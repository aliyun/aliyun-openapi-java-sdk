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

import com.aliyuncs.baas.model.v20180731.CreateConsortiumResponse;
import com.aliyuncs.baas.model.v20180731.CreateConsortiumResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateConsortiumResponseUnmarshaller {

	public static CreateConsortiumResponse unmarshall(CreateConsortiumResponse createConsortiumResponse, UnmarshallerContext context) {
		
		createConsortiumResponse.setRequestId(context.stringValue("CreateConsortiumResponse.RequestId"));
		createConsortiumResponse.setSuccess(context.booleanValue("CreateConsortiumResponse.Success"));
		createConsortiumResponse.setErrorCode(context.integerValue("CreateConsortiumResponse.ErrorCode"));

		Result result = new Result();
		result.setConsortiumId(context.stringValue("CreateConsortiumResponse.Result.ConsortiumId"));
		result.setName(context.stringValue("CreateConsortiumResponse.Result.Name"));
		result.setRegionId(context.stringValue("CreateConsortiumResponse.Result.RegionId"));
		result.setZoneId(context.stringValue("CreateConsortiumResponse.Result.ZoneId"));
		result.setCodeName(context.stringValue("CreateConsortiumResponse.Result.CodeName"));
		result.setDomain(context.stringValue("CreateConsortiumResponse.Result.Domain"));
		result.setDescription(context.stringValue("CreateConsortiumResponse.Result.Description"));
		result.setOwnerBid(context.stringValue("CreateConsortiumResponse.Result.OwnerBid"));
		result.setOwnerUid(context.longValue("CreateConsortiumResponse.Result.OwnerUid"));
		result.setOrdererType(context.stringValue("CreateConsortiumResponse.Result.OrdererType"));
		result.setChannelPolicy(context.stringValue("CreateConsortiumResponse.Result.ChannelPolicy"));
		result.setOrdererCount(context.integerValue("CreateConsortiumResponse.Result.OrdererCount"));
		result.setMemberCount(context.integerValue("CreateConsortiumResponse.Result.MemberCount"));
		result.setChannelCount(context.integerValue("CreateConsortiumResponse.Result.ChannelCount"));
		result.setSpecName(context.stringValue("CreateConsortiumResponse.Result.SpecName"));
		result.setClusterState(context.stringValue("CreateConsortiumResponse.Result.ClusterState"));
		result.setServiceState(context.stringValue("CreateConsortiumResponse.Result.ServiceState"));
		result.setCreateTime(context.stringValue("CreateConsortiumResponse.Result.CreateTime"));
		createConsortiumResponse.setResult(result);
	 
	 	return createConsortiumResponse;
	}
}