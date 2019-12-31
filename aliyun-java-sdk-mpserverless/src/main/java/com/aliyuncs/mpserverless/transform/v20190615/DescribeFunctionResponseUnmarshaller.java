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

import com.aliyuncs.mpserverless.model.v20190615.DescribeFunctionResponse;
import com.aliyuncs.mpserverless.model.v20190615.DescribeFunctionResponse.Deployment;
import com.aliyuncs.mpserverless.model.v20190615.DescribeFunctionResponse.Function;
import com.aliyuncs.mpserverless.model.v20190615.DescribeFunctionResponse.Function.Spec;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFunctionResponseUnmarshaller {

	public static DescribeFunctionResponse unmarshall(DescribeFunctionResponse describeFunctionResponse, UnmarshallerContext _ctx) {
		
		describeFunctionResponse.setRequestId(_ctx.stringValue("DescribeFunctionResponse.RequestId"));
		describeFunctionResponse.setHttpStatusCode(_ctx.stringValue("DescribeFunctionResponse.HttpStatusCode"));
		describeFunctionResponse.setSuccess(_ctx.booleanValue("DescribeFunctionResponse.Success"));
		describeFunctionResponse.setCode(_ctx.stringValue("DescribeFunctionResponse.Code"));
		describeFunctionResponse.setMessage(_ctx.stringValue("DescribeFunctionResponse.Message"));

		Function function = new Function();
		function.setName(_ctx.stringValue("DescribeFunctionResponse.Function.Name"));
		function.setDesc(_ctx.stringValue("DescribeFunctionResponse.Function.Desc"));
		function.setCreatedAt(_ctx.stringValue("DescribeFunctionResponse.Function.CreatedAt"));
		function.setModifiedAt(_ctx.stringValue("DescribeFunctionResponse.Function.ModifiedAt"));

		Spec spec = new Spec();
		spec.setRuntime(_ctx.stringValue("DescribeFunctionResponse.Function.Spec.Runtime"));
		spec.setMemory(_ctx.stringValue("DescribeFunctionResponse.Function.Spec.Memory"));
		spec.setTimeout(_ctx.stringValue("DescribeFunctionResponse.Function.Spec.Timeout"));
		function.setSpec(spec);
		describeFunctionResponse.setFunction(function);

		Deployment deployment = new Deployment();
		deployment.setDeploymentId(_ctx.stringValue("DescribeFunctionResponse.Deployment.DeploymentId"));
		deployment.setVersionNo(_ctx.stringValue("DescribeFunctionResponse.Deployment.VersionNo"));
		deployment.setCreatedAt(_ctx.stringValue("DescribeFunctionResponse.Deployment.CreatedAt"));
		deployment.setModifiedAt(_ctx.stringValue("DescribeFunctionResponse.Deployment.ModifiedAt"));
		deployment.setDownloadSignedUrl(_ctx.stringValue("DescribeFunctionResponse.Deployment.DownloadSignedUrl"));
		describeFunctionResponse.setDeployment(deployment);
	 
	 	return describeFunctionResponse;
	}
}