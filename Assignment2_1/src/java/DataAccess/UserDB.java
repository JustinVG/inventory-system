
package DataAccess;

import Models.Users;
import javax.persistence.EntityManager;


public class UserDB {
    public Users get(String username ){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        
        try {
            Users user = em.find(Users.class, username);
            return user;
        }
        finally {
            em.close();
        }
    }
}
