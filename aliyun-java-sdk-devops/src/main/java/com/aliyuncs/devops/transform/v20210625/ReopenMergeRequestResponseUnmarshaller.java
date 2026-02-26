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

import com.aliyuncs.devops.model.v20210625.ReopenMergeRequestResponse;
import com.aliyuncs.devops.model.v20210625.ReopenMergeRequestResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReopenMergeRequestResponseUnmarshaller {

	public static ReopenMergeRequestResponse unmarshall(ReopenMergeRequestResponse reopenMergeRequestResponse, UnmarshallerContext _ctx) {
		
		reopenMergeRequestResponse.setRequestId(_ctx.stringValue("ReopenMergeRequestResponse.requestId"));
		reopenMergeRequestResponse.setErrorMessage(_ctx.stringValue("ReopenMergeRequestResponse.errorMessage"));
		reopenMergeRequestResponse.setErrorCode(_ctx.stringValue("ReopenMergeRequestResponse.errorCode"));
		reopenMergeRequestResponse.setSuccess(_ctx.booleanValue("ReopenMergeRequestResponse.success"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("ReopenMergeRequestResponse.result.result"));
		reopenMergeRequestResponse.setResult(result);
	 
	 	return reopenMergeRequestResponse;
	}
}