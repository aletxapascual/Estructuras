import tkinter as tk
import tkinter.messagebox
import tkinter.simpledialog

class Player:
    def __init__(self, name, symbol):
        self.name = name
        self.symbol = symbol
    def setname(self, name):
        self.name = name
    def getname(self):
        return self.name

class Game:
    def __init__(self):
        self.root = tk.Tk()
        self.root.title("Tic Tac Toe")
        self.board = [[' ' for _ in range(3)] for _ in range(3)]
        self.player1 = Player("", "X")
        self.player2 = Player("", "O")
        self.current_player = self.player1
        self.winner = None
        self.create_name_interface()
    
    def create_name_interface(self):
        self.name_frame = tk.Frame(self.root)
        self.name_frame.pack(pady=20)
        welcome_label = tk.Label(self.name_frame, text="Welcome to Tic Tac Toe! Please enter the names of the players.")
        welcome_label.grid(row=0, column=1, columnspan=2, padx=5, pady=5)
        
        tk.Label(self.name_frame, text="Enter Player 1 Name:").grid(row=1, column=1, padx=5, pady=5)
        self.player1_entry = tk.Entry(self.name_frame)
        self.player1_entry.grid(row=1, column=2, padx=5, pady=5)
        
        tk.Label(self.name_frame, text="Enter Player 2 Name:").grid(row=2, column=1, padx=5, pady=5)
        self.player2_entry = tk.Entry(self.name_frame)
        self.player2_entry.grid(row=2, column=2, padx=5, pady=5)
        
        start_button = tk.Button(self.name_frame, text="Start Game", command=self.start_game)
        start_button.grid(row=3, column=1, columnspan=2, pady=10)
  
    def switch_player(self):
        if self.current_player == self.player2:
            self.current_player = self.player1
        else:
            self.current_player = self.player2

    def start_game(self):
        player1_name = self.player1_entry.get()
        player2_name = self.player2_entry.get()
        
        if player1_name and player2_name:
            self.player1.setname(player1_name)
            self.player2.setname(player2_name)
            self.name_frame.destroy()
            self.create_game_interface()
        else:
            tkinter.messagebox.showwarning("Input Error", "Please enter names for both players.") 

    def create_game_interface(self):
        self.buttons = [[None for _ in range(3)] for _ in range(3)]
        self.game_frame = tk.Frame(self.root)
        self.game_frame.pack()
        
        for i in range(3):
            for j in range(3):
                self.buttons[i][j] = tk.Button(self.game_frame, text=' ', font=('Arial', 20), width=5, height=2, command=lambda i=i, j=j: self.on_button_click(i, j))
                self.buttons[i][j].grid(row=i, column=j)
        
        self.player_turn_label = tk.Label(self.root, text=f"{self.current_player.getname()}'s turn", font=('Arial', 16))
        self.player_turn_label.pack(pady=10)
    
    def on_button_click(self, i, j):
        if self.board[i][j] == ' ' and not self.winner:
            self.board[i][j] = self.current_player.symbol
            self.check_winner()
            self.update_buttons()
            self.switch_player()
        if self.winner:
            if self.winner == 'draw':
                tkinter.messagebox.showinfo("Game Over", "It's a draw!")
            else:
                tkinter.messagebox.showinfo("Game Over", f"{self.winner.getname()} wins!")
                if not hasattr(self, "restart_button"): #if the button doesn't exist yet
                    self.restart_button = tk.Button(self.root, text="Start Again", command=self.restart_game)
                    self.restart_button.pack(pady=10)
        else:
            self.player_turn_label.config(text=f"{self.current_player.getname()}'s turn")
        
        
    def restart_game(self):
        answer = tkinter.messagebox.askquestion("Restart Game", "Do you want to change players?")
        if answer == 'yes':
            self.root.destroy()
            game = Game()
            game.root.mainloop()
        else:
            self.board = [[' ' for _ in range(3)] for _ in range(3)]
            self.winner = None
            self.current_player = self.player1
            self.player_turn_label.config(text=f"{self.current_player.getname()}'s turn")
            self.update_buttons()

    def update_buttons(self):
        for i in range(3):
            for j in range(3):
                self.buttons[i][j].config(text=self.board[i][j])
    
    def play(self):
        self.print_board()
        while not self.winner:
            
            print(f"{self.current_player.getname()}'s turn")
            row = int(input("Enter the row number: "))
            col = int(input("Enter the column number: "))
            if row not in range(3) or col not in range(3):
                print("Invalid position. Try again.")
                continue
            if self.board[row][col] != ' ':
                print("This position is already taken. Try again.")
                continue
            self.board[row][col] = self.current_player.symbol
            self.check_winner()
            self.print_board()
            self.switch_player()
        if self.winner == 'draw':
            print("It's a draw!")
        else:
            print(f"{self.winner.getname()} wins!")
        
        
    def print_board(self): #like that but after we can use tkinter to make it more beautiful
        values = [self.board[i][j] for i in range(3) for j in range(3)]
        print("\n")
        print("\t     |     |")
        print("\t  {}  |  {}  |  {}".format(values[0], values[1], values[2]))
        print('\t_____|_____|_____')
    
        print("\t     |     |")
        print("\t  {}  |  {}  |  {}".format(values[3], values[4], values[5]))
        print('\t_____|_____|_____')
    
        print("\t     |     |")
    
        print("\t  {}  |  {}  |  {}".format(values[6], values[7], values[8]))
        print("\t     |     |")
        print("\n")


    def check_winner(self):
        # Check rows
        if self.winner==None:
            for i in range(3):
                if self.board[i][0] == self.board[i][1] == self.board[i][2] == self.player1.symbol:
                    self.winner = self.player1
                elif self.board[i][0] == self.board[i][1] == self.board[i][2] == self.player2.symbol:
                    self.winner = self.player2
        
        # Check columns
        if self.winner==None:
            for i in range(3):
                if self.board[0][i] == self.board[1][i] == self.board[2][i] == self.player1.symbol:
                    self.winner = self.player1
                elif self.board[0][i] == self.board[1][i] == self.board[2][i] == self.player2.symbol:
                    self.winner = self.player2
  
        # Check diagonals
        if self.winner==None:
            if self.board[0][0] == self.board[1][1] == self.board[2][2] == self.player1.symbol:
                self.winner = self.player1
            elif self.board[0][2] == self.board[1][1] == self.board[2][0] == self.player1.symbol:
                self.winner = self.player1
            elif self.board[0][0] == self.board[1][1] == self.board[2][2] == self.player2.symbol:
                self.winner = self.player2
            elif self.board[0][2] == self.board[1][1] == self.board[2][0] == self.player2.symbol:
                self.winner = self.player2
        
        # Check if the board is full
        if self.winner==None:
            if all(self.board[i][j] != ' ' for i in range(3) for j in range(3)):
                self.winner = 'draw'
        

if __name__ == '__main__':
    game = Game()
    #version tkinter :
    game.root.mainloop()
    #version terminal : 
    #game.play()
