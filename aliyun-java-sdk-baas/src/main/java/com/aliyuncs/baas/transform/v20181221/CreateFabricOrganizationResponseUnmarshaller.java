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

import com.aliyuncs.baas.model.v20181221.CreateFabricOrganizationResponse;
import com.aliyuncs.baas.model.v20181221.CreateFabricOrganizationResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFabricOrganizationResponseUnmarshaller {

	public static CreateFabricOrganizationResponse unmarshall(CreateFabricOrganizationResponse createFabricOrganizationResponse, UnmarshallerContext _ctx) {
		
		createFabricOrganizationResponse.setRequestId(_ctx.stringValue("CreateFabricOrganizationResponse.RequestId"));
		createFabricOrganizationResponse.setSuccess(_ctx.booleanValue("CreateFabricOrganizationResponse.Success"));
		createFabricOrganizationResponse.setErrorCode(_ctx.integerValue("CreateFabricOrganizationResponse.ErrorCode"));

		Result result = new Result();
		result.setOrganizationId(_ctx.stringValue("CreateFabricOrganizationResponse.Result.OrganizationId"));
		result.setOrganizationName(_ctx.stringValue("CreateFabricOrganizationResponse.Result.OrganizationName"));
		result.setRegionId(_ctx.stringValue("CreateFabricOrganizationResponse.Result.RegionId"));
		result.setZoneId(_ctx.stringValue("CreateFabricOrganizationResponse.Result.ZoneId"));
		result.setCodeName(_ctx.stringValue("CreateFabricOrganizationResponse.Result.CodeName"));
		result.setDomain(_ctx.stringValue("CreateFabricOrganizationResponse.Result.Domain"));
		result.setOrganizationDescription(_ctx.stringValue("CreateFabricOrganizationResponse.Result.OrganizationDescription"));
		result.setOwnerBid(_ctx.stringValue("CreateFabricOrganizationResponse.Result.OwnerBid"));
		result.setOwnerUid(_ctx.longValue("CreateFabricOrganizationResponse.Result.OwnerUid"));
		result.setOwnerName(_ctx.stringValue("CreateFabricOrganizationResponse.Result.OwnerName"));
		result.setPeerCount(_ctx.integerValue("CreateFabricOrganizationResponse.Result.PeerCount"));
		result.setUserCount(_ctx.integerValue("CreateFabricOrganizationResponse.Result.UserCount"));
		result.setConsortiumCount(_ctx.integerValue("CreateFabricOrganizationResponse.Result.ConsortiumCount"));
		result.setSpecName(_ctx.stringValue("CreateFabricOrganizationResponse.Result.SpecName"));
		result.setRequestId(_ctx.stringValue("CreateFabricOrganizationResponse.Result.RequestId"));
		result.setCreateTime(_ctx.stringValue("CreateFabricOrganizationResponse.Result.CreateTime"));
		result.setClusterState(_ctx.stringValue("CreateFabricOrganizationResponse.Result.ClusterState"));
		result.setServiceState(_ctx.stringValue("CreateFabricOrganizationResponse.Result.ServiceState"));
		createFabricOrganizationResponse.setResult(result);
	 
	 	return createFabricOrganizationResponse;
	}
}