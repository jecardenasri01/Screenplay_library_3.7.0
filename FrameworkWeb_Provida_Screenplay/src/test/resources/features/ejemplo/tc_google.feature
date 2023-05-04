@cucumber
Feature: 12348
  Scenario Outline: 12348 buscar cancion (Ch):
    Given usuario realiza busqueda en navegador google de <cancion>
    When accede a youtube
    Then revisa nombre de cancion sea <cancionesperada>
    Examples:
      |cancion|cancionesperada|
      |juanes tu foto |Juanes, Nelly Furtado|
      |juanes tu camisa negra|Juanes - La Camisa Negra|