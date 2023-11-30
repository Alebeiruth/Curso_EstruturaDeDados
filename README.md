# CursoEstruturaDeDados: Pilha

Pilha > controla o acesso dos dados, de modo que a inserção(adição de elementos) sejam obrigatoriamente feitos em SEQUENCIA,
no topo da pilha, e as remoções(remove) seja feito de modo inverso. 

Existe dois tipos de Pilha:

Estática ao qual seu volume/tamanho/capacidade de armazenamento de dados é fixo e imutável. 

Dinâmica ao qual não possui essa limitação, e sua capacidade max é definida pela qnt de memoria disponível. 

PILHA == LIFO = LAST IN, FIRST OUT
 
*Lembrar da pilha de roupa ou livro 📚📚📚

*Não há possibilidades de adc um elemento em qualquer lugar da pilha (LIFO)

Pilha > possui esses atributos principais: adicionar, remover e limpar
e ainda 3 funções auxiliares, verificar se a pilha está cheia, vazia e
iteração (consulta elementos como se fossem ser removidos na ordem que foram empilhados mas não são removidos) 

Adicionar(push): adc no topo da pilha

Remover(pop): remove e retorna ao topo da pilha

Limpar(clear): remove todos elementos da pilha, deixando vazia.

OVERFLOW: não há espaço no vetor para armazenamento
UNDERFLOW: não pode remover elementos de uma pilha vazia
OVERHEAD: valor extra, q não representa informação de fato de dentro da estrutura
