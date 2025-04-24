```mermaid
classDiagram
iphone <|-- interface_ReprodutorMusical
iphone <|-- interface_navegadorDeInternet
iphone <|-- interface_AparelhoTelefonico

class interface_AparelhoTelefonico {
  +ligar(String numeroTelefone)
  +atender()
  +iniciarCorreioDeVoz()
}
class interface_ReprodutorMusical {
  +tocarMusica()
  +pausarMusica()
  +selecionarMusica()
}
class interface_navegadorDeInternet {
  +exibirPagina()
  +abrirNovaGuia()
  +AtualizarPagina()
}
```
