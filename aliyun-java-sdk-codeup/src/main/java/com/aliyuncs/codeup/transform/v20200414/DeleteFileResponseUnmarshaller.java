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

import com.aliyuncs.codeup.model.v20200414.DeleteFileResponse;
import com.aliyuncs.codeup.model.v20200414.DeleteFileResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteFileResponseUnmarshaller {

	public static DeleteFileResponse unmarshall(DeleteFileResponse deleteFileResponse, UnmarshallerContext _ctx) {
		
		deleteFileResponse.setRequestId(_ctx.stringValue("DeleteFileResponse.RequestId"));
		deleteFileResponse.setErrorCode(_ctx.stringValue("DeleteFileResponse.ErrorCode"));
		deleteFileResponse.setSuccess(_ctx.booleanValue("DeleteFileResponse.Success"));
		deleteFileResponse.setErrorMessage(_ctx.stringValue("DeleteFileResponse.ErrorMessage"));

		Result result = new Result();
		result.setBranchName(_ctx.stringValue("DeleteFileResponse.Result.BranchName"));
		result.setFilePath(_ctx.stringValue("DeleteFileResponse.Result.FilePath"));
		deleteFileResponse.setResult(result);
	 
	 	return deleteFileResponse;
	}
}