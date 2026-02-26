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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.GetRemediationTemplateResponse;
import com.aliyuncs.config.model.v20200907.GetRemediationTemplateResponse.RemediationTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRemediationTemplateResponseUnmarshaller {

	public static GetRemediationTemplateResponse unmarshall(GetRemediationTemplateResponse getRemediationTemplateResponse, UnmarshallerContext _ctx) {
		
		getRemediationTemplateResponse.setRequestId(_ctx.stringValue("GetRemediationTemplateResponse.RequestId"));

		List<RemediationTemplate> remediationTemplates = new ArrayList<RemediationTemplate>();
		for (int i = 0; i < _ctx.lengthValue("GetRemediationTemplateResponse.RemediationTemplates.Length"); i++) {
			RemediationTemplate remediationTemplate = new RemediationTemplate();
			remediationTemplate.setCompulsoryParameters(_ctx.stringValue("GetRemediationTemplateResponse.RemediationTemplates["+ i +"].CompulsoryParameters"));
			remediationTemplate.setRemediationType(_ctx.stringValue("GetRemediationTemplateResponse.RemediationTemplates["+ i +"].RemediationType"));
			remediationTemplate.setTemplateIdentifier(_ctx.stringValue("GetRemediationTemplateResponse.RemediationTemplates["+ i +"].TemplateIdentifier"));
			remediationTemplate.setTemplateName(_ctx.stringValue("GetRemediationTemplateResponse.RemediationTemplates["+ i +"].TemplateName"));
			remediationTemplate.setTemplateDefinition(_ctx.stringValue("GetRemediationTemplateResponse.RemediationTemplates["+ i +"].TemplateDefinition"));
			remediationTemplate.setManagedRuleIdentifier(_ctx.stringValue("GetRemediationTemplateResponse.RemediationTemplates["+ i +"].ManagedRuleIdentifier"));
			remediationTemplate.setTemplateDescription(_ctx.stringValue("GetRemediationTemplateResponse.RemediationTemplates["+ i +"].TemplateDescription"));

			remediationTemplates.add(remediationTemplate);
		}
		getRemediationTemplateResponse.setRemediationTemplates(remediationTemplates);
	 
	 	return getRemediationTemplateResponse;
	}
}