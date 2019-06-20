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

import com.aliyuncs.oos.model.v20190601.GetExecutionTemplateResponse;
import com.aliyuncs.oos.model.v20190601.GetExecutionTemplateResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetExecutionTemplateResponseUnmarshaller {

	public static GetExecutionTemplateResponse unmarshall(GetExecutionTemplateResponse getExecutionTemplateResponse, UnmarshallerContext context) {
		
		getExecutionTemplateResponse.setRequestId(context.stringValue("GetExecutionTemplateResponse.RequestId"));
		getExecutionTemplateResponse.setContent(context.stringValue("GetExecutionTemplateResponse.Content"));

		Template template = new Template();
		template.setTemplateName(context.stringValue("GetExecutionTemplateResponse.Template.TemplateName"));
		template.setTemplateId(context.stringValue("GetExecutionTemplateResponse.Template.TemplateId"));
		template.setCreatedDate(context.stringValue("GetExecutionTemplateResponse.Template.CreatedDate"));
		template.setCreatedBy(context.stringValue("GetExecutionTemplateResponse.Template.CreatedBy"));
		template.setUpdatedDate(context.stringValue("GetExecutionTemplateResponse.Template.UpdatedDate"));
		template.setUpdatedBy(context.stringValue("GetExecutionTemplateResponse.Template.UpdatedBy"));
		template.setHash(context.stringValue("GetExecutionTemplateResponse.Template.Hash"));
		template.setDescription(context.stringValue("GetExecutionTemplateResponse.Template.Description"));
		template.setShareType(context.stringValue("GetExecutionTemplateResponse.Template.ShareType"));
		template.setTemplateFormat(context.stringValue("GetExecutionTemplateResponse.Template.TemplateFormat"));
		template.setTemplateVersion(context.stringValue("GetExecutionTemplateResponse.Template.TemplateVersion"));
		getExecutionTemplateResponse.setTemplate(template);
	 
	 	return getExecutionTemplateResponse;
	}
}