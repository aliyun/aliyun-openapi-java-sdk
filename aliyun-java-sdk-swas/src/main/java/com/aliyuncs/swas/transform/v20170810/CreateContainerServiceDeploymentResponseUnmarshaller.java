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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.CreateContainerServiceDeploymentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateContainerServiceDeploymentResponseUnmarshaller {

	public static CreateContainerServiceDeploymentResponse unmarshall(CreateContainerServiceDeploymentResponse createContainerServiceDeploymentResponse, UnmarshallerContext _ctx) {
		
		createContainerServiceDeploymentResponse.setRequestId(_ctx.stringValue("CreateContainerServiceDeploymentResponse.RequestId"));
		createContainerServiceDeploymentResponse.setIsSuccess(_ctx.booleanValue("CreateContainerServiceDeploymentResponse.IsSuccess"));
		createContainerServiceDeploymentResponse.setCode(_ctx.stringValue("CreateContainerServiceDeploymentResponse.Code"));
	 
	 	return createContainerServiceDeploymentResponse;
	}
}