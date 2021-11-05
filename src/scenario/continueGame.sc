theme: /

    state: Продолжить
        q!: (продолжить|продолжить игру|продолжить играть)
        
        script:
            continueGame($context);
            
        go!: /ВозвратКИгреЗавершен