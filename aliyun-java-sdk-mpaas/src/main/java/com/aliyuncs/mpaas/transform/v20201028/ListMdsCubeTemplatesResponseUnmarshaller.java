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

import com.aliyuncs.mpaas.model.v20201028.ListMdsCubeTemplatesResponse;
import com.aliyuncs.mpaas.model.v20201028.ListMdsCubeTemplatesResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.ListMdsCubeTemplatesResponse.ResultContent.Data;
import com.aliyuncs.mpaas.model.v20201028.ListMdsCubeTemplatesResponse.ResultContent.Data.Content;
import com.aliyuncs.mpaas.model.v20201028.ListMdsCubeTemplatesResponse.ResultContent.Data.Content.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMdsCubeTemplatesResponseUnmarshaller {

	public static ListMdsCubeTemplatesResponse unmarshall(ListMdsCubeTemplatesResponse listMdsCubeTemplatesResponse, UnmarshallerContext _ctx) {
		
		listMdsCubeTemplatesResponse.setRequestId(_ctx.stringValue("ListMdsCubeTemplatesResponse.RequestId"));
		listMdsCubeTemplatesResponse.setResultMessage(_ctx.stringValue("ListMdsCubeTemplatesResponse.ResultMessage"));
		listMdsCubeTemplatesResponse.setResultCode(_ctx.stringValue("ListMdsCubeTemplatesResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("ListMdsCubeTemplatesResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("ListMdsCubeTemplatesResponse.ResultContent.Data.RequestId"));
		data.setErrorCode(_ctx.stringValue("ListMdsCubeTemplatesResponse.ResultContent.Data.ErrorCode"));
		data.setSuccess(_ctx.booleanValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Success"));
		data.setResultMsg(_ctx.stringValue("ListMdsCubeTemplatesResponse.ResultContent.Data.ResultMsg"));

		Content content = new Content();
		content.setPageNo(_ctx.integerValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.PageNo"));
		content.setPageSize(_ctx.integerValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.PageSize"));
		content.setTotalCount(_ctx.integerValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.TotalCount"));
		content.setFirstResult(_ctx.longValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.FirstResult"));
		content.setFirstPage(_ctx.booleanValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.FirstPage"));
		content.setLastPage(_ctx.booleanValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.LastPage"));
		content.setPrePage(_ctx.longValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.PrePage"));
		content.setNextPage(_ctx.longValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.NextPage"));
		content.setTotalPage(_ctx.longValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.TotalPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setStatus(_ctx.integerValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.List["+ i +"].Status"));
			listItem.setTemplateDesc(_ctx.stringValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.List["+ i +"].TemplateDesc"));
			listItem.setAppCode(_ctx.stringValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.List["+ i +"].AppCode"));
			listItem.setGmtCreate(_ctx.stringValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.List["+ i +"].GmtCreate"));
			listItem.setTemplateName(_ctx.stringValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.List["+ i +"].TemplateName"));
			listItem.setGmtModified(_ctx.stringValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.List["+ i +"].GmtModified"));
			listItem.setTemplateId(_ctx.stringValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.List["+ i +"].TemplateId"));
			listItem.setId(_ctx.longValue("ListMdsCubeTemplatesResponse.ResultContent.Data.Content.List["+ i +"].Id"));

			list.add(listItem);
		}
		content.setList(list);
		data.setContent(content);
		resultContent.setData(data);
		listMdsCubeTemplatesResponse.setResultContent(resultContent);
	 
	 	return listMdsCubeTemplatesResponse;
	}
}