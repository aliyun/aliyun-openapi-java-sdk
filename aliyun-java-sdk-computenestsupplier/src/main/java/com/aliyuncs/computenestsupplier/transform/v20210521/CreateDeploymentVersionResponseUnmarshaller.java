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

import com.aliyuncs.computenestsupplier.model.v20210521.CreateDeploymentVersionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDeploymentVersionResponseUnmarshaller {

	public static CreateDeploymentVersionResponse unmarshall(CreateDeploymentVersionResponse createDeploymentVersionResponse, UnmarshallerContext _ctx) {
		
		createDeploymentVersionResponse.setRequestId(_ctx.stringValue("CreateDeploymentVersionResponse.RequestId"));
		createDeploymentVersionResponse.setDeploymentId(_ctx.stringValue("CreateDeploymentVersionResponse.DeploymentId"));
		createDeploymentVersionResponse.setServiceId(_ctx.stringValue("CreateDeploymentVersionResponse.ServiceId"));
		createDeploymentVersionResponse.setVersion(_ctx.stringValue("CreateDeploymentVersionResponse.Version"));
		createDeploymentVersionResponse.setDeployType(_ctx.stringValue("CreateDeploymentVersionResponse.DeployType"));
		createDeploymentVersionResponse.setIsDefault(_ctx.booleanValue("CreateDeploymentVersionResponse.IsDefault"));
	 
	 	return createDeploymentVersionResponse;
	}
}