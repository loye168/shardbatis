package com.alibaba.china.shard.strategy.resolution;

import java.util.List;

import com.alibaba.china.shard.ShardId;

public interface ShardResolutionStrategy {
    /**
     * ��������ܴ��ڵ�shard
     *
     * @param shardResolutionStrategyData �����ж�����shard��һЩ����
     * @return ���ݴ�ŵ�shard ids
     */
    List<ShardId> selectShardIdsFromShardResolutionStrategyData(
        ShardResolutionStrategyData shardResolutionStrategyData);
  }