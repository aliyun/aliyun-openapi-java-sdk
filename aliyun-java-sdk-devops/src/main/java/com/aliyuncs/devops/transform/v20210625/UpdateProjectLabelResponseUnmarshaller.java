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

import com.aliyuncs.devops.model.v20210625.UpdateProjectLabelResponse;
import com.aliyuncs.devops.model.v20210625.UpdateProjectLabelResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateProjectLabelResponseUnmarshaller {

	public static UpdateProjectLabelResponse unmarshall(UpdateProjectLabelResponse updateProjectLabelResponse, UnmarshallerContext _ctx) {
		
		updateProjectLabelResponse.setRequestId(_ctx.stringValue("UpdateProjectLabelResponse.requestId"));
		updateProjectLabelResponse.setSuccess(_ctx.booleanValue("UpdateProjectLabelResponse.success"));
		updateProjectLabelResponse.setErrorCode(_ctx.stringValue("UpdateProjectLabelResponse.errorCode"));
		updateProjectLabelResponse.setErrorMessage(_ctx.stringValue("UpdateProjectLabelResponse.errorMessage"));

		Result result = new Result();
		result.setId(_ctx.stringValue("UpdateProjectLabelResponse.result.id"));
		result.setName(_ctx.stringValue("UpdateProjectLabelResponse.result.name"));
		result.setColor(_ctx.stringValue("UpdateProjectLabelResponse.result.color"));
		result.setDescription(_ctx.stringValue("UpdateProjectLabelResponse.result.description"));
		updateProjectLabelResponse.setResult(result);
	 
	 	return updateProjectLabelResponse;
	}
}