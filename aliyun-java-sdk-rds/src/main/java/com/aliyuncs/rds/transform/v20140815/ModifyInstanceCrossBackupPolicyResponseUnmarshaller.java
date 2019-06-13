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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.ModifyInstanceCrossBackupPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyInstanceCrossBackupPolicyResponseUnmarshaller {

	public static ModifyInstanceCrossBackupPolicyResponse unmarshall(ModifyInstanceCrossBackupPolicyResponse modifyInstanceCrossBackupPolicyResponse, UnmarshallerContext context) {
		
		modifyInstanceCrossBackupPolicyResponse.setRequestId(context.stringValue("ModifyInstanceCrossBackupPolicyResponse.RequestId"));
		modifyInstanceCrossBackupPolicyResponse.setDBInstanceId(context.stringValue("ModifyInstanceCrossBackupPolicyResponse.DBInstanceId"));
		modifyInstanceCrossBackupPolicyResponse.setRegionId(context.stringValue("ModifyInstanceCrossBackupPolicyResponse.RegionId"));
		modifyInstanceCrossBackupPolicyResponse.setCrossBackupRegion(context.stringValue("ModifyInstanceCrossBackupPolicyResponse.CrossBackupRegion"));
		modifyInstanceCrossBackupPolicyResponse.setCrossBackupType(context.stringValue("ModifyInstanceCrossBackupPolicyResponse.CrossBackupType"));
		modifyInstanceCrossBackupPolicyResponse.setBackupEnabled(context.stringValue("ModifyInstanceCrossBackupPolicyResponse.BackupEnabled"));
		modifyInstanceCrossBackupPolicyResponse.setLogBackupEnabled(context.stringValue("ModifyInstanceCrossBackupPolicyResponse.LogBackupEnabled"));
		modifyInstanceCrossBackupPolicyResponse.setStorageOwner(context.stringValue("ModifyInstanceCrossBackupPolicyResponse.StorageOwner"));
		modifyInstanceCrossBackupPolicyResponse.setStorageType(context.stringValue("ModifyInstanceCrossBackupPolicyResponse.StorageType"));
		modifyInstanceCrossBackupPolicyResponse.setEndpoint(context.stringValue("ModifyInstanceCrossBackupPolicyResponse.Endpoint"));
		modifyInstanceCrossBackupPolicyResponse.setRetentType(context.integerValue("ModifyInstanceCrossBackupPolicyResponse.RetentType"));
		modifyInstanceCrossBackupPolicyResponse.setRetention(context.integerValue("ModifyInstanceCrossBackupPolicyResponse.Retention"));
	 
	 	return modifyInstanceCrossBackupPolicyResponse;
	}
}