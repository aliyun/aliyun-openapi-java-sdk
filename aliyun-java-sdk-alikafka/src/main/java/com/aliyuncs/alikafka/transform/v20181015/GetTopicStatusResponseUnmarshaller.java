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

package com.aliyuncs.alikafka.transform.v20181015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20181015.GetTopicStatusResponse;
import com.aliyuncs.alikafka.model.v20181015.GetTopicStatusResponse.TopicStatus;
import com.aliyuncs.alikafka.model.v20181015.GetTopicStatusResponse.TopicStatus.OffsetTableItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTopicStatusResponseUnmarshaller {

	public static GetTopicStatusResponse unmarshall(GetTopicStatusResponse getTopicStatusResponse, UnmarshallerContext context) {
		
		getTopicStatusResponse.setRequestId(context.stringValue("GetTopicStatusResponse.RequestId"));
		getTopicStatusResponse.setSuccess(context.booleanValue("GetTopicStatusResponse.Success"));
		getTopicStatusResponse.setCode(context.integerValue("GetTopicStatusResponse.Code"));
		getTopicStatusResponse.setMessage(context.stringValue("GetTopicStatusResponse.Message"));

		TopicStatus topicStatus = new TopicStatus();
		topicStatus.setTotalCount(context.longValue("GetTopicStatusResponse.TopicStatus.TotalCount"));
		topicStatus.setLastTimeStamp(context.longValue("GetTopicStatusResponse.TopicStatus.LastTimeStamp"));

		List<OffsetTableItem> offsetTable = new ArrayList<OffsetTableItem>();
		for (int i = 0; i < context.lengthValue("GetTopicStatusResponse.TopicStatus.OffsetTable.Length"); i++) {
			OffsetTableItem offsetTableItem = new OffsetTableItem();
			offsetTableItem.setMinOffset(context.longValue("GetTopicStatusResponse.TopicStatus.OffsetTable["+ i +"].MinOffset"));
			offsetTableItem.setMaxOffset(context.longValue("GetTopicStatusResponse.TopicStatus.OffsetTable["+ i +"].MaxOffset"));
			offsetTableItem.setLastUpdateTimestamp(context.longValue("GetTopicStatusResponse.TopicStatus.OffsetTable["+ i +"].LastUpdateTimestamp"));
			offsetTableItem.setTopic(context.stringValue("GetTopicStatusResponse.TopicStatus.OffsetTable["+ i +"].Topic"));
			offsetTableItem.setPartition(context.integerValue("GetTopicStatusResponse.TopicStatus.OffsetTable["+ i +"].Partition"));

			offsetTable.add(offsetTableItem);
		}
		topicStatus.setOffsetTable(offsetTable);
		getTopicStatusResponse.setTopicStatus(topicStatus);
	 
	 	return getTopicStatusResponse;
	}
}