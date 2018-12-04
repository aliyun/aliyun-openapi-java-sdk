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

import com.aliyuncs.baas.model.v20180731.CreateOrganizationResponse;
import com.aliyuncs.baas.model.v20180731.CreateOrganizationResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrganizationResponseUnmarshaller {

	public static CreateOrganizationResponse unmarshall(CreateOrganizationResponse createOrganizationResponse, UnmarshallerContext context) {
		
		createOrganizationResponse.setRequestId(context.stringValue("CreateOrganizationResponse.RequestId"));
		createOrganizationResponse.setSuccess(context.booleanValue("CreateOrganizationResponse.Success"));
		createOrganizationResponse.setErrorCode(context.integerValue("CreateOrganizationResponse.ErrorCode"));

		Result result = new Result();
		result.setOrganizationId(context.stringValue("CreateOrganizationResponse.Result.OrganizationId"));
		result.setName(context.stringValue("CreateOrganizationResponse.Result.Name"));
		result.setRegionId(context.stringValue("CreateOrganizationResponse.Result.RegionId"));
		result.setZoneId(context.stringValue("CreateOrganizationResponse.Result.ZoneId"));
		result.setCodeName(context.stringValue("CreateOrganizationResponse.Result.CodeName"));
		result.setDomain(context.stringValue("CreateOrganizationResponse.Result.Domain"));
		result.setDescription(context.stringValue("CreateOrganizationResponse.Result.Description"));
		result.setOwnerBid(context.stringValue("CreateOrganizationResponse.Result.OwnerBid"));
		result.setOwnerUid(context.integerValue("CreateOrganizationResponse.Result.OwnerUid"));
		result.setOwnerName(context.stringValue("CreateOrganizationResponse.Result.OwnerName"));
		result.setPeerCount(context.integerValue("CreateOrganizationResponse.Result.PeerCount"));
		result.setUserCount(context.integerValue("CreateOrganizationResponse.Result.UserCount"));
		result.setConsortiumCount(context.integerValue("CreateOrganizationResponse.Result.ConsortiumCount"));
		result.setSpecName(context.stringValue("CreateOrganizationResponse.Result.SpecName"));
		result.setRequestId(context.stringValue("CreateOrganizationResponse.Result.RequestId"));
		result.setCreateTime(context.stringValue("CreateOrganizationResponse.Result.CreateTime"));
		result.setClusterState(context.stringValue("CreateOrganizationResponse.Result.ClusterState"));
		result.setServiceState(context.stringValue("CreateOrganizationResponse.Result.ServiceState"));
		createOrganizationResponse.setResult(result);
	 
	 	return createOrganizationResponse;
	}
}