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

import com.aliyuncs.retailcloud.model.v20180313.UpdateDeployConfigResponse;
import com.aliyuncs.retailcloud.model.v20180313.UpdateDeployConfigResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDeployConfigResponseUnmarshaller {

	public static UpdateDeployConfigResponse unmarshall(UpdateDeployConfigResponse updateDeployConfigResponse, UnmarshallerContext _ctx) {
		
		updateDeployConfigResponse.setRequestId(_ctx.stringValue("UpdateDeployConfigResponse.RequestId"));
		updateDeployConfigResponse.setCode(_ctx.integerValue("UpdateDeployConfigResponse.Code"));
		updateDeployConfigResponse.setErrMsg(_ctx.stringValue("UpdateDeployConfigResponse.ErrMsg"));

		Result result = new Result();
		result.setSuccess(_ctx.booleanValue("UpdateDeployConfigResponse.Result.Success"));
		updateDeployConfigResponse.setResult(result);
	 
	 	return updateDeployConfigResponse;
	}
}