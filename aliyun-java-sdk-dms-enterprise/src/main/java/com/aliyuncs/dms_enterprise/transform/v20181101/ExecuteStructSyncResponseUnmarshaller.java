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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.ExecuteStructSyncResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteStructSyncResponseUnmarshaller {

	public static ExecuteStructSyncResponse unmarshall(ExecuteStructSyncResponse executeStructSyncResponse, UnmarshallerContext _ctx) {
		
		executeStructSyncResponse.setRequestId(_ctx.stringValue("ExecuteStructSyncResponse.RequestId"));
		executeStructSyncResponse.setErrorCode(_ctx.stringValue("ExecuteStructSyncResponse.ErrorCode"));
		executeStructSyncResponse.setErrorMessage(_ctx.stringValue("ExecuteStructSyncResponse.ErrorMessage"));
		executeStructSyncResponse.setSuccess(_ctx.booleanValue("ExecuteStructSyncResponse.Success"));
	 
	 	return executeStructSyncResponse;
	}
}