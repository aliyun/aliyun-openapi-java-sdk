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

package com.aliyuncs.mpaas.transform.v20201028;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20201028.ListMdsCubeTasksResponse;
import com.aliyuncs.mpaas.model.v20201028.ListMdsCubeTasksResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.ListMdsCubeTasksResponse.ResultContent.Data;
import com.aliyuncs.mpaas.model.v20201028.ListMdsCubeTasksResponse.ResultContent.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMdsCubeTasksResponseUnmarshaller {

	public static ListMdsCubeTasksResponse unmarshall(ListMdsCubeTasksResponse listMdsCubeTasksResponse, UnmarshallerContext _ctx) {
		
		listMdsCubeTasksResponse.setRequestId(_ctx.stringValue("ListMdsCubeTasksResponse.RequestId"));
		listMdsCubeTasksResponse.setResultMessage(_ctx.stringValue("ListMdsCubeTasksResponse.ResultMessage"));
		listMdsCubeTasksResponse.setResultCode(_ctx.stringValue("ListMdsCubeTasksResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("ListMdsCubeTasksResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("ListMdsCubeTasksResponse.ResultContent.Data.RequestId"));
		data.setErrorCode(_ctx.stringValue("ListMdsCubeTasksResponse.ResultContent.Data.ErrorCode"));
		data.setSuccess(_ctx.booleanValue("ListMdsCubeTasksResponse.ResultContent.Data.Success"));
		data.setResultMsg(_ctx.stringValue("ListMdsCubeTasksResponse.ResultContent.Data.ResultMsg"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMdsCubeTasksResponse.ResultContent.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setPublishMode(_ctx.integerValue("ListMdsCubeTasksResponse.ResultContent.Data.Content["+ i +"].PublishMode"));
			contentItem.setAppCode(_ctx.stringValue("ListMdsCubeTasksResponse.ResultContent.Data.Content["+ i +"].AppCode"));
			contentItem.setResourceVersion(_ctx.stringValue("ListMdsCubeTasksResponse.ResultContent.Data.Content["+ i +"].ResourceVersion"));
			contentItem.setGreyNum(_ctx.integerValue("ListMdsCubeTasksResponse.ResultContent.Data.Content["+ i +"].GreyNum"));
			contentItem.setGreyConfigInfo(_ctx.stringValue("ListMdsCubeTasksResponse.ResultContent.Data.Content["+ i +"].GreyConfigInfo"));
			contentItem.setGmtModified(_ctx.stringValue("ListMdsCubeTasksResponse.ResultContent.Data.Content["+ i +"].GmtModified"));
			contentItem.setGreyEndtimeData(_ctx.stringValue("ListMdsCubeTasksResponse.ResultContent.Data.Content["+ i +"].GreyEndtimeData"));
			contentItem.setPublishType(_ctx.integerValue("ListMdsCubeTasksResponse.ResultContent.Data.Content["+ i +"].PublishType"));
			contentItem.setTaskStatus(_ctx.integerValue("ListMdsCubeTasksResponse.ResultContent.Data.Content["+ i +"].TaskStatus"));
			contentItem.setWhitelistIds(_ctx.stringValue("ListMdsCubeTasksResponse.ResultContent.Data.Content["+ i +"].WhitelistIds"));
			contentItem.setGmtCreate(_ctx.stringValue("ListMdsCubeTasksResponse.ResultContent.Data.Content["+ i +"].GmtCreate"));
			contentItem.setTaskDesc(_ctx.stringValue("ListMdsCubeTasksResponse.ResultContent.Data.Content["+ i +"].TaskDesc"));
			contentItem.setOperator(_ctx.stringValue("ListMdsCubeTasksResponse.ResultContent.Data.Content["+ i +"].Operator"));
			contentItem.setTemplateResourceId(_ctx.longValue("ListMdsCubeTasksResponse.ResultContent.Data.Content["+ i +"].TemplateResourceId"));
			contentItem.setTemplateId(_ctx.stringValue("ListMdsCubeTasksResponse.ResultContent.Data.Content["+ i +"].TemplateId"));
			contentItem.setId(_ctx.longValue("ListMdsCubeTasksResponse.ResultContent.Data.Content["+ i +"].Id"));

			content.add(contentItem);
		}
		data.setContent(content);
		resultContent.setData(data);
		listMdsCubeTasksResponse.setResultContent(resultContent);
	 
	 	return listMdsCubeTasksResponse;
	}
}