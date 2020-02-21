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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTemplateResponseUnmarshaller {

	public static UpdateTemplateResponse unmarshall(UpdateTemplateResponse updateTemplateResponse, UnmarshallerContext _ctx) {
		
		updateTemplateResponse.setRequestId(_ctx.stringValue("UpdateTemplateResponse.RequestId"));

		Template template = new Template();
		template.setTemplateName(_ctx.stringValue("UpdateTemplateResponse.Template.TemplateName"));
		template.setTemplateId(_ctx.stringValue("UpdateTemplateResponse.Template.TemplateId"));
		template.setCreatedDate(_ctx.stringValue("UpdateTemplateResponse.Template.CreatedDate"));
		template.setCreatedBy(_ctx.stringValue("UpdateTemplateResponse.Template.CreatedBy"));
		template.setUpdatedDate(_ctx.stringValue("UpdateTemplateResponse.Template.UpdatedDate"));
		template.setUpdatedBy(_ctx.stringValue("UpdateTemplateResponse.Template.UpdatedBy"));
		template.setHash(_ctx.stringValue("UpdateTemplateResponse.Template.Hash"));
		template.setDescription(_ctx.stringValue("UpdateTemplateResponse.Template.Description"));
		template.setShareType(_ctx.stringValue("UpdateTemplateResponse.Template.ShareType"));
		template.setTemplateFormat(_ctx.stringValue("UpdateTemplateResponse.Template.TemplateFormat"));
		template.setTemplateVersion(_ctx.stringValue("UpdateTemplateResponse.Template.TemplateVersion"));
		template.setHasTrigger(_ctx.booleanValue("UpdateTemplateResponse.Template.HasTrigger"));
		template.setTags(_ctx.mapValue("UpdateTemplateResponse.Template.Tags"));
		updateTemplateResponse.setTemplate(template);
	 
	 	return updateTemplateResponse;
	}
}