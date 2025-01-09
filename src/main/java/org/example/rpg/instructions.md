Fantasy RPG Character System - Komplett Kravspecifikation
Syfte: Att öva på och demonstrera förståelse för arv, abstraktion och polymorfism genom att
bygga ett rollspelssystem med karaktärer, items och inventory.
Karaktärssystem - Grundkrav:
1. Skapa en abstrakt basklass Character som innehåller:
- Grundläggande attribut för en rollspelskaraktär
- Minst en abstrakt metod
- Minst en konkret metod som alla subklasser ärver
2. Skapa minst tre olika karaktärsklasser som ärver från Character:
- Varje klass ska ha minst en unik egenskap
- Varje klass ska implementera alla abstrakta metoder
- Varje klass ska ha minst en unik metod
3. Implementera ett stridssystem:
- Möjlighet för karaktärer att attackera varandra
- Olika typer av attacker för olika klasser
- Ett system för att hantera skada och healing
  Item-system - Grundkrav:
1. Skapa en abstrakt basklass Item som innehåller:
- Grundläggande attribut (namn, vikt, värde)
- Minst en abstrakt metod för användning av föremålet
- System för att kategorisera items
2. Skapa olika typer av items som ärver från Item:
- Weapon (vapen med skada)
- Armor (rustning med försvar)
- Potion (återställer hälsa/mana)
3. Implementera ett Inventory-system:
- Maxvikt som kan bäras
- Metoder för att lägga till/ta bort items
- Möjlighet att använda items från inventory
- Metod för att visa innehållet