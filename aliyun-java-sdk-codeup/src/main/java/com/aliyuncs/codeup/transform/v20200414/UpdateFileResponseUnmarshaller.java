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

import com.aliyuncs.codeup.model.v20200414.UpdateFileResponse;
import com.aliyuncs.codeup.model.v20200414.UpdateFileResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateFileResponseUnmarshaller {

	public static UpdateFileResponse unmarshall(UpdateFileResponse updateFileResponse, UnmarshallerContext _ctx) {
		
		updateFileResponse.setRequestId(_ctx.stringValue("UpdateFileResponse.RequestId"));
		updateFileResponse.setErrorCode(_ctx.stringValue("UpdateFileResponse.ErrorCode"));
		updateFileResponse.setSuccess(_ctx.booleanValue("UpdateFileResponse.Success"));
		updateFileResponse.setErrorMessage(_ctx.stringValue("UpdateFileResponse.ErrorMessage"));

		Result result = new Result();
		result.setBranchName(_ctx.stringValue("UpdateFileResponse.Result.BranchName"));
		result.setFilePath(_ctx.stringValue("UpdateFileResponse.Result.FilePath"));
		updateFileResponse.setResult(result);
	 
	 	return updateFileResponse;
	}
}