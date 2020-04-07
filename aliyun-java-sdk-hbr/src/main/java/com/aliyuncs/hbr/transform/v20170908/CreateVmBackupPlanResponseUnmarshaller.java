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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.CreateVmBackupPlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateVmBackupPlanResponseUnmarshaller {

	public static CreateVmBackupPlanResponse unmarshall(CreateVmBackupPlanResponse createVmBackupPlanResponse, UnmarshallerContext _ctx) {
		
		createVmBackupPlanResponse.setRequestId(_ctx.stringValue("CreateVmBackupPlanResponse.RequestId"));
		createVmBackupPlanResponse.setSuccess(_ctx.booleanValue("CreateVmBackupPlanResponse.Success"));
		createVmBackupPlanResponse.setCode(_ctx.stringValue("CreateVmBackupPlanResponse.Code"));
		createVmBackupPlanResponse.setMessage(_ctx.stringValue("CreateVmBackupPlanResponse.Message"));
		createVmBackupPlanResponse.setPlanId(_ctx.stringValue("CreateVmBackupPlanResponse.PlanId"));
	 
	 	return createVmBackupPlanResponse;
	}
}