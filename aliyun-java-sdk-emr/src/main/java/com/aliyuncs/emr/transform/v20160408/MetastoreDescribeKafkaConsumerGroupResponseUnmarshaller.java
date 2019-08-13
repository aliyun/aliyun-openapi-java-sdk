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

	public static MetastoreDescribeKafkaConsumerGroupResponse unmarshall(MetastoreDescribeKafkaConsumerGroupResponse metastoreDescribeKafkaConsumerGroupResponse, UnmarshallerContext _ctx) {
		
		metastoreDescribeKafkaConsumerGroupResponse.setRequestId(_ctx.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.RequestId"));
		metastoreDescribeKafkaConsumerGroupResponse.setId(_ctx.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.Id"));
		metastoreDescribeKafkaConsumerGroupResponse.setDataSourceId(_ctx.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.DataSourceId"));
		metastoreDescribeKafkaConsumerGroupResponse.setConsumerGroup(_ctx.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.ConsumerGroup"));
		metastoreDescribeKafkaConsumerGroupResponse.setConsumerType(_ctx.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.ConsumerType"));
		metastoreDescribeKafkaConsumerGroupResponse.setTotalLag(_ctx.longValue("MetastoreDescribeKafkaConsumerGroupResponse.TotalLag"));
		metastoreDescribeKafkaConsumerGroupResponse.setPartitionProportion(_ctx.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionProportion"));
		metastoreDescribeKafkaConsumerGroupResponse.setGmtCreate(_ctx.longValue("MetastoreDescribeKafkaConsumerGroupResponse.GmtCreate"));
		metastoreDescribeKafkaConsumerGroupResponse.setGmtModified(_ctx.longValue("MetastoreDescribeKafkaConsumerGroupResponse.GmtModified"));

		List<Partition> partitionList = new ArrayList<Partition>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList.Length"); i++) {
			Partition partition = new Partition();
			partition.setDataSourceId(_ctx.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].DataSourceId"));
			partition.setConsumerGroupId(_ctx.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].ConsumerGroupId"));
			partition.setPartitionId(_ctx.integerValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].PartitionId"));
			partition.setConsumerOffset(_ctx.longValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].ConsumerOffset"));
			partition.setLogEndOffset(_ctx.longValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].LogEndOffset"));
			partition.setLag(_ctx.longValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].Lag"));
			partition.setConsumerInstanceOwner(_ctx.stringValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].ConsumerInstanceOwner"));
			partition.setGmtCreate(_ctx.longValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].GmtCreate"));
			partition.setGmtModified(_ctx.longValue("MetastoreDescribeKafkaConsumerGroupResponse.PartitionList["+ i +"].GmtModified"));

			partitionList.add(partition);
		}
		metastoreDescribeKafkaConsumerGroupResponse.setPartitionList(partitionList);
	 
	 	return metastoreDescribeKafkaConsumerGroupResponse;
	}
}