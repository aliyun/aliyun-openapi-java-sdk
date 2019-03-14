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

	public static UpdateMCTemplateResponse unmarshall(UpdateMCTemplateResponse updateMCTemplateResponse, UnmarshallerContext context) {
		
		updateMCTemplateResponse.setRequestId(context.stringValue("UpdateMCTemplateResponse.RequestId"));

		Template template = new Template();
		template.setTemplateId(context.stringValue("UpdateMCTemplateResponse.Template.TemplateId"));
		template.setName(context.stringValue("UpdateMCTemplateResponse.Template.Name"));
		template.setState(context.stringValue("UpdateMCTemplateResponse.Template.State"));
		template.setPorn(context.stringValue("UpdateMCTemplateResponse.Template.Porn"));
		template.setTerrorism(context.stringValue("UpdateMCTemplateResponse.Template.Terrorism"));
		template.setPolitics(context.stringValue("UpdateMCTemplateResponse.Template.Politics"));
		template.setAd(context.stringValue("UpdateMCTemplateResponse.Template.Ad"));
		template.setQrcode(context.stringValue("UpdateMCTemplateResponse.Template.Qrcode"));
		template.setLive(context.stringValue("UpdateMCTemplateResponse.Template.Live"));
		template.setLogo(context.stringValue("UpdateMCTemplateResponse.Template.Logo"));
		template.setAbuse(context.stringValue("UpdateMCTemplateResponse.Template.Abuse"));
		template.setContraband(context.stringValue("UpdateMCTemplateResponse.Template.Contraband"));
		template.setSpam(context.stringValue("UpdateMCTemplateResponse.Template.Spam"));
		updateMCTemplateResponse.setTemplate(template);
	 
	 	return updateMCTemplateResponse;
	}
}