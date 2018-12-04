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

import com.aliyuncs.baas.model.v20180731.CreateChannelResponse;
import com.aliyuncs.baas.model.v20180731.CreateChannelResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateChannelResponseUnmarshaller {

	public static CreateChannelResponse unmarshall(CreateChannelResponse createChannelResponse, UnmarshallerContext context) {
		
		createChannelResponse.setRequestId(context.stringValue("CreateChannelResponse.RequestId"));
		createChannelResponse.setSuccess(context.booleanValue("CreateChannelResponse.Success"));
		createChannelResponse.setErrorCode(context.integerValue("CreateChannelResponse.ErrorCode"));

		Result result = new Result();
		result.setChannelId(context.stringValue("CreateChannelResponse.Result.ChannelId"));
		result.setName(context.stringValue("CreateChannelResponse.Result.Name"));
		result.setConsortiumId(context.stringValue("CreateChannelResponse.Result.ConsortiumId"));
		result.setState(context.stringValue("CreateChannelResponse.Result.State"));
		result.setOwnerBid(context.stringValue("CreateChannelResponse.Result.OwnerBid"));
		result.setOwnerUid(context.integerValue("CreateChannelResponse.Result.OwnerUid"));
		result.setOwnerName(context.stringValue("CreateChannelResponse.Result.OwnerName"));
		result.setMemberCount(context.integerValue("CreateChannelResponse.Result.MemberCount"));
		result.setChaincodeCount(context.integerValue("CreateChannelResponse.Result.ChaincodeCount"));
		result.setBlockCount(context.integerValue("CreateChannelResponse.Result.BlockCount"));
		result.setRequestId(context.stringValue("CreateChannelResponse.Result.RequestId"));
		result.setCreateTime(context.stringValue("CreateChannelResponse.Result.CreateTime"));
		result.setUpdateTime(context.stringValue("CreateChannelResponse.Result.UpdateTime"));
		result.setConsortiumName(context.stringValue("CreateChannelResponse.Result.ConsortiumName"));
		createChannelResponse.setResult(result);
	 
	 	return createChannelResponse;
	}
}