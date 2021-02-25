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

package com.aliyuncs.codeup.transform.v20200414;

import com.aliyuncs.codeup.model.v20200414.DeleteRepositoryProtectedBranchResponse;
import com.aliyuncs.codeup.model.v20200414.DeleteRepositoryProtectedBranchResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRepositoryProtectedBranchResponseUnmarshaller {

	public static DeleteRepositoryProtectedBranchResponse unmarshall(DeleteRepositoryProtectedBranchResponse deleteRepositoryProtectedBranchResponse, UnmarshallerContext _ctx) {
		
		deleteRepositoryProtectedBranchResponse.setRequestId(_ctx.stringValue("DeleteRepositoryProtectedBranchResponse.RequestId"));
		deleteRepositoryProtectedBranchResponse.setErrorCode(_ctx.stringValue("DeleteRepositoryProtectedBranchResponse.ErrorCode"));
		deleteRepositoryProtectedBranchResponse.setErrorMessage(_ctx.stringValue("DeleteRepositoryProtectedBranchResponse.ErrorMessage"));
		deleteRepositoryProtectedBranchResponse.setSuccess(_ctx.booleanValue("DeleteRepositoryProtectedBranchResponse.Success"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("DeleteRepositoryProtectedBranchResponse.Result.Result"));
		deleteRepositoryProtectedBranchResponse.setResult(result);
	 
	 	return deleteRepositoryProtectedBranchResponse;
	}
}