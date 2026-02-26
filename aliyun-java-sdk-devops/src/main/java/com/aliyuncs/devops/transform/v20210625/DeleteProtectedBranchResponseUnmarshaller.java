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

import com.aliyuncs.devops.model.v20210625.DeleteProtectedBranchResponse;
import com.aliyuncs.devops.model.v20210625.DeleteProtectedBranchResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteProtectedBranchResponseUnmarshaller {

	public static DeleteProtectedBranchResponse unmarshall(DeleteProtectedBranchResponse deleteProtectedBranchResponse, UnmarshallerContext _ctx) {
		
		deleteProtectedBranchResponse.setRequestId(_ctx.stringValue("DeleteProtectedBranchResponse.requestId"));
		deleteProtectedBranchResponse.setErrorMessage(_ctx.stringValue("DeleteProtectedBranchResponse.errorMessage"));
		deleteProtectedBranchResponse.setErrorCode(_ctx.stringValue("DeleteProtectedBranchResponse.errorCode"));
		deleteProtectedBranchResponse.setSuccess(_ctx.booleanValue("DeleteProtectedBranchResponse.success"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("DeleteProtectedBranchResponse.result.result"));
		deleteProtectedBranchResponse.setResult(result);
	 
	 	return deleteProtectedBranchResponse;
	}
}