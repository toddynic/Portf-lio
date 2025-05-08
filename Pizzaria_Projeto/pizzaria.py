print("PIZZARIA COMA BASTANTE - SEJA BEM VINDO")
print("_____ CARDÁPIO - PREÇOS _____")
print(" ")

print("******** PIZZAS - SABORES ********")
print(" CALABREZA, FRANGO, CATUPIRY ")

print("******** PIZZAS - TAMANHO ********")
print(" PIZZA PEQUENA     R$ 10,00 ")
print(" PIZZA MÉDIA       R$ 15,00 ")
print(" PIZZA GRANDE      R$ 20,00 ")

print("******** REFRIGERANTES ********")
print(" COCA-COLA         R$ 7,00 ")
print(" GUARANÁ           R$ 6,00 ")
print(" FANTA             R$ 5,00 ")

print("______________________________")
print(" ")

print("FAÇA O SEU PEDIDO PARA PIZZA:")
print("1 - CALABREZA")
print("2 - FRANGO")
print("3 - CATUPIRY")

print("______________________________\n")

print("FAÇA SEU PEDIDO PARA A PIZZA:\n")

print("ESCOLHA O SABOR DA PIZZA")
print("1 - CALABREZA")
print("2 - FRANGO")
print("3 - CATUPIRY")
sabor = int(input("DIGITE O NÚMERO DO SABOR DE PIZZA: "))

print("")

print("ESCOLHA O TAMANHO DA PIZZA")
print("P - PEQUENA")
print("M - MEDIA")
print("G - GRANDE")
tamanho = input("DIGITE O TAMANHO DA PIZZA: ").upper()

print("")

print("ESCOLHA O SEU REFRIGERANTE")
print("1 - COCA-COLA")
print("2 - GUARANÁ")
print("3 - FANTA")
refrigerante = int(input("DIGITE O NÚMERO DO SEU REFRIGERANTE: "))

print("")

valor = 0

#Trem feio para calcular o valor da pizza

if sabor == 1:
    sabor = "CALABREZA"
elif sabor == 2:
    sabor = "FRANGO"
elif sabor == 3:
    sabor = "CATUPIRY"
else:
    sabor="ERROR!"

if tamanho == "P":
    tamanho="PEQUENA"
    valor=valor+10
elif tamanho == "M":
    tamanho="MÉDIA"
    valor=valor+15
elif tamanho == "G":
    tamanho="GRANDE"
    valor=valor+20
else:
    tamanho="ERROR!"

if refrigerante == 1:
    refrigerante="COCA-COLA"
    valor=valor+7
elif refrigerante == 2:
    refrigerante="GUARANÁ"
    valor=valor+6
elif refrigerante == 3:
    refrigerante="FANTA"
    valor=valor+5
else:
    refrigerante="ERROR!"


print("#########################################################\n")
print(f"VALOR: {valor} R$\n")
print("SUA PIZZA:\n")
print("SABOR: "+ sabor)
print("TAMANHO: "+tamanho)
print("REFRIGERANTE: "+refrigerante)