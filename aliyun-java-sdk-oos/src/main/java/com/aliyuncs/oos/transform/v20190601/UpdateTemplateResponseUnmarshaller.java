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

import com.aliyuncs.oos.model.v20190601.UpdateTemplateResponse;
import com.aliyuncs.oos.model.v20190601.UpdateTemplateResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTemplateResponseUnmarshaller {

	public static UpdateTemplateResponse unmarshall(UpdateTemplateResponse updateTemplateResponse, UnmarshallerContext context) {
		
		updateTemplateResponse.setRequestId(context.stringValue("UpdateTemplateResponse.RequestId"));

		Template template = new Template();
		template.setTemplateName(context.stringValue("UpdateTemplateResponse.Template.TemplateName"));
		template.setTemplateId(context.stringValue("UpdateTemplateResponse.Template.TemplateId"));
		template.setCreatedDate(context.stringValue("UpdateTemplateResponse.Template.CreatedDate"));
		template.setCreatedBy(context.stringValue("UpdateTemplateResponse.Template.CreatedBy"));
		template.setUpdatedDate(context.stringValue("UpdateTemplateResponse.Template.UpdatedDate"));
		template.setUpdatedBy(context.stringValue("UpdateTemplateResponse.Template.UpdatedBy"));
		template.setHash(context.stringValue("UpdateTemplateResponse.Template.Hash"));
		template.setDescription(context.stringValue("UpdateTemplateResponse.Template.Description"));
		template.setShareType(context.stringValue("UpdateTemplateResponse.Template.ShareType"));
		template.setTemplateFormat(context.stringValue("UpdateTemplateResponse.Template.TemplateFormat"));
		template.setTemplateVersion(context.stringValue("UpdateTemplateResponse.Template.TemplateVersion"));
		updateTemplateResponse.setTemplate(template);
	 
	 	return updateTemplateResponse;
	}
}