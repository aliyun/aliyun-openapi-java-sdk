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

package com.aliyuncs.baas.transform.v20180731;

import com.aliyuncs.baas.model.v20180731.DescribeInviterResponse;
import com.aliyuncs.baas.model.v20180731.DescribeInviterResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInviterResponseUnmarshaller {

	public static DescribeInviterResponse unmarshall(DescribeInviterResponse describeInviterResponse, UnmarshallerContext context) {
		
		describeInviterResponse.setRequestId(context.stringValue("DescribeInviterResponse.RequestId"));
		describeInviterResponse.setSuccess(context.booleanValue("DescribeInviterResponse.Success"));
		describeInviterResponse.setErrorCode(context.integerValue("DescribeInviterResponse.ErrorCode"));

		Result result = new Result();
		result.setConsortiumId(context.stringValue("DescribeInviterResponse.Result.ConsortiumId"));
		result.setConsortiumName(context.stringValue("DescribeInviterResponse.Result.ConsortiumName"));
		result.setInviterName(context.stringValue("DescribeInviterResponse.Result.InviterName"));
		result.setInviterId(context.longValue("DescribeInviterResponse.Result.InviterId"));
		result.setExpireTime(context.stringValue("DescribeInviterResponse.Result.ExpireTime"));
		describeInviterResponse.setResult(result);
	 
	 	return describeInviterResponse;
	}
}