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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.GetProtocolMountTargetResponse;
import com.aliyuncs.nas.model.v20170626.GetProtocolMountTargetResponse.ProtocolMountTarget;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProtocolMountTargetResponseUnmarshaller {

	public static GetProtocolMountTargetResponse unmarshall(GetProtocolMountTargetResponse getProtocolMountTargetResponse, UnmarshallerContext _ctx) {
		
		getProtocolMountTargetResponse.setRequestId(_ctx.stringValue("GetProtocolMountTargetResponse.RequestId"));
		getProtocolMountTargetResponse.setNextToken(_ctx.stringValue("GetProtocolMountTargetResponse.NextToken"));

		ProtocolMountTarget protocolMountTarget = new ProtocolMountTarget();
		protocolMountTarget.setFsetId(_ctx.stringValue("GetProtocolMountTargetResponse.ProtocolMountTarget.FsetId"));
		protocolMountTarget.setPath(_ctx.stringValue("GetProtocolMountTargetResponse.ProtocolMountTarget.Path"));
		protocolMountTarget.setStatus(_ctx.stringValue("GetProtocolMountTargetResponse.ProtocolMountTarget.Status"));
		protocolMountTarget.setExportId(_ctx.stringValue("GetProtocolMountTargetResponse.ProtocolMountTarget.ExportId"));
		protocolMountTarget.setDescription(_ctx.stringValue("GetProtocolMountTargetResponse.ProtocolMountTarget.Description"));
		protocolMountTarget.setVpcId(_ctx.stringValue("GetProtocolMountTargetResponse.ProtocolMountTarget.VpcId"));
		protocolMountTarget.setProtocolMountTargetDomain(_ctx.stringValue("GetProtocolMountTargetResponse.ProtocolMountTarget.ProtocolMountTargetDomain"));
		protocolMountTarget.setProtocolType(_ctx.stringValue("GetProtocolMountTargetResponse.ProtocolMountTarget.ProtocolType"));
		protocolMountTarget.setVSwitchId(_ctx.stringValue("GetProtocolMountTargetResponse.ProtocolMountTarget.VSwitchId"));
		protocolMountTarget.setAccessGroupName(_ctx.stringValue("GetProtocolMountTargetResponse.ProtocolMountTarget.AccessGroupName"));
		protocolMountTarget.setCreateTime(_ctx.stringValue("GetProtocolMountTargetResponse.ProtocolMountTarget.CreateTime"));

		List<String> vSwitchIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetProtocolMountTargetResponse.ProtocolMountTarget.VSwitchIds.Length"); i++) {
			vSwitchIds.add(_ctx.stringValue("GetProtocolMountTargetResponse.ProtocolMountTarget.VSwitchIds["+ i +"]"));
		}
		protocolMountTarget.setVSwitchIds(vSwitchIds);
		getProtocolMountTargetResponse.setProtocolMountTarget(protocolMountTarget);
	 
	 	return getProtocolMountTargetResponse;
	}
}