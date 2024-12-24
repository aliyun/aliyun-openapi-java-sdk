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

package com.aliyuncs.brinekingdom.transform.v20190627;

import com.aliyuncs.brinekingdom.model.v20190627.GetProjectTypeByCodeResponse;
import com.aliyuncs.brinekingdom.model.v20190627.GetProjectTypeByCodeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectTypeByCodeResponseUnmarshaller {

	public static GetProjectTypeByCodeResponse unmarshall(GetProjectTypeByCodeResponse getProjectTypeByCodeResponse, UnmarshallerContext _ctx) {
		
		getProjectTypeByCodeResponse.setRequestId(_ctx.stringValue("GetProjectTypeByCodeResponse.RequestId"));
		getProjectTypeByCodeResponse.set_Class(_ctx.stringValue("GetProjectTypeByCodeResponse.Class"));
		getProjectTypeByCodeResponse.setErrorMessage(_ctx.stringValue("GetProjectTypeByCodeResponse.ErrorMessage"));
		getProjectTypeByCodeResponse.setSuccess(_ctx.booleanValue("GetProjectTypeByCodeResponse.Success"));
		getProjectTypeByCodeResponse.setResultCode(_ctx.stringValue("GetProjectTypeByCodeResponse.ResultCode"));

		Result result = new Result();
		result.set_Class(_ctx.stringValue("GetProjectTypeByCodeResponse.Result.Class"));
		result.setId(_ctx.longValue("GetProjectTypeByCodeResponse.Result.Id"));
		result.setProjectType(_ctx.stringValue("GetProjectTypeByCodeResponse.Result.ProjectType"));
		result.setProjectTypeName(_ctx.stringValue("GetProjectTypeByCodeResponse.Result.ProjectTypeName"));
		getProjectTypeByCodeResponse.setResult(result);
	 
	 	return getProjectTypeByCodeResponse;
	}
}