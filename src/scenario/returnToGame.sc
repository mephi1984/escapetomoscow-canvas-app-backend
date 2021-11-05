theme: /

    state: НазадВИгру
        q!: (вернись|вернуться|назад в игру)
        
        script:
            returnToGame($context);
            
        go!: /ВозвратКИгреЗавершен

