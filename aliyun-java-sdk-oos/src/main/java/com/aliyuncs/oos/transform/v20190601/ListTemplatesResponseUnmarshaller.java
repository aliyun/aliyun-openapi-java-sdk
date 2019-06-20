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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTemplatesResponseUnmarshaller {

	public static ListTemplatesResponse unmarshall(ListTemplatesResponse listTemplatesResponse, UnmarshallerContext context) {
		
		listTemplatesResponse.setRequestId(context.stringValue("ListTemplatesResponse.RequestId"));
		listTemplatesResponse.setMaxResults(context.integerValue("ListTemplatesResponse.MaxResults"));
		listTemplatesResponse.setNextToken(context.stringValue("ListTemplatesResponse.NextToken"));

		List<Template> templates = new ArrayList<Template>();
		for (int i = 0; i < context.lengthValue("ListTemplatesResponse.Templates.Length"); i++) {
			Template template = new Template();
			template.setTemplateName(context.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateName"));
			template.setTemplateId(context.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateId"));
			template.setCreatedDate(context.stringValue("ListTemplatesResponse.Templates["+ i +"].CreatedDate"));
			template.setCreatedBy(context.stringValue("ListTemplatesResponse.Templates["+ i +"].CreatedBy"));
			template.setUpdatedDate(context.stringValue("ListTemplatesResponse.Templates["+ i +"].UpdatedDate"));
			template.setUpdatedBy(context.stringValue("ListTemplatesResponse.Templates["+ i +"].UpdatedBy"));
			template.setHash(context.stringValue("ListTemplatesResponse.Templates["+ i +"].Hash"));
			template.setDescription(context.stringValue("ListTemplatesResponse.Templates["+ i +"].Description"));
			template.setShareType(context.stringValue("ListTemplatesResponse.Templates["+ i +"].ShareType"));
			template.setTemplateFormat(context.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateFormat"));
			template.setTemplateVersion(context.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateVersion"));
			template.setTotalExecutionCount(context.integerValue("ListTemplatesResponse.Templates["+ i +"].TotalExecutionCount"));
			template.setPopularity(context.integerValue("ListTemplatesResponse.Templates["+ i +"].Popularity"));

			templates.add(template);
		}
		listTemplatesResponse.setTemplates(templates);
	 
	 	return listTemplatesResponse;
	}
}