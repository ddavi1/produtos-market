(não está respondendo aos status, mas a API está pronta e funcional). Estou utilizando o flyway para as migrations do banco de dados.

detalhe que na hora de criar um novo registro (POST) o json é: 

{
	"nome": "Bolacha",
	"marca" : "Passa-tempo",
	"quantidade": 20,
	"caixa": "viviane",
	"valor": 3.50
	
}

mas no caso quando dar um (GET) ele irá retornar apenas: 
	{
		"id": 2,
		"nome": "Bolacha",
		"marca": "Passa-tempo",
		"quantidade": 20
	}

isso porquê eu estava utilizando DTO e alguns enum. (DTO = DATA TRANSFER OBJECT). Oque torna mais seguro e mais limpo o meu codigo

no caso para dar update (PUT) em algum dado é necessario mandar o id dele via body 
	{
		"id": 2,
		"nome": "Bolacha de Sal",
		"marca": "Marilan",
		"quantidade": 9
	}

 no caso de deleter (DELETE)  é so mandar o id via path no meu caso (localhost:8080/pessoas/2)


 -- AQUI FINALIZAMOS O CRUD--

 
