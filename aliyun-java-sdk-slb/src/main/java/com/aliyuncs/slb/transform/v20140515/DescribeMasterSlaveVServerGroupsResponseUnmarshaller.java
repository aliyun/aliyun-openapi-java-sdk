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
package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeMasterSlaveVServerGroupsResponse;
import com.aliyuncs.slb.model.v20140515.DescribeMasterSlaveVServerGroupsResponse.MasterSlaveVServerGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMasterSlaveVServerGroupsResponseUnmarshaller {

	public static DescribeMasterSlaveVServerGroupsResponse unmarshall(DescribeMasterSlaveVServerGroupsResponse describeMasterSlaveVServerGroupsResponse, UnmarshallerContext context) {
		
		describeMasterSlaveVServerGroupsResponse.setRequestId(context.stringValue("DescribeMasterSlaveVServerGroupsResponse.RequestId"));

		List<MasterSlaveVServerGroup> masterSlaveVServerGroups = new ArrayList<MasterSlaveVServerGroup>();
		for (int i = 0; i < context.lengthValue("DescribeMasterSlaveVServerGroupsResponse.MasterSlaveVServerGroups.Length"); i++) {
			MasterSlaveVServerGroup masterSlaveVServerGroup = new MasterSlaveVServerGroup();
			masterSlaveVServerGroup.setMasterSlaveVServerGroupId(context.stringValue("DescribeMasterSlaveVServerGroupsResponse.MasterSlaveVServerGroups["+ i +"].MasterSlaveVServerGroupId"));
			masterSlaveVServerGroup.setMasterSlaveVServerGroupName(context.stringValue("DescribeMasterSlaveVServerGroupsResponse.MasterSlaveVServerGroups["+ i +"].MasterSlaveVServerGroupName"));

			masterSlaveVServerGroups.add(masterSlaveVServerGroup);
		}
		describeMasterSlaveVServerGroupsResponse.setMasterSlaveVServerGroups(masterSlaveVServerGroups);
	 
	 	return describeMasterSlaveVServerGroupsResponse;
	}
}