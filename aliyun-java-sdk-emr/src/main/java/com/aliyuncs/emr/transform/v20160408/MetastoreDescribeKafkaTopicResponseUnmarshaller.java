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

	public static MetastoreDescribeKafkaTopicResponse unmarshall(MetastoreDescribeKafkaTopicResponse metastoreDescribeKafkaTopicResponse, UnmarshallerContext context) {
		
		metastoreDescribeKafkaTopicResponse.setRequestId(context.stringValue("MetastoreDescribeKafkaTopicResponse.RequestId"));
		metastoreDescribeKafkaTopicResponse.setId(context.stringValue("MetastoreDescribeKafkaTopicResponse.Id"));
		metastoreDescribeKafkaTopicResponse.setDataSourceId(context.stringValue("MetastoreDescribeKafkaTopicResponse.DataSourceId"));
		metastoreDescribeKafkaTopicResponse.setTopicName(context.stringValue("MetastoreDescribeKafkaTopicResponse.TopicName"));
		metastoreDescribeKafkaTopicResponse.setNumPartitions(context.integerValue("MetastoreDescribeKafkaTopicResponse.NumPartitions"));
		metastoreDescribeKafkaTopicResponse.setReplicationFactor(context.integerValue("MetastoreDescribeKafkaTopicResponse.ReplicationFactor"));
		metastoreDescribeKafkaTopicResponse.setGmtCreate(context.longValue("MetastoreDescribeKafkaTopicResponse.GmtCreate"));
		metastoreDescribeKafkaTopicResponse.setGmtModified(context.longValue("MetastoreDescribeKafkaTopicResponse.GmtModified"));
		metastoreDescribeKafkaTopicResponse.setBrokerTotal(context.integerValue("MetastoreDescribeKafkaTopicResponse.BrokerTotal"));
		metastoreDescribeKafkaTopicResponse.setNumUsingBrokers(context.integerValue("MetastoreDescribeKafkaTopicResponse.NumUsingBrokers"));
		metastoreDescribeKafkaTopicResponse.setBrokersLeaderSkewPercentage(context.stringValue("MetastoreDescribeKafkaTopicResponse.BrokersLeaderSkewPercentage"));
		metastoreDescribeKafkaTopicResponse.setUnderReplicatedPercentage(context.stringValue("MetastoreDescribeKafkaTopicResponse.UnderReplicatedPercentage"));
		metastoreDescribeKafkaTopicResponse.setPreferredReplicasPercentage(context.stringValue("MetastoreDescribeKafkaTopicResponse.PreferredReplicasPercentage"));

		Cluster cluster = new Cluster();
		cluster.setClusterBizId(context.stringValue("MetastoreDescribeKafkaTopicResponse.Cluster.ClusterBizId"));
		cluster.setClusterName(context.stringValue("MetastoreDescribeKafkaTopicResponse.Cluster.ClusterName"));
		cluster.setClusterStatus(context.stringValue("MetastoreDescribeKafkaTopicResponse.Cluster.ClusterStatus"));
		metastoreDescribeKafkaTopicResponse.setCluster(cluster);

		List<AdvancedConfig> advancedConfigList = new ArrayList<AdvancedConfig>();
		for (int i = 0; i < context.lengthValue("MetastoreDescribeKafkaTopicResponse.AdvancedConfigList.Length"); i++) {
			AdvancedConfig advancedConfig = new AdvancedConfig();
			advancedConfig.setKey(context.stringValue("MetastoreDescribeKafkaTopicResponse.AdvancedConfigList["+ i +"].Key"));
			advancedConfig.setValue(context.stringValue("MetastoreDescribeKafkaTopicResponse.AdvancedConfigList["+ i +"].Value"));

			advancedConfigList.add(advancedConfig);
		}
		metastoreDescribeKafkaTopicResponse.setAdvancedConfigList(advancedConfigList);

		List<Summary> summaryList = new ArrayList<Summary>();
		for (int i = 0; i < context.lengthValue("MetastoreDescribeKafkaTopicResponse.SummaryList.Length"); i++) {
			Summary summary = new Summary();
			summary.setKey(context.stringValue("MetastoreDescribeKafkaTopicResponse.SummaryList["+ i +"].Key"));
			summary.setValue(context.stringValue("MetastoreDescribeKafkaTopicResponse.SummaryList["+ i +"].Value"));

			summaryList.add(summary);
		}
		metastoreDescribeKafkaTopicResponse.setSummaryList(summaryList);

		List<Distribution> distributionList = new ArrayList<Distribution>();
		for (int i = 0; i < context.lengthValue("MetastoreDescribeKafkaTopicResponse.DistributionList.Length"); i++) {
			Distribution distribution = new Distribution();
			distribution.setPartition(context.integerValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].Partition"));
			distribution.setOffset(context.longValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].Offset"));
			distribution.setLeader(context.integerValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].Leader"));
			distribution.setPreferredLeader(context.booleanValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].PreferredLeader"));
			distribution.setUnderReplicated(context.booleanValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].UnderReplicated"));
			distribution.setLogEndOffset(context.longValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].LogEndOffset"));

			List<String> isrList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].IsrList.Length"); j++) {
				isrList.add(context.stringValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].IsrList["+ j +"]"));
			}
			distribution.setIsrList(isrList);

			List<String> replicaList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].ReplicaList.Length"); j++) {
				replicaList.add(context.stringValue("MetastoreDescribeKafkaTopicResponse.DistributionList["+ i +"].ReplicaList["+ j +"]"));
			}
			distribution.setReplicaList(replicaList);

			distributionList.add(distribution);
		}
		metastoreDescribeKafkaTopicResponse.setDistributionList(distributionList);
	 
	 	return metastoreDescribeKafkaTopicResponse;
	}
}