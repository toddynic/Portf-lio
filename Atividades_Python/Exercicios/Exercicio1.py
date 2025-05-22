#Preço a pagar

#Pede o preço e quantidade do café depois calcula o preço

valorcafe = float(input("Fale o valor do café: R$"))

print("")

quantidade= int(input("Qual a quantidade de café você vai querer: "))

print("\n#####################################################\n")

print(f"Preço do café: R${valorcafe:.2f}")
print(f"Quantidade de café: {quantidade}\n")

print(f"Valor a pagar: R${(valorcafe*quantidade):.2f}")