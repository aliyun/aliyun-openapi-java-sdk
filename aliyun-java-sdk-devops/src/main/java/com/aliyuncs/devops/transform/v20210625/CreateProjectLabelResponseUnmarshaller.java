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

import com.aliyuncs.devops.model.v20210625.CreateProjectLabelResponse;
import com.aliyuncs.devops.model.v20210625.CreateProjectLabelResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateProjectLabelResponseUnmarshaller {

	public static CreateProjectLabelResponse unmarshall(CreateProjectLabelResponse createProjectLabelResponse, UnmarshallerContext _ctx) {
		
		createProjectLabelResponse.setRequestId(_ctx.stringValue("CreateProjectLabelResponse.requestId"));
		createProjectLabelResponse.setSuccess(_ctx.booleanValue("CreateProjectLabelResponse.success"));
		createProjectLabelResponse.setErrorCode(_ctx.stringValue("CreateProjectLabelResponse.errorCode"));
		createProjectLabelResponse.setErrorMessage(_ctx.stringValue("CreateProjectLabelResponse.errorMessage"));

		Result result = new Result();
		result.setId(_ctx.stringValue("CreateProjectLabelResponse.result.id"));
		result.setName(_ctx.stringValue("CreateProjectLabelResponse.result.name"));
		result.setColor(_ctx.stringValue("CreateProjectLabelResponse.result.color"));
		result.setDescription(_ctx.stringValue("CreateProjectLabelResponse.result.description"));
		createProjectLabelResponse.setResult(result);
	 
	 	return createProjectLabelResponse;
	}
}