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

package com.aliyuncs.kms.transform.v20160120;

import com.aliyuncs.kms.model.v20160120.DescribeApplicationAccessPointResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationAccessPointResponseUnmarshaller {

	public static DescribeApplicationAccessPointResponse unmarshall(DescribeApplicationAccessPointResponse describeApplicationAccessPointResponse, UnmarshallerContext _ctx) {
		
		describeApplicationAccessPointResponse.setRequestId(_ctx.stringValue("DescribeApplicationAccessPointResponse.RequestId"));
		describeApplicationAccessPointResponse.setArn(_ctx.stringValue("DescribeApplicationAccessPointResponse.Arn"));
		describeApplicationAccessPointResponse.setName(_ctx.stringValue("DescribeApplicationAccessPointResponse.Name"));
		describeApplicationAccessPointResponse.setDescription(_ctx.stringValue("DescribeApplicationAccessPointResponse.Description"));
		describeApplicationAccessPointResponse.setAuthenticationMethod(_ctx.stringValue("DescribeApplicationAccessPointResponse.AuthenticationMethod"));
		describeApplicationAccessPointResponse.setPolicies(_ctx.stringValue("DescribeApplicationAccessPointResponse.Policies"));
	 
	 	return describeApplicationAccessPointResponse;
	}
}