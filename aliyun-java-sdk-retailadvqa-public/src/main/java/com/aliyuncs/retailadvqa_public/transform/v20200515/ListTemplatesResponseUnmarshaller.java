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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.ListTemplatesResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListTemplatesResponse.Data;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListTemplatesResponse.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTemplatesResponseUnmarshaller {

	public static ListTemplatesResponse unmarshall(ListTemplatesResponse listTemplatesResponse, UnmarshallerContext _ctx) {
		
		listTemplatesResponse.setRequestId(_ctx.stringValue("ListTemplatesResponse.RequestId"));
		listTemplatesResponse.setErrorDesc(_ctx.stringValue("ListTemplatesResponse.ErrorDesc"));
		listTemplatesResponse.setErrorCode(_ctx.stringValue("ListTemplatesResponse.ErrorCode"));
		listTemplatesResponse.setSuccess(_ctx.booleanValue("ListTemplatesResponse.Success"));
		listTemplatesResponse.setTraceId(_ctx.stringValue("ListTemplatesResponse.TraceId"));

		Data data = new Data();
		data.setTotalNum(_ctx.longValue("ListTemplatesResponse.Data.TotalNum"));
		data.setPageSize(_ctx.longValue("ListTemplatesResponse.Data.PageSize"));
		data.setPageNum(_ctx.longValue("ListTemplatesResponse.Data.PageNum"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTemplatesResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setId(_ctx.stringValue("ListTemplatesResponse.Data.Content["+ i +"].Id"));
			contentItem.setTemplateType(_ctx.longValue("ListTemplatesResponse.Data.Content["+ i +"].TemplateType"));
			contentItem.setTemplateStatus(_ctx.longValue("ListTemplatesResponse.Data.Content["+ i +"].TemplateStatus"));
			contentItem.setSmsTemplateCode(_ctx.stringValue("ListTemplatesResponse.Data.Content["+ i +"].SmsTemplateCode"));
			contentItem.setTemplateName(_ctx.stringValue("ListTemplatesResponse.Data.Content["+ i +"].TemplateName"));
			contentItem.setTemplateContent(_ctx.stringValue("ListTemplatesResponse.Data.Content["+ i +"].TemplateContent"));
			contentItem.setSmsContentSuffix(_ctx.stringValue("ListTemplatesResponse.Data.Content["+ i +"].SmsContentSuffix"));
			contentItem.setPlatformName(_ctx.stringValue("ListTemplatesResponse.Data.Content["+ i +"].PlatformName"));
			contentItem.setWorkspaceId(_ctx.stringValue("ListTemplatesResponse.Data.Content["+ i +"].WorkspaceId"));

			content.add(contentItem);
		}
		data.setContent(content);
		listTemplatesResponse.setData(data);
	 
	 	return listTemplatesResponse;
	}
}