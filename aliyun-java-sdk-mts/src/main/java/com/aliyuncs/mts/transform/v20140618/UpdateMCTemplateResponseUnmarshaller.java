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

import com.aliyuncs.mts.model.v20140618.UpdateMCTemplateResponse;
import com.aliyuncs.mts.model.v20140618.UpdateMCTemplateResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMCTemplateResponseUnmarshaller {

	public static UpdateMCTemplateResponse unmarshall(UpdateMCTemplateResponse updateMCTemplateResponse, UnmarshallerContext _ctx) {
		
		updateMCTemplateResponse.setRequestId(_ctx.stringValue("UpdateMCTemplateResponse.RequestId"));

		Template template = new Template();
		template.setTemplateId(_ctx.stringValue("UpdateMCTemplateResponse.Template.TemplateId"));
		template.setName(_ctx.stringValue("UpdateMCTemplateResponse.Template.Name"));
		template.setState(_ctx.stringValue("UpdateMCTemplateResponse.Template.State"));
		template.setPorn(_ctx.stringValue("UpdateMCTemplateResponse.Template.Porn"));
		template.setTerrorism(_ctx.stringValue("UpdateMCTemplateResponse.Template.Terrorism"));
		template.setPolitics(_ctx.stringValue("UpdateMCTemplateResponse.Template.Politics"));
		template.setAd(_ctx.stringValue("UpdateMCTemplateResponse.Template.Ad"));
		template.setQrcode(_ctx.stringValue("UpdateMCTemplateResponse.Template.Qrcode"));
		template.setLive(_ctx.stringValue("UpdateMCTemplateResponse.Template.Live"));
		template.setLogo(_ctx.stringValue("UpdateMCTemplateResponse.Template.Logo"));
		template.setAbuse(_ctx.stringValue("UpdateMCTemplateResponse.Template.Abuse"));
		template.setContraband(_ctx.stringValue("UpdateMCTemplateResponse.Template.Contraband"));
		template.setSpam(_ctx.stringValue("UpdateMCTemplateResponse.Template.Spam"));
		updateMCTemplateResponse.setTemplate(template);
	 
	 	return updateMCTemplateResponse;
	}
}