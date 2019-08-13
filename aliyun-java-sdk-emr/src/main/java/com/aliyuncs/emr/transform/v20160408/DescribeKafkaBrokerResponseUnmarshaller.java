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

import com.aliyuncs.emr.model.v20160408.DescribeKafkaBrokerResponse;
import com.aliyuncs.emr.model.v20160408.DescribeKafkaBrokerResponse.Topic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKafkaBrokerResponseUnmarshaller {

	public static DescribeKafkaBrokerResponse unmarshall(DescribeKafkaBrokerResponse describeKafkaBrokerResponse, UnmarshallerContext _ctx) {
		
		describeKafkaBrokerResponse.setRequestId(_ctx.stringValue("DescribeKafkaBrokerResponse.RequestId"));
		describeKafkaBrokerResponse.setBrokerId(_ctx.integerValue("DescribeKafkaBrokerResponse.BrokerId"));
		describeKafkaBrokerResponse.setHostId(_ctx.stringValue("DescribeKafkaBrokerResponse.HostId"));
		describeKafkaBrokerResponse.setHostName(_ctx.stringValue("DescribeKafkaBrokerResponse.HostName"));
		describeKafkaBrokerResponse.setHostIp(_ctx.stringValue("DescribeKafkaBrokerResponse.HostIp"));
		describeKafkaBrokerResponse.setStatus(_ctx.stringValue("DescribeKafkaBrokerResponse.Status"));
		describeKafkaBrokerResponse.setPartitionCount(_ctx.integerValue("DescribeKafkaBrokerResponse.PartitionCount"));
		describeKafkaBrokerResponse.setLeaderCount(_ctx.integerValue("DescribeKafkaBrokerResponse.LeaderCount"));
		describeKafkaBrokerResponse.setTopicCount(_ctx.integerValue("DescribeKafkaBrokerResponse.TopicCount"));
		describeKafkaBrokerResponse.setDiskUnbalanceRate(_ctx.stringValue("DescribeKafkaBrokerResponse.DiskUnbalanceRate"));
		describeKafkaBrokerResponse.setDiskUsageMean(_ctx.stringValue("DescribeKafkaBrokerResponse.DiskUsageMean"));
		describeKafkaBrokerResponse.setDiskUsageMax(_ctx.stringValue("DescribeKafkaBrokerResponse.DiskUsageMax"));
		describeKafkaBrokerResponse.setDiskCapacity(_ctx.integerValue("DescribeKafkaBrokerResponse.DiskCapacity"));
		describeKafkaBrokerResponse.setTraffic(_ctx.stringValue("DescribeKafkaBrokerResponse.Traffic"));

		List<Topic> topicList = new ArrayList<Topic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeKafkaBrokerResponse.TopicList.Length"); i++) {
			Topic topic = new Topic();
			topic.setTopicId(_ctx.stringValue("DescribeKafkaBrokerResponse.TopicList["+ i +"].TopicId"));
			topic.setTopicName(_ctx.stringValue("DescribeKafkaBrokerResponse.TopicList["+ i +"].TopicName"));
			topic.setNumPartitions(_ctx.integerValue("DescribeKafkaBrokerResponse.TopicList["+ i +"].NumPartitions"));
			topic.setReplicationFactor(_ctx.integerValue("DescribeKafkaBrokerResponse.TopicList["+ i +"].ReplicationFactor"));
			topic.setBrokerNumPartitions(_ctx.integerValue("DescribeKafkaBrokerResponse.TopicList["+ i +"].BrokerNumPartitions"));
			topic.setLeaderCount(_ctx.integerValue("DescribeKafkaBrokerResponse.TopicList["+ i +"].LeaderCount"));

			List<String> partitionList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeKafkaBrokerResponse.TopicList["+ i +"].partitionList.Length"); j++) {
				partitionList.add(_ctx.stringValue("DescribeKafkaBrokerResponse.TopicList["+ i +"].partitionList["+ j +"]"));
			}
			topic.setPartitionList(partitionList);

			topicList.add(topic);
		}
		describeKafkaBrokerResponse.setTopicList(topicList);
	 
	 	return describeKafkaBrokerResponse;
	}
}