# Cria uma lista para armazenar os números
numeros = []

# Solicita ao usuário 4 números e armazena na lista
for i in range(4):
    numero = float(input(f"Digite o {i+1}º número: "))
    numeros.append(numero)

# Conta quantos números negativos foram digitados
quantidade_negativos = sum(1 for numero in numeros if numero < 0)

# Exibe o resultado
print(f"Você digitou {quantidade_negativos} número(s) negativo(s).")