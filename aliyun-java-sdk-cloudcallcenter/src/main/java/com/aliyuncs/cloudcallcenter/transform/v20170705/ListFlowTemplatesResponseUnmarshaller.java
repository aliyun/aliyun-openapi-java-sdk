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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListFlowTemplatesResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListFlowTemplatesResponse.Templates;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListFlowTemplatesResponse.Templates.FlowTemplate;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListFlowTemplatesResponse.Templates.FlowTemplate.Category;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListFlowTemplatesResponse.Templates.FlowTemplate.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowTemplatesResponseUnmarshaller {

	public static ListFlowTemplatesResponse unmarshall(ListFlowTemplatesResponse listFlowTemplatesResponse, UnmarshallerContext context) {
		
		listFlowTemplatesResponse.setRequestId(context.stringValue("ListFlowTemplatesResponse.RequestId"));
		listFlowTemplatesResponse.setSuccess(context.booleanValue("ListFlowTemplatesResponse.Success"));
		listFlowTemplatesResponse.setCode(context.stringValue("ListFlowTemplatesResponse.Code"));
		listFlowTemplatesResponse.setMessage(context.stringValue("ListFlowTemplatesResponse.Message"));
		listFlowTemplatesResponse.setHttpStatusCode(context.integerValue("ListFlowTemplatesResponse.HttpStatusCode"));

		Templates templates = new Templates();
		templates.setTotalCount(context.integerValue("ListFlowTemplatesResponse.Templates.TotalCount"));
		templates.setPageNumber(context.integerValue("ListFlowTemplatesResponse.Templates.PageNumber"));
		templates.setPageSize(context.integerValue("ListFlowTemplatesResponse.Templates.PageSize"));

		List<FlowTemplate> list = new ArrayList<FlowTemplate>();
		for (int i = 0; i < context.lengthValue("ListFlowTemplatesResponse.Templates.List.Length"); i++) {
			FlowTemplate flowTemplate = new FlowTemplate();
			flowTemplate.setFlowJson(context.stringValue("ListFlowTemplatesResponse.Templates.List["+ i +"].FlowJson"));
			flowTemplate.setName(context.stringValue("ListFlowTemplatesResponse.Templates.List["+ i +"].Name"));
			flowTemplate.setId(context.stringValue("ListFlowTemplatesResponse.Templates.List["+ i +"].Id"));

			List<Parameter> parameters = new ArrayList<Parameter>();
			for (int j = 0; j < context.lengthValue("ListFlowTemplatesResponse.Templates.List["+ i +"].Parameters.Length"); j++) {
				Parameter parameter = new Parameter();
				parameter.setTitle(context.stringValue("ListFlowTemplatesResponse.Templates.List["+ i +"].Parameters["+ j +"].Title"));
				parameter.setName(context.stringValue("ListFlowTemplatesResponse.Templates.List["+ i +"].Parameters["+ j +"].Name"));
				parameter.setDefaultValue(context.stringValue("ListFlowTemplatesResponse.Templates.List["+ i +"].Parameters["+ j +"].DefaultValue"));
				parameter.setDescription(context.stringValue("ListFlowTemplatesResponse.Templates.List["+ i +"].Parameters["+ j +"].Description"));
				parameter.setType(context.stringValue("ListFlowTemplatesResponse.Templates.List["+ i +"].Parameters["+ j +"].Type"));

				parameters.add(parameter);
			}
			flowTemplate.setParameters(parameters);

			List<Category> categories = new ArrayList<Category>();
			for (int j = 0; j < context.lengthValue("ListFlowTemplatesResponse.Templates.List["+ i +"].Categories.Length"); j++) {
				Category category = new Category();
				category.setType(context.stringValue("ListFlowTemplatesResponse.Templates.List["+ i +"].Categories["+ j +"].Type"));
				category.setName(context.stringValue("ListFlowTemplatesResponse.Templates.List["+ i +"].Categories["+ j +"].Name"));
				category.setOptions(context.stringValue("ListFlowTemplatesResponse.Templates.List["+ i +"].Categories["+ j +"].Options"));
				category.setId(context.stringValue("ListFlowTemplatesResponse.Templates.List["+ i +"].Categories["+ j +"].Id"));

				categories.add(category);
			}
			flowTemplate.setCategories(categories);

			list.add(flowTemplate);
		}
		templates.setList(list);
		listFlowTemplatesResponse.setTemplates(templates);
	 
	 	return listFlowTemplatesResponse;
	}
}