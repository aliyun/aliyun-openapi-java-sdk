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

import com.aliyuncs.sofa.model.v20190815.ListMqSofamqRouterconfigResponse;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqRouterconfigResponse.Data;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqRouterconfigResponse.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMqSofamqRouterconfigResponseUnmarshaller {

	public static ListMqSofamqRouterconfigResponse unmarshall(ListMqSofamqRouterconfigResponse listMqSofamqRouterconfigResponse, UnmarshallerContext _ctx) {
		
		listMqSofamqRouterconfigResponse.setRequestId(_ctx.stringValue("ListMqSofamqRouterconfigResponse.RequestId"));
		listMqSofamqRouterconfigResponse.setResultCode(_ctx.stringValue("ListMqSofamqRouterconfigResponse.ResultCode"));
		listMqSofamqRouterconfigResponse.setResultMessage(_ctx.stringValue("ListMqSofamqRouterconfigResponse.ResultMessage"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("ListMqSofamqRouterconfigResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("ListMqSofamqRouterconfigResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListMqSofamqRouterconfigResponse.Data.Total"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMqSofamqRouterconfigResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setConsumerId(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].ConsumerId"));
			contentItem.setConsumeFromType(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].ConsumeFromType"));
			contentItem.setConsumeFromValue(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].ConsumeFromValue"));
			contentItem.setConsumeToType(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].ConsumeToType"));
			contentItem.setConsumeToValue(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].ConsumeToValue"));
			contentItem.setDescription(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].Description"));
			contentItem.setDestinationCell(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].DestinationCell"));
			contentItem.setDestinationNamespaceId(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].DestinationNamespaceId"));
			contentItem.setDestinationTopic(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].DestinationTopic"));
			contentItem.setDisaster(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].Disaster"));
			contentItem.setGmtCreate(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].GmtCreate"));
			contentItem.setGmtModified(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].GmtModified"));
			contentItem.setId(_ctx.longValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].Id"));
			contentItem.setSourceCell(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].SourceCell"));
			contentItem.setSourceNamespaceId(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].SourceNamespaceId"));
			contentItem.setSourceTopic(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].SourceTopic"));
			contentItem.setTag(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].Tag"));
			contentItem.setTaskStatus(_ctx.stringValue("ListMqSofamqRouterconfigResponse.Data.Content["+ i +"].TaskStatus"));

			content.add(contentItem);
		}
		data.setContent(content);
		listMqSofamqRouterconfigResponse.setData(data);
	 
	 	return listMqSofamqRouterconfigResponse;
	}
}