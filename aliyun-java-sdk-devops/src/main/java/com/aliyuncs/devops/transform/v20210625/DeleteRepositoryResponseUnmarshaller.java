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

import com.aliyuncs.devops.model.v20210625.DeleteRepositoryResponse;
import com.aliyuncs.devops.model.v20210625.DeleteRepositoryResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRepositoryResponseUnmarshaller {

	public static DeleteRepositoryResponse unmarshall(DeleteRepositoryResponse deleteRepositoryResponse, UnmarshallerContext _ctx) {
		
		deleteRepositoryResponse.setRequestId(_ctx.stringValue("DeleteRepositoryResponse.requestId"));
		deleteRepositoryResponse.setErrorMessage(_ctx.stringValue("DeleteRepositoryResponse.errorMessage"));
		deleteRepositoryResponse.setErrorCode(_ctx.stringValue("DeleteRepositoryResponse.errorCode"));
		deleteRepositoryResponse.setSuccess(_ctx.booleanValue("DeleteRepositoryResponse.success"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("DeleteRepositoryResponse.result.result"));
		deleteRepositoryResponse.setResult(result);
	 
	 	return deleteRepositoryResponse;
	}
}