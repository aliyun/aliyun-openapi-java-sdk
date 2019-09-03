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

	public static ModifyInstanceCrossBackupPolicyResponse unmarshall(ModifyInstanceCrossBackupPolicyResponse modifyInstanceCrossBackupPolicyResponse, UnmarshallerContext _ctx) {
		
		modifyInstanceCrossBackupPolicyResponse.setRequestId(_ctx.stringValue("ModifyInstanceCrossBackupPolicyResponse.RequestId"));
		modifyInstanceCrossBackupPolicyResponse.setDBInstanceId(_ctx.stringValue("ModifyInstanceCrossBackupPolicyResponse.DBInstanceId"));
		modifyInstanceCrossBackupPolicyResponse.setRegionId(_ctx.stringValue("ModifyInstanceCrossBackupPolicyResponse.RegionId"));
		modifyInstanceCrossBackupPolicyResponse.setCrossBackupRegion(_ctx.stringValue("ModifyInstanceCrossBackupPolicyResponse.CrossBackupRegion"));
		modifyInstanceCrossBackupPolicyResponse.setCrossBackupType(_ctx.stringValue("ModifyInstanceCrossBackupPolicyResponse.CrossBackupType"));
		modifyInstanceCrossBackupPolicyResponse.setBackupEnabled(_ctx.stringValue("ModifyInstanceCrossBackupPolicyResponse.BackupEnabled"));
		modifyInstanceCrossBackupPolicyResponse.setLogBackupEnabled(_ctx.stringValue("ModifyInstanceCrossBackupPolicyResponse.LogBackupEnabled"));
		modifyInstanceCrossBackupPolicyResponse.setStorageOwner(_ctx.stringValue("ModifyInstanceCrossBackupPolicyResponse.StorageOwner"));
		modifyInstanceCrossBackupPolicyResponse.setStorageType(_ctx.stringValue("ModifyInstanceCrossBackupPolicyResponse.StorageType"));
		modifyInstanceCrossBackupPolicyResponse.setEndpoint(_ctx.stringValue("ModifyInstanceCrossBackupPolicyResponse.Endpoint"));
		modifyInstanceCrossBackupPolicyResponse.setRetentType(_ctx.integerValue("ModifyInstanceCrossBackupPolicyResponse.RetentType"));
		modifyInstanceCrossBackupPolicyResponse.setRetention(_ctx.integerValue("ModifyInstanceCrossBackupPolicyResponse.Retention"));
	 
	 	return modifyInstanceCrossBackupPolicyResponse;
	}
}