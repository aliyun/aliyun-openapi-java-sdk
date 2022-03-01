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
		result.setChannelCount(_ctx.integerValue("CreateFabricConsortiumResponse.Result.ChannelCount"));
		result.setDomain(_ctx.stringValue("CreateFabricConsortiumResponse.Result.Domain"));
		result.setCreateTime(_ctx.stringValue("CreateFabricConsortiumResponse.Result.CreateTime"));
		result.setSpecName(_ctx.stringValue("CreateFabricConsortiumResponse.Result.SpecName"));
		result.setOrdererCount(_ctx.integerValue("CreateFabricConsortiumResponse.Result.OrdererCount"));
		result.setServiceState(_ctx.stringValue("CreateFabricConsortiumResponse.Result.ServiceState"));
		result.setClusterState(_ctx.stringValue("CreateFabricConsortiumResponse.Result.ClusterState"));
		result.setOwnerUid(_ctx.longValue("CreateFabricConsortiumResponse.Result.OwnerUid"));
		result.setOwnerBid(_ctx.stringValue("CreateFabricConsortiumResponse.Result.OwnerBid"));
		result.setCodeName(_ctx.stringValue("CreateFabricConsortiumResponse.Result.CodeName"));
		result.setRegionId(_ctx.stringValue("CreateFabricConsortiumResponse.Result.RegionId"));
		result.setMemberCount(_ctx.integerValue("CreateFabricConsortiumResponse.Result.MemberCount"));
		result.setChannelPolicy(_ctx.stringValue("CreateFabricConsortiumResponse.Result.ChannelPolicy"));
		result.setOrdererType(_ctx.stringValue("CreateFabricConsortiumResponse.Result.OrdererType"));
		result.setDescription(_ctx.stringValue("CreateFabricConsortiumResponse.Result.Description"));
		result.setConsortiumId(_ctx.stringValue("CreateFabricConsortiumResponse.Result.ConsortiumId"));
		result.setZoneId(_ctx.stringValue("CreateFabricConsortiumResponse.Result.ZoneId"));
		result.setConsortiumName(_ctx.stringValue("CreateFabricConsortiumResponse.Result.ConsortiumName"));
		createFabricConsortiumResponse.setResult(result);
	 
	 	return createFabricConsortiumResponse;
	}
}