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

import com.aliyuncs.dbs.model.v20190306.EnableBackupLogResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableBackupLogResponseUnmarshaller {

	public static EnableBackupLogResponse unmarshall(EnableBackupLogResponse enableBackupLogResponse, UnmarshallerContext _ctx) {
		
		enableBackupLogResponse.setRequestId(_ctx.stringValue("EnableBackupLogResponse.RequestId"));
		enableBackupLogResponse.setSuccess(_ctx.booleanValue("EnableBackupLogResponse.Success"));
		enableBackupLogResponse.setErrCode(_ctx.stringValue("EnableBackupLogResponse.ErrCode"));
		enableBackupLogResponse.setErrMessage(_ctx.stringValue("EnableBackupLogResponse.ErrMessage"));
		enableBackupLogResponse.setHttpStatusCode(_ctx.integerValue("EnableBackupLogResponse.HttpStatusCode"));
		enableBackupLogResponse.setBackupPlanId(_ctx.stringValue("EnableBackupLogResponse.BackupPlanId"));
		enableBackupLogResponse.setNeedPrecheck(_ctx.booleanValue("EnableBackupLogResponse.NeedPrecheck"));
	 
	 	return enableBackupLogResponse;
	}
}