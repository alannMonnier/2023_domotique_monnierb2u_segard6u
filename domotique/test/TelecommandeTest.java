import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelecommandeTest {

    /**
     * Test l ajout d'une lampe a une telecommande vide
     */
    @Test
    void ajouterLampe_Vide() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Lampe1");

        // methode testee
        t.ajouterTelecommandable(l);

        // verification
        assertEquals(t.getTelecommandables().get(0), l, "Il devrait y avoir la lampe lampe1");
    }


    /**
     * Test l ajout d'une lampe a une telecommande vide
     */
    @Test
    void ajouterLampe_1elt() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Lampe1");
        t.ajouterTelecommandable(l);
        Lampe l2 = new Lampe("lampe2");

        // methode testee
        t.ajouterTelecommandable(l2);

        // verification
        Lampe[] t_l = {l, l2};
        for (int i = 0; i < 2; i++) {
            assertEquals(t.getTelecommandables().get(i), t_l[i], "Il devrait y avoir la lampe lampe" + i);
        }
    }

    /**
     * Active une lampe en position 0
     */

    /**
     * Active une lampe en position 1
     */
    @Test
    void activerLampe() {
        // Preparations données
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Lampe1");
        t.ajouterTelecommandable(l);

        // methode testee
        t.getTelecommandables().get(0).allumer();

        // verification
        assertTrue(((Lampe) t.getTelecommandables().get(0)).isAllume(), "La lampe lampe2 devrait être allumée");
    }


    /**
     * Active une lampe inexistante
     */
    @Test
    void activerLampe_Inexistant() {
        // Preparations données
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Lampe1");
        t.ajouterTelecommandable(l);

        // verification
        // methode testee
        assertThrows(IndexOutOfBoundsException.class, () ->
        {
            t.ajouterTelecommandable(l);
        }, "On ne dervait pas pouvoir récupérer une lampe inexistante");

    }
}
