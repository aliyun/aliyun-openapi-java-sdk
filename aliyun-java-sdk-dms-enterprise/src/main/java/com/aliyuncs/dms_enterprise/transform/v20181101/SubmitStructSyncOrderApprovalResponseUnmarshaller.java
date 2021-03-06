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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.SubmitStructSyncOrderApprovalResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitStructSyncOrderApprovalResponseUnmarshaller {

	public static SubmitStructSyncOrderApprovalResponse unmarshall(SubmitStructSyncOrderApprovalResponse submitStructSyncOrderApprovalResponse, UnmarshallerContext _ctx) {
		
		submitStructSyncOrderApprovalResponse.setRequestId(_ctx.stringValue("SubmitStructSyncOrderApprovalResponse.RequestId"));
		submitStructSyncOrderApprovalResponse.setWorkflowInstanceId(_ctx.longValue("SubmitStructSyncOrderApprovalResponse.WorkflowInstanceId"));
		submitStructSyncOrderApprovalResponse.setErrorCode(_ctx.stringValue("SubmitStructSyncOrderApprovalResponse.ErrorCode"));
		submitStructSyncOrderApprovalResponse.setErrorMessage(_ctx.stringValue("SubmitStructSyncOrderApprovalResponse.ErrorMessage"));
		submitStructSyncOrderApprovalResponse.setSuccess(_ctx.booleanValue("SubmitStructSyncOrderApprovalResponse.Success"));
	 
	 	return submitStructSyncOrderApprovalResponse;
	}
}