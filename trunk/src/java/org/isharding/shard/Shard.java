package org.isharding.shard;

import java.util.Set;

import javax.sql.DataSource;


/**
 * 
 * ����һ��Shard
 * 
 * @author argan 2007-11-13 ����03:06:50
 */
public interface Shard {
    DataSource getDataSource();
    Set<ShardId> getShardIds();
}
