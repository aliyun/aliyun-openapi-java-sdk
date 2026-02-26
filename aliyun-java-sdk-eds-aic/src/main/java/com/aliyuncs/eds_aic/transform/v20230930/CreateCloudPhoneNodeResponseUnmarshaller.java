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

import com.aliyuncs.eds_aic.model.v20230930.CreateCloudPhoneNodeResponse;
import com.aliyuncs.eds_aic.model.v20230930.CreateCloudPhoneNodeResponse.NetworkPackageOrderModel;
import com.aliyuncs.eds_aic.model.v20230930.CreateCloudPhoneNodeResponse.NodeInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCloudPhoneNodeResponseUnmarshaller {

	public static CreateCloudPhoneNodeResponse unmarshall(CreateCloudPhoneNodeResponse createCloudPhoneNodeResponse, UnmarshallerContext _ctx) {
		
		createCloudPhoneNodeResponse.setRequestId(_ctx.stringValue("CreateCloudPhoneNodeResponse.RequestId"));
		createCloudPhoneNodeResponse.setOrderId(_ctx.stringValue("CreateCloudPhoneNodeResponse.OrderId"));

		NetworkPackageOrderModel networkPackageOrderModel = new NetworkPackageOrderModel();
		networkPackageOrderModel.setBandwidthPackageOrderId(_ctx.stringValue("CreateCloudPhoneNodeResponse.NetworkPackageOrderModel.BandwidthPackageOrderId"));
		networkPackageOrderModel.setBandwidthPackageId(_ctx.stringValue("CreateCloudPhoneNodeResponse.NetworkPackageOrderModel.BandwidthPackageId"));
		createCloudPhoneNodeResponse.setNetworkPackageOrderModel(networkPackageOrderModel);

		List<NodeInfosItem> nodeInfos = new ArrayList<NodeInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateCloudPhoneNodeResponse.NodeInfos.Length"); i++) {
			NodeInfosItem nodeInfosItem = new NodeInfosItem();
			nodeInfosItem.setNodeId(_ctx.stringValue("CreateCloudPhoneNodeResponse.NodeInfos["+ i +"].NodeId"));

			List<String> instanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateCloudPhoneNodeResponse.NodeInfos["+ i +"].InstanceIds.Length"); j++) {
				instanceIds.add(_ctx.stringValue("CreateCloudPhoneNodeResponse.NodeInfos["+ i +"].InstanceIds["+ j +"]"));
			}
			nodeInfosItem.setInstanceIds(instanceIds);

			nodeInfos.add(nodeInfosItem);
		}
		createCloudPhoneNodeResponse.setNodeInfos(nodeInfos);
	 
	 	return createCloudPhoneNodeResponse;
	}
}