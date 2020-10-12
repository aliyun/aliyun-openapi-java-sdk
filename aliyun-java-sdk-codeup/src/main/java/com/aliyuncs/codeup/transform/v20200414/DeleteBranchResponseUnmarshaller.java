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

import com.aliyuncs.codeup.model.v20200414.DeleteBranchResponse;
import com.aliyuncs.codeup.model.v20200414.DeleteBranchResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteBranchResponseUnmarshaller {

	public static DeleteBranchResponse unmarshall(DeleteBranchResponse deleteBranchResponse, UnmarshallerContext _ctx) {
		
		deleteBranchResponse.setRequestId(_ctx.stringValue("DeleteBranchResponse.RequestId"));
		deleteBranchResponse.setErrorCode(_ctx.stringValue("DeleteBranchResponse.ErrorCode"));
		deleteBranchResponse.setSuccess(_ctx.booleanValue("DeleteBranchResponse.Success"));
		deleteBranchResponse.setErrorMessage(_ctx.stringValue("DeleteBranchResponse.ErrorMessage"));

		Result result = new Result();
		result.setBranchName(_ctx.stringValue("DeleteBranchResponse.Result.BranchName"));
		deleteBranchResponse.setResult(result);
	 
	 	return deleteBranchResponse;
	}
}