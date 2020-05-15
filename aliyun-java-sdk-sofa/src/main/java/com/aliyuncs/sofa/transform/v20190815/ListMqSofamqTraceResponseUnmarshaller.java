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

import com.aliyuncs.sofa.model.v20190815.ListMqSofamqTraceResponse;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqTraceResponse.Data;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqTraceResponse.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMqSofamqTraceResponseUnmarshaller {

	public static ListMqSofamqTraceResponse unmarshall(ListMqSofamqTraceResponse listMqSofamqTraceResponse, UnmarshallerContext _ctx) {
		
		listMqSofamqTraceResponse.setRequestId(_ctx.stringValue("ListMqSofamqTraceResponse.RequestId"));
		listMqSofamqTraceResponse.setResultCode(_ctx.stringValue("ListMqSofamqTraceResponse.ResultCode"));
		listMqSofamqTraceResponse.setResultMessage(_ctx.stringValue("ListMqSofamqTraceResponse.ResultMessage"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("ListMqSofamqTraceResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("ListMqSofamqTraceResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListMqSofamqTraceResponse.Data.Total"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMqSofamqTraceResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setCell(_ctx.stringValue("ListMqSofamqTraceResponse.Data.Content["+ i +"].Cell"));
			contentItem.setGmtCreate(_ctx.longValue("ListMqSofamqTraceResponse.Data.Content["+ i +"].GmtCreate"));
			contentItem.setGmtModified(_ctx.longValue("ListMqSofamqTraceResponse.Data.Content["+ i +"].GmtModified"));
			contentItem.setInstanceId(_ctx.stringValue("ListMqSofamqTraceResponse.Data.Content["+ i +"].InstanceId"));
			contentItem.setMsgId(_ctx.stringValue("ListMqSofamqTraceResponse.Data.Content["+ i +"].MsgId"));
			contentItem.setMsgKey(_ctx.stringValue("ListMqSofamqTraceResponse.Data.Content["+ i +"].MsgKey"));
			contentItem.setQueryId(_ctx.stringValue("ListMqSofamqTraceResponse.Data.Content["+ i +"].QueryId"));
			contentItem.setStatus(_ctx.stringValue("ListMqSofamqTraceResponse.Data.Content["+ i +"].Status"));
			contentItem.setTopic(_ctx.stringValue("ListMqSofamqTraceResponse.Data.Content["+ i +"].Topic"));

			content.add(contentItem);
		}
		data.setContent(content);
		listMqSofamqTraceResponse.setData(data);
	 
	 	return listMqSofamqTraceResponse;
	}
}