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

import com.aliyuncs.dbs.model.v20190306.ModifyStorageStrategyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyStorageStrategyResponseUnmarshaller {

	public static ModifyStorageStrategyResponse unmarshall(ModifyStorageStrategyResponse modifyStorageStrategyResponse, UnmarshallerContext _ctx) {
		
		modifyStorageStrategyResponse.setRequestId(_ctx.stringValue("ModifyStorageStrategyResponse.RequestId"));
		modifyStorageStrategyResponse.setSuccess(_ctx.booleanValue("ModifyStorageStrategyResponse.Success"));
		modifyStorageStrategyResponse.setErrCode(_ctx.stringValue("ModifyStorageStrategyResponse.ErrCode"));
		modifyStorageStrategyResponse.setErrMessage(_ctx.stringValue("ModifyStorageStrategyResponse.ErrMessage"));
		modifyStorageStrategyResponse.setHttpStatusCode(_ctx.integerValue("ModifyStorageStrategyResponse.HttpStatusCode"));
		modifyStorageStrategyResponse.setBackupPlanId(_ctx.stringValue("ModifyStorageStrategyResponse.BackupPlanId"));
		modifyStorageStrategyResponse.setNeedPrecheck(_ctx.booleanValue("ModifyStorageStrategyResponse.NeedPrecheck"));
	 
	 	return modifyStorageStrategyResponse;
	}
}