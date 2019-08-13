/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.MetastoreDescribeKafkaTopicResponse;
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeKafkaTopicResponse.AdvancedConfig;
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeKafkaTopicResponse.Cluster;
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeKafkaTopicResponse.Distribution;
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeKafkaTopicResponse.Summary;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreDescribeKafkaTopicResponseUnmarshaller {

	public static MetastoreDescribeKafkaTopicResponse unmarshall(MetastoreDescribeKafkaTopicResponse metastoreDescribeKafkaTopicResponse, UnmarshallerContext _ctx) {
		
		metastoreDescribeKafkaTopicResponse.setRequestId(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.RequestId"));
		metastoreDescribeKafkaTopicResponse.setId(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.Id"));
		metastoreDescribeKafkaTopicResponse.setDataSourceId(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.DataSourceId"));
		metastoreDescribeKafkaTopicResponse.setTopicName(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.TopicName"));
		metastoreDescribeKafkaTopicResponse.setNumPartitions(_ctx.integerValue("MetastoreDescribeKafkaTopicResponse.NumPartitions"));
		metastoreDescribeKafkaTopicResponse.setReplicationFactor(_ctx.integerValue("MetastoreDescribeKafkaTopicResponse.ReplicationFactor"));
		metastoreDescribeKafkaTopicResponse.setGmtCreate(_ctx.longValue("MetastoreDescribeKafkaTopicResponse.GmtCreate"));
		metastoreDescribeKafkaTopicResponse.setGmtModified(_ctx.longValue("MetastoreDescribeKafkaTopicResponse.GmtModified"));
		metastoreDescribeKafkaTopicResponse.setBrokerTotal(_ctx.integerValue("MetastoreDescribeKafkaTopicResponse.BrokerTotal"));
		metastoreDescribeKafkaTopicResponse.setNumUsingBrokers(_ctx.integerValue("MetastoreDescribeKafkaTopicResponse.NumUsingBrokers"));
		metastoreDescribeKafkaTopicResponse.setBrokersLeaderSkewPercentage(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.BrokersLeaderSkewPercentage"));
		metastoreDescribeKafkaTopicResponse.setUnderReplicatedPercentage(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.UnderReplicatedPercentage"));
		metastoreDescribeKafkaTopicResponse.setPreferredReplicasPercentage(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.PreferredReplicasPercentage"));
		metastoreDescribeKafkaTopicResponse.setStatus(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.Status"));
		metastoreDescribeKafkaTopicResponse.setReassignId(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.ReassignId"));

		Cluster cluster = new Cluster();
		cluster.setClusterBizId(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.Cluster.ClusterBizId"));
		cluster.setClusterName(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.Cluster.ClusterName"));
		cluster.setClusterStatus(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.Cluster.ClusterStatus"));
		metastoreDescribeKafkaTopicResponse.setCluster(cluster);

		List<AdvancedConfig> advancedConfigList = new ArrayList<AdvancedConfig>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreDescribeKafkaTopicResponse.AdvancedConfigList.Length"); i++) {
			AdvancedConfig advancedConfig = new AdvancedConfig();
			advancedConfig.setKey(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.AdvancedConfigList["+ i +"].Key"));
			advancedConfig.setValue(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.AdvancedConfigList["+ i +"].Value"));

			advancedConfigList.add(advancedConfig);
		}
		metastoreDescribeKafkaTopicResponse.setAdvancedConfigList(advancedConfigList);

		List<Summary> summaryList = new ArrayList<Summary>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreDescribeKafkaTopicResponse.SummaryList.Length"); i++) {
			Summary summary = new Summary();
			summary.setKey(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.SummaryList["+ i +"].Key"));
			summary.setValue(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.SummaryList["+ i +"].Value"));

			summaryList.add(summary);
		}
		metastoreDescribeKafkaTopicResponse.setSummaryList(summaryList);

		List<Distribution> distributionList = new ArrayList<Distribution>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreDescribeKafkaTopicResponse.DistributionList.Length"); i++) {
			Distribution distribution = new Distribution();
			distribution.setPartition(_ctx.integerValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].Partition"));
			distribution.setOffset(_ctx.longValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].Offset"));
			distribution.setLeader(_ctx.integerValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].Leader"));
			distribution.setPreferredLeader(_ctx.booleanValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].PreferredLeader"));
			distribution.setUnderReplicated(_ctx.booleanValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].UnderReplicated"));
			distribution.setLogEndOffset(_ctx.longValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].LogEndOffset"));

			List<String> isrList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].IsrList.Length"); j++) {
				isrList.add(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].IsrList["+ j +"]"));
			}
			distribution.setIsrList(isrList);

			List<String> replicaList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].ReplicaList.Length"); j++) {
				replicaList.add(_ctx.stringValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].ReplicaList["+ j +"]"));
			}
			distribution.setReplicaList(replicaList);

			distributionList.add(distribution);
		}
		metastoreDescribeKafkaTopicResponse.setDistributionList(distributionList);
	 
	 	return metastoreDescribeKafkaTopicResponse;
	}
}