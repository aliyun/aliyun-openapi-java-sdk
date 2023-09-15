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

package com.aliyuncs.cams.transform.v20200606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cams.model.v20200606.ListChatappTemplateResponse;
import com.aliyuncs.cams.model.v20200606.ListChatappTemplateResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListChatappTemplateResponseUnmarshaller {

	public static ListChatappTemplateResponse unmarshall(ListChatappTemplateResponse listChatappTemplateResponse, UnmarshallerContext _ctx) {
		
		listChatappTemplateResponse.setRequestId(_ctx.stringValue("ListChatappTemplateResponse.RequestId"));
		listChatappTemplateResponse.setCode(_ctx.stringValue("ListChatappTemplateResponse.Code"));
		listChatappTemplateResponse.setMessage(_ctx.stringValue("ListChatappTemplateResponse.Message"));
		listChatappTemplateResponse.setTotal(_ctx.integerValue("ListChatappTemplateResponse.Total"));
		listChatappTemplateResponse.setAccessDeniedDetail(_ctx.stringValue("ListChatappTemplateResponse.AccessDeniedDetail"));

		List<Template> listTemplate = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("ListChatappTemplateResponse.ListTemplate.Length"); i++) {
			Template template = new Template();
			template.setTemplateName(_ctx.stringValue("ListChatappTemplateResponse.ListTemplate["+ i +"].TemplateName"));
			template.setTemplateCode(_ctx.stringValue("ListChatappTemplateResponse.ListTemplate["+ i +"].TemplateCode"));
			template.setAuditStatus(_ctx.stringValue("ListChatappTemplateResponse.ListTemplate["+ i +"].AuditStatus"));
			template.setLanguage(_ctx.stringValue("ListChatappTemplateResponse.ListTemplate["+ i +"].Language"));
			template.setCategory(_ctx.stringValue("ListChatappTemplateResponse.ListTemplate["+ i +"].Category"));
			template.setTemplateType(_ctx.stringValue("ListChatappTemplateResponse.ListTemplate["+ i +"].TemplateType"));
			template.setReason(_ctx.stringValue("ListChatappTemplateResponse.ListTemplate["+ i +"].Reason"));

			listTemplate.add(template);
		}
		listChatappTemplateResponse.setListTemplate(listTemplate);
	 
	 	return listChatappTemplateResponse;
	}
}