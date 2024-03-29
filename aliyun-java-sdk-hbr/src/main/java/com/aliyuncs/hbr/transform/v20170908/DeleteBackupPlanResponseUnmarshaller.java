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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.DeleteBackupPlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteBackupPlanResponseUnmarshaller {

	public static DeleteBackupPlanResponse unmarshall(DeleteBackupPlanResponse deleteBackupPlanResponse, UnmarshallerContext _ctx) {
		
		deleteBackupPlanResponse.setRequestId(_ctx.stringValue("DeleteBackupPlanResponse.RequestId"));
		deleteBackupPlanResponse.setCode(_ctx.stringValue("DeleteBackupPlanResponse.Code"));
		deleteBackupPlanResponse.setMessage(_ctx.stringValue("DeleteBackupPlanResponse.Message"));
		deleteBackupPlanResponse.setSuccess(_ctx.booleanValue("DeleteBackupPlanResponse.Success"));
	 
	 	return deleteBackupPlanResponse;
	}
}