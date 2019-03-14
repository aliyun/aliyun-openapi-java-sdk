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

import com.aliyuncs.emr.model.v20160408.MetastoreDescribeKafkaConsumerGroupResponse;
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeKafkaConsumerGroupResponse.Partition;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreDescribeKafkaConsumerGroupResponseUnmarshaller {

	public static MetastoreDescribeKafkaConsumerGroupResponse unmarshall(MetastoreDescribeKafkaConsumerGroupResponse metastoreDescribeKafkaConsumerGroupResponse, UnmarshallerContext context) {
		
		metastoreDescribeKafkaConsumerGroupResponse.setRequestId(context.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.RequestId"));
		metastoreDescribeKafkaConsumerGroupResponse.setId(context.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.Id"));
		metastoreDescribeKafkaConsumerGroupResponse.setDataSourceId(context.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.DataSourceId"));
		metastoreDescribeKafkaConsumerGroupResponse.setConsumerGroup(context.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.ConsumerGroup"));
		metastoreDescribeKafkaConsumerGroupResponse.setConsumerType(context.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.ConsumerType"));
		metastoreDescribeKafkaConsumerGroupResponse.setTotalLag(context.longValue("MetastoreDescribeKafkaConsumerGroupResponse.TotalLag"));
		metastoreDescribeKafkaConsumerGroupResponse.setPartitionProportion(context.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionProportion"));
		metastoreDescribeKafkaConsumerGroupResponse.setGmtCreate(context.longValue("MetastoreDescribeKafkaConsumerGroupResponse.GmtCreate"));
		metastoreDescribeKafkaConsumerGroupResponse.setGmtModified(context.longValue("MetastoreDescribeKafkaConsumerGroupResponse.GmtModified"));

		List<Partition> partitionList = new ArrayList<Partition>();
		for (int i = 0; i < context.lengthValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList.Length"); i++) {
			Partition partition = new Partition();
			partition.setDataSourceId(context.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].DataSourceId"));
			partition.setConsumerGroupId(context.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].ConsumerGroupId"));
			partition.setPartitionId(context.integerValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].PartitionId"));
			partition.setConsumerOffset(context.longValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].ConsumerOffset"));
			partition.setLogEndOffset(context.longValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].LogEndOffset"));
			partition.setLag(context.longValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].Lag"));
			partition.setConsumerInstanceOwner(context.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].ConsumerInstanceOwner"));
			partition.setGmtCreate(context.longValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].GmtCreate"));
			partition.setGmtModified(context.longValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].GmtModified"));

			partitionList.add(partition);
		}
		metastoreDescribeKafkaConsumerGroupResponse.setPartitionList(partitionList);
	 
	 	return metastoreDescribeKafkaConsumerGroupResponse;
	}
}