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

import com.aliyuncs.oos.model.v20190601.CreateTemplateResponse;
import com.aliyuncs.oos.model.v20190601.CreateTemplateResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTemplateResponseUnmarshaller {

	public static CreateTemplateResponse unmarshall(CreateTemplateResponse createTemplateResponse, UnmarshallerContext context) {
		
		createTemplateResponse.setRequestId(context.stringValue("CreateTemplateResponse.RequestId"));

		Template template = new Template();
		template.setTemplateName(context.stringValue("CreateTemplateResponse.Template.TemplateName"));
		template.setTemplateId(context.stringValue("CreateTemplateResponse.Template.TemplateId"));
		template.setCreatedDate(context.stringValue("CreateTemplateResponse.Template.CreatedDate"));
		template.setCreatedBy(context.stringValue("CreateTemplateResponse.Template.CreatedBy"));
		template.setUpdatedDate(context.stringValue("CreateTemplateResponse.Template.UpdatedDate"));
		template.setUpdatedBy(context.stringValue("CreateTemplateResponse.Template.UpdatedBy"));
		template.setHash(context.stringValue("CreateTemplateResponse.Template.Hash"));
		template.setDescription(context.stringValue("CreateTemplateResponse.Template.Description"));
		template.setShareType(context.stringValue("CreateTemplateResponse.Template.ShareType"));
		template.setTemplateFormat(context.stringValue("CreateTemplateResponse.Template.TemplateFormat"));
		template.setTemplateVersion(context.stringValue("CreateTemplateResponse.Template.TemplateVersion"));
		createTemplateResponse.setTemplate(template);
	 
	 	return createTemplateResponse;
	}
}