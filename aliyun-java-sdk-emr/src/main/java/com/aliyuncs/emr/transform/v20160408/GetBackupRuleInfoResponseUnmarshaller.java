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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.GetBackupRuleInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBackupRuleInfoResponseUnmarshaller {

	public static GetBackupRuleInfoResponse unmarshall(GetBackupRuleInfoResponse getBackupRuleInfoResponse, UnmarshallerContext _ctx) {
		
		getBackupRuleInfoResponse.setRequestId(_ctx.stringValue("GetBackupRuleInfoResponse.RequestId"));
		getBackupRuleInfoResponse.setId(_ctx.stringValue("GetBackupRuleInfoResponse.Id"));
		getBackupRuleInfoResponse.setName(_ctx.stringValue("GetBackupRuleInfoResponse.Name"));
		getBackupRuleInfoResponse.setDescription(_ctx.stringValue("GetBackupRuleInfoResponse.Description"));
		getBackupRuleInfoResponse.setMetadataType(_ctx.stringValue("GetBackupRuleInfoResponse.MetadataType"));
		getBackupRuleInfoResponse.setBackupMethodType(_ctx.stringValue("GetBackupRuleInfoResponse.BackupMethodType"));
		getBackupRuleInfoResponse.setBackupPlanId(_ctx.stringValue("GetBackupRuleInfoResponse.BackupPlanId"));
	 
	 	return getBackupRuleInfoResponse;
	}
}