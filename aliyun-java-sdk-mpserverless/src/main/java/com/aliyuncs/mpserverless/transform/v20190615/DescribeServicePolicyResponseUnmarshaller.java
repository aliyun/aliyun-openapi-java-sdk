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

import com.aliyuncs.mpserverless.model.v20190615.DescribeServicePolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServicePolicyResponseUnmarshaller {

	public static DescribeServicePolicyResponse unmarshall(DescribeServicePolicyResponse describeServicePolicyResponse, UnmarshallerContext _ctx) {
		
		describeServicePolicyResponse.setRequestId(_ctx.stringValue("DescribeServicePolicyResponse.RequestId"));
		describeServicePolicyResponse.setHttpStatusCode(_ctx.stringValue("DescribeServicePolicyResponse.HttpStatusCode"));
		describeServicePolicyResponse.setSuccess(_ctx.booleanValue("DescribeServicePolicyResponse.Success"));
		describeServicePolicyResponse.setCode(_ctx.stringValue("DescribeServicePolicyResponse.Code"));
		describeServicePolicyResponse.setMessage(_ctx.stringValue("DescribeServicePolicyResponse.Message"));
		describeServicePolicyResponse.setId(_ctx.stringValue("DescribeServicePolicyResponse.Id"));
		describeServicePolicyResponse.setPolicy(_ctx.stringValue("DescribeServicePolicyResponse.Policy"));
		describeServicePolicyResponse.setSpaceId(_ctx.stringValue("DescribeServicePolicyResponse.SpaceId"));
		describeServicePolicyResponse.setServiceName(_ctx.stringValue("DescribeServicePolicyResponse.ServiceName"));
	 
	 	return describeServicePolicyResponse;
	}
}