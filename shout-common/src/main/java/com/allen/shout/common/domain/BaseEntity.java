package com.allen.shout.common.domain;

import com.alibaba.dubbo.common.utils.CollectionUtils;

import java.util.*;

/**
 * @Author yuanchen.li
 * @DATE Created in 2017/11/27/027
 * @Description
 */
public class BaseEntity extends CommonEntity{

    private String id;

    public BaseEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            BaseEntity that = (BaseEntity)o;
            return Objects.equals(this.id, that.id);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id});
    }

    public static Set<String> getIdSetBySelfCollection(Collection<? extends BaseEntity> baseEntityCollection) {
        Set<String> idSet = new HashSet();
        if (CollectionUtils.isNotEmpty(baseEntityCollection)) {
            Iterator var2 = baseEntityCollection.iterator();

            while(var2.hasNext()) {
                BaseEntity baseEntity = (BaseEntity)var2.next();
                idSet.add(baseEntity.getId());
            }
        }

        return idSet;
    }

    public static List<String> getIdListBySelfCollection(Collection<? extends BaseEntity> baseEntityCollection) {
        List<String> idSet = new LinkedList();
        if (CollectionUtils.isNotEmpty(baseEntityCollection)) {
            Iterator var2 = baseEntityCollection.iterator();

            while(var2.hasNext()) {
                BaseEntity baseEntity = (BaseEntity)var2.next();
                idSet.add(baseEntity.getId());
            }
        }

        return idSet;
    }

    public static Map<String, ? extends BaseEntity> getIdAndSelfMapBySelfCollection(Collection<? extends BaseEntity> baseEntityCollection) {
        Map<String, BaseEntity> idAndSelfMap = new HashMap();
        if (CollectionUtils.isNotEmpty(baseEntityCollection)) {
            Iterator var2 = baseEntityCollection.iterator();

            while(var2.hasNext()) {
                BaseEntity baseEntity = (BaseEntity)var2.next();
                idAndSelfMap.put(baseEntity.getId(), baseEntity);
            }
        }

        return idAndSelfMap;
    }
}
