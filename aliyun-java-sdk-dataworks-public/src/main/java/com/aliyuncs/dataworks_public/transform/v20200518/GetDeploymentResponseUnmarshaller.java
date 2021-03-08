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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetDeploymentResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetDeploymentResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetDeploymentResponse.Data.Deployment;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeploymentResponseUnmarshaller {

	public static GetDeploymentResponse unmarshall(GetDeploymentResponse getDeploymentResponse, UnmarshallerContext _ctx) {
		
		getDeploymentResponse.setRequestId(_ctx.stringValue("GetDeploymentResponse.RequestId"));
		getDeploymentResponse.setSuccess(_ctx.booleanValue("GetDeploymentResponse.Success"));
		getDeploymentResponse.setErrorCode(_ctx.stringValue("GetDeploymentResponse.ErrorCode"));
		getDeploymentResponse.setErrorMessage(_ctx.stringValue("GetDeploymentResponse.ErrorMessage"));
		getDeploymentResponse.setHttpStatusCode(_ctx.integerValue("GetDeploymentResponse.HttpStatusCode"));

		Data data = new Data();

		Deployment deployment = new Deployment();
		deployment.setName(_ctx.stringValue("GetDeploymentResponse.Data.Deployment.Name"));
		deployment.setCreatorId(_ctx.stringValue("GetDeploymentResponse.Data.Deployment.CreatorId"));
		deployment.setHandlerId(_ctx.stringValue("GetDeploymentResponse.Data.Deployment.HandlerId"));
		deployment.setCreateTime(_ctx.longValue("GetDeploymentResponse.Data.Deployment.CreateTime"));
		deployment.setExecuteTime(_ctx.longValue("GetDeploymentResponse.Data.Deployment.ExecuteTime"));
		deployment.setStatus(_ctx.integerValue("GetDeploymentResponse.Data.Deployment.Status"));
		deployment.setFromEnvironment(_ctx.integerValue("GetDeploymentResponse.Data.Deployment.FromEnvironment"));
		deployment.setToEnvironment(_ctx.integerValue("GetDeploymentResponse.Data.Deployment.ToEnvironment"));
		deployment.setErrorMessage(_ctx.stringValue("GetDeploymentResponse.Data.Deployment.ErrorMessage"));
		data.setDeployment(deployment);
		getDeploymentResponse.setData(data);
	 
	 	return getDeploymentResponse;
	}
}