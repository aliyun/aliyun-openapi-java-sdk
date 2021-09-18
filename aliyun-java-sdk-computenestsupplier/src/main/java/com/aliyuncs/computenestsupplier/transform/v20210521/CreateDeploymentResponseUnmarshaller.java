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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import com.aliyuncs.computenestsupplier.model.v20210521.CreateDeploymentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDeploymentResponseUnmarshaller {

	public static CreateDeploymentResponse unmarshall(CreateDeploymentResponse createDeploymentResponse, UnmarshallerContext _ctx) {
		
		createDeploymentResponse.setRequestId(_ctx.stringValue("CreateDeploymentResponse.RequestId"));
		createDeploymentResponse.setDeploymentId(_ctx.stringValue("CreateDeploymentResponse.DeploymentId"));
		createDeploymentResponse.setServiceId(_ctx.stringValue("CreateDeploymentResponse.ServiceId"));
		createDeploymentResponse.setVersion(_ctx.stringValue("CreateDeploymentResponse.Version"));
		createDeploymentResponse.setName(_ctx.stringValue("CreateDeploymentResponse.Name"));
		createDeploymentResponse.setDescription(_ctx.stringValue("CreateDeploymentResponse.Description"));
		createDeploymentResponse.setDeployType(_ctx.stringValue("CreateDeploymentResponse.DeployType"));
		createDeploymentResponse.setDeployMetadata(_ctx.stringValue("CreateDeploymentResponse.DeployMetadata"));
		createDeploymentResponse.setIsDefault(_ctx.booleanValue("CreateDeploymentResponse.IsDefault"));
	 
	 	return createDeploymentResponse;
	}
}