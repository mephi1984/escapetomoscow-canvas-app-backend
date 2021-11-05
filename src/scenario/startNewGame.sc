theme: /

    state: Начать
        q!: (начать|начать игру|начать новую игру|начать играть)
        
        script:
            startNewGame($context);
            
        go!: /ВозвратКИгреЗавершен