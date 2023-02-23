
@todos
Feature: magazine
  Como usuario eu 
  Quero acessar o site
  Para adicionar um produto ao carrinho
 
 
  @imagem
  Scenario: Adicionando um produto clicando na imagem
    Given que eu acesse o site
    And realizar uma busca
    When clicar na imagem 
    And adicionar ao carrinho imagem
    Then validar o produto no carrinho imagem
    
  @descricao
 	Scenario: Adicionando um produto clicando na descricao
 		Given que eu acesse o site
    And realizar uma busca
    When escolher clicar na descricao
    And escolher modelo
    And adicionar ao carrinho descricao
    Then validar o produto no carrinho descricao
    
  @cep
 	Scenario: Adicionando um produto com cep
 		Given que eu acesse o site
    And realizar uma busca 
    When escolher o produto
    And inserir o cep
    And adicionar ao carrinho cep
    Then validar o produto no carrinho cep
    
  @seguro
 	Scenario: Adicionando um produto e adicionado seguro
 		Given que eu acesse o site
    And realizar uma busca
    When escolher um produto
    And adicionar ao carrinho seguro
    And adicionar seguro
    Then validar o produto no carrinho
    
  @retira
 	Scenario: Adicionando um produto e escolher retirar na loja
 		Given que eu acesse o site
    And realizar uma busca
    When escolher um produto retira
    And inserir o cep
    And escolher opcao de entrega
    And adicionar ao carrinho
    Then validar o produto no carrinho
    
   
