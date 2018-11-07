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
import com.aliyuncs.emr.model.v20160408.MetastoreListKafkaConsumerGroupResponse.ConsumeGroup;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreListKafkaConsumerGroupResponseUnmarshaller {

	public static MetastoreListKafkaConsumerGroupResponse unmarshall(MetastoreListKafkaConsumerGroupResponse metastoreListKafkaConsumerGroupResponse, UnmarshallerContext context) {
		
		metastoreListKafkaConsumerGroupResponse.setRequestId(context.stringValue("MetastoreListKafkaConsumerGroupResponse.RequestId"));
		metastoreListKafkaConsumerGroupResponse.setTotalCount(context.integerValue("MetastoreListKafkaConsumerGroupResponse.TotalCount"));
		metastoreListKafkaConsumerGroupResponse.setPageNumber(context.integerValue("MetastoreListKafkaConsumerGroupResponse.PageNumber"));
		metastoreListKafkaConsumerGroupResponse.setPageSize(context.integerValue("MetastoreListKafkaConsumerGroupResponse.PageSize"));

		List<ConsumeGroup> consumeGroupList = new ArrayList<ConsumeGroup>();
		for (int i = 0; i < context.lengthValue("MetastoreListKafkaConsumerGroupResponse.ConsumeGroupList.Length"); i++) {
			ConsumeGroup consumeGroup = new ConsumeGroup();
			consumeGroup.setId(context.stringValue("MetastoreListKafkaConsumerGroupResponse.ConsumeGroupList["+ i +"].Id"));
			consumeGroup.setDataSourceId(context.stringValue("MetastoreListKafkaConsumerGroupResponse.ConsumeGroupList["+ i +"].DataSourceId"));
			consumeGroup.setConsumerGroup(context.stringValue("MetastoreListKafkaConsumerGroupResponse.ConsumeGroupList["+ i +"].ConsumerGroup"));
			consumeGroup.setConsumerType(context.stringValue("MetastoreListKafkaConsumerGroupResponse.ConsumeGroupList["+ i +"].ConsumerType"));
			consumeGroup.setTotalLag(context.integerValue("MetastoreListKafkaConsumerGroupResponse.ConsumeGroupList["+ i +"].TotalLag"));
			consumeGroup.setGmtCreate(context.longValue("MetastoreListKafkaConsumerGroupResponse.ConsumeGroupList["+ i +"].GmtCreate"));
			consumeGroup.setGmtModified(context.longValue("MetastoreListKafkaConsumerGroupResponse.ConsumeGroupList["+ i +"].GmtModified"));

			consumeGroupList.add(consumeGroup);
		}
		metastoreListKafkaConsumerGroupResponse.setConsumeGroupList(consumeGroupList);
	 
	 	return metastoreListKafkaConsumerGroupResponse;
	}
}