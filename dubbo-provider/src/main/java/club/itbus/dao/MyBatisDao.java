package club.itbus.dao;


import java.lang.reflect.ParameterizedType;

/**
 * Desc:
 * Mail: hehaiyang@terminus.io
 * Date: 16/9/14
 */
public abstract class MyBatisDao<T> {

    public final String nameSpace;

    public MyBatisDao() {
        if(this.getClass().getGenericSuperclass() instanceof ParameterizedType) {
            this.nameSpace = ((Class)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getSimpleName();
        } else {
            this.nameSpace = ((Class)((ParameterizedType)this.getClass().getSuperclass().getGenericSuperclass()).getActualTypeArguments()[0]).getSimpleName();
        }

    }

    protected String sqlId(String id) {
        return this.nameSpace + "." + id;
    }
}
