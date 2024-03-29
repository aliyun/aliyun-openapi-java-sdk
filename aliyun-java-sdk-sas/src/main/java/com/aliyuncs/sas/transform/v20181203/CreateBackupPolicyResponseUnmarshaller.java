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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.CreateBackupPolicyResponse;
import com.aliyuncs.sas.model.v20181203.CreateBackupPolicyResponse.BackupPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBackupPolicyResponseUnmarshaller {

	public static CreateBackupPolicyResponse unmarshall(CreateBackupPolicyResponse createBackupPolicyResponse, UnmarshallerContext _ctx) {
		
		createBackupPolicyResponse.setRequestId(_ctx.stringValue("CreateBackupPolicyResponse.RequestId"));
		createBackupPolicyResponse.setCode(_ctx.stringValue("CreateBackupPolicyResponse.Code"));

		BackupPolicy backupPolicy = new BackupPolicy();
		backupPolicy.setId(_ctx.stringValue("CreateBackupPolicyResponse.BackupPolicy.Id"));
		backupPolicy.setStatus(_ctx.stringValue("CreateBackupPolicyResponse.BackupPolicy.Status"));
		createBackupPolicyResponse.setBackupPolicy(backupPolicy);
	 
	 	return createBackupPolicyResponse;
	}
}