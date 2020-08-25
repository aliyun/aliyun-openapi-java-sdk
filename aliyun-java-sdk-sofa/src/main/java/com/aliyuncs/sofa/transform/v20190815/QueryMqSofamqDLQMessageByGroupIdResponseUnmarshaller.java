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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqDLQMessageByGroupIdResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqDLQMessageByGroupIdResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqDLQMessageByGroupIdResponse.Data.ContentItem;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqDLQMessageByGroupIdResponse.Data.ContentItem.PropertyListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMqSofamqDLQMessageByGroupIdResponseUnmarshaller {

	public static QueryMqSofamqDLQMessageByGroupIdResponse unmarshall(QueryMqSofamqDLQMessageByGroupIdResponse queryMqSofamqDLQMessageByGroupIdResponse, UnmarshallerContext _ctx) {
		
		queryMqSofamqDLQMessageByGroupIdResponse.setRequestId(_ctx.stringValue("QueryMqSofamqDLQMessageByGroupIdResponse.RequestId"));
		queryMqSofamqDLQMessageByGroupIdResponse.setResultCode(_ctx.stringValue("QueryMqSofamqDLQMessageByGroupIdResponse.ResultCode"));
		queryMqSofamqDLQMessageByGroupIdResponse.setResultMessage(_ctx.stringValue("QueryMqSofamqDLQMessageByGroupIdResponse.ResultMessage"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.PageSize"));
		data.setTaskId(_ctx.stringValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.TaskId"));
		data.setTotal(_ctx.longValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.Total"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setBody(_ctx.stringValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.Content["+ i +"].Body"));
			contentItem.setBodyCrc(_ctx.longValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.Content["+ i +"].BodyCrc"));
			contentItem.setBornHost(_ctx.stringValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.Content["+ i +"].BornHost"));
			contentItem.setBornTimestamp(_ctx.longValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.Content["+ i +"].BornTimestamp"));
			contentItem.setInstanceId(_ctx.stringValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.Content["+ i +"].InstanceId"));
			contentItem.setMsgId(_ctx.stringValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.Content["+ i +"].MsgId"));
			contentItem.setReconsumeTimes(_ctx.longValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.Content["+ i +"].ReconsumeTimes"));
			contentItem.setStoreHost(_ctx.stringValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.Content["+ i +"].StoreHost"));
			contentItem.setStoreSize(_ctx.longValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.Content["+ i +"].StoreSize"));
			contentItem.setStoreTimestamp(_ctx.longValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.Content["+ i +"].StoreTimestamp"));
			contentItem.setTopic(_ctx.stringValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.Content["+ i +"].Topic"));

			List<PropertyListItem> propertyList = new ArrayList<PropertyListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.Content["+ i +"].PropertyList.Length"); j++) {
				PropertyListItem propertyListItem = new PropertyListItem();
				propertyListItem.setName(_ctx.stringValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.Content["+ i +"].PropertyList["+ j +"].Name"));
				propertyListItem.setValue(_ctx.stringValue("QueryMqSofamqDLQMessageByGroupIdResponse.Data.Content["+ i +"].PropertyList["+ j +"].Value"));

				propertyList.add(propertyListItem);
			}
			contentItem.setPropertyList(propertyList);

			content.add(contentItem);
		}
		data.setContent(content);
		queryMqSofamqDLQMessageByGroupIdResponse.setData(data);
	 
	 	return queryMqSofamqDLQMessageByGroupIdResponse;
	}
}