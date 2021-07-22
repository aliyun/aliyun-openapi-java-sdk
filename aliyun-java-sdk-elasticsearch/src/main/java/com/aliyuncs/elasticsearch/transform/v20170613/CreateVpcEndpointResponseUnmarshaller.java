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

package com.aliyuncs.elasticsearch.transform.v20170613;

import com.aliyuncs.elasticsearch.model.v20170613.CreateVpcEndpointResponse;
import com.aliyuncs.elasticsearch.model.v20170613.CreateVpcEndpointResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateVpcEndpointResponseUnmarshaller {

	public static CreateVpcEndpointResponse unmarshall(CreateVpcEndpointResponse createVpcEndpointResponse, UnmarshallerContext _ctx) {
		
		createVpcEndpointResponse.setRequestId(_ctx.stringValue("CreateVpcEndpointResponse.RequestId"));

		Result result = new Result();
		result.setEndpointId(_ctx.stringValue("CreateVpcEndpointResponse.Result.endpointId"));
		result.setEndpointName(_ctx.stringValue("CreateVpcEndpointResponse.Result.endpointName"));
		result.setServiceId(_ctx.stringValue("CreateVpcEndpointResponse.Result.serviceId"));
		result.setEndpointDomain(_ctx.stringValue("CreateVpcEndpointResponse.Result.endpointDomain"));
		createVpcEndpointResponse.setResult(result);
	 
	 	return createVpcEndpointResponse;
	}
}