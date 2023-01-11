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

package com.aliyuncs.nlb.transform.v20220430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nlb.model.v20220430.ListServerGroupsResponse;
import com.aliyuncs.nlb.model.v20220430.ListServerGroupsResponse.ServerGroup;
import com.aliyuncs.nlb.model.v20220430.ListServerGroupsResponse.ServerGroup.HealthCheck;
import com.aliyuncs.nlb.model.v20220430.ListServerGroupsResponse.ServerGroup.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServerGroupsResponseUnmarshaller {

	public static ListServerGroupsResponse unmarshall(ListServerGroupsResponse listServerGroupsResponse, UnmarshallerContext _ctx) {
		
		listServerGroupsResponse.setRequestId(_ctx.stringValue("ListServerGroupsResponse.RequestId"));
		listServerGroupsResponse.setSuccess(_ctx.booleanValue("ListServerGroupsResponse.Success"));
		listServerGroupsResponse.setCode(_ctx.stringValue("ListServerGroupsResponse.Code"));
		listServerGroupsResponse.setMessage(_ctx.stringValue("ListServerGroupsResponse.Message"));
		listServerGroupsResponse.setHttpStatusCode(_ctx.integerValue("ListServerGroupsResponse.HttpStatusCode"));
		listServerGroupsResponse.setDynamicCode(_ctx.stringValue("ListServerGroupsResponse.DynamicCode"));
		listServerGroupsResponse.setDynamicMessage(_ctx.stringValue("ListServerGroupsResponse.DynamicMessage"));
		listServerGroupsResponse.setTotalCount(_ctx.integerValue("ListServerGroupsResponse.TotalCount"));
		listServerGroupsResponse.setNextToken(_ctx.stringValue("ListServerGroupsResponse.NextToken"));
		listServerGroupsResponse.setMaxResults(_ctx.integerValue("ListServerGroupsResponse.MaxResults"));

		List<ServerGroup> serverGroups = new ArrayList<ServerGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListServerGroupsResponse.ServerGroups.Length"); i++) {
			ServerGroup serverGroup = new ServerGroup();
			serverGroup.setRegionId(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].RegionId"));
			serverGroup.setServerGroupId(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].ServerGroupId"));
			serverGroup.setServerGroupName(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].ServerGroupName"));
			serverGroup.setServerGroupType(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].ServerGroupType"));
			serverGroup.setAddressIPVersion(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].AddressIPVersion"));
			serverGroup.setVpcId(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].VpcId"));
			serverGroup.setScheduler(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].Scheduler"));
			serverGroup.setBizProtocol(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].Protocol"));
			serverGroup.setPersistenceEnabled(_ctx.booleanValue("ListServerGroupsResponse.ServerGroups["+ i +"].PersistenceEnabled"));
			serverGroup.setPersistenceTimeout(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].PersistenceTimeout"));
			serverGroup.setConnectionDrainEnabled(_ctx.booleanValue("ListServerGroupsResponse.ServerGroups["+ i +"].ConnectionDrainEnabled"));
			serverGroup.setConnectionDrainTimeout(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].ConnectionDrainTimeout"));
			serverGroup.setPreserveClientIpEnabled(_ctx.booleanValue("ListServerGroupsResponse.ServerGroups["+ i +"].PreserveClientIpEnabled"));
			serverGroup.setAnyPortEnabled(_ctx.booleanValue("ListServerGroupsResponse.ServerGroups["+ i +"].AnyPortEnabled"));
			serverGroup.setResourceGroupId(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].ResourceGroupId"));
			serverGroup.setServerGroupStatus(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].ServerGroupStatus"));
			serverGroup.setAliUid(_ctx.longValue("ListServerGroupsResponse.ServerGroups["+ i +"].AliUid"));
			serverGroup.setServerCount(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].ServerCount"));

			List<String> relatedLoadBalancerIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListServerGroupsResponse.ServerGroups["+ i +"].RelatedLoadBalancerIds.Length"); j++) {
				relatedLoadBalancerIds.add(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].RelatedLoadBalancerIds["+ j +"]"));
			}
			serverGroup.setRelatedLoadBalancerIds(relatedLoadBalancerIds);

			HealthCheck healthCheck = new HealthCheck();
			healthCheck.setHealthCheckEnabled(_ctx.booleanValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheck.HealthCheckEnabled"));
			healthCheck.setHealthCheckType(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheck.HealthCheckType"));
			healthCheck.setHealthCheckConnectPort(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheck.HealthCheckConnectPort"));
			healthCheck.setHealthyThreshold(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheck.HealthyThreshold"));
			healthCheck.setUnhealthyThreshold(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheck.UnhealthyThreshold"));
			healthCheck.setHealthCheckConnectTimeout(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheck.HealthCheckConnectTimeout"));
			healthCheck.setHealthCheckInterval(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheck.HealthCheckInterval"));
			healthCheck.setHealthCheckDomain(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheck.HealthCheckDomain"));
			healthCheck.setHealthCheckUrl(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheck.HealthCheckUrl"));
			healthCheck.setHttpCheckMethod(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheck.HttpCheckMethod"));

			List<String> healthCheckHttpCode = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheck.HealthCheckHttpCode.Length"); j++) {
				healthCheckHttpCode.add(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheck.HealthCheckHttpCode["+ j +"]"));
			}
			healthCheck.setHealthCheckHttpCode(healthCheckHttpCode);
			serverGroup.setHealthCheck(healthCheck);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListServerGroupsResponse.ServerGroups["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			serverGroup.setTags(tags);

			serverGroups.add(serverGroup);
		}
		listServerGroupsResponse.setServerGroups(serverGroups);
	 
	 	return listServerGroupsResponse;
	}
}