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

import com.aliyuncs.retailcloud.model.v20180313.CreateDeployConfigResponse;
import com.aliyuncs.retailcloud.model.v20180313.CreateDeployConfigResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDeployConfigResponseUnmarshaller {

	public static CreateDeployConfigResponse unmarshall(CreateDeployConfigResponse createDeployConfigResponse, UnmarshallerContext _ctx) {
		
		createDeployConfigResponse.setRequestId(_ctx.stringValue("CreateDeployConfigResponse.RequestId"));
		createDeployConfigResponse.setCode(_ctx.integerValue("CreateDeployConfigResponse.Code"));
		createDeployConfigResponse.setErrMessage(_ctx.stringValue("CreateDeployConfigResponse.ErrMessage"));

		Result result = new Result();
		result.setAppId(_ctx.longValue("CreateDeployConfigResponse.Result.AppId"));
		result.setName(_ctx.stringValue("CreateDeployConfigResponse.Result.Name"));
		result.setSchemaId(_ctx.longValue("CreateDeployConfigResponse.Result.SchemaId"));
		createDeployConfigResponse.setResult(result);
	 
	 	return createDeployConfigResponse;
	}
}