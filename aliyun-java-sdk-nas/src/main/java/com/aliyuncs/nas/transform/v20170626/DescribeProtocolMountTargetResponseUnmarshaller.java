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

import com.aliyuncs.nas.model.v20170626.DescribeProtocolMountTargetResponse;
import com.aliyuncs.nas.model.v20170626.DescribeProtocolMountTargetResponse.ProtocolMountTarget;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProtocolMountTargetResponseUnmarshaller {

	public static DescribeProtocolMountTargetResponse unmarshall(DescribeProtocolMountTargetResponse describeProtocolMountTargetResponse, UnmarshallerContext _ctx) {
		
		describeProtocolMountTargetResponse.setRequestId(_ctx.stringValue("DescribeProtocolMountTargetResponse.RequestId"));
		describeProtocolMountTargetResponse.setNextToken(_ctx.stringValue("DescribeProtocolMountTargetResponse.NextToken"));

		List<ProtocolMountTarget> protocolMountTargets = new ArrayList<ProtocolMountTarget>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProtocolMountTargetResponse.ProtocolMountTargets.Length"); i++) {
			ProtocolMountTarget protocolMountTarget = new ProtocolMountTarget();
			protocolMountTarget.setExportId(_ctx.stringValue("DescribeProtocolMountTargetResponse.ProtocolMountTargets["+ i +"].ExportId"));
			protocolMountTarget.setProtocolMountTargetDomain(_ctx.stringValue("DescribeProtocolMountTargetResponse.ProtocolMountTargets["+ i +"].ProtocolMountTargetDomain"));
			protocolMountTarget.setProtocolType(_ctx.stringValue("DescribeProtocolMountTargetResponse.ProtocolMountTargets["+ i +"].ProtocolType"));
			protocolMountTarget.setVpcId(_ctx.stringValue("DescribeProtocolMountTargetResponse.ProtocolMountTargets["+ i +"].VpcId"));
			protocolMountTarget.setVSwitchId(_ctx.stringValue("DescribeProtocolMountTargetResponse.ProtocolMountTargets["+ i +"].VSwitchId"));
			protocolMountTarget.setFsetId(_ctx.stringValue("DescribeProtocolMountTargetResponse.ProtocolMountTargets["+ i +"].FsetId"));
			protocolMountTarget.setPath(_ctx.stringValue("DescribeProtocolMountTargetResponse.ProtocolMountTargets["+ i +"].Path"));
			protocolMountTarget.setAccessGroupName(_ctx.stringValue("DescribeProtocolMountTargetResponse.ProtocolMountTargets["+ i +"].AccessGroupName"));
			protocolMountTarget.setCreateTime(_ctx.stringValue("DescribeProtocolMountTargetResponse.ProtocolMountTargets["+ i +"].CreateTime"));
			protocolMountTarget.setStatus(_ctx.stringValue("DescribeProtocolMountTargetResponse.ProtocolMountTargets["+ i +"].Status"));
			protocolMountTarget.setProtocolServiceId(_ctx.stringValue("DescribeProtocolMountTargetResponse.ProtocolMountTargets["+ i +"].ProtocolServiceId"));
			protocolMountTarget.setDescription(_ctx.stringValue("DescribeProtocolMountTargetResponse.ProtocolMountTargets["+ i +"].Description"));

			protocolMountTargets.add(protocolMountTarget);
		}
		describeProtocolMountTargetResponse.setProtocolMountTargets(protocolMountTargets);
	 
	 	return describeProtocolMountTargetResponse;
	}
}