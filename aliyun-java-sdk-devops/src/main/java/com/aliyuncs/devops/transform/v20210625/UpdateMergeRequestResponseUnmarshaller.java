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

import com.aliyuncs.devops.model.v20210625.UpdateMergeRequestResponse;
import com.aliyuncs.devops.model.v20210625.UpdateMergeRequestResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMergeRequestResponseUnmarshaller {

	public static UpdateMergeRequestResponse unmarshall(UpdateMergeRequestResponse updateMergeRequestResponse, UnmarshallerContext _ctx) {
		
		updateMergeRequestResponse.setRequestId(_ctx.stringValue("UpdateMergeRequestResponse.requestId"));
		updateMergeRequestResponse.setErrorMessage(_ctx.stringValue("UpdateMergeRequestResponse.errorMessage"));
		updateMergeRequestResponse.setErrorCode(_ctx.stringValue("UpdateMergeRequestResponse.errorCode"));
		updateMergeRequestResponse.setSuccess(_ctx.booleanValue("UpdateMergeRequestResponse.success"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("UpdateMergeRequestResponse.result.result"));
		updateMergeRequestResponse.setResult(result);
	 
	 	return updateMergeRequestResponse;
	}
}