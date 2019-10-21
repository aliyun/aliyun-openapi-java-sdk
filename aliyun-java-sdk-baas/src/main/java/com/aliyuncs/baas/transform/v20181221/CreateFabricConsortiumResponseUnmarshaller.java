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

import com.aliyuncs.baas.model.v20181221.CreateFabricConsortiumResponse;
import com.aliyuncs.baas.model.v20181221.CreateFabricConsortiumResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFabricConsortiumResponseUnmarshaller {

	public static CreateFabricConsortiumResponse unmarshall(CreateFabricConsortiumResponse createFabricConsortiumResponse, UnmarshallerContext _ctx) {
		
		createFabricConsortiumResponse.setRequestId(_ctx.stringValue("CreateFabricConsortiumResponse.RequestId"));
		createFabricConsortiumResponse.setSuccess(_ctx.booleanValue("CreateFabricConsortiumResponse.Success"));
		createFabricConsortiumResponse.setErrorCode(_ctx.integerValue("CreateFabricConsortiumResponse.ErrorCode"));

		Result result = new Result();
		result.setConsortiumId(_ctx.stringValue("CreateFabricConsortiumResponse.Result.ConsortiumId"));
		result.setConsortiumName(_ctx.stringValue("CreateFabricConsortiumResponse.Result.ConsortiumName"));
		result.setRegionId(_ctx.stringValue("CreateFabricConsortiumResponse.Result.RegionId"));
		result.setZoneId(_ctx.stringValue("CreateFabricConsortiumResponse.Result.ZoneId"));
		result.setCodeName(_ctx.stringValue("CreateFabricConsortiumResponse.Result.CodeName"));
		result.setDomain(_ctx.stringValue("CreateFabricConsortiumResponse.Result.Domain"));
		result.setDescription(_ctx.stringValue("CreateFabricConsortiumResponse.Result.Description"));
		result.setOwnerBid(_ctx.stringValue("CreateFabricConsortiumResponse.Result.OwnerBid"));
		result.setOwnerUid(_ctx.longValue("CreateFabricConsortiumResponse.Result.OwnerUid"));
		result.setOrdererType(_ctx.stringValue("CreateFabricConsortiumResponse.Result.OrdererType"));
		result.setChannelPolicy(_ctx.stringValue("CreateFabricConsortiumResponse.Result.ChannelPolicy"));
		result.setOrdererCount(_ctx.integerValue("CreateFabricConsortiumResponse.Result.OrdererCount"));
		result.setMemberCount(_ctx.integerValue("CreateFabricConsortiumResponse.Result.MemberCount"));
		result.setChannelCount(_ctx.integerValue("CreateFabricConsortiumResponse.Result.ChannelCount"));
		result.setSpecName(_ctx.stringValue("CreateFabricConsortiumResponse.Result.SpecName"));
		result.setClusterState(_ctx.stringValue("CreateFabricConsortiumResponse.Result.ClusterState"));
		result.setServiceState(_ctx.stringValue("CreateFabricConsortiumResponse.Result.ServiceState"));
		result.setCreateTime(_ctx.stringValue("CreateFabricConsortiumResponse.Result.CreateTime"));
		createFabricConsortiumResponse.setResult(result);
	 
	 	return createFabricConsortiumResponse;
	}
}