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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.DeleteAppEnvironmentResponse;
import com.aliyuncs.retailcloud.model.v20180313.DeleteAppEnvironmentResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAppEnvironmentResponseUnmarshaller {

	public static DeleteAppEnvironmentResponse unmarshall(DeleteAppEnvironmentResponse deleteAppEnvironmentResponse, UnmarshallerContext _ctx) {
		
		deleteAppEnvironmentResponse.setRequestId(_ctx.stringValue("DeleteAppEnvironmentResponse.RequestId"));
		deleteAppEnvironmentResponse.setCode(_ctx.integerValue("DeleteAppEnvironmentResponse.Code"));
		deleteAppEnvironmentResponse.setErrMsg(_ctx.stringValue("DeleteAppEnvironmentResponse.ErrMsg"));

		Result result = new Result();
		result.setSuccess(_ctx.booleanValue("DeleteAppEnvironmentResponse.Result.Success"));
		deleteAppEnvironmentResponse.setResult(result);
	 
	 	return deleteAppEnvironmentResponse;
	}
}