# Solicita ao usuário uma letra
letra = input("Digite uma letra: ").lower()

# Verifica se a letra é uma vogal ou consoante
if letra in 'aeiou':
    print(f"A letra '{letra}' é uma vogal.")
elif letra.isalpha() and len(letra) == 1:
    print(f"A letra '{letra}' é uma consoante.")
else:
    print("Por favor, digite apenas uma letra válida.")