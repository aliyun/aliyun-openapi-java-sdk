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

import com.aliyuncs.dbs.model.v20190306.ModifyBackupSetDownloadRulesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyBackupSetDownloadRulesResponseUnmarshaller {

	public static ModifyBackupSetDownloadRulesResponse unmarshall(ModifyBackupSetDownloadRulesResponse modifyBackupSetDownloadRulesResponse, UnmarshallerContext _ctx) {
		
		modifyBackupSetDownloadRulesResponse.setRequestId(_ctx.stringValue("ModifyBackupSetDownloadRulesResponse.RequestId"));
		modifyBackupSetDownloadRulesResponse.setSuccess(_ctx.booleanValue("ModifyBackupSetDownloadRulesResponse.Success"));
		modifyBackupSetDownloadRulesResponse.setErrCode(_ctx.stringValue("ModifyBackupSetDownloadRulesResponse.ErrCode"));
		modifyBackupSetDownloadRulesResponse.setErrMessage(_ctx.stringValue("ModifyBackupSetDownloadRulesResponse.ErrMessage"));
		modifyBackupSetDownloadRulesResponse.setHttpStatusCode(_ctx.integerValue("ModifyBackupSetDownloadRulesResponse.HttpStatusCode"));
		modifyBackupSetDownloadRulesResponse.setBackupPlanId(_ctx.stringValue("ModifyBackupSetDownloadRulesResponse.BackupPlanId"));
	 
	 	return modifyBackupSetDownloadRulesResponse;
	}
}