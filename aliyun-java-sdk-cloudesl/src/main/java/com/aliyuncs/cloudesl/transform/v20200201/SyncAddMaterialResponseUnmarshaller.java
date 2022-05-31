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

import com.aliyuncs.cloudesl.model.v20200201.SyncAddMaterialResponse;
import com.aliyuncs.cloudesl.model.v20200201.SyncAddMaterialResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncAddMaterialResponseUnmarshaller {

	public static SyncAddMaterialResponse unmarshall(SyncAddMaterialResponse syncAddMaterialResponse, UnmarshallerContext _ctx) {
		
		syncAddMaterialResponse.setRequestId(_ctx.stringValue("SyncAddMaterialResponse.RequestId"));
		syncAddMaterialResponse.setSuccess(_ctx.booleanValue("SyncAddMaterialResponse.Success"));
		syncAddMaterialResponse.setMessage(_ctx.stringValue("SyncAddMaterialResponse.Message"));
		syncAddMaterialResponse.setErrorCode(_ctx.stringValue("SyncAddMaterialResponse.ErrorCode"));
		syncAddMaterialResponse.setErrorMessage(_ctx.stringValue("SyncAddMaterialResponse.ErrorMessage"));
		syncAddMaterialResponse.setCode(_ctx.stringValue("SyncAddMaterialResponse.Code"));
		syncAddMaterialResponse.setDynamicCode(_ctx.stringValue("SyncAddMaterialResponse.DynamicCode"));
		syncAddMaterialResponse.setDynamicMessage(_ctx.stringValue("SyncAddMaterialResponse.DynamicMessage"));

		Result result = new Result();
		result.setSuccess(_ctx.booleanValue("SyncAddMaterialResponse.Result.Success"));
		result.setMessage(_ctx.stringValue("SyncAddMaterialResponse.Result.Message"));
		result.setDynamicMessage(_ctx.stringValue("SyncAddMaterialResponse.Result.DynamicMessage"));
		result.setDynamicCode(_ctx.stringValue("SyncAddMaterialResponse.Result.DynamicCode"));
		result.setErrorCode(_ctx.stringValue("SyncAddMaterialResponse.Result.ErrorCode"));
		syncAddMaterialResponse.setResult(result);
	 
	 	return syncAddMaterialResponse;
	}
}