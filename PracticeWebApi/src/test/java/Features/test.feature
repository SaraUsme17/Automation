Feature: Buscar un personaje de Stars Wars en Wikipedia

  Scenario Outline: Ver el artículo de Wikipedia relacionado con el personaje
  Given Yo soy un usuario en la página principal de Wikipedia buscando <number>
    When Busco el personaje especificado en la página de búsqueda de Wikipedia
    Then Debo poder ver la página del personaje específicado en la página de resultados

    Examples:
      | number | cName |
      | 1 | Luke Skywalker |
      | 2 | C-3PO |
      | 3 | R2-D2 |
      | 4 | Darth Vader |
      | 5 | Princess Leia |
