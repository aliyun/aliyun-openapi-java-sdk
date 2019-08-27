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

import com.aliyuncs.emr.model.v20160408.MetastoreListKafkaTopicResponse;
import com.aliyuncs.emr.model.v20160408.MetastoreListKafkaTopicResponse.Topic;
import com.aliyuncs.emr.model.v20160408.MetastoreListKafkaTopicResponse.Topic.AdvancedConfig;
import com.aliyuncs.emr.model.v20160408.MetastoreListKafkaTopicResponse.Topic.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreListKafkaTopicResponseUnmarshaller {

	public static MetastoreListKafkaTopicResponse unmarshall(MetastoreListKafkaTopicResponse metastoreListKafkaTopicResponse, UnmarshallerContext _ctx) {
		
		metastoreListKafkaTopicResponse.setRequestId(_ctx.stringValue("MetastoreListKafkaTopicResponse.RequestId"));
		metastoreListKafkaTopicResponse.setTotalCount(_ctx.integerValue("MetastoreListKafkaTopicResponse.TotalCount"));
		metastoreListKafkaTopicResponse.setPageNumber(_ctx.integerValue("MetastoreListKafkaTopicResponse.PageNumber"));
		metastoreListKafkaTopicResponse.setPageSize(_ctx.integerValue("MetastoreListKafkaTopicResponse.PageSize"));

		List<Topic> topicList = new ArrayList<Topic>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreListKafkaTopicResponse.TopicList.Length"); i++) {
			Topic topic = new Topic();
			topic.setId(_ctx.stringValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].Id"));
			topic.setDataSourceId(_ctx.stringValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].DataSourceId"));
			topic.setTopicName(_ctx.stringValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].TopicName"));
			topic.setNumPartitions(_ctx.integerValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].NumPartitions"));
			topic.setReplicationFactor(_ctx.integerValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].ReplicationFactor"));
			topic.setGmtCreate(_ctx.longValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].GmtCreate"));
			topic.setGmtModified(_ctx.longValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].GmtModified"));
			topic.setStatus(_ctx.stringValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].Status"));
			topic.setReassignId(_ctx.stringValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].ReassignId"));

			Cluster cluster = new Cluster();
			cluster.setClusterBizId(_ctx.stringValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].Cluster.ClusterBizId"));
			cluster.setClusterName(_ctx.stringValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].Cluster.ClusterName"));
			cluster.setClusterStatus(_ctx.stringValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].Cluster.ClusterStatus"));
			topic.setCluster(cluster);

			List<AdvancedConfig> advancedConfigList = new ArrayList<AdvancedConfig>();
			for (int j = 0; j < _ctx.lengthValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].AdvancedConfigList.Length"); j++) {
				AdvancedConfig advancedConfig = new AdvancedConfig();
				advancedConfig.setKey(_ctx.stringValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].AdvancedConfigList["+ j +"].Key"));
				advancedConfig.setValue(_ctx.stringValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].AdvancedConfigList["+ j +"].Value"));

				advancedConfigList.add(advancedConfig);
			}
			topic.setAdvancedConfigList(advancedConfigList);

			topicList.add(topic);
		}
		metastoreListKafkaTopicResponse.setTopicList(topicList);
	 
	 	return metastoreListKafkaTopicResponse;
	}
}