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

import com.aliyuncs.cms.model.v20180308.DeleteMonitoringTemplateResponse;
import com.aliyuncs.cms.model.v20180308.DeleteMonitoringTemplateResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMonitoringTemplateResponseUnmarshaller {

	public static DeleteMonitoringTemplateResponse unmarshall(DeleteMonitoringTemplateResponse deleteMonitoringTemplateResponse, UnmarshallerContext context) {
		
		deleteMonitoringTemplateResponse.setRequestId(context.stringValue("DeleteMonitoringTemplateResponse.RequestId"));
		deleteMonitoringTemplateResponse.setSuccess(context.booleanValue("DeleteMonitoringTemplateResponse.Success"));
		deleteMonitoringTemplateResponse.setErrorCode(context.integerValue("DeleteMonitoringTemplateResponse.ErrorCode"));
		deleteMonitoringTemplateResponse.setErrorMessage(context.stringValue("DeleteMonitoringTemplateResponse.ErrorMessage"));

		Resource resource = new Resource();
		resource.setName(context.stringValue("DeleteMonitoringTemplateResponse.Resource.Name"));
		resource.setId(context.stringValue("DeleteMonitoringTemplateResponse.Resource.Id"));
		resource.setRestVersion(context.stringValue("DeleteMonitoringTemplateResponse.Resource.RestVersion"));
		resource.setNamespace(context.stringValue("DeleteMonitoringTemplateResponse.Resource.Namespace"));
		resource.setDescription(context.stringValue("DeleteMonitoringTemplateResponse.Resource.Description"));
		resource.setAlertTemplatesJson(context.stringValue("DeleteMonitoringTemplateResponse.Resource.AlertTemplatesJson"));
		resource.setEventRuleTemplatesJson(context.stringValue("DeleteMonitoringTemplateResponse.Resource.EventRuleTemplatesJson"));
		deleteMonitoringTemplateResponse.setResource(resource);
	 
	 	return deleteMonitoringTemplateResponse;
	}
}