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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreListKafkaTopicResponseUnmarshaller {

	public static MetastoreListKafkaTopicResponse unmarshall(MetastoreListKafkaTopicResponse metastoreListKafkaTopicResponse, UnmarshallerContext context) {
		
		metastoreListKafkaTopicResponse.setRequestId(context.stringValue("MetastoreListKafkaTopicResponse.RequestId"));
		metastoreListKafkaTopicResponse.setTotalCount(context.integerValue("MetastoreListKafkaTopicResponse.TotalCount"));
		metastoreListKafkaTopicResponse.setPageNumber(context.integerValue("MetastoreListKafkaTopicResponse.PageNumber"));
		metastoreListKafkaTopicResponse.setPageSize(context.integerValue("MetastoreListKafkaTopicResponse.PageSize"));

		List<Topic> topicList = new ArrayList<Topic>();
		for (int i = 0; i < context.lengthValue("MetastoreListKafkaTopicResponse.TopicList.Length"); i++) {
			Topic topic = new Topic();
			topic.setId(context.stringValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].Id"));
			topic.setDataSourceId(context.stringValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].DataSourceId"));
			topic.setNumPartitions(context.integerValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].NumPartitions"));
			topic.setReplicationFactor(context.integerValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].ReplicationFactor"));
			topic.setGmtCreate(context.longValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].GmtCreate"));
			topic.setGmtModified(context.longValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].GmtModified"));

			List<AdvancedConfig> advancedConfigList = new ArrayList<AdvancedConfig>();
			for (int j = 0; j < context.lengthValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].AdvancedConfigList.Length"); j++) {
				AdvancedConfig advancedConfig = new AdvancedConfig();
				advancedConfig.setKey(context.stringValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].AdvancedConfigList["+ j +"].Key"));
				advancedConfig.setValue(context.stringValue("MetastoreListKafkaTopicResponse.TopicList["+ i +"].AdvancedConfigList["+ j +"].Value"));

				advancedConfigList.add(advancedConfig);
			}
			topic.setAdvancedConfigList(advancedConfigList);

			topicList.add(topic);
		}
		metastoreListKafkaTopicResponse.setTopicList(topicList);
	 
	 	return metastoreListKafkaTopicResponse;
	}
}