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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListClusterHostGroupResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterHostGroupResponse.HostGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterHostGroupResponseUnmarshaller {

	public static ListClusterHostGroupResponse unmarshall(ListClusterHostGroupResponse listClusterHostGroupResponse, UnmarshallerContext context) {
		
		listClusterHostGroupResponse.setRequestId(context.stringValue("ListClusterHostGroupResponse.RequestId"));
		listClusterHostGroupResponse.setPageNumber(context.integerValue("ListClusterHostGroupResponse.PageNumber"));
		listClusterHostGroupResponse.setPageSize(context.integerValue("ListClusterHostGroupResponse.PageSize"));
		listClusterHostGroupResponse.setTotal(context.integerValue("ListClusterHostGroupResponse.Total"));
		listClusterHostGroupResponse.setClusterId(context.stringValue("ListClusterHostGroupResponse.ClusterId"));

		List<HostGroup> hostGroupList = new ArrayList<HostGroup>();
		for (int i = 0; i < context.lengthValue("ListClusterHostGroupResponse.HostGroupList.Length"); i++) {
			HostGroup hostGroup = new HostGroup();
			hostGroup.setHostGroupId(context.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].HostGroupId"));
			hostGroup.setHostGroupName(context.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].HostGroupName"));
			hostGroup.setHostGroupType(context.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].HostGroupType"));
			hostGroup.setHostGroupSubType(context.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].HostGroupSubType"));
			hostGroup.setInstanceType(context.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].InstanceType"));
			hostGroup.setSystemDiskType(context.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].SystemDiskType"));
			hostGroup.setSystemDiskSize(context.integerValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].SystemDiskSize"));
			hostGroup.setSystemDiskCount(context.integerValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].SystemDiskCount"));
			hostGroup.setDataDiskType(context.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].DataDiskType"));
			hostGroup.setDataDiskSize(context.integerValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].DataDiskSize"));
			hostGroup.setDataDiskCount(context.integerValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].DataDiskCount"));
			hostGroup.setCpu(context.integerValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].Cpu"));
			hostGroup.setMemory(context.integerValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].Memory"));
			hostGroup.setStatus(context.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].Status"));
			hostGroup.setLockType(context.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].LockType"));
			hostGroup.setLockReason(context.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].LockReason"));
			hostGroup.setPayType(context.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].PayType"));
			hostGroup.setNodeCount(context.integerValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].NodeCount"));
			hostGroup.setVswitchId(context.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].VswitchId"));
			hostGroup.setComment(context.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].Comment"));
			hostGroup.setSecurityGroupId(context.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].SecurityGroupId"));
			hostGroup.setGmtCreate(context.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].gmtCreate"));
			hostGroup.setGmtModified(context.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].gmtModified"));

			hostGroupList.add(hostGroup);
		}
		listClusterHostGroupResponse.setHostGroupList(hostGroupList);
	 
	 	return listClusterHostGroupResponse;
	}
}