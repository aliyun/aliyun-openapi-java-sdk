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

import com.aliyuncs.sofa.model.v20190815.ListMqSofamqTopicResponse;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqTopicResponse.Data;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqTopicResponse.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMqSofamqTopicResponseUnmarshaller {

	public static ListMqSofamqTopicResponse unmarshall(ListMqSofamqTopicResponse listMqSofamqTopicResponse, UnmarshallerContext _ctx) {
		
		listMqSofamqTopicResponse.setRequestId(_ctx.stringValue("ListMqSofamqTopicResponse.RequestId"));
		listMqSofamqTopicResponse.setResultMessage(_ctx.stringValue("ListMqSofamqTopicResponse.ResultMessage"));
		listMqSofamqTopicResponse.setResultCode(_ctx.stringValue("ListMqSofamqTopicResponse.ResultCode"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("ListMqSofamqTopicResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("ListMqSofamqTopicResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListMqSofamqTopicResponse.Data.Total"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMqSofamqTopicResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setCluster(_ctx.stringValue("ListMqSofamqTopicResponse.Data.Content["+ i +"].Cluster"));
			contentItem.setRemark(_ctx.stringValue("ListMqSofamqTopicResponse.Data.Content["+ i +"].Remark"));
			contentItem.setWriteQueueNum(_ctx.longValue("ListMqSofamqTopicResponse.Data.Content["+ i +"].WriteQueueNum"));
			contentItem.setReadQueueNum(_ctx.longValue("ListMqSofamqTopicResponse.Data.Content["+ i +"].ReadQueueNum"));
			contentItem.setInstanceId(_ctx.stringValue("ListMqSofamqTopicResponse.Data.Content["+ i +"].InstanceId"));
			contentItem.setGmtModified(_ctx.longValue("ListMqSofamqTopicResponse.Data.Content["+ i +"].GmtModified"));
			contentItem.setMessageType(_ctx.longValue("ListMqSofamqTopicResponse.Data.Content["+ i +"].MessageType"));
			contentItem.setPerm(_ctx.longValue("ListMqSofamqTopicResponse.Data.Content["+ i +"].Perm"));
			contentItem.setTopic(_ctx.stringValue("ListMqSofamqTopicResponse.Data.Content["+ i +"].Topic"));
			contentItem.setGmtCreate(_ctx.longValue("ListMqSofamqTopicResponse.Data.Content["+ i +"].GmtCreate"));
			contentItem.setOperator(_ctx.stringValue("ListMqSofamqTopicResponse.Data.Content["+ i +"].Operator"));
			contentItem.setId(_ctx.longValue("ListMqSofamqTopicResponse.Data.Content["+ i +"].Id"));

			content.add(contentItem);
		}
		data.setContent(content);
		listMqSofamqTopicResponse.setData(data);
	 
	 	return listMqSofamqTopicResponse;
	}
}