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

import com.aliyuncs.devops.model.v20210625.DeleteRepositoryGroupResponse;
import com.aliyuncs.devops.model.v20210625.DeleteRepositoryGroupResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRepositoryGroupResponseUnmarshaller {

	public static DeleteRepositoryGroupResponse unmarshall(DeleteRepositoryGroupResponse deleteRepositoryGroupResponse, UnmarshallerContext _ctx) {
		
		deleteRepositoryGroupResponse.setRequestId(_ctx.stringValue("DeleteRepositoryGroupResponse.requestId"));
		deleteRepositoryGroupResponse.setErrorMessage(_ctx.stringValue("DeleteRepositoryGroupResponse.errorMessage"));
		deleteRepositoryGroupResponse.setErrorCode(_ctx.stringValue("DeleteRepositoryGroupResponse.errorCode"));
		deleteRepositoryGroupResponse.setSuccess(_ctx.booleanValue("DeleteRepositoryGroupResponse.success"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("DeleteRepositoryGroupResponse.result.result"));
		deleteRepositoryGroupResponse.setResult(result);
	 
	 	return deleteRepositoryGroupResponse;
	}
}