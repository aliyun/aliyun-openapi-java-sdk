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

import com.aliyuncs.retailcloud.model.v20180313.DeployAppResponse;
import com.aliyuncs.retailcloud.model.v20180313.DeployAppResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeployAppResponseUnmarshaller {

	public static DeployAppResponse unmarshall(DeployAppResponse deployAppResponse, UnmarshallerContext _ctx) {
		
		deployAppResponse.setRequestId(_ctx.stringValue("DeployAppResponse.RequestId"));
		deployAppResponse.setCode(_ctx.integerValue("DeployAppResponse.Code"));
		deployAppResponse.setErrMsg(_ctx.stringValue("DeployAppResponse.ErrMsg"));
		deployAppResponse.setSuccess(_ctx.booleanValue("DeployAppResponse.Success"));

		Result result = new Result();
		result.setAdmitted(_ctx.booleanValue("DeployAppResponse.Result.Admitted"));
		result.setBusinessCode(_ctx.stringValue("DeployAppResponse.Result.BusinessCode"));
		result.setDeployOrderId(_ctx.longValue("DeployAppResponse.Result.DeployOrderId"));
		deployAppResponse.setResult(result);
	 
	 	return deployAppResponse;
	}
}