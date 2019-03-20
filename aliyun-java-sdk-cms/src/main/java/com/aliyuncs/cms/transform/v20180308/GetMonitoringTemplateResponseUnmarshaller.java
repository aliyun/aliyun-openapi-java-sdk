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

package com.aliyuncs.cms.transform.v20180308;

import com.aliyuncs.cms.model.v20180308.GetMonitoringTemplateResponse;
import com.aliyuncs.cms.model.v20180308.GetMonitoringTemplateResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMonitoringTemplateResponseUnmarshaller {

	public static GetMonitoringTemplateResponse unmarshall(GetMonitoringTemplateResponse getMonitoringTemplateResponse, UnmarshallerContext context) {
		
		getMonitoringTemplateResponse.setRequestId(context.stringValue("GetMonitoringTemplateResponse.RequestId"));
		getMonitoringTemplateResponse.setSuccess(context.booleanValue("GetMonitoringTemplateResponse.Success"));
		getMonitoringTemplateResponse.setErrorCode(context.integerValue("GetMonitoringTemplateResponse.ErrorCode"));
		getMonitoringTemplateResponse.setErrorMessage(context.stringValue("GetMonitoringTemplateResponse.ErrorMessage"));

		Resource resource = new Resource();
		resource.setName(context.stringValue("GetMonitoringTemplateResponse.Resource.Name"));
		resource.setId(context.stringValue("GetMonitoringTemplateResponse.Resource.Id"));
		resource.setRestVersion(context.stringValue("GetMonitoringTemplateResponse.Resource.RestVersion"));
		resource.setNamespace(context.stringValue("GetMonitoringTemplateResponse.Resource.Namespace"));
		resource.setDescription(context.stringValue("GetMonitoringTemplateResponse.Resource.Description"));
		resource.setAlertTemplatesJson(context.stringValue("GetMonitoringTemplateResponse.Resource.AlertTemplatesJson"));
		resource.setEventRuleTemplatesJson(context.stringValue("GetMonitoringTemplateResponse.Resource.EventRuleTemplatesJson"));
		getMonitoringTemplateResponse.setResource(resource);
	 
	 	return getMonitoringTemplateResponse;
	}
}