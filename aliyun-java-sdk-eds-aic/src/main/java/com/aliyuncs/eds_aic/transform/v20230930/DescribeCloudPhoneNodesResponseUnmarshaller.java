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

import com.aliyuncs.eds_aic.model.v20230930.DescribeCloudPhoneNodesResponse;
import com.aliyuncs.eds_aic.model.v20230930.DescribeCloudPhoneNodesResponse.Data;
import com.aliyuncs.eds_aic.model.v20230930.DescribeCloudPhoneNodesResponse.Data.BizTagsItem;
import com.aliyuncs.eds_aic.model.v20230930.DescribeCloudPhoneNodesResponse.Data.NetworkInfosItem;
import com.aliyuncs.eds_aic.model.v20230930.DescribeCloudPhoneNodesResponse.Data.PhoneDataInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudPhoneNodesResponseUnmarshaller {

	public static DescribeCloudPhoneNodesResponse unmarshall(DescribeCloudPhoneNodesResponse describeCloudPhoneNodesResponse, UnmarshallerContext _ctx) {
		
		describeCloudPhoneNodesResponse.setRequestId(_ctx.stringValue("DescribeCloudPhoneNodesResponse.RequestId"));
		describeCloudPhoneNodesResponse.setTotalCount(_ctx.integerValue("DescribeCloudPhoneNodesResponse.TotalCount"));
		describeCloudPhoneNodesResponse.setNextToken(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NextToken"));
		describeCloudPhoneNodesResponse.setMaxResults(_ctx.integerValue("DescribeCloudPhoneNodesResponse.MaxResults"));

		List<Data> nodeModel = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudPhoneNodesResponse.NodeModel.Length"); i++) {
			Data data = new Data();
			data.setServerType(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].ServerType"));
			data.setResolutionWidth(_ctx.integerValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].ResolutionWidth"));
			data.setNodeName(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].NodeName"));
			data.setMemory(_ctx.integerValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].Memory"));
			data.setGmtModified(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].GmtModified"));
			data.setCpu(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].Cpu"));
			data.setNetworkType(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].NetworkType"));
			data.setBandwidthPackageId(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].BandwidthPackageId"));
			data.setInstanceType(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].InstanceType"));
			data.setStatus(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].Status"));
			data.setVSwitchId(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].VSwitchId"));
			data.setResolutionHeight(_ctx.integerValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].ResolutionHeight"));
			data.setNetworkId(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].NetworkId"));
			data.setBandwidthPackageType(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].BandwidthPackageType"));
			data.setGmtExpired(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].GmtExpired"));
			data.setPhoneCount(_ctx.integerValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].PhoneCount"));
			data.setNodePoolId(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].NodePoolId"));
			data.setGmtCreate(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].GmtCreate"));
			data.setChargeType(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].ChargeType"));
			data.setNodeId(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].NodeId"));
			data.setRegionId(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].RegionId"));
			data.setShareDataVolume(_ctx.integerValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].ShareDataVolume"));

			PhoneDataInfo phoneDataInfo = new PhoneDataInfo();
			phoneDataInfo.setPhoneDataId(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].PhoneDataInfo.PhoneDataId"));
			phoneDataInfo.setPhoneDataVolume(_ctx.integerValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].PhoneDataInfo.PhoneDataVolume"));
			data.setPhoneDataInfo(phoneDataInfo);

			List<BizTagsItem> bizTags = new ArrayList<BizTagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].BizTags.Length"); j++) {
				BizTagsItem bizTagsItem = new BizTagsItem();
				bizTagsItem.setValue(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].BizTags["+ j +"].Value"));
				bizTagsItem.setKey(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].BizTags["+ j +"].Key"));

				bizTags.add(bizTagsItem);
			}
			data.setBizTags(bizTags);

			List<NetworkInfosItem> networkInfos = new ArrayList<NetworkInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].NetworkInfos.Length"); j++) {
				NetworkInfosItem networkInfosItem = new NetworkInfosItem();
				networkInfosItem.setNetworkType(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].NetworkInfos["+ j +"].NetworkType"));
				networkInfosItem.setVSwitchId(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].NetworkInfos["+ j +"].VSwitchId"));
				networkInfosItem.setBandwidthPackageId(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].NetworkInfos["+ j +"].BandwidthPackageId"));
				networkInfosItem.setNetworkId(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].NetworkInfos["+ j +"].NetworkId"));
				networkInfosItem.setBandwidthPackageType(_ctx.stringValue("DescribeCloudPhoneNodesResponse.NodeModel["+ i +"].NetworkInfos["+ j +"].BandwidthPackageType"));

				networkInfos.add(networkInfosItem);
			}
			data.setNetworkInfos(networkInfos);

			nodeModel.add(data);
		}
		describeCloudPhoneNodesResponse.setNodeModel(nodeModel);
	 
	 	return describeCloudPhoneNodesResponse;
	}
}