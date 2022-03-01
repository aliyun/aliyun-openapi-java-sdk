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

package com.aliyuncs.baas.transform.v20181221;

import com.aliyuncs.baas.model.v20181221.DescribeFabricInvitationCodeResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricInvitationCodeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricInvitationCodeResponseUnmarshaller {

	public static DescribeFabricInvitationCodeResponse unmarshall(DescribeFabricInvitationCodeResponse describeFabricInvitationCodeResponse, UnmarshallerContext _ctx) {
		
		describeFabricInvitationCodeResponse.setRequestId(_ctx.stringValue("DescribeFabricInvitationCodeResponse.RequestId"));
		describeFabricInvitationCodeResponse.setDynamicMessage(_ctx.stringValue("DescribeFabricInvitationCodeResponse.DynamicMessage"));
		describeFabricInvitationCodeResponse.setErrorCode(_ctx.integerValue("DescribeFabricInvitationCodeResponse.ErrorCode"));
		describeFabricInvitationCodeResponse.setSuccess(_ctx.booleanValue("DescribeFabricInvitationCodeResponse.Success"));
		describeFabricInvitationCodeResponse.setDynamicCode(_ctx.stringValue("DescribeFabricInvitationCodeResponse.DynamicCode"));

		Result result = new Result();
		result.setSenderId(_ctx.longValue("DescribeFabricInvitationCodeResponse.Result.SenderId"));
		result.setEmail(_ctx.stringValue("DescribeFabricInvitationCodeResponse.Result.Email"));
		result.setSenderBid(_ctx.stringValue("DescribeFabricInvitationCodeResponse.Result.SenderBid"));
		result.setExpireTime(_ctx.stringValue("DescribeFabricInvitationCodeResponse.Result.ExpireTime"));
		result.setConsortiumId(_ctx.stringValue("DescribeFabricInvitationCodeResponse.Result.ConsortiumId"));
		result.setInvitationId(_ctx.integerValue("DescribeFabricInvitationCodeResponse.Result.InvitationId"));
		result.setSenderName(_ctx.stringValue("DescribeFabricInvitationCodeResponse.Result.SenderName"));
		result.setCode(_ctx.stringValue("DescribeFabricInvitationCodeResponse.Result.Code"));
		result.setUrl(_ctx.stringValue("DescribeFabricInvitationCodeResponse.Result.Url"));
		result.setAccepted(_ctx.booleanValue("DescribeFabricInvitationCodeResponse.Result.Accepted"));
		result.setSendTime(_ctx.stringValue("DescribeFabricInvitationCodeResponse.Result.SendTime"));
		describeFabricInvitationCodeResponse.setResult(result);
	 
	 	return describeFabricInvitationCodeResponse;
	}
}