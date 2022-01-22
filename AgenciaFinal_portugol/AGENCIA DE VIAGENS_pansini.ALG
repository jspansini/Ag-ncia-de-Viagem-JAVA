Algoritmo "Agencia de viagens"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Eduardo
// Descrição   : Cadastro e consulta de clientes e destinos de uma agencia.
// Autor(a)    : Jessica Pansini
// Data atual  : 23/10/2021
Var

opcao, i: inteiro
cliente: vetor[1..3] de caractere
destino: vetor[1..3] de caractere
pagamento: vetor[1..3] de caractere
continuar: caractere

pedido: inteiro
valor: vetor[1..3] de real
Inicio

	escreval("========== AGÊNCIA DE VIAGENS ==========")
	escreval("[1] - CADASTRAR CLIENTE")
	escreval("[2] - CADASTRAR DESTINOS")
	escreval("[3] - ENCERRAR PROGRAMA")
	leia(opcao)
	
   escreval (" ")

	escolha (opcao)
	caso 1
	escreval (":::Cadastrar cliente:::")
      para i de 1 ate 3 faca
      		escreval ("Qual nome do ", i ,"º cliente?")
      		leia(cliente[i])
      		escreval("Qual é o destino?")
      		leia(destino[i])
      		escreval ("Qual forma de pagamento?")
      		leia (pagamento[i])
      		escreval ("Cliente cadastrado com sucesso!")
      fimpara

      		escreval (" ")
      		escreval ("Consultar status do seu pedido? [SIM]- [NÃO] ")
      		leia (continuar)
      		
        se (continuar = "sim") entao
        escreval("Pedido realizado com sucesso!")
        senao
        escreval("Obrigada por ser nosso cliente! Até mais")
        fimse
                  
	caso 2
	escreval (":::Cadastrar destinos:::")
           	para i de 1 ate 3 faca
      		escreval ("Registre o destino no sistema")
      		leia(destino[i])
      		escreval("Qual é o valor desta viagem? R$ ")
      		leia(valor[i])
            escreval ("Destino gravado com sucesso!")
            
            escreval (" ")
      		escreval ("Consultar status do destino no sistema? [SIM]-[NÃO]")
      		leia (continuar)
      		
            se (continuar = "sim") entao
                escreval("Pedido realizado com sucesso!")
            senao
             escreval("Obrigada por ser nosso cliente! Até mais")
              fimse
            
	caso 3
	escreval (":::Te vejo em breve!:::")
	outrocaso
	escreval (":::OPÇÃO INVALIDA:::")
	fimescolha
	fimescolha


Fimalgoritmo