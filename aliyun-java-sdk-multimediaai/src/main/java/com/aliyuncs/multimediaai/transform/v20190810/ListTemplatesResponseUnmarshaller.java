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

package com.aliyuncs.multimediaai.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.multimediaai.model.v20190810.ListTemplatesResponse;
import com.aliyuncs.multimediaai.model.v20190810.ListTemplatesResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTemplatesResponseUnmarshaller {

	public static ListTemplatesResponse unmarshall(ListTemplatesResponse listTemplatesResponse, UnmarshallerContext _ctx) {
		
		listTemplatesResponse.setRequestId(_ctx.stringValue("ListTemplatesResponse.RequestId"));
		listTemplatesResponse.setPageNumber(_ctx.integerValue("ListTemplatesResponse.PageNumber"));
		listTemplatesResponse.setPageSize(_ctx.integerValue("ListTemplatesResponse.PageSize"));
		listTemplatesResponse.setTotalCount(_ctx.longValue("ListTemplatesResponse.TotalCount"));
		listTemplatesResponse.setTotalAmount(_ctx.longValue("ListTemplatesResponse.TotalAmount"));

		List<Template> templates = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("ListTemplatesResponse.Templates.Length"); i++) {
			Template template = new Template();
			template.setTemplateId(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateId"));
			template.setTemplateName(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateName"));
			template.setType(_ctx.integerValue("ListTemplatesResponse.Templates["+ i +"].Type"));
			template.setIsDefault(_ctx.booleanValue("ListTemplatesResponse.Templates["+ i +"].IsDefault"));
			template.setCreateTime(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].CreateTime"));
			template.setUpdateTime(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].UpdateTime"));

			templates.add(template);
		}
		listTemplatesResponse.setTemplates(templates);
	 
	 	return listTemplatesResponse;
	}
}