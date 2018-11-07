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
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeKafkaTopicResponse.Distribution;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreDescribeKafkaTopicResponseUnmarshaller {

	public static MetastoreDescribeKafkaTopicResponse unmarshall(MetastoreDescribeKafkaTopicResponse metastoreDescribeKafkaTopicResponse, UnmarshallerContext context) {
		
		metastoreDescribeKafkaTopicResponse.setRequestId(context.stringValue("MetastoreDescribeKafkaTopicResponse.RequestId"));
		metastoreDescribeKafkaTopicResponse.setId(context.stringValue("MetastoreDescribeKafkaTopicResponse.Id"));
		metastoreDescribeKafkaTopicResponse.setDataSourceId(context.stringValue("MetastoreDescribeKafkaTopicResponse.DataSourceId"));
		metastoreDescribeKafkaTopicResponse.setNumPartitions(context.integerValue("MetastoreDescribeKafkaTopicResponse.NumPartitions"));
		metastoreDescribeKafkaTopicResponse.setReplicationFactor(context.integerValue("MetastoreDescribeKafkaTopicResponse.ReplicationFactor"));
		metastoreDescribeKafkaTopicResponse.setGmtCreate(context.longValue("MetastoreDescribeKafkaTopicResponse.GmtCreate"));
		metastoreDescribeKafkaTopicResponse.setGmtModified(context.longValue("MetastoreDescribeKafkaTopicResponse.GmtModified"));

		Distribution distribution = new Distribution();
		distribution.setPartition(context.integerValue("MetastoreDescribeKafkaTopicResponse.Distribution.Partition"));
		distribution.setLeader(context.integerValue("MetastoreDescribeKafkaTopicResponse.Distribution.Leader"));
		distribution.setPreferredLeader(context.booleanValue("MetastoreDescribeKafkaTopicResponse.Distribution.PreferredLeader"));
		distribution.setUnderReplicated(context.booleanValue("MetastoreDescribeKafkaTopicResponse.Distribution.UnderReplicated"));

		List<String> isrList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("MetastoreDescribeKafkaTopicResponse.Distribution.IsrList.Length"); i++) {
			isrList.add(context.stringValue("MetastoreDescribeKafkaTopicResponse.Distribution.IsrList["+ i +"]"));
		}
		distribution.setIsrList(isrList);

		List<String> replicaList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("MetastoreDescribeKafkaTopicResponse.Distribution.ReplicaList.Length"); i++) {
			replicaList.add(context.stringValue("MetastoreDescribeKafkaTopicResponse.Distribution.ReplicaList["+ i +"]"));
		}
		distribution.setReplicaList(replicaList);
		metastoreDescribeKafkaTopicResponse.setDistribution(distribution);

		List<AdvancedConfig> advancedConfigList = new ArrayList<AdvancedConfig>();
		for (int i = 0; i < context.lengthValue("MetastoreDescribeKafkaTopicResponse.AdvancedConfigList.Length"); i++) {
			AdvancedConfig advancedConfig = new AdvancedConfig();
			advancedConfig.setKey(context.stringValue("MetastoreDescribeKafkaTopicResponse.AdvancedConfigList["+ i +"].Key"));
			advancedConfig.setValue(context.stringValue("MetastoreDescribeKafkaTopicResponse.AdvancedConfigList["+ i +"].Value"));

			advancedConfigList.add(advancedConfig);
		}
		metastoreDescribeKafkaTopicResponse.setAdvancedConfigList(advancedConfigList);
	 
	 	return metastoreDescribeKafkaTopicResponse;
	}
}