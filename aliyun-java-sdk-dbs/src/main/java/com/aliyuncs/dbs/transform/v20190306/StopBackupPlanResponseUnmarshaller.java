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

import com.aliyuncs.dbs.model.v20190306.StopBackupPlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopBackupPlanResponseUnmarshaller {

	public static StopBackupPlanResponse unmarshall(StopBackupPlanResponse stopBackupPlanResponse, UnmarshallerContext _ctx) {
		
		stopBackupPlanResponse.setRequestId(_ctx.stringValue("StopBackupPlanResponse.RequestId"));
		stopBackupPlanResponse.setSuccess(_ctx.booleanValue("StopBackupPlanResponse.Success"));
		stopBackupPlanResponse.setErrCode(_ctx.stringValue("StopBackupPlanResponse.ErrCode"));
		stopBackupPlanResponse.setErrMessage(_ctx.stringValue("StopBackupPlanResponse.ErrMessage"));
		stopBackupPlanResponse.setHttpStatusCode(_ctx.integerValue("StopBackupPlanResponse.HttpStatusCode"));
		stopBackupPlanResponse.setBackupPlanId(_ctx.stringValue("StopBackupPlanResponse.BackupPlanId"));
	 
	 	return stopBackupPlanResponse;
	}
}