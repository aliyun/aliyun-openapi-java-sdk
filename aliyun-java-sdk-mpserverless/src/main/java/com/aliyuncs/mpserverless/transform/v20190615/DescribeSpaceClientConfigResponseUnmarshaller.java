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

import com.aliyuncs.mpserverless.model.v20190615.DescribeSpaceClientConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSpaceClientConfigResponseUnmarshaller {

	public static DescribeSpaceClientConfigResponse unmarshall(DescribeSpaceClientConfigResponse describeSpaceClientConfigResponse, UnmarshallerContext _ctx) {
		
		describeSpaceClientConfigResponse.setRequestId(_ctx.stringValue("DescribeSpaceClientConfigResponse.RequestId"));
		describeSpaceClientConfigResponse.setHttpStatusCode(_ctx.stringValue("DescribeSpaceClientConfigResponse.HttpStatusCode"));
		describeSpaceClientConfigResponse.setSuccess(_ctx.booleanValue("DescribeSpaceClientConfigResponse.Success"));
		describeSpaceClientConfigResponse.setCode(_ctx.stringValue("DescribeSpaceClientConfigResponse.Code"));
		describeSpaceClientConfigResponse.setMessage(_ctx.stringValue("DescribeSpaceClientConfigResponse.Message"));
		describeSpaceClientConfigResponse.setSpaceId(_ctx.stringValue("DescribeSpaceClientConfigResponse.SpaceId"));
		describeSpaceClientConfigResponse.setName(_ctx.stringValue("DescribeSpaceClientConfigResponse.Name"));
		describeSpaceClientConfigResponse.setClientSecret(_ctx.stringValue("DescribeSpaceClientConfigResponse.ClientSecret"));
		describeSpaceClientConfigResponse.setEndpoint(_ctx.stringValue("DescribeSpaceClientConfigResponse.Endpoint"));
		describeSpaceClientConfigResponse.setVersion(_ctx.stringValue("DescribeSpaceClientConfigResponse.Version"));
		describeSpaceClientConfigResponse.setApiKey(_ctx.stringValue("DescribeSpaceClientConfigResponse.ApiKey"));
	 
	 	return describeSpaceClientConfigResponse;
	}
}