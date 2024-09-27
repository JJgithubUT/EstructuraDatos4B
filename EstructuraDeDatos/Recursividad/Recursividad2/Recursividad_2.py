def sumatoriaRec(n):
    if n == 0:
        return 0
    else:
        return n*n + sumatoriaRec(n - 1)

num_a_con = 4

resultado = sumatoriaRec(num_a_con)
print(f"La sumatoria de {num_a_con} es: {resultado}")
