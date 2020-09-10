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

import com.aliyuncs.dbs.model.v20190306.ReleaseBackupPlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReleaseBackupPlanResponseUnmarshaller {

	public static ReleaseBackupPlanResponse unmarshall(ReleaseBackupPlanResponse releaseBackupPlanResponse, UnmarshallerContext _ctx) {
		
		releaseBackupPlanResponse.setRequestId(_ctx.stringValue("ReleaseBackupPlanResponse.RequestId"));
		releaseBackupPlanResponse.setSuccess(_ctx.booleanValue("ReleaseBackupPlanResponse.Success"));
		releaseBackupPlanResponse.setErrCode(_ctx.stringValue("ReleaseBackupPlanResponse.ErrCode"));
		releaseBackupPlanResponse.setErrMessage(_ctx.stringValue("ReleaseBackupPlanResponse.ErrMessage"));
		releaseBackupPlanResponse.setHttpStatusCode(_ctx.integerValue("ReleaseBackupPlanResponse.HttpStatusCode"));
		releaseBackupPlanResponse.setBackupPlanId(_ctx.stringValue("ReleaseBackupPlanResponse.BackupPlanId"));
	 
	 	return releaseBackupPlanResponse;
	}
}