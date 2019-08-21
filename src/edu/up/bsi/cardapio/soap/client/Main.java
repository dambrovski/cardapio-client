package edu.up.bsi.cardapio.soap.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;

import edu.up.bsi.cardapio.soap.server.AlimentoCardapio;
import edu.up.bsi.cardapio.soap.server.FuncoesWS;
import edu.up.bsi.cardapio.soap.server.FuncoesWSService;

public class Main {

	private static final String WS_URL = "http://localhost:9080/alimentoCardapio?wsdl";

	public static void main(String[] args) throws MalformedURLException {

		Scanner sc = new Scanner(System.in);

		URL url = new URL(WS_URL);
		QName qname = new QName("http://server.soap.cardapio.bsi.up.edu/", "FuncoesWSService");
		Service service = Service.create(url, qname);

		FuncoesWS login = service.getPort(FuncoesWS.class);

		BindingProvider provider = (BindingProvider) login;
		Map<String, Object> req_ctx = provider.getRequestContext();
		req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);

		Map<String, List<String>> headers = new HashMap<String, List<String>>();

		Boolean logado = false;

		FuncoesWS fun = new FuncoesWSService().getFuncoesWSPort();

		int option = 0;

		String usuario = "";
		String senha = "";



		while (logado == false) {

			System.out.println("MENU DE LOGIN:");
			System.out.println("Digite seu Login:");
			usuario = sc.next();
			System.out.println("Digite sua senha:");
			senha = sc.next();
			
			headers.put("Username", Collections.singletonList(usuario));
			headers.put("Password", Collections.singletonList(senha));
			req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
			logado = login.loginUsuario();
			
			if (logado) {
				System.out.println("Logado com Sucesso!");
				
			}
			else {
				System.out.println("Verifique os dados que est�o sendo digitados!");
			}

			while (logado == true) {
				System.out.println("MENU DE ACESSO:");
				System.out.println("1 - LISTAR CARDAPIO:");
				System.out.println("2 - LOGOUT:");
				option = sc.nextInt();
				
				switch (option) {
				case 1:
					System.out.println("Op��o 1 selecionada.");
					option = 1;
					List<AlimentoCardapio> cardapio2 = new ArrayList<AlimentoCardapio>();
					cardapio2 = fun.todosAlimentos();
					for (AlimentoCardapio alimentoCardapio : cardapio2) {

						System.out.println("Lanche: " + alimentoCardapio.getDescricao() + " Pre�o: R$"
								+ alimentoCardapio.getPreco());
						System.out.println();
					}
					break;

				case 2:
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("Usu�rio foi deslogado.");
					logado = false;

					break;

				default:
					break;
				}
			}
		}
	}
}
