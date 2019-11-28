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

import com.aliyuncs.dms_enterprise.model.v20181101.ExecuteDataCorrectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteDataCorrectResponseUnmarshaller {

	public static ExecuteDataCorrectResponse unmarshall(ExecuteDataCorrectResponse executeDataCorrectResponse, UnmarshallerContext _ctx) {
		
		executeDataCorrectResponse.setRequestId(_ctx.stringValue("ExecuteDataCorrectResponse.RequestId"));
		executeDataCorrectResponse.setSuccess(_ctx.booleanValue("ExecuteDataCorrectResponse.Success"));
		executeDataCorrectResponse.setErrorMessage(_ctx.stringValue("ExecuteDataCorrectResponse.ErrorMessage"));
		executeDataCorrectResponse.setErrorCode(_ctx.stringValue("ExecuteDataCorrectResponse.ErrorCode"));
	 
	 	return executeDataCorrectResponse;
	}
}