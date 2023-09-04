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

package com.aliyuncs.eflo.transform.v20220530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo.model.v20220530.GetNodeInfoForPodResponse;
import com.aliyuncs.eflo.model.v20220530.GetNodeInfoForPodResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeInfoForPodResponseUnmarshaller {

	public static GetNodeInfoForPodResponse unmarshall(GetNodeInfoForPodResponse getNodeInfoForPodResponse, UnmarshallerContext _ctx) {
		
		getNodeInfoForPodResponse.setRequestId(_ctx.stringValue("GetNodeInfoForPodResponse.RequestId"));
		getNodeInfoForPodResponse.setCode(_ctx.integerValue("GetNodeInfoForPodResponse.Code"));
		getNodeInfoForPodResponse.setMessage(_ctx.stringValue("GetNodeInfoForPodResponse.Message"));

		Content content = new Content();
		content.setRegionId(_ctx.stringValue("GetNodeInfoForPodResponse.Content.RegionId"));
		content.setClusterId(_ctx.stringValue("GetNodeInfoForPodResponse.Content.ClusterId"));
		content.setVpcId(_ctx.stringValue("GetNodeInfoForPodResponse.Content.VpcId"));
		content.setNodeId(_ctx.stringValue("GetNodeInfoForPodResponse.Content.NodeId"));
		content.setLeniQuota(_ctx.integerValue("GetNodeInfoForPodResponse.Content.LeniQuota"));
		content.setLniSipQuota(_ctx.integerValue("GetNodeInfoForPodResponse.Content.LniSipQuota"));

		List<String> vSwitches = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetNodeInfoForPodResponse.Content.VSwitches.Length"); i++) {
			vSwitches.add(_ctx.stringValue("GetNodeInfoForPodResponse.Content.VSwitches["+ i +"]"));
		}
		content.setVSwitches(vSwitches);
		getNodeInfoForPodResponse.setContent(content);
	 
	 	return getNodeInfoForPodResponse;
	}
}