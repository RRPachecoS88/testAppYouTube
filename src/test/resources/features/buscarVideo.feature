Feature: Buscar video en youtube

  Scenario: Busqueda de Video por nombre de video

    Given Tengo la appYoutube abierta
    When Hago click en el Boton [Buscar]
    And Se escribe el 'op Dragon Ball GT' del video en el [Texbox]
    And Se hace click [finVideo] para buscar
    Then Se muestra los resultados