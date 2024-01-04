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

import com.aliyuncs.devops.model.v20210625.UpdateFileResponse;
import com.aliyuncs.devops.model.v20210625.UpdateFileResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateFileResponseUnmarshaller {

	public static UpdateFileResponse unmarshall(UpdateFileResponse updateFileResponse, UnmarshallerContext _ctx) {
		
		updateFileResponse.setRequestId(_ctx.stringValue("UpdateFileResponse.requestId"));
		updateFileResponse.setErrorMessage(_ctx.stringValue("UpdateFileResponse.errorMessage"));
		updateFileResponse.setErrorCode(_ctx.stringValue("UpdateFileResponse.errorCode"));
		updateFileResponse.setSuccess(_ctx.booleanValue("UpdateFileResponse.success"));

		Result result = new Result();
		result.setBranchName(_ctx.stringValue("UpdateFileResponse.result.branchName"));
		result.setFilePath(_ctx.stringValue("UpdateFileResponse.result.filePath"));
		updateFileResponse.setResult(result);
	 
	 	return updateFileResponse;
	}
}