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

import com.aliyuncs.sofa.model.v20190815.ListMqSofamqWarnHistoryResponse;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqWarnHistoryResponse.Data;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqWarnHistoryResponse.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMqSofamqWarnHistoryResponseUnmarshaller {

	public static ListMqSofamqWarnHistoryResponse unmarshall(ListMqSofamqWarnHistoryResponse listMqSofamqWarnHistoryResponse, UnmarshallerContext _ctx) {
		
		listMqSofamqWarnHistoryResponse.setRequestId(_ctx.stringValue("ListMqSofamqWarnHistoryResponse.RequestId"));
		listMqSofamqWarnHistoryResponse.setResultMessage(_ctx.stringValue("ListMqSofamqWarnHistoryResponse.ResultMessage"));
		listMqSofamqWarnHistoryResponse.setResultCode(_ctx.stringValue("ListMqSofamqWarnHistoryResponse.ResultCode"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("ListMqSofamqWarnHistoryResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("ListMqSofamqWarnHistoryResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListMqSofamqWarnHistoryResponse.Data.Total"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMqSofamqWarnHistoryResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setWarnId(_ctx.longValue("ListMqSofamqWarnHistoryResponse.Data.Content["+ i +"].WarnId"));
			contentItem.setGroupId(_ctx.stringValue("ListMqSofamqWarnHistoryResponse.Data.Content["+ i +"].GroupId"));
			contentItem.setTopic(_ctx.stringValue("ListMqSofamqWarnHistoryResponse.Data.Content["+ i +"].Topic"));
			contentItem.setGmtCreate(_ctx.longValue("ListMqSofamqWarnHistoryResponse.Data.Content["+ i +"].GmtCreate"));
			contentItem.setWarnInfo(_ctx.stringValue("ListMqSofamqWarnHistoryResponse.Data.Content["+ i +"].WarnInfo"));
			contentItem.setInstanceId(_ctx.stringValue("ListMqSofamqWarnHistoryResponse.Data.Content["+ i +"].InstanceId"));
			contentItem.setGmtModified(_ctx.longValue("ListMqSofamqWarnHistoryResponse.Data.Content["+ i +"].GmtModified"));
			contentItem.setCell(_ctx.stringValue("ListMqSofamqWarnHistoryResponse.Data.Content["+ i +"].Cell"));

			content.add(contentItem);
		}
		data.setContent(content);
		listMqSofamqWarnHistoryResponse.setData(data);
	 
	 	return listMqSofamqWarnHistoryResponse;
	}
}