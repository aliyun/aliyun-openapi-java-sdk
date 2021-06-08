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

package com.aliyuncs.alb.transform.v20200616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alb.model.v20200616.ListServerGroupsResponse;
import com.aliyuncs.alb.model.v20200616.ListServerGroupsResponse.ServerGroup;
import com.aliyuncs.alb.model.v20200616.ListServerGroupsResponse.ServerGroup.HealthCheckConfig;
import com.aliyuncs.alb.model.v20200616.ListServerGroupsResponse.ServerGroup.StickySessionConfig;
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
			serverGroup.setBizProtocol(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].Protocol"));
			serverGroup.setResourceGroupId(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].ResourceGroupId"));
			serverGroup.setScheduler(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].Scheduler"));
			serverGroup.setServerGroupId(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].ServerGroupId"));
			serverGroup.setServerGroupName(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].ServerGroupName"));
			serverGroup.setServerGroupStatus(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].ServerGroupStatus"));
			serverGroup.setVpcId(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].VpcId"));

			HealthCheckConfig healthCheckConfig = new HealthCheckConfig();
			healthCheckConfig.setHealthCheckConnectPort(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckConnectPort"));
			healthCheckConfig.setHealthCheckEnabled(_ctx.booleanValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckEnabled"));
			healthCheckConfig.setHealthCheckHost(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckHost"));
			healthCheckConfig.setHealthCheckHttpVersion(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckHttpVersion"));
			healthCheckConfig.setHealthCheckInterval(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckInterval"));
			healthCheckConfig.setHealthCheckMethod(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckMethod"));
			healthCheckConfig.setHealthCheckPath(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckPath"));
			healthCheckConfig.setHealthCheckProtocol(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckProtocol"));
			healthCheckConfig.setHealthCheckTimeout(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckTimeout"));
			healthCheckConfig.setHealthyThreshold(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthyThreshold"));
			healthCheckConfig.setUnhealthyThreshold(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.UnhealthyThreshold"));

			List<String> healthCheckCodes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckCodes.Length"); j++) {
				healthCheckCodes.add(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].HealthCheckConfig.HealthCheckCodes["+ j +"]"));
			}
			healthCheckConfig.setHealthCheckCodes(healthCheckCodes);
			serverGroup.setHealthCheckConfig(healthCheckConfig);

			StickySessionConfig stickySessionConfig = new StickySessionConfig();
			stickySessionConfig.setCookie(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].StickySessionConfig.Cookie"));
			stickySessionConfig.setCookieTimeout(_ctx.integerValue("ListServerGroupsResponse.ServerGroups["+ i +"].StickySessionConfig.CookieTimeout"));
			stickySessionConfig.setStickySessionEnabled(_ctx.booleanValue("ListServerGroupsResponse.ServerGroups["+ i +"].StickySessionConfig.StickySessionEnabled"));
			stickySessionConfig.setStickySessionType(_ctx.stringValue("ListServerGroupsResponse.ServerGroups["+ i +"].StickySessionConfig.StickySessionType"));
			serverGroup.setStickySessionConfig(stickySessionConfig);

			serverGroups.add(serverGroup);
		}
		listServerGroupsResponse.setServerGroups(serverGroups);
	 
	 	return listServerGroupsResponse;
	}
}