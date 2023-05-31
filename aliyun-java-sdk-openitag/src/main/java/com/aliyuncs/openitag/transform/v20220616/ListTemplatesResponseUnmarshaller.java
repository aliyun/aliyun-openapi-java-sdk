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

package com.aliyuncs.openitag.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openitag.model.v20220616.ListTemplatesResponse;
import com.aliyuncs.openitag.model.v20220616.ListTemplatesResponse.TemplatesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTemplatesResponseUnmarshaller {

	public static ListTemplatesResponse unmarshall(ListTemplatesResponse listTemplatesResponse, UnmarshallerContext _ctx) {
		
		listTemplatesResponse.setRequestId(_ctx.stringValue("ListTemplatesResponse.RequestId"));
		listTemplatesResponse.setCode(_ctx.integerValue("ListTemplatesResponse.Code"));
		listTemplatesResponse.setMessage(_ctx.stringValue("ListTemplatesResponse.Message"));
		listTemplatesResponse.setDetails(_ctx.stringValue("ListTemplatesResponse.Details"));
		listTemplatesResponse.setSuccess(_ctx.booleanValue("ListTemplatesResponse.Success"));
		listTemplatesResponse.setPageNumber(_ctx.integerValue("ListTemplatesResponse.PageNumber"));
		listTemplatesResponse.setPageSize(_ctx.integerValue("ListTemplatesResponse.PageSize"));
		listTemplatesResponse.setTotalPage(_ctx.integerValue("ListTemplatesResponse.TotalPage"));
		listTemplatesResponse.setTotalCount(_ctx.integerValue("ListTemplatesResponse.TotalCount"));
		listTemplatesResponse.setErrorCode(_ctx.stringValue("ListTemplatesResponse.ErrorCode"));

		List<TemplatesItem> templates = new ArrayList<TemplatesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTemplatesResponse.Templates.Length"); i++) {
			TemplatesItem templatesItem = new TemplatesItem();
			templatesItem.setTemplateId(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateId"));
			templatesItem.setTemplateName(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateName"));
			templatesItem.setTenantId(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TenantId"));
			templatesItem.setDescription(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].Description"));
			templatesItem.setStatus(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].Status"));
			templatesItem.setSharedMode(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].SharedMode"));
			templatesItem.setAbandonReasons(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].AbandonReasons"));
			templatesItem.setType(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].Type"));
			templatesItem.setGmtCreateTime(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].GmtCreateTime"));
			templatesItem.setGmtModifiedTime(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].GmtModifiedTime"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTemplatesResponse.Templates["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].Tags["+ j +"]"));
			}
			templatesItem.setTags(tags);

			templates.add(templatesItem);
		}
		listTemplatesResponse.setTemplates(templates);
	 
	 	return listTemplatesResponse;
	}
}