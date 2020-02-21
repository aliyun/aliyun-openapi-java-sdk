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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.ListTemplatesResponse;
import com.aliyuncs.oos.model.v20190601.ListTemplatesResponse.Template;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTemplatesResponseUnmarshaller {

	public static ListTemplatesResponse unmarshall(ListTemplatesResponse listTemplatesResponse, UnmarshallerContext _ctx) {
		
		listTemplatesResponse.setRequestId(_ctx.stringValue("ListTemplatesResponse.RequestId"));
		listTemplatesResponse.setMaxResults(_ctx.integerValue("ListTemplatesResponse.MaxResults"));
		listTemplatesResponse.setNextToken(_ctx.stringValue("ListTemplatesResponse.NextToken"));

		List<Template> templates = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("ListTemplatesResponse.Templates.Length"); i++) {
			Template template = new Template();
			template.setTemplateName(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateName"));
			template.setTemplateId(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateId"));
			template.setCreatedDate(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].CreatedDate"));
			template.setCreatedBy(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].CreatedBy"));
			template.setUpdatedDate(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].UpdatedDate"));
			template.setUpdatedBy(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].UpdatedBy"));
			template.setHash(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].Hash"));
			template.setDescription(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].Description"));
			template.setShareType(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].ShareType"));
			template.setTemplateFormat(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateFormat"));
			template.setTemplateVersion(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateVersion"));
			template.setHasTrigger(_ctx.booleanValue("ListTemplatesResponse.Templates["+ i +"].HasTrigger"));
			template.setTotalExecutionCount(_ctx.integerValue("ListTemplatesResponse.Templates["+ i +"].TotalExecutionCount"));
			template.setPopularity(_ctx.integerValue("ListTemplatesResponse.Templates["+ i +"].Popularity"));
			template.setTags(_ctx.mapValue("ListTemplatesResponse.Templates["+ i +"].Tags"));
			template.setCategory(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].Category"));

			templates.add(template);
		}
		listTemplatesResponse.setTemplates(templates);
	 
	 	return listTemplatesResponse;
	}
}