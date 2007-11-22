package com.alibaba.china.shard.strategy.selection;

import com.alibaba.china.shard.ShardId;

/**
 * ѡ�����
 * 
 * @author <a mailto="kerrigan@alibaba-inc.com">Argan Wang</a>
 */
public interface ShardSelectionStrategy {
    /**
     * ���¶���ѡ���ŵ�shard 
     * @param obj Ҫѡ��shard�Ķ���
     * @return ����Ҫ��ŵ���shard��id 
     */
    ShardId selectShardIdForNewObject(Object obj);
}
