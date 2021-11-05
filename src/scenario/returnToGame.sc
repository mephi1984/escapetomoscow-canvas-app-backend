theme: /

    state: НазадВИгру
        q!: (назад|назад в игру)
        
        script:
            returnToGame($context);
            
        go!: /ВозвратКИгреЗавершен
