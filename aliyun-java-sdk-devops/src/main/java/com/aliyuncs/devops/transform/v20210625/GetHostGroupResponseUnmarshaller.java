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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.GetHostGroupResponse;
import com.aliyuncs.devops.model.v20210625.GetHostGroupResponse.HostGroup;
import com.aliyuncs.devops.model.v20210625.GetHostGroupResponse.HostGroup.HostInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHostGroupResponseUnmarshaller {

	public static GetHostGroupResponse unmarshall(GetHostGroupResponse getHostGroupResponse, UnmarshallerContext _ctx) {
		
		getHostGroupResponse.setRequestId(_ctx.stringValue("GetHostGroupResponse.requestId"));
		getHostGroupResponse.setErrorMessage(_ctx.stringValue("GetHostGroupResponse.errorMessage"));
		getHostGroupResponse.setErrorCode(_ctx.stringValue("GetHostGroupResponse.errorCode"));
		getHostGroupResponse.setSuccess(_ctx.booleanValue("GetHostGroupResponse.success"));

		HostGroup hostGroup = new HostGroup();
		hostGroup.setCreatorAccountId(_ctx.stringValue("GetHostGroupResponse.hostGroup.creatorAccountId"));
		hostGroup.setUpateTIme(_ctx.longValue("GetHostGroupResponse.hostGroup.upateTIme"));
		hostGroup.setHostNum(_ctx.longValue("GetHostGroupResponse.hostGroup.hostNum"));
		hostGroup.setModifierAccountId(_ctx.stringValue("GetHostGroupResponse.hostGroup.modifierAccountId"));
		hostGroup.setDescription(_ctx.stringValue("GetHostGroupResponse.hostGroup.description"));
		hostGroup.setType(_ctx.stringValue("GetHostGroupResponse.hostGroup.type"));
		hostGroup.setCreateTime(_ctx.longValue("GetHostGroupResponse.hostGroup.createTime"));
		hostGroup.setEcsType(_ctx.stringValue("GetHostGroupResponse.hostGroup.ecsType"));
		hostGroup.setAliyunRegion(_ctx.stringValue("GetHostGroupResponse.hostGroup.aliyunRegion"));
		hostGroup.setEcsLabelKey(_ctx.stringValue("GetHostGroupResponse.hostGroup.ecsLabelKey"));
		hostGroup.setId(_ctx.longValue("GetHostGroupResponse.hostGroup.id"));
		hostGroup.setName(_ctx.stringValue("GetHostGroupResponse.hostGroup.name"));
		hostGroup.setServiceConnectionId(_ctx.longValue("GetHostGroupResponse.hostGroup.serviceConnectionId"));
		hostGroup.setEcsLabelValue(_ctx.stringValue("GetHostGroupResponse.hostGroup.ecsLabelValue"));

		List<HostInfo> hostInfos = new ArrayList<HostInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetHostGroupResponse.hostGroup.hostInfos.Length"); i++) {
			HostInfo hostInfo = new HostInfo();
			hostInfo.setUpdateTime(_ctx.longValue("GetHostGroupResponse.hostGroup.hostInfos["+ i +"].updateTime"));
			hostInfo.setCreatorAccountId(_ctx.stringValue("GetHostGroupResponse.hostGroup.hostInfos["+ i +"].creatorAccountId"));
			hostInfo.setInstanceName(_ctx.stringValue("GetHostGroupResponse.hostGroup.hostInfos["+ i +"].instanceName"));
			hostInfo.setModifierAccountId(_ctx.stringValue("GetHostGroupResponse.hostGroup.hostInfos["+ i +"].modifierAccountId"));
			hostInfo.setIp(_ctx.stringValue("GetHostGroupResponse.hostGroup.hostInfos["+ i +"].ip"));
			hostInfo.setCreateTime(_ctx.longValue("GetHostGroupResponse.hostGroup.hostInfos["+ i +"].createTime"));
			hostInfo.setObjectType(_ctx.stringValue("GetHostGroupResponse.hostGroup.hostInfos["+ i +"].objectType"));
			hostInfo.setAliyunRegionId(_ctx.stringValue("GetHostGroupResponse.hostGroup.hostInfos["+ i +"].aliyunRegionId"));
			hostInfo.setMachineSn(_ctx.stringValue("GetHostGroupResponse.hostGroup.hostInfos["+ i +"].machineSn"));

			hostInfos.add(hostInfo);
		}
		hostGroup.setHostInfos(hostInfos);
		getHostGroupResponse.setHostGroup(hostGroup);
	 
	 	return getHostGroupResponse;
	}
}