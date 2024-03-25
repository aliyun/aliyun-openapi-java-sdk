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
		listTemplatesResponse.setNextToken(_ctx.stringValue("ListTemplatesResponse.NextToken"));
		listTemplatesResponse.setMaxResults(_ctx.integerValue("ListTemplatesResponse.MaxResults"));

		List<Template> templates = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("ListTemplatesResponse.Templates.Length"); i++) {
			Template template = new Template();
			template.setHash(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].Hash"));
			template.setUpdatedDate(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].UpdatedDate"));
			template.setUpdatedBy(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].UpdatedBy"));
			template.setTemplateType(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateType"));
			template.setTags(_ctx.mapValue("ListTemplatesResponse.Templates["+ i +"].Tags"));
			template.setTemplateName(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateName"));
			template.setTemplateVersion(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateVersion"));
			template.setTemplateFormat(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateFormat"));
			template.setPopularity(_ctx.integerValue("ListTemplatesResponse.Templates["+ i +"].Popularity"));
			template.setTotalExecutionCount(_ctx.integerValue("ListTemplatesResponse.Templates["+ i +"].TotalExecutionCount"));
			template.setDescription(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].Description"));
			template.setResourceGroupId(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].ResourceGroupId"));
			template.setCreatedBy(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].CreatedBy"));
			template.setCreatedDate(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].CreatedDate"));
			template.setCategory(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].Category"));
			template.setHasTrigger(_ctx.booleanValue("ListTemplatesResponse.Templates["+ i +"].HasTrigger"));
			template.setTemplateId(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateId"));
			template.setShareType(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].ShareType"));
			template.setIsFavorite(_ctx.booleanValue("ListTemplatesResponse.Templates["+ i +"].IsFavorite"));
			template.setPublisher(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].Publisher"));
			template.setConstraints(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].Constraints"));

			templates.add(template);
		}
		listTemplatesResponse.setTemplates(templates);
	 
	 	return listTemplatesResponse;
	}
}