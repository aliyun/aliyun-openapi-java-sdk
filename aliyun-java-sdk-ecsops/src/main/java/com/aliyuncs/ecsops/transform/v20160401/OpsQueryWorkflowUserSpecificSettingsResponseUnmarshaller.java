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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryWorkflowUserSpecificSettingsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryWorkflowUserSpecificSettingsResponse.WorkflowUserSpecificSettings;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryWorkflowUserSpecificSettingsResponseUnmarshaller {

	public static OpsQueryWorkflowUserSpecificSettingsResponse unmarshall(OpsQueryWorkflowUserSpecificSettingsResponse opsQueryWorkflowUserSpecificSettingsResponse, UnmarshallerContext _ctx) {
		
		opsQueryWorkflowUserSpecificSettingsResponse.setRequestId(_ctx.stringValue("OpsQueryWorkflowUserSpecificSettingsResponse.RequestId"));

		WorkflowUserSpecificSettings workflowUserSpecificSettings = new WorkflowUserSpecificSettings();
		workflowUserSpecificSettings.setWildcard(_ctx.booleanValue("OpsQueryWorkflowUserSpecificSettingsResponse.WorkflowUserSpecificSettings.Wildcard"));
		workflowUserSpecificSettings.setSize(_ctx.integerValue("OpsQueryWorkflowUserSpecificSettingsResponse.WorkflowUserSpecificSettings.Size"));
		workflowUserSpecificSettings.setConcurrent(_ctx.integerValue("OpsQueryWorkflowUserSpecificSettingsResponse.WorkflowUserSpecificSettings.Concurrent"));
		workflowUserSpecificSettings.setPendingTimeout(_ctx.integerValue("OpsQueryWorkflowUserSpecificSettingsResponse.WorkflowUserSpecificSettings.PendingTimeout"));
		workflowUserSpecificSettings.setExecTimeout(_ctx.integerValue("OpsQueryWorkflowUserSpecificSettingsResponse.WorkflowUserSpecificSettings.ExecTimeout"));
		workflowUserSpecificSettings.setCreateDate(_ctx.stringValue("OpsQueryWorkflowUserSpecificSettingsResponse.WorkflowUserSpecificSettings.CreateDate"));
		workflowUserSpecificSettings.setModifyDate(_ctx.stringValue("OpsQueryWorkflowUserSpecificSettingsResponse.WorkflowUserSpecificSettings.ModifyDate"));
		workflowUserSpecificSettings.setExpireDate(_ctx.stringValue("OpsQueryWorkflowUserSpecificSettingsResponse.WorkflowUserSpecificSettings.ExpireDate"));
		opsQueryWorkflowUserSpecificSettingsResponse.setWorkflowUserSpecificSettings(workflowUserSpecificSettings);
	 
	 	return opsQueryWorkflowUserSpecificSettingsResponse;
	}
}