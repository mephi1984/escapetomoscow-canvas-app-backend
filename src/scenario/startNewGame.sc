theme: /

    state: Начать
        q!: (начать|начать игру|начать новую игру|начать играть|новая игра)
        
        script:
            startNewGame($context);
            
        go!: /ВозвратКИгреЗавершен