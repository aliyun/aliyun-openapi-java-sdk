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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.ChangeCloudPhoneNodeResponse;
import com.aliyuncs.eds_aic.model.v20230930.ChangeCloudPhoneNodeResponse.NodeInfosItem;
import com.aliyuncs.eds_aic.model.v20230930.ChangeCloudPhoneNodeResponse.NodeInfosItem.InstanceIds;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeCloudPhoneNodeResponseUnmarshaller {

	public static ChangeCloudPhoneNodeResponse unmarshall(ChangeCloudPhoneNodeResponse changeCloudPhoneNodeResponse, UnmarshallerContext _ctx) {
		
		changeCloudPhoneNodeResponse.setRequestId(_ctx.stringValue("ChangeCloudPhoneNodeResponse.RequestId"));

		List<NodeInfosItem> nodeInfos = new ArrayList<NodeInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("ChangeCloudPhoneNodeResponse.NodeInfos.Length"); i++) {
			NodeInfosItem nodeInfosItem = new NodeInfosItem();
			nodeInfosItem.setNodeId(_ctx.stringValue("ChangeCloudPhoneNodeResponse.NodeInfos["+ i +"].NodeId"));

			List<InstanceIds> instanceInfos = new ArrayList<InstanceIds>();
			for (int j = 0; j < _ctx.lengthValue("ChangeCloudPhoneNodeResponse.NodeInfos["+ i +"].InstanceInfos.Length"); j++) {
				InstanceIds instanceIds = new InstanceIds();
				instanceIds.setInstanceId(_ctx.stringValue("ChangeCloudPhoneNodeResponse.NodeInfos["+ i +"].InstanceInfos["+ j +"].InstanceId"));

				instanceInfos.add(instanceIds);
			}
			nodeInfosItem.setInstanceInfos(instanceInfos);

			nodeInfos.add(nodeInfosItem);
		}
		changeCloudPhoneNodeResponse.setNodeInfos(nodeInfos);
	 
	 	return changeCloudPhoneNodeResponse;
	}
}