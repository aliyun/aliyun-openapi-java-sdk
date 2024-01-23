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

import com.aliyuncs.devops.model.v20210625.MergeMergeRequestResponse;
import com.aliyuncs.devops.model.v20210625.MergeMergeRequestResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class MergeMergeRequestResponseUnmarshaller {

	public static MergeMergeRequestResponse unmarshall(MergeMergeRequestResponse mergeMergeRequestResponse, UnmarshallerContext _ctx) {
		
		mergeMergeRequestResponse.setRequestId(_ctx.stringValue("MergeMergeRequestResponse.requestId"));
		mergeMergeRequestResponse.setErrorMessage(_ctx.stringValue("MergeMergeRequestResponse.errorMessage"));
		mergeMergeRequestResponse.setErrorCode(_ctx.stringValue("MergeMergeRequestResponse.errorCode"));
		mergeMergeRequestResponse.setSuccess(_ctx.booleanValue("MergeMergeRequestResponse.success"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("MergeMergeRequestResponse.result.result"));
		result.setMergedRevision(_ctx.stringValue("MergeMergeRequestResponse.result.mergedRevision"));
		result.setBizId(_ctx.stringValue("MergeMergeRequestResponse.result.bizId"));
		result.setProjectId(_ctx.longValue("MergeMergeRequestResponse.result.projectId"));
		result.setLocalId(_ctx.longValue("MergeMergeRequestResponse.result.localId"));
		mergeMergeRequestResponse.setResult(result);
	 
	 	return mergeMergeRequestResponse;
	}
}