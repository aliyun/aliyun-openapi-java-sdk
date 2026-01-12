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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.DeployLocationTreeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeployLocationTreeResponseUnmarshaller {

	public static DeployLocationTreeResponse unmarshall(DeployLocationTreeResponse deployLocationTreeResponse, UnmarshallerContext _ctx) {
		
		deployLocationTreeResponse.setRequestId(_ctx.stringValue("DeployLocationTreeResponse.RequestId"));
		deployLocationTreeResponse.setSuccess(_ctx.booleanValue("DeployLocationTreeResponse.Success"));
		deployLocationTreeResponse.setCode(_ctx.stringValue("DeployLocationTreeResponse.Code"));
		deployLocationTreeResponse.setMessage(_ctx.stringValue("DeployLocationTreeResponse.Message"));
		deployLocationTreeResponse.setErrorName(_ctx.stringValue("DeployLocationTreeResponse.ErrorName"));
		deployLocationTreeResponse.setHttpCode(_ctx.integerValue("DeployLocationTreeResponse.HttpCode"));
		deployLocationTreeResponse.setData(_ctx.booleanValue("DeployLocationTreeResponse.Data"));
	 
	 	return deployLocationTreeResponse;
	}
}