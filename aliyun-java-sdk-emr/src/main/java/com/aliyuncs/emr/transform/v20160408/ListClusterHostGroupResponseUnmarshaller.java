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

	public static ListClusterHostGroupResponse unmarshall(ListClusterHostGroupResponse listClusterHostGroupResponse, UnmarshallerContext _ctx) {
		
		listClusterHostGroupResponse.setRequestId(_ctx.stringValue("ListClusterHostGroupResponse.RequestId"));
		listClusterHostGroupResponse.setPageNumber(_ctx.integerValue("ListClusterHostGroupResponse.PageNumber"));
		listClusterHostGroupResponse.setPageSize(_ctx.integerValue("ListClusterHostGroupResponse.PageSize"));
		listClusterHostGroupResponse.setTotal(_ctx.integerValue("ListClusterHostGroupResponse.Total"));
		listClusterHostGroupResponse.setClusterId(_ctx.stringValue("ListClusterHostGroupResponse.ClusterId"));

		List<HostGroup> hostGroupList = new ArrayList<HostGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterHostGroupResponse.HostGroupList.Length"); i++) {
			HostGroup hostGroup = new HostGroup();
			hostGroup.setHostGroupId(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].HostGroupId"));
			hostGroup.setHostGroupName(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].HostGroupName"));
			hostGroup.setHostGroupType(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].HostGroupType"));
			hostGroup.setHostGroupSubType(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].HostGroupSubType"));
			hostGroup.setInstanceType(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].InstanceType"));
			hostGroup.setSystemDiskType(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].SystemDiskType"));
			hostGroup.setSystemDiskSize(_ctx.integerValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].SystemDiskSize"));
			hostGroup.setSystemDiskCount(_ctx.integerValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].SystemDiskCount"));
			hostGroup.setDataDiskType(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].DataDiskType"));
			hostGroup.setDataDiskSize(_ctx.integerValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].DataDiskSize"));
			hostGroup.setDataDiskCount(_ctx.integerValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].DataDiskCount"));
			hostGroup.setCpu(_ctx.integerValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].Cpu"));
			hostGroup.setMemory(_ctx.integerValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].Memory"));
			hostGroup.setStatus(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].Status"));
			hostGroup.setLockType(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].LockType"));
			hostGroup.setLockReason(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].LockReason"));
			hostGroup.setPayType(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].PayType"));
			hostGroup.setChargeType(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].ChargeType"));
			hostGroup.setNodeCount(_ctx.integerValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].NodeCount"));
			hostGroup.setVswitchId(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].VswitchId"));
			hostGroup.setComment(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].Comment"));
			hostGroup.setSecurityGroupId(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].SecurityGroupId"));
			hostGroup.setGmtCreate(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].gmtCreate"));
			hostGroup.setGmtModified(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].gmtModified"));
			hostGroup.setHostGroupChangeType(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].HostGroupChangeType"));
			hostGroup.setHostGroupChangeStatus(_ctx.stringValue("ListClusterHostGroupResponse.HostGroupList["+ i +"].HostGroupChangeStatus"));

			hostGroupList.add(hostGroup);
		}
		listClusterHostGroupResponse.setHostGroupList(hostGroupList);
	 
	 	return listClusterHostGroupResponse;
	}
}