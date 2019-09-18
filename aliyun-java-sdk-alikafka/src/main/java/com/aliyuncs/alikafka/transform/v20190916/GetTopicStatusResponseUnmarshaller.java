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

package com.aliyuncs.alikafka.transform.v20190916;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20190916.GetTopicStatusResponse;
import com.aliyuncs.alikafka.model.v20190916.GetTopicStatusResponse.TopicStatus;
import com.aliyuncs.alikafka.model.v20190916.GetTopicStatusResponse.TopicStatus.OffsetTableItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTopicStatusResponseUnmarshaller {

	public static GetTopicStatusResponse unmarshall(GetTopicStatusResponse getTopicStatusResponse, UnmarshallerContext _ctx) {
		
		getTopicStatusResponse.setRequestId(_ctx.stringValue("GetTopicStatusResponse.RequestId"));
		getTopicStatusResponse.setSuccess(_ctx.booleanValue("GetTopicStatusResponse.Success"));
		getTopicStatusResponse.setCode(_ctx.integerValue("GetTopicStatusResponse.Code"));
		getTopicStatusResponse.setMessage(_ctx.stringValue("GetTopicStatusResponse.Message"));

		TopicStatus topicStatus = new TopicStatus();
		topicStatus.setTotalCount(_ctx.longValue("GetTopicStatusResponse.TopicStatus.TotalCount"));
		topicStatus.setLastTimeStamp(_ctx.longValue("GetTopicStatusResponse.TopicStatus.LastTimeStamp"));

		List<OffsetTableItem> offsetTable = new ArrayList<OffsetTableItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTopicStatusResponse.TopicStatus.OffsetTable.Length"); i++) {
			OffsetTableItem offsetTableItem = new OffsetTableItem();
			offsetTableItem.setMinOffset(_ctx.longValue("GetTopicStatusResponse.TopicStatus.OffsetTable["+ i +"].MinOffset"));
			offsetTableItem.setMaxOffset(_ctx.longValue("GetTopicStatusResponse.TopicStatus.OffsetTable["+ i +"].MaxOffset"));
			offsetTableItem.setLastUpdateTimestamp(_ctx.longValue("GetTopicStatusResponse.TopicStatus.OffsetTable["+ i +"].LastUpdateTimestamp"));
			offsetTableItem.setTopic(_ctx.stringValue("GetTopicStatusResponse.TopicStatus.OffsetTable["+ i +"].Topic"));
			offsetTableItem.setPartition(_ctx.integerValue("GetTopicStatusResponse.TopicStatus.OffsetTable["+ i +"].Partition"));

			offsetTable.add(offsetTableItem);
		}
		topicStatus.setOffsetTable(offsetTable);
		getTopicStatusResponse.setTopicStatus(topicStatus);
	 
	 	return getTopicStatusResponse;
	}
}