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

import com.aliyuncs.devops.model.v20210625.DeleteProjectLabelResponse;
import com.aliyuncs.devops.model.v20210625.DeleteProjectLabelResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteProjectLabelResponseUnmarshaller {

	public static DeleteProjectLabelResponse unmarshall(DeleteProjectLabelResponse deleteProjectLabelResponse, UnmarshallerContext _ctx) {
		
		deleteProjectLabelResponse.setRequestId(_ctx.stringValue("DeleteProjectLabelResponse.requestId"));
		deleteProjectLabelResponse.setSuccess(_ctx.booleanValue("DeleteProjectLabelResponse.success"));
		deleteProjectLabelResponse.setErrorCode(_ctx.stringValue("DeleteProjectLabelResponse.errorCode"));
		deleteProjectLabelResponse.setErrorMessage(_ctx.stringValue("DeleteProjectLabelResponse.errorMessage"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("DeleteProjectLabelResponse.result.result"));
		deleteProjectLabelResponse.setResult(result);
	 
	 	return deleteProjectLabelResponse;
	}
}