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

import com.aliyuncs.dbs.model.v20190306.CreateBackupPlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBackupPlanResponseUnmarshaller {

	public static CreateBackupPlanResponse unmarshall(CreateBackupPlanResponse createBackupPlanResponse, UnmarshallerContext context) {
		
		createBackupPlanResponse.setRequestId(context.stringValue("CreateBackupPlanResponse.RequestId"));
		createBackupPlanResponse.setSuccess(context.booleanValue("CreateBackupPlanResponse.Success"));
		createBackupPlanResponse.setErrCode(context.stringValue("CreateBackupPlanResponse.ErrCode"));
		createBackupPlanResponse.setErrMessage(context.stringValue("CreateBackupPlanResponse.ErrMessage"));
		createBackupPlanResponse.setHttpStatusCode(context.integerValue("CreateBackupPlanResponse.HttpStatusCode"));
		createBackupPlanResponse.setBackupPlanId(context.stringValue("CreateBackupPlanResponse.BackupPlanId"));
		createBackupPlanResponse.setOrderId(context.stringValue("CreateBackupPlanResponse.OrderId"));
	 
	 	return createBackupPlanResponse;
	}
}