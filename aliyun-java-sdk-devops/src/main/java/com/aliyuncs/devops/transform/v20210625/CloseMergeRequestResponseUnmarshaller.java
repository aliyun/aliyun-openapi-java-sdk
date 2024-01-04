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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.CloseMergeRequestResponse;
import com.aliyuncs.devops.model.v20210625.CloseMergeRequestResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CloseMergeRequestResponseUnmarshaller {

	public static CloseMergeRequestResponse unmarshall(CloseMergeRequestResponse closeMergeRequestResponse, UnmarshallerContext _ctx) {
		
		closeMergeRequestResponse.setRequestId(_ctx.stringValue("CloseMergeRequestResponse.requestId"));
		closeMergeRequestResponse.setErrorMessage(_ctx.stringValue("CloseMergeRequestResponse.errorMessage"));
		closeMergeRequestResponse.setErrorCode(_ctx.stringValue("CloseMergeRequestResponse.errorCode"));
		closeMergeRequestResponse.setSuccess(_ctx.booleanValue("CloseMergeRequestResponse.success"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("CloseMergeRequestResponse.result.result"));
		closeMergeRequestResponse.setResult(result);
	 
	 	return closeMergeRequestResponse;
	}
}