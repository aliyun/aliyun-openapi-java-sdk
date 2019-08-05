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

import com.aliyuncs.dbs.model.v20190306.ConfigureBackupPlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfigureBackupPlanResponseUnmarshaller {

	public static ConfigureBackupPlanResponse unmarshall(ConfigureBackupPlanResponse configureBackupPlanResponse, UnmarshallerContext _ctx) {
		
		configureBackupPlanResponse.setRequestId(_ctx.stringValue("ConfigureBackupPlanResponse.RequestId"));
		configureBackupPlanResponse.setSuccess(_ctx.booleanValue("ConfigureBackupPlanResponse.Success"));
		configureBackupPlanResponse.setErrCode(_ctx.stringValue("ConfigureBackupPlanResponse.ErrCode"));
		configureBackupPlanResponse.setErrMessage(_ctx.stringValue("ConfigureBackupPlanResponse.ErrMessage"));
		configureBackupPlanResponse.setHttpStatusCode(_ctx.integerValue("ConfigureBackupPlanResponse.HttpStatusCode"));
		configureBackupPlanResponse.setBackupPlanId(_ctx.stringValue("ConfigureBackupPlanResponse.BackupPlanId"));
	 
	 	return configureBackupPlanResponse;
	}
}