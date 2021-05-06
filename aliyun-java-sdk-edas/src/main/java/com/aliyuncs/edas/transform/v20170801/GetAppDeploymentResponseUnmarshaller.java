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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.GetAppDeploymentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppDeploymentResponseUnmarshaller {

	public static GetAppDeploymentResponse unmarshall(GetAppDeploymentResponse getAppDeploymentResponse, UnmarshallerContext _ctx) {
		
		getAppDeploymentResponse.setRequestId(_ctx.stringValue("GetAppDeploymentResponse.RequestId"));
		getAppDeploymentResponse.setCode(_ctx.integerValue("GetAppDeploymentResponse.Code"));
		getAppDeploymentResponse.setMessage(_ctx.stringValue("GetAppDeploymentResponse.Message"));
		getAppDeploymentResponse.setData(_ctx.stringValue("GetAppDeploymentResponse.Data"));
	 
	 	return getAppDeploymentResponse;
	}
}