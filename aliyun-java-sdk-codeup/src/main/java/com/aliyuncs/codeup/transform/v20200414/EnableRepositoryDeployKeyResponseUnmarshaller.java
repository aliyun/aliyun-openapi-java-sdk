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

import com.aliyuncs.codeup.model.v20200414.EnableRepositoryDeployKeyResponse;
import com.aliyuncs.codeup.model.v20200414.EnableRepositoryDeployKeyResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableRepositoryDeployKeyResponseUnmarshaller {

	public static EnableRepositoryDeployKeyResponse unmarshall(EnableRepositoryDeployKeyResponse enableRepositoryDeployKeyResponse, UnmarshallerContext _ctx) {
		
		enableRepositoryDeployKeyResponse.setRequestId(_ctx.stringValue("EnableRepositoryDeployKeyResponse.RequestId"));
		enableRepositoryDeployKeyResponse.setErrorCode(_ctx.stringValue("EnableRepositoryDeployKeyResponse.ErrorCode"));
		enableRepositoryDeployKeyResponse.setErrorMessage(_ctx.stringValue("EnableRepositoryDeployKeyResponse.ErrorMessage"));
		enableRepositoryDeployKeyResponse.setSuccess(_ctx.booleanValue("EnableRepositoryDeployKeyResponse.Success"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("EnableRepositoryDeployKeyResponse.Result.Result"));
		enableRepositoryDeployKeyResponse.setResult(result);
	 
	 	return enableRepositoryDeployKeyResponse;
	}
}