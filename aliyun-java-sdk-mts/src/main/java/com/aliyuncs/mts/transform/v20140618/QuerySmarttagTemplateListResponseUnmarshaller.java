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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QuerySmarttagTemplateListResponse;
import com.aliyuncs.mts.model.v20140618.QuerySmarttagTemplateListResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySmarttagTemplateListResponseUnmarshaller {

	public static QuerySmarttagTemplateListResponse unmarshall(QuerySmarttagTemplateListResponse querySmarttagTemplateListResponse, UnmarshallerContext _ctx) {
		
		querySmarttagTemplateListResponse.setRequestId(_ctx.stringValue("QuerySmarttagTemplateListResponse.RequestId"));

		List<Template> templates = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("QuerySmarttagTemplateListResponse.Templates.Length"); i++) {
			Template template = new Template();
			template.setAnalyseTypes(_ctx.stringValue("QuerySmarttagTemplateListResponse.Templates["+ i +"].AnalyseTypes"));
			template.setIndustry(_ctx.stringValue("QuerySmarttagTemplateListResponse.Templates["+ i +"].Industry"));
			template.setIsDefault(_ctx.booleanValue("QuerySmarttagTemplateListResponse.Templates["+ i +"].IsDefault"));
			template.setTemplateName(_ctx.stringValue("QuerySmarttagTemplateListResponse.Templates["+ i +"].TemplateName"));
			template.setTemplateId(_ctx.stringValue("QuerySmarttagTemplateListResponse.Templates["+ i +"].TemplateId"));
			template.setFaceCategoryIds(_ctx.stringValue("QuerySmarttagTemplateListResponse.Templates["+ i +"].FaceCategoryIds"));
			template.setScene(_ctx.stringValue("QuerySmarttagTemplateListResponse.Templates["+ i +"].Scene"));

			templates.add(template);
		}
		querySmarttagTemplateListResponse.setTemplates(templates);
	 
	 	return querySmarttagTemplateListResponse;
	}
}