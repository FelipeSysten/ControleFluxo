+---------------------+
|  <<interface>>      |
|  IReprodutorMusical |
+---------------------+
|  + play(): void     |
|  + pause(): void    |
|  + stop(): void     |
+---------------------+

+---------------------+
|  <<interface>>      |
|  IAparelhoTelefonico|
+---------------------+
|  + ligar(): void    |
|  + atender(): void  |
|  + iniciarCorreioDeVoz(): void |
+---------------------+

+---------------------+
|  <<interface>>      |
|  INavegadorInternet |
+---------------------+
|  + exibirPagina(): void      |
|  + adicionarNovaAba(): void  |
|  + atualizarPagina(): void   |
+---------------------+

        ^               ^               ^
        |               |               |
        |               |               |
        +---------------+---------------+
                        |
                        |
                 +-------------------+
                 |      iPhone       |
                 +-------------------+
                 | - modelo: String  |
                 | - cor: String     |
                 | - capacidade: int |
                 +-------------------+
                 | + play(): void    |
                 | + pause(): void   |
                 | + stop(): void    |
                 | + ligar(): void   |
                 | + atender(): void |
                 | + iniciarCorreioDeVoz(): void |
                 | + exibirPagina(): void      |
                 | + adicionarNovaAba(): void  |
                 | + atualizarPagina(): void   |
                 +-------------------+
