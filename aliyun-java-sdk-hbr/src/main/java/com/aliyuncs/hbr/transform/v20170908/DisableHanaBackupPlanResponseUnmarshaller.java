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

import com.aliyuncs.hbr.model.v20170908.DisableHanaBackupPlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableHanaBackupPlanResponseUnmarshaller {

	public static DisableHanaBackupPlanResponse unmarshall(DisableHanaBackupPlanResponse disableHanaBackupPlanResponse, UnmarshallerContext _ctx) {
		
		disableHanaBackupPlanResponse.setRequestId(_ctx.stringValue("DisableHanaBackupPlanResponse.RequestId"));
		disableHanaBackupPlanResponse.setCode(_ctx.stringValue("DisableHanaBackupPlanResponse.Code"));
		disableHanaBackupPlanResponse.setMessage(_ctx.stringValue("DisableHanaBackupPlanResponse.Message"));
		disableHanaBackupPlanResponse.setSuccess(_ctx.booleanValue("DisableHanaBackupPlanResponse.Success"));
	 
	 	return disableHanaBackupPlanResponse;
	}
}