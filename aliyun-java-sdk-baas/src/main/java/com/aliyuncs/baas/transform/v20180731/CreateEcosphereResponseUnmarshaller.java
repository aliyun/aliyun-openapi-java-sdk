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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.CreateEcosphereResponse;
import com.aliyuncs.baas.model.v20180731.CreateEcosphereResponse.Result;
import com.aliyuncs.baas.model.v20180731.CreateEcosphereResponse.Result.Organization;
import com.aliyuncs.baas.model.v20180731.CreateEcosphereResponse.Result.Specification;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEcosphereResponseUnmarshaller {

	public static CreateEcosphereResponse unmarshall(CreateEcosphereResponse createEcosphereResponse, UnmarshallerContext context) {
		
		createEcosphereResponse.setRequestId(context.stringValue("CreateEcosphereResponse.RequestId"));
		createEcosphereResponse.setSuccess(context.booleanValue("CreateEcosphereResponse.Success"));
		createEcosphereResponse.setErrorCode(context.integerValue("CreateEcosphereResponse.ErrorCode"));
		createEcosphereResponse.setErrorMessage(context.stringValue("CreateEcosphereResponse.ErrorMessage"));

		Result result = new Result();
		result.setConsortiumId(context.stringValue("CreateEcosphereResponse.Result.ConsortiumId"));
		result.setName(context.stringValue("CreateEcosphereResponse.Result.Name"));
		result.setRegionId(context.stringValue("CreateEcosphereResponse.Result.RegionId"));
		result.setZoneId(context.stringValue("CreateEcosphereResponse.Result.ZoneId"));
		result.setCode(context.stringValue("CreateEcosphereResponse.Result.Code"));
		result.setDomain(context.stringValue("CreateEcosphereResponse.Result.Domain"));
		result.setDescription(context.stringValue("CreateEcosphereResponse.Result.Description"));
		result.setOwnerBid(context.stringValue("CreateEcosphereResponse.Result.OwnerBid"));
		result.setOwnerUid(context.longValue("CreateEcosphereResponse.Result.OwnerUid"));
		result.setOrdererType(context.stringValue("CreateEcosphereResponse.Result.OrdererType"));
		result.setChannelPolicy(context.stringValue("CreateEcosphereResponse.Result.ChannelPolicy"));
		result.setOrdererCount(context.integerValue("CreateEcosphereResponse.Result.OrdererCount"));
		result.setMemberCount(context.integerValue("CreateEcosphereResponse.Result.MemberCount"));
		result.setChannelCount(context.integerValue("CreateEcosphereResponse.Result.ChannelCount"));
		result.setSpecName(context.stringValue("CreateEcosphereResponse.Result.SpecName"));
		result.setClusterState(context.stringValue("CreateEcosphereResponse.Result.ClusterState"));
		result.setServiceState(context.stringValue("CreateEcosphereResponse.Result.ServiceState"));
		result.setCreateTime(context.stringValue("CreateEcosphereResponse.Result.CreateTime"));

		Specification specification = new Specification();
		specification.setName(context.stringValue("CreateEcosphereResponse.Result.Specification.Name"));
		specification.setTitle(context.stringValue("CreateEcosphereResponse.Result.Specification.Title"));
		specification.setNumOfNodes(context.integerValue("CreateEcosphereResponse.Result.Specification.NumOfNodes"));
		result.setSpecification(specification);

		List<Organization> organizations = new ArrayList<Organization>();
		for (int i = 0; i < context.lengthValue("CreateEcosphereResponse.Result.Organizations.Length"); i++) {
			Organization organization = new Organization();
			organization.setName(context.stringValue("CreateEcosphereResponse.Result.Organizations["+ i +"].Name"));
			organization.setCode(context.stringValue("CreateEcosphereResponse.Result.Organizations["+ i +"].Code"));
			organization.setDomain(context.stringValue("CreateEcosphereResponse.Result.Organizations["+ i +"].Domain"));
			organization.setDescription(context.stringValue("CreateEcosphereResponse.Result.Organizations["+ i +"].Description"));
			organization.setClusterState(context.stringValue("CreateEcosphereResponse.Result.Organizations["+ i +"].ClusterState"));
			organization.setServiceState(context.stringValue("CreateEcosphereResponse.Result.Organizations["+ i +"].ServiceState"));
			organization.setCreateTime(context.stringValue("CreateEcosphereResponse.Result.Organizations["+ i +"].CreateTime"));

			organizations.add(organization);
		}
		result.setOrganizations(organizations);
		createEcosphereResponse.setResult(result);
	 
	 	return createEcosphereResponse;
	}
}