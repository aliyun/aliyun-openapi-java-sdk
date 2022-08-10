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

import com.aliyuncs.computenestsupplier.model.v20210521.GetDeploymentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeploymentResponseUnmarshaller {

	public static GetDeploymentResponse unmarshall(GetDeploymentResponse getDeploymentResponse, UnmarshallerContext _ctx) {
		
		getDeploymentResponse.setRequestId(_ctx.stringValue("GetDeploymentResponse.RequestId"));
		getDeploymentResponse.setServiceId(_ctx.stringValue("GetDeploymentResponse.ServiceId"));
		getDeploymentResponse.setDeploymentId(_ctx.stringValue("GetDeploymentResponse.DeploymentId"));
		getDeploymentResponse.setVersion(_ctx.stringValue("GetDeploymentResponse.Version"));
		getDeploymentResponse.setName(_ctx.stringValue("GetDeploymentResponse.Name"));
		getDeploymentResponse.setDescription(_ctx.stringValue("GetDeploymentResponse.Description"));
		getDeploymentResponse.setDeployType(_ctx.stringValue("GetDeploymentResponse.DeployType"));
		getDeploymentResponse.setDeployMetadata(_ctx.stringValue("GetDeploymentResponse.DeployMetadata"));
		getDeploymentResponse.setDefaultVersion(_ctx.stringValue("GetDeploymentResponse.DefaultVersion"));
	 
	 	return getDeploymentResponse;
	}
}