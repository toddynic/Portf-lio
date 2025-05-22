# Solicita ao usuário os valores das variáveis
a = input("Digite o valor da variável a: ")
b = input("Digite o valor da variável b: ")

# Exibe os valores antes da troca
print("\nValor de antes da troca:")
print("a =", a)
print("b =", b)

# Troca os valores das variáveis
a, b = b, a

# Exibe os valores após a troca
print("\nApós a troca:")
print("a =", a)
print("b =", b)