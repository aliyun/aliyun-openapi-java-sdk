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

import com.aliyuncs.oos.model.v20190601.GetTemplateResponse;
import com.aliyuncs.oos.model.v20190601.GetTemplateResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateResponseUnmarshaller {

	public static GetTemplateResponse unmarshall(GetTemplateResponse getTemplateResponse, UnmarshallerContext context) {
		
		getTemplateResponse.setRequestId(context.stringValue("GetTemplateResponse.RequestId"));
		getTemplateResponse.setContent(context.stringValue("GetTemplateResponse.Content"));

		Template template = new Template();
		template.setTemplateName(context.stringValue("GetTemplateResponse.Template.TemplateName"));
		template.setTemplateId(context.stringValue("GetTemplateResponse.Template.TemplateId"));
		template.setCreatedDate(context.stringValue("GetTemplateResponse.Template.CreatedDate"));
		template.setCreatedBy(context.stringValue("GetTemplateResponse.Template.CreatedBy"));
		template.setUpdatedDate(context.stringValue("GetTemplateResponse.Template.UpdatedDate"));
		template.setUpdatedBy(context.stringValue("GetTemplateResponse.Template.UpdatedBy"));
		template.setHash(context.stringValue("GetTemplateResponse.Template.Hash"));
		template.setDescription(context.stringValue("GetTemplateResponse.Template.Description"));
		template.setShareType(context.stringValue("GetTemplateResponse.Template.ShareType"));
		template.setTemplateFormat(context.stringValue("GetTemplateResponse.Template.TemplateFormat"));
		template.setTemplateVersion(context.stringValue("GetTemplateResponse.Template.TemplateVersion"));
		getTemplateResponse.setTemplate(template);
	 
	 	return getTemplateResponse;
	}
}