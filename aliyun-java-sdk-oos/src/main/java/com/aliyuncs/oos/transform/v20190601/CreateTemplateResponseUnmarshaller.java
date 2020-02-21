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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTemplateResponseUnmarshaller {

	public static CreateTemplateResponse unmarshall(CreateTemplateResponse createTemplateResponse, UnmarshallerContext _ctx) {
		
		createTemplateResponse.setRequestId(_ctx.stringValue("CreateTemplateResponse.RequestId"));

		Template template = new Template();
		template.setTemplateName(_ctx.stringValue("CreateTemplateResponse.Template.TemplateName"));
		template.setTemplateId(_ctx.stringValue("CreateTemplateResponse.Template.TemplateId"));
		template.setCreatedDate(_ctx.stringValue("CreateTemplateResponse.Template.CreatedDate"));
		template.setCreatedBy(_ctx.stringValue("CreateTemplateResponse.Template.CreatedBy"));
		template.setUpdatedDate(_ctx.stringValue("CreateTemplateResponse.Template.UpdatedDate"));
		template.setUpdatedBy(_ctx.stringValue("CreateTemplateResponse.Template.UpdatedBy"));
		template.setHash(_ctx.stringValue("CreateTemplateResponse.Template.Hash"));
		template.setDescription(_ctx.stringValue("CreateTemplateResponse.Template.Description"));
		template.setShareType(_ctx.stringValue("CreateTemplateResponse.Template.ShareType"));
		template.setTemplateFormat(_ctx.stringValue("CreateTemplateResponse.Template.TemplateFormat"));
		template.setTemplateVersion(_ctx.stringValue("CreateTemplateResponse.Template.TemplateVersion"));
		template.setHasTrigger(_ctx.booleanValue("CreateTemplateResponse.Template.HasTrigger"));
		template.setTags(_ctx.mapValue("CreateTemplateResponse.Template.Tags"));
		createTemplateResponse.setTemplate(template);
	 
	 	return createTemplateResponse;
	}
}