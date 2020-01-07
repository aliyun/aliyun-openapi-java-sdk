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

import com.aliyuncs.retailcloud.model.v20180313.CreateAppResourceAllocResponse;
import com.aliyuncs.retailcloud.model.v20180313.CreateAppResourceAllocResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppResourceAllocResponseUnmarshaller {

	public static CreateAppResourceAllocResponse unmarshall(CreateAppResourceAllocResponse createAppResourceAllocResponse, UnmarshallerContext _ctx) {
		
		createAppResourceAllocResponse.setRequestId(_ctx.stringValue("CreateAppResourceAllocResponse.RequestId"));
		createAppResourceAllocResponse.setCode(_ctx.integerValue("CreateAppResourceAllocResponse.Code"));
		createAppResourceAllocResponse.setErrMsg(_ctx.stringValue("CreateAppResourceAllocResponse.ErrMsg"));
		createAppResourceAllocResponse.setSuccess(_ctx.booleanValue("CreateAppResourceAllocResponse.Success"));

		Result result = new Result();
		result.setAppEnvId(_ctx.longValue("CreateAppResourceAllocResponse.Result.AppEnvId"));
		result.setAppId(_ctx.longValue("CreateAppResourceAllocResponse.Result.AppId"));
		result.setClusterId(_ctx.stringValue("CreateAppResourceAllocResponse.Result.ClusterId"));
		result.setId(_ctx.longValue("CreateAppResourceAllocResponse.Result.Id"));
		result.setResourceDef(_ctx.stringValue("CreateAppResourceAllocResponse.Result.ResourceDef"));
		createAppResourceAllocResponse.setResult(result);
	 
	 	return createAppResourceAllocResponse;
	}
}