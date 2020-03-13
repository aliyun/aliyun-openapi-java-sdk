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

import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqMessageByTopicResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqMessageByTopicResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqMessageByTopicResponse.Data.ContentItem;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqMessageByTopicResponse.Data.ContentItem.PropertyListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMqSofamqMessageByTopicResponseUnmarshaller {

	public static QueryMqSofamqMessageByTopicResponse unmarshall(QueryMqSofamqMessageByTopicResponse queryMqSofamqMessageByTopicResponse, UnmarshallerContext _ctx) {
		
		queryMqSofamqMessageByTopicResponse.setRequestId(_ctx.stringValue("QueryMqSofamqMessageByTopicResponse.RequestId"));
		queryMqSofamqMessageByTopicResponse.setResultCode(_ctx.stringValue("QueryMqSofamqMessageByTopicResponse.ResultCode"));
		queryMqSofamqMessageByTopicResponse.setResultMessage(_ctx.stringValue("QueryMqSofamqMessageByTopicResponse.ResultMessage"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("QueryMqSofamqMessageByTopicResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("QueryMqSofamqMessageByTopicResponse.Data.PageSize"));
		data.setTaskId(_ctx.stringValue("QueryMqSofamqMessageByTopicResponse.Data.TaskId"));
		data.setTotal(_ctx.longValue("QueryMqSofamqMessageByTopicResponse.Data.Total"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMqSofamqMessageByTopicResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setBody(_ctx.stringValue("QueryMqSofamqMessageByTopicResponse.Data.Content["+ i +"].Body"));
			contentItem.setBodyCrc(_ctx.longValue("QueryMqSofamqMessageByTopicResponse.Data.Content["+ i +"].BodyCrc"));
			contentItem.setBornHost(_ctx.stringValue("QueryMqSofamqMessageByTopicResponse.Data.Content["+ i +"].BornHost"));
			contentItem.setBornTimestamp(_ctx.longValue("QueryMqSofamqMessageByTopicResponse.Data.Content["+ i +"].BornTimestamp"));
			contentItem.setInstanceId(_ctx.stringValue("QueryMqSofamqMessageByTopicResponse.Data.Content["+ i +"].InstanceId"));
			contentItem.setMsgId(_ctx.stringValue("QueryMqSofamqMessageByTopicResponse.Data.Content["+ i +"].MsgId"));
			contentItem.setReconsumeTimes(_ctx.longValue("QueryMqSofamqMessageByTopicResponse.Data.Content["+ i +"].ReconsumeTimes"));
			contentItem.setStoreHost(_ctx.stringValue("QueryMqSofamqMessageByTopicResponse.Data.Content["+ i +"].StoreHost"));
			contentItem.setStoreSize(_ctx.longValue("QueryMqSofamqMessageByTopicResponse.Data.Content["+ i +"].StoreSize"));
			contentItem.setStoreTimestamp(_ctx.longValue("QueryMqSofamqMessageByTopicResponse.Data.Content["+ i +"].StoreTimestamp"));
			contentItem.setTopic(_ctx.stringValue("QueryMqSofamqMessageByTopicResponse.Data.Content["+ i +"].Topic"));

			List<PropertyListItem> propertyList = new ArrayList<PropertyListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMqSofamqMessageByTopicResponse.Data.Content["+ i +"].PropertyList.Length"); j++) {
				PropertyListItem propertyListItem = new PropertyListItem();
				propertyListItem.setName(_ctx.stringValue("QueryMqSofamqMessageByTopicResponse.Data.Content["+ i +"].PropertyList["+ j +"].Name"));
				propertyListItem.setValue(_ctx.stringValue("QueryMqSofamqMessageByTopicResponse.Data.Content["+ i +"].PropertyList["+ j +"].Value"));

				propertyList.add(propertyListItem);
			}
			contentItem.setPropertyList(propertyList);

			content.add(contentItem);
		}
		data.setContent(content);
		queryMqSofamqMessageByTopicResponse.setData(data);
	 
	 	return queryMqSofamqMessageByTopicResponse;
	}
}