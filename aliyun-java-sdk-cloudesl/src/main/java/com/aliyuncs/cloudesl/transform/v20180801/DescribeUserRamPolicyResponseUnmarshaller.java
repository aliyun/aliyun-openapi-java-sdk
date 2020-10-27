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

package com.aliyuncs.cloudesl.transform.v20180801;

import com.aliyuncs.cloudesl.model.v20180801.DescribeUserRamPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserRamPolicyResponseUnmarshaller {

	public static DescribeUserRamPolicyResponse unmarshall(DescribeUserRamPolicyResponse describeUserRamPolicyResponse, UnmarshallerContext _ctx) {
		
		describeUserRamPolicyResponse.setRequestId(_ctx.stringValue("DescribeUserRamPolicyResponse.RequestId"));
		describeUserRamPolicyResponse.setSuccess(_ctx.booleanValue("DescribeUserRamPolicyResponse.Success"));
		describeUserRamPolicyResponse.setMessage(_ctx.stringValue("DescribeUserRamPolicyResponse.Message"));
		describeUserRamPolicyResponse.setErrorCode(_ctx.stringValue("DescribeUserRamPolicyResponse.ErrorCode"));
		describeUserRamPolicyResponse.setPolicy(_ctx.stringValue("DescribeUserRamPolicyResponse.Policy"));
	 
	 	return describeUserRamPolicyResponse;
	}
}