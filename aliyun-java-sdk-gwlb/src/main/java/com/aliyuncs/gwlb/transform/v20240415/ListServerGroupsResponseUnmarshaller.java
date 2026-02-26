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

package com.aliyuncs.gwlb.transform.v20240415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gwlb.model.v20240415.ListServerGroupsResponse;
import com.aliyuncs.gwlb.model.v20240415.ListServerGroupsResponse.ServerGroup;
import com.aliyuncs.gwlb.model.v20240415.ListServerGroupsResponse.ServerGroup.ConnectionDrainConfig;
import com.aliyuncs.gwlb.model.v20240415.ListServerGroupsResponse.ServerGroup.HealthCheckConfig;
import com.aliyuncs.gwlb.model.v20240415.ListServerGroupsResponse.ServerGroup.TagModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServerGroupsResponseUnmarshaller {

	public static ListServerGroupsResponse unmarshall(ListServerGroupsResponse listServerGroupsResponse, UnmarshallerContext _ctx) {
		
		listServerGroupsResponse.setRequestId(_ctx.stringValue("ListServerGroupsResponse.RequestId"));
		listServerGroupsResponse.setMaxResults(_ctx.integerValue("ListServerGroupsResponse.MaxResults"));
		listServerGroupsResponse.setNextToken(_ctx.stringValue("ListServerGroupsResponse.NextToken"));
		listServerGroupsResponse.setTotalCount(_ctx.integerValue("ListServerGroupsResponse.TotalCount"));

		List<ServerGroup> serverGroups = new ArrayList<ServerGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListServerGroupsResponse.ServerGroups.Length"); i++) {
			ServerGroup serverGroup = new ServerGroup();
			serverGroup.setCreateTime(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].CreateTime"));
			serverGroup.setBizProtocol(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].Protocol"));
			serverGroup.setResourceGroupId(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].ResourceGroupId"));
			serverGroup.setScheduler(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].Scheduler"));
			serverGroup.setServerCount(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].ServerCount"));
			serverGroup.setServerGroupId(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].ServerGroupId"));
			serverGroup.setServerGroupName(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].ServerGroupName"));
			serverGroup.setServerGroupStatus(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].ServerGroupStatus"));
			serverGroup.setServerGroupType(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].ServerGroupType"));
			serverGroup.setVpcId(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].VpcId"));

			List<String> relatedLoadBalancerIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListServerGroupsResponse.ServerGroups["+ i +"].RelatedLoadBalancerIds.Length"); j++) {
				relatedLoadBalancerIds.add(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].RelatedLoadBalancerIds["+ j +"]"));
			}
			serverGroup.setRelatedLoadBalancerIds(relatedLoadBalancerIds);

			ConnectionDrainConfig connectionDrainConfig = new ConnectionDrainConfig();
			connectionDrainConfig.setConnectionDrainEnabled(_ctx.booleanValue("ListServerGroupsResponse.ServerGroups["+ i +"].ConnectionDrainConfig.ConnectionDrainEnabled"));
			connectionDrainConfig.setConnectionDrainTimeout(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].ConnectionDrainConfig.ConnectionDrainTimeout"));
			serverGroup.setConnectionDrainConfig(connectionDrainConfig);

			HealthCheckConfig healthCheckConfig = new HealthCheckConfig();
			healthCheckConfig.setHealthCheckConnectPort(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckConnectPort"));
			healthCheckConfig.setHealthCheckConnectTimeout(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckConnectTimeout"));
			healthCheckConfig.setHealthCheckDomain(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckDomain"));
			healthCheckConfig.setHealthCheckEnabled(_ctx.booleanValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckEnabled"));
			healthCheckConfig.setHealthCheckInterval(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckInterval"));
			healthCheckConfig.setHealthCheckPath(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckPath"));
			healthCheckConfig.setHealthCheckProtocol(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckProtocol"));
			healthCheckConfig.setHealthyThreshold(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthyThreshold"));
			healthCheckConfig.setUnhealthyThreshold(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.UnhealthyThreshold"));

			List<String> healthCheckHttpCode = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckHttpCode.Length"); j++) {
				healthCheckHttpCode.add(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckHttpCode["+ j +"]"));
			}
			healthCheckConfig.setHealthCheckHttpCode(healthCheckHttpCode);
			serverGroup.setHealthCheckConfig(healthCheckConfig);

			List<TagModel> tags = new ArrayList<TagModel>();
			for (int j = 0; j < _ctx.lengthValue("ListServerGroupsResponse.ServerGroups["+ i +"].Tags.Length"); j++) {
				TagModel tagModel = new TagModel();
				tagModel.setKey(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].Tags["+ j +"].Key"));
				tagModel.setValue(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagModel);
			}
			serverGroup.setTags(tags);

			serverGroups.add(serverGroup);
		}
		listServerGroupsResponse.setServerGroups(serverGroups);
	 
	 	return listServerGroupsResponse;
	}
}