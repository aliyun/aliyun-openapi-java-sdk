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

import com.aliyuncs.baas.model.v20180731.DescribeInvitationCodeResponse;
import com.aliyuncs.baas.model.v20180731.DescribeInvitationCodeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInvitationCodeResponseUnmarshaller {

	public static DescribeInvitationCodeResponse unmarshall(DescribeInvitationCodeResponse describeInvitationCodeResponse, UnmarshallerContext context) {
		
		describeInvitationCodeResponse.setRequestId(context.stringValue("DescribeInvitationCodeResponse.RequestId"));
		describeInvitationCodeResponse.setSuccess(context.booleanValue("DescribeInvitationCodeResponse.Success"));
		describeInvitationCodeResponse.setErrorCode(context.integerValue("DescribeInvitationCodeResponse.ErrorCode"));
		describeInvitationCodeResponse.setDynamicCode(context.stringValue("DescribeInvitationCodeResponse.DynamicCode"));
		describeInvitationCodeResponse.setDynamicMessage(context.stringValue("DescribeInvitationCodeResponse.DynamicMessage"));

		Result result = new Result();
		result.setId(context.integerValue("DescribeInvitationCodeResponse.Result.Id"));
		result.setCode(context.stringValue("DescribeInvitationCodeResponse.Result.Code"));
		result.setSendTime(context.stringValue("DescribeInvitationCodeResponse.Result.SendTime"));
		result.setSenderId(context.longValue("DescribeInvitationCodeResponse.Result.SenderId"));
		result.setSenderBid(context.stringValue("DescribeInvitationCodeResponse.Result.SenderBid"));
		result.setConsortiumId(context.stringValue("DescribeInvitationCodeResponse.Result.ConsortiumId"));
		result.setSenderName(context.stringValue("DescribeInvitationCodeResponse.Result.SenderName"));
		result.setAccepted(context.booleanValue("DescribeInvitationCodeResponse.Result.Accepted"));
		result.setExpireTime(context.stringValue("DescribeInvitationCodeResponse.Result.ExpireTime"));
		result.setEmail(context.stringValue("DescribeInvitationCodeResponse.Result.Email"));
		result.setUrl(context.stringValue("DescribeInvitationCodeResponse.Result.Url"));
		describeInvitationCodeResponse.setResult(result);
	 
	 	return describeInvitationCodeResponse;
	}
}