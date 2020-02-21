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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateResponseUnmarshaller {

	public static GetTemplateResponse unmarshall(GetTemplateResponse getTemplateResponse, UnmarshallerContext _ctx) {
		
		getTemplateResponse.setRequestId(_ctx.stringValue("GetTemplateResponse.RequestId"));
		getTemplateResponse.setContent(_ctx.stringValue("GetTemplateResponse.Content"));

		Template template = new Template();
		template.setTemplateName(_ctx.stringValue("GetTemplateResponse.Template.TemplateName"));
		template.setTemplateId(_ctx.stringValue("GetTemplateResponse.Template.TemplateId"));
		template.setCreatedDate(_ctx.stringValue("GetTemplateResponse.Template.CreatedDate"));
		template.setCreatedBy(_ctx.stringValue("GetTemplateResponse.Template.CreatedBy"));
		template.setUpdatedDate(_ctx.stringValue("GetTemplateResponse.Template.UpdatedDate"));
		template.setUpdatedBy(_ctx.stringValue("GetTemplateResponse.Template.UpdatedBy"));
		template.setHash(_ctx.stringValue("GetTemplateResponse.Template.Hash"));
		template.setDescription(_ctx.stringValue("GetTemplateResponse.Template.Description"));
		template.setShareType(_ctx.stringValue("GetTemplateResponse.Template.ShareType"));
		template.setTemplateFormat(_ctx.stringValue("GetTemplateResponse.Template.TemplateFormat"));
		template.setTemplateVersion(_ctx.stringValue("GetTemplateResponse.Template.TemplateVersion"));
		template.setHasTrigger(_ctx.booleanValue("GetTemplateResponse.Template.HasTrigger"));
		template.setTags(_ctx.mapValue("GetTemplateResponse.Template.Tags"));
		getTemplateResponse.setTemplate(template);
	 
	 	return getTemplateResponse;
	}
}