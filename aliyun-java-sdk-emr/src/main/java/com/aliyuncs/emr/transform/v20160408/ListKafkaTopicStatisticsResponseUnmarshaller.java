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

import com.aliyuncs.emr.model.v20160408.ListKafkaTopicStatisticsResponse;
import com.aliyuncs.emr.model.v20160408.ListKafkaTopicStatisticsResponse.Topic;
import com.aliyuncs.emr.model.v20160408.ListKafkaTopicStatisticsResponse.Topic.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListKafkaTopicStatisticsResponseUnmarshaller {

	public static ListKafkaTopicStatisticsResponse unmarshall(ListKafkaTopicStatisticsResponse listKafkaTopicStatisticsResponse, UnmarshallerContext _ctx) {
		
		listKafkaTopicStatisticsResponse.setRequestId(_ctx.stringValue("ListKafkaTopicStatisticsResponse.RequestId"));
		listKafkaTopicStatisticsResponse.setTotal(_ctx.integerValue("ListKafkaTopicStatisticsResponse.Total"));
		listKafkaTopicStatisticsResponse.setPageSize(_ctx.integerValue("ListKafkaTopicStatisticsResponse.PageSize"));
		listKafkaTopicStatisticsResponse.setPageNumber(_ctx.integerValue("ListKafkaTopicStatisticsResponse.PageNumber"));

		List<Topic> topicList = new ArrayList<Topic>();
		for (int i = 0; i < _ctx.lengthValue("ListKafkaTopicStatisticsResponse.TopicList.Length"); i++) {
			Topic topic = new Topic();
			topic.setDataSourceId(_ctx.stringValue("ListKafkaTopicStatisticsResponse.TopicList["+ i +"].DataSourceId"));
			topic.setTopicId(_ctx.stringValue("ListKafkaTopicStatisticsResponse.TopicList["+ i +"].TopicId"));
			topic.setTopicName(_ctx.stringValue("ListKafkaTopicStatisticsResponse.TopicList["+ i +"].TopicName"));
			topic.setNumPartitions(_ctx.integerValue("ListKafkaTopicStatisticsResponse.TopicList["+ i +"].NumPartitions"));
			topic.setOffsetSum(_ctx.longValue("ListKafkaTopicStatisticsResponse.TopicList["+ i +"].OffsetSum"));
			topic.setOffsetRate(_ctx.stringValue("ListKafkaTopicStatisticsResponse.TopicList["+ i +"].OffsetRate"));
			topic.setUnderReplicatedPercentage(_ctx.stringValue("ListKafkaTopicStatisticsResponse.TopicList["+ i +"].UnderReplicatedPercentage"));
			topic.setMessageRate(_ctx.stringValue("ListKafkaTopicStatisticsResponse.TopicList["+ i +"].MessageRate"));
			topic.setBytesInPerSecondRate(_ctx.stringValue("ListKafkaTopicStatisticsResponse.TopicList["+ i +"].BytesInPerSecondRate"));
			topic.setBytesOutPerSecondRate(_ctx.stringValue("ListKafkaTopicStatisticsResponse.TopicList["+ i +"].BytesOutPerSecondRate"));

			Cluster cluster = new Cluster();
			cluster.setClusterId(_ctx.stringValue("ListKafkaTopicStatisticsResponse.TopicList["+ i +"].Cluster.ClusterId"));
			cluster.setClusterName(_ctx.stringValue("ListKafkaTopicStatisticsResponse.TopicList["+ i +"].Cluster.ClusterName"));
			cluster.setClusterStatus(_ctx.stringValue("ListKafkaTopicStatisticsResponse.TopicList["+ i +"].Cluster.ClusterStatus"));
			topic.setCluster(cluster);

			topicList.add(topic);
		}
		listKafkaTopicStatisticsResponse.setTopicList(topicList);
	 
	 	return listKafkaTopicStatisticsResponse;
	}
}