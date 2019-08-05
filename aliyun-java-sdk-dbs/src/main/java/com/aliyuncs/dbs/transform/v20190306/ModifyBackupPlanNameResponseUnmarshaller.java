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

package com.aliyuncs.dbs.transform.v20190306;

import com.aliyuncs.dbs.model.v20190306.ModifyBackupPlanNameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyBackupPlanNameResponseUnmarshaller {

	public static ModifyBackupPlanNameResponse unmarshall(ModifyBackupPlanNameResponse modifyBackupPlanNameResponse, UnmarshallerContext _ctx) {
		
		modifyBackupPlanNameResponse.setRequestId(_ctx.stringValue("ModifyBackupPlanNameResponse.RequestId"));
		modifyBackupPlanNameResponse.setSuccess(_ctx.booleanValue("ModifyBackupPlanNameResponse.Success"));
		modifyBackupPlanNameResponse.setErrCode(_ctx.stringValue("ModifyBackupPlanNameResponse.ErrCode"));
		modifyBackupPlanNameResponse.setErrMessage(_ctx.stringValue("ModifyBackupPlanNameResponse.ErrMessage"));
		modifyBackupPlanNameResponse.setHttpStatusCode(_ctx.integerValue("ModifyBackupPlanNameResponse.HttpStatusCode"));
		modifyBackupPlanNameResponse.setBackupPlanId(_ctx.stringValue("ModifyBackupPlanNameResponse.BackupPlanId"));
	 
	 	return modifyBackupPlanNameResponse;
	}
}