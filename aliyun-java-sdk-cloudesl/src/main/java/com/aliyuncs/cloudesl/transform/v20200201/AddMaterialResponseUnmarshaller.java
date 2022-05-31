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

package com.aliyuncs.cloudesl.transform.v20200201;

import com.aliyuncs.cloudesl.model.v20200201.AddMaterialResponse;
import com.aliyuncs.cloudesl.model.v20200201.AddMaterialResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMaterialResponseUnmarshaller {

	public static AddMaterialResponse unmarshall(AddMaterialResponse addMaterialResponse, UnmarshallerContext _ctx) {
		
		addMaterialResponse.setRequestId(_ctx.stringValue("AddMaterialResponse.RequestId"));
		addMaterialResponse.setSuccess(_ctx.booleanValue("AddMaterialResponse.Success"));
		addMaterialResponse.setMessage(_ctx.stringValue("AddMaterialResponse.Message"));
		addMaterialResponse.setErrorCode(_ctx.stringValue("AddMaterialResponse.ErrorCode"));
		addMaterialResponse.setErrorMessage(_ctx.stringValue("AddMaterialResponse.ErrorMessage"));
		addMaterialResponse.setCode(_ctx.stringValue("AddMaterialResponse.Code"));
		addMaterialResponse.setDynamicCode(_ctx.stringValue("AddMaterialResponse.DynamicCode"));
		addMaterialResponse.setDynamicMessage(_ctx.stringValue("AddMaterialResponse.DynamicMessage"));

		Result result = new Result();
		result.setSuccess(_ctx.booleanValue("AddMaterialResponse.Result.Success"));
		result.setMessage(_ctx.stringValue("AddMaterialResponse.Result.Message"));
		result.setDynamicMessage(_ctx.stringValue("AddMaterialResponse.Result.DynamicMessage"));
		result.setDynamicCode(_ctx.stringValue("AddMaterialResponse.Result.DynamicCode"));
		result.setErrorCode(_ctx.stringValue("AddMaterialResponse.Result.ErrorCode"));
		addMaterialResponse.setResult(result);
	 
	 	return addMaterialResponse;
	}
}