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

import com.aliyuncs.dbs.model.v20190306.ModifyBackupStrategyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyBackupStrategyResponseUnmarshaller {

	public static ModifyBackupStrategyResponse unmarshall(ModifyBackupStrategyResponse modifyBackupStrategyResponse, UnmarshallerContext _ctx) {
		
		modifyBackupStrategyResponse.setRequestId(_ctx.stringValue("ModifyBackupStrategyResponse.RequestId"));
		modifyBackupStrategyResponse.setSuccess(_ctx.booleanValue("ModifyBackupStrategyResponse.Success"));
		modifyBackupStrategyResponse.setErrCode(_ctx.stringValue("ModifyBackupStrategyResponse.ErrCode"));
		modifyBackupStrategyResponse.setErrMessage(_ctx.stringValue("ModifyBackupStrategyResponse.ErrMessage"));
		modifyBackupStrategyResponse.setHttpStatusCode(_ctx.integerValue("ModifyBackupStrategyResponse.HttpStatusCode"));
		modifyBackupStrategyResponse.setBackupPlanId(_ctx.stringValue("ModifyBackupStrategyResponse.BackupPlanId"));
		modifyBackupStrategyResponse.setNeedPrecheck(_ctx.booleanValue("ModifyBackupStrategyResponse.NeedPrecheck"));
	 
	 	return modifyBackupStrategyResponse;
	}
}