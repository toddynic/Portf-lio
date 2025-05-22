#Calculadora de Juros Simples

#

valor = float(input("Escreva o valor: "))

juros = float(input("Escreva a taxa de juros(em porcentagem): "))/100

anos = int(input("Escreva a quantidade de anos: "))

jurosfinal = valor*juros*anos

print(f"\nO valor com o juros: {(valor+jurosfinal):.2f}")
print(f"O juros : {jurosfinal:.2f}")