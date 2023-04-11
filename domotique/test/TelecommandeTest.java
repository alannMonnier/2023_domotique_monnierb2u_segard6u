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
        t.ajouterLampe(l);

        // verification
        assertEquals(t.getLampes().get(0), l, "Il devrait y avoir la lampe lampe1");
    }


    /**
     * Test l ajout d'une lampe a une telecommande vide
     */
    @Test
    void ajouterLampe_1elt() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Lampe1");
        t.ajouterLampe(l);
        Lampe l2 = new Lampe("lampe2");

        // methode testee
        t.ajouterLampe(l2);

        // verification
        Lampe[] t_l = {l, l2};
        for (int i = 0; i < 2; i++) {
            assertEquals(t.getLampes().get(i), t_l[i], "Il devrait y avoir la lampe lampe" + i);
        }
    }

    /**
     * Active une lampe en position 0
     */
    @Test
    void activerLampe_Pos0() {
        // Preparations données
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Lampe1");
        t.ajouterLampe(l);

        // methode testee
        t.activerLampe(0);

        // verification
        assertEquals(t.getLampes().get(0).isAllume(), l.isAllume(), "La lampe lampe1 devrait être allumée");
    }


    /**
     * Active une lampe en position 1
     */
    @Test
    void activerLampe_Pos1() {
        // Preparations données
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Lampe1");
        t.ajouterLampe(l);
        Lampe l2 = new Lampe("Lampe2");
        t.ajouterLampe(l2);

        // methode testee
        t.activerLampe(1);

        // verification
        assertEquals(t.getLampes().get(1).isAllume(), l2.isAllume(), "La lampe lampe2 devrait être allumée");
    }


    /**
     * Active une lampe inexistante
     */
    @Test
    void activerLampe_Inexistant() {
        // Preparations données
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Lampe1");
        t.ajouterLampe(l);

        // verification
        // methode testee
        assertThrows(IndexOutOfBoundsException.class, () ->
        {
            t.activerLampe(1);
        }, "On ne dervait pas pouvoir récupérer une lampe inexistante");

    }
}
