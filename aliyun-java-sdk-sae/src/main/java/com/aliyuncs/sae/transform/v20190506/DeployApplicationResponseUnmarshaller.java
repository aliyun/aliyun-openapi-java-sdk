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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.DeployApplicationResponse;
import com.aliyuncs.sae.model.v20190506.DeployApplicationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeployApplicationResponseUnmarshaller {

	public static DeployApplicationResponse unmarshall(DeployApplicationResponse deployApplicationResponse, UnmarshallerContext _ctx) {
		
		deployApplicationResponse.setRequestId(_ctx.stringValue("DeployApplicationResponse.RequestId"));
		deployApplicationResponse.setCode(_ctx.stringValue("DeployApplicationResponse.Code"));
		deployApplicationResponse.setMessage(_ctx.stringValue("DeployApplicationResponse.Message"));
		deployApplicationResponse.setErrorCode(_ctx.stringValue("DeployApplicationResponse.ErrorCode"));
		deployApplicationResponse.setTraceId(_ctx.stringValue("DeployApplicationResponse.TraceId"));
		deployApplicationResponse.setSuccess(_ctx.booleanValue("DeployApplicationResponse.Success"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("DeployApplicationResponse.Data.AppId"));
		data.setChangeOrderId(_ctx.stringValue("DeployApplicationResponse.Data.ChangeOrderId"));
		deployApplicationResponse.setData(data);
	 
	 	return deployApplicationResponse;
	}
}