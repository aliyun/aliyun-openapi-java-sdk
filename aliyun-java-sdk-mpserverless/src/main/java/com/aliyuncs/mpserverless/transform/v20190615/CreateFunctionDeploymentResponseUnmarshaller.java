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

package com.aliyuncs.mpserverless.transform.v20190615;

import com.aliyuncs.mpserverless.model.v20190615.CreateFunctionDeploymentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFunctionDeploymentResponseUnmarshaller {

	public static CreateFunctionDeploymentResponse unmarshall(CreateFunctionDeploymentResponse createFunctionDeploymentResponse, UnmarshallerContext _ctx) {
		
		createFunctionDeploymentResponse.setRequestId(_ctx.stringValue("CreateFunctionDeploymentResponse.RequestId"));
		createFunctionDeploymentResponse.setHttpStatusCode(_ctx.stringValue("CreateFunctionDeploymentResponse.HttpStatusCode"));
		createFunctionDeploymentResponse.setSuccess(_ctx.booleanValue("CreateFunctionDeploymentResponse.Success"));
		createFunctionDeploymentResponse.setCode(_ctx.stringValue("CreateFunctionDeploymentResponse.Code"));
		createFunctionDeploymentResponse.setMessage(_ctx.stringValue("CreateFunctionDeploymentResponse.Message"));
		createFunctionDeploymentResponse.setDeploymentId(_ctx.stringValue("CreateFunctionDeploymentResponse.DeploymentId"));
		createFunctionDeploymentResponse.setUploadSignedUrl(_ctx.stringValue("CreateFunctionDeploymentResponse.UploadSignedUrl"));
	 
	 	return createFunctionDeploymentResponse;
	}
}