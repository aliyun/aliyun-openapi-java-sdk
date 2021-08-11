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

import com.aliyuncs.retailadvqa_public.model.v20200515.ListDigitalTemplatesResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListDigitalTemplatesResponse.Data;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListDigitalTemplatesResponse.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDigitalTemplatesResponseUnmarshaller {

	public static ListDigitalTemplatesResponse unmarshall(ListDigitalTemplatesResponse listDigitalTemplatesResponse, UnmarshallerContext _ctx) {
		
		listDigitalTemplatesResponse.setRequestId(_ctx.stringValue("ListDigitalTemplatesResponse.RequestId"));
		listDigitalTemplatesResponse.setErrorCode(_ctx.stringValue("ListDigitalTemplatesResponse.ErrorCode"));
		listDigitalTemplatesResponse.setErrorDesc(_ctx.stringValue("ListDigitalTemplatesResponse.ErrorDesc"));
		listDigitalTemplatesResponse.setSuccess(_ctx.booleanValue("ListDigitalTemplatesResponse.Success"));
		listDigitalTemplatesResponse.setTraceId(_ctx.stringValue("ListDigitalTemplatesResponse.TraceId"));

		Data data = new Data();
		data.setTotalNum(_ctx.longValue("ListDigitalTemplatesResponse.Data.TotalNum"));
		data.setPageSize(_ctx.longValue("ListDigitalTemplatesResponse.Data.PageSize"));
		data.setPageNum(_ctx.longValue("ListDigitalTemplatesResponse.Data.PageNum"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDigitalTemplatesResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setId(_ctx.stringValue("ListDigitalTemplatesResponse.Data.Content["+ i +"].Id"));
			contentItem.setTemplateName(_ctx.stringValue("ListDigitalTemplatesResponse.Data.Content["+ i +"].TemplateName"));
			contentItem.setTemplateTheme(_ctx.stringValue("ListDigitalTemplatesResponse.Data.Content["+ i +"].TemplateTheme"));
			contentItem.setSmsTemplateCode(_ctx.stringValue("ListDigitalTemplatesResponse.Data.Content["+ i +"].SmsTemplateCode"));
			contentItem.setTemplateStatus(_ctx.longValue("ListDigitalTemplatesResponse.Data.Content["+ i +"].TemplateStatus"));
			contentItem.setPlatformName(_ctx.stringValue("ListDigitalTemplatesResponse.Data.Content["+ i +"].PlatformName"));
			contentItem.setPlatformId(_ctx.stringValue("ListDigitalTemplatesResponse.Data.Content["+ i +"].PlatformId"));
			contentItem.setReason(_ctx.stringValue("ListDigitalTemplatesResponse.Data.Content["+ i +"].Reason"));
			contentItem.setSign(_ctx.stringValue("ListDigitalTemplatesResponse.Data.Content["+ i +"].Sign"));
			contentItem.setSupportProvider(_ctx.stringValue("ListDigitalTemplatesResponse.Data.Content["+ i +"].SupportProvider"));

			content.add(contentItem);
		}
		data.setContent(content);
		listDigitalTemplatesResponse.setData(data);
	 
	 	return listDigitalTemplatesResponse;
	}
}