package test;

import data.phrase.IPhrase;
import data.phrase.PhraseNonVide;
import data.phrase.PhraseTropLongue;
import data.phrase.PhraseVide;
import data.texte.ITexte;
import data.texte.TexteNonVide;
import data.texte.TexteTropLong;
import data.texte.TexteVide;
import generator.Gen;
import registry.Client;
import registry.Store;
import vocabulaire.Complement;
import vocabulaire.Sujet;
import vocabulaire.Verbe;

public class Main {
    public static void main( String[] args ) {
        IPhrase phraseOne = PhraseVide.nulle;
        IPhrase phraseTwo = PhraseVide.nulle;
        IPhrase phraseThree = PhraseVide.nulle;

        try {
            phraseOne = new PhraseNonVide( Sujet.JE, new PhraseNonVide( Verbe.BOIRE, new PhraseNonVide( Complement.EAU, PhraseVide.nulle ) ) );
            phraseTwo = new PhraseNonVide( Sujet.IL, new PhraseNonVide( Verbe.DORMIR, new PhraseNonVide( Complement.BEAU, PhraseVide.nulle ) ) );
            phraseThree = new PhraseNonVide( Sujet.PAUL, new PhraseNonVide( Verbe.FAIRE, new PhraseNonVide( Complement.FROID, PhraseVide.nulle ) ) );
        } catch ( PhraseTropLongue phraseTropLongue ) {
            phraseTropLongue.printStackTrace();
        }

        System.out.println("=======Test des phrases");
        System.out.println(phraseOne);
        System.out.println(phraseTwo);
        System.out.println(phraseThree);

        ITexte texte = TexteVide.nulle;

        try {
            texte = new TexteNonVide( phraseOne, new TexteNonVide( phraseTwo, new TexteNonVide( phraseThree, TexteVide.nulle ) ) );
        } catch ( TexteTropLong texteTropLong ) {
            texteTropLong.printStackTrace();
        }

        System.out.println("===========Test du texte");
        System.out.println(texte);


        System.out.println("===========Test du generateur (en realite un listeur)");
        Gen generator = new Gen( texte );

        while ( !generator.isDone() )
        {
            System.out.println(generator.current());
            generator.next();
        }

        System.out.println("===========Test du store et de ses clients");
        Client clientOne = new Client( Store.instance, "Anael" );
        Client clientTwo = new Client( Store.instance, "Mr Royer" );
        Store.instance.setGen( generator );
        Store.instance.addObserver( clientOne );
        Store.instance.addObserver( clientTwo );
        Store.instance.storageProccessor();

    }
}
