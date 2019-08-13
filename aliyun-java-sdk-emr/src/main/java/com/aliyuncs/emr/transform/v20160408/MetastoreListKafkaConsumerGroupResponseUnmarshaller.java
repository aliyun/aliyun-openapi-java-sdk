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

import com.aliyuncs.emr.model.v20160408.MetastoreListKafkaConsumerGroupResponse;
import com.aliyuncs.emr.model.v20160408.MetastoreListKafkaConsumerGroupResponse.ConsumerGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreListKafkaConsumerGroupResponseUnmarshaller {

	public static MetastoreListKafkaConsumerGroupResponse unmarshall(MetastoreListKafkaConsumerGroupResponse metastoreListKafkaConsumerGroupResponse, UnmarshallerContext _ctx) {
		
		metastoreListKafkaConsumerGroupResponse.setRequestId(_ctx.stringValue("MetastoreListKafkaConsumerGroupResponse.RequestId"));
		metastoreListKafkaConsumerGroupResponse.setTotalCount(_ctx.integerValue("MetastoreListKafkaConsumerGroupResponse.TotalCount"));
		metastoreListKafkaConsumerGroupResponse.setPageNumber(_ctx.integerValue("MetastoreListKafkaConsumerGroupResponse.PageNumber"));
		metastoreListKafkaConsumerGroupResponse.setPageSize(_ctx.integerValue("MetastoreListKafkaConsumerGroupResponse.PageSize"));

		List<ConsumerGroup> consumerGroupList = new ArrayList<ConsumerGroup>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreListKafkaConsumerGroupResponse.ConsumerGroupList.Length"); i++) {
			ConsumerGroup consumerGroup = new ConsumerGroup();
			consumerGroup.setId(_ctx.stringValue("MetastoreListKafkaConsumerGroupResponse.ConsumerGroupList["+ i +"].Id"));
			consumerGroup.setDataSourceId(_ctx.stringValue("MetastoreListKafkaConsumerGroupResponse.ConsumerGroupList["+ i +"].DataSourceId"));
			consumerGroup.setConsumerGroup(_ctx.stringValue("MetastoreListKafkaConsumerGroupResponse.ConsumerGroupList["+ i +"].ConsumerGroup"));
			consumerGroup.setConsumerType(_ctx.stringValue("MetastoreListKafkaConsumerGroupResponse.ConsumerGroupList["+ i +"].ConsumerType"));
			consumerGroup.setTotalLag(_ctx.longValue("MetastoreListKafkaConsumerGroupResponse.ConsumerGroupList["+ i +"].TotalLag"));
			consumerGroup.setGmtCreate(_ctx.longValue("MetastoreListKafkaConsumerGroupResponse.ConsumerGroupList["+ i +"].GmtCreate"));
			consumerGroup.setGmtModified(_ctx.longValue("MetastoreListKafkaConsumerGroupResponse.ConsumerGroupList["+ i +"].GmtModified"));
			consumerGroup.setPartitionProportion(_ctx.stringValue("MetastoreListKafkaConsumerGroupResponse.ConsumerGroupList["+ i +"].PartitionProportion"));

			consumerGroupList.add(consumerGroup);
		}
		metastoreListKafkaConsumerGroupResponse.setConsumerGroupList(consumerGroupList);
	 
	 	return metastoreListKafkaConsumerGroupResponse;
	}
}