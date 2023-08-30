package br.com.locadora.dao;

import br.com.locadora.model.Ator;
import br.com.locadora.model.Classe;
import br.com.locadora.model.Diretor;

import java.util.List;

public class DMLActions {

    //ATOR ---------------------------------------------------------------------------------------

    public static Ator findByIdAtor(Long id) {
        return (Ator) QueryFactory.findById(Ator.class, id);
    }

    public static List getListAtores() {
        try {
            return QueryFactory.findList(Ator.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertAtor(Ator ator) {
        try {
            QueryFactory.insert(ator);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateAtor(Ator ator) {
        try {
            QueryFactory.update(ator);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteAtor(Ator ator) {
        try {
            QueryFactory.delete(ator);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //CLASSE ---------------------------------------------------------------------------------------

    public static Classe findByIdClasse(Long id) {
        return (Classe) QueryFactory.findById(Classe.class, id);
    }

    public static List getListClasses() {
        try {
            return QueryFactory.findList(Classe.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertClasse(Classe classe) {
        try {
            QueryFactory.insert(classe);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateClasse(Classe classe) {
        try {
            QueryFactory.update(classe);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteClasse(Classe classe) {
        try {
            QueryFactory.delete(classe);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //DIRETOR ---------------------------------------------------------------------------------------
    public static List getListDiretores() {
        try {
            return QueryFactory.findList(Diretor.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertDiretor(Diretor diretor) {
        try {
            QueryFactory.insert(diretor);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateDiretor(Diretor diretor) {
        try {
            QueryFactory.update(diretor);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteDiretor(Diretor diretor) {
        try {
            QueryFactory.delete(diretor);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
