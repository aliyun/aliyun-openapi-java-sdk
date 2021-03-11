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

import com.aliyuncs.dbs.model.v20190306.CreateAndStartBackupPlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAndStartBackupPlanResponseUnmarshaller {

	public static CreateAndStartBackupPlanResponse unmarshall(CreateAndStartBackupPlanResponse createAndStartBackupPlanResponse, UnmarshallerContext _ctx) {
		
		createAndStartBackupPlanResponse.setRequestId(_ctx.stringValue("CreateAndStartBackupPlanResponse.RequestId"));
		createAndStartBackupPlanResponse.setSuccess(_ctx.booleanValue("CreateAndStartBackupPlanResponse.Success"));
		createAndStartBackupPlanResponse.setErrCode(_ctx.stringValue("CreateAndStartBackupPlanResponse.ErrCode"));
		createAndStartBackupPlanResponse.setErrMessage(_ctx.stringValue("CreateAndStartBackupPlanResponse.ErrMessage"));
		createAndStartBackupPlanResponse.setHttpStatusCode(_ctx.integerValue("CreateAndStartBackupPlanResponse.HttpStatusCode"));
		createAndStartBackupPlanResponse.setBackupPlanId(_ctx.stringValue("CreateAndStartBackupPlanResponse.BackupPlanId"));
		createAndStartBackupPlanResponse.setCreateBackupSet(_ctx.booleanValue("CreateAndStartBackupPlanResponse.CreateBackupSet"));
		createAndStartBackupPlanResponse.setOrderId(_ctx.stringValue("CreateAndStartBackupPlanResponse.OrderId"));
	 
	 	return createAndStartBackupPlanResponse;
	}
}