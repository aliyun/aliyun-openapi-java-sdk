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

import com.aliyuncs.mts.model.v20140618.AddMCTemplateResponse;
import com.aliyuncs.mts.model.v20140618.AddMCTemplateResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMCTemplateResponseUnmarshaller {

	public static AddMCTemplateResponse unmarshall(AddMCTemplateResponse addMCTemplateResponse, UnmarshallerContext _ctx) {
		
		addMCTemplateResponse.setRequestId(_ctx.stringValue("AddMCTemplateResponse.RequestId"));

		Template template = new Template();
		template.setTemplateId(_ctx.stringValue("AddMCTemplateResponse.Template.TemplateId"));
		template.setName(_ctx.stringValue("AddMCTemplateResponse.Template.Name"));
		template.setPorn(_ctx.stringValue("AddMCTemplateResponse.Template.Porn"));
		template.setTerrorism(_ctx.stringValue("AddMCTemplateResponse.Template.Terrorism"));
		template.setPolitics(_ctx.stringValue("AddMCTemplateResponse.Template.Politics"));
		template.setAd(_ctx.stringValue("AddMCTemplateResponse.Template.Ad"));
		template.setQrcode(_ctx.stringValue("AddMCTemplateResponse.Template.Qrcode"));
		template.setLive(_ctx.stringValue("AddMCTemplateResponse.Template.Live"));
		template.setLogo(_ctx.stringValue("AddMCTemplateResponse.Template.Logo"));
		template.setAbuse(_ctx.stringValue("AddMCTemplateResponse.Template.Abuse"));
		template.setContraband(_ctx.stringValue("AddMCTemplateResponse.Template.Contraband"));
		template.setSpam(_ctx.stringValue("AddMCTemplateResponse.Template.Spam"));
		addMCTemplateResponse.setTemplate(template);
	 
	 	return addMCTemplateResponse;
	}
}