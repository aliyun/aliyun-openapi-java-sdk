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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRCNodePoolResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCNodePoolResponse.NodePoolLists;
import com.aliyuncs.rds.model.v20140815.DescribeRCNodePoolResponse.NodePoolLists.DataDiskItem;
import com.aliyuncs.rds.model.v20140815.DescribeRCNodePoolResponse.NodePoolLists.SystemDisk;
import com.aliyuncs.rds.model.v20140815.DescribeRCNodePoolResponse.NodePoolLists.TagItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCNodePoolResponseUnmarshaller {

	public static DescribeRCNodePoolResponse unmarshall(DescribeRCNodePoolResponse describeRCNodePoolResponse, UnmarshallerContext _ctx) {
		
		describeRCNodePoolResponse.setRequestId(_ctx.stringValue("DescribeRCNodePoolResponse.RequestId"));

		List<NodePoolLists> nodePoolList = new ArrayList<NodePoolLists>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCNodePoolResponse.NodePoolList.Length"); i++) {
			NodePoolLists nodePoolLists = new NodePoolLists();
			nodePoolLists.setClusterId(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].ClusterId"));
			nodePoolLists.setNodePoolId(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].NodePoolId"));
			nodePoolLists.setSecurityEnhancementStrategy(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].SecurityEnhancementStrategy"));
			nodePoolLists.setDeploymentSetId(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].DeploymentSetId"));
			nodePoolLists.setDescription(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].Description"));
			nodePoolLists.setInstanceName(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].InstanceName"));
			nodePoolLists.setPassword(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].Password"));
			nodePoolLists.setVSwitchId(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].VSwitchId"));
			nodePoolLists.setHostName(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].HostName"));
			nodePoolLists.setInternetChargeType(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].InternetChargeType"));
			nodePoolLists.setImageId(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].ImageId"));
			nodePoolLists.setInstanceType(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].InstanceType"));
			nodePoolLists.setInternetMaxBandwidthOut(_ctx.integerValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].InternetMaxBandwidthOut"));
			nodePoolLists.setIoOptimized(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].IoOptimized"));
			nodePoolLists.setKeyPairName(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].KeyPairName"));
			nodePoolLists.setRegionId(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].RegionId"));
			nodePoolLists.setSecurityGroupId(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].SecurityGroupId"));
			nodePoolLists.setAutoPay(_ctx.booleanValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].AutoPay"));
			nodePoolLists.setZoneId(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].ZoneId"));
			nodePoolLists.setResourceGroupId(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].ResourceGroupId"));
			nodePoolLists.setInstanceChargeType(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].InstanceChargeType"));
			nodePoolLists.setSpotStrategy(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].SpotStrategy"));
			nodePoolLists.setCreateMode(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].CreateMode"));
			nodePoolLists.setPeriod(_ctx.integerValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].Period"));
			nodePoolLists.setPeriodUnit(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].PeriodUnit"));
			nodePoolLists.setAutoRenew(_ctx.booleanValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].AutoRenew"));
			nodePoolLists.setNodePoolName(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].NodePoolName"));

			SystemDisk systemDisk = new SystemDisk();
			systemDisk.setCategory(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].SystemDisk.Category"));
			systemDisk.setSize(_ctx.integerValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].SystemDisk.Size"));
			systemDisk.setPerformanceLevel(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].SystemDisk.PerformanceLevel"));
			nodePoolLists.setSystemDisk(systemDisk);

			List<DataDiskItem> dataDisk = new ArrayList<DataDiskItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].DataDisk.Length"); j++) {
				DataDiskItem dataDiskItem = new DataDiskItem();
				dataDiskItem.setCategory(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].DataDisk["+ j +"].Category"));
				dataDiskItem.setDeleteWithInstance(_ctx.booleanValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].DataDisk["+ j +"].DeleteWithInstance"));
				dataDiskItem.setEncrypted(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].DataDisk["+ j +"].Encrypted"));
				dataDiskItem.setPerformanceLevel(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].DataDisk["+ j +"].PerformanceLevel"));
				dataDiskItem.setSize(_ctx.integerValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].DataDisk["+ j +"].Size"));

				dataDisk.add(dataDiskItem);
			}
			nodePoolLists.setDataDisk(dataDisk);

			List<TagItem> tag = new ArrayList<TagItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].Tag.Length"); j++) {
				TagItem tagItem = new TagItem();
				tagItem.setKey(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].Tag["+ j +"].Key"));
				tagItem.setValue(_ctx.stringValue("DescribeRCNodePoolResponse.NodePoolList["+ i +"].Tag["+ j +"].Value"));

				tag.add(tagItem);
			}
			nodePoolLists.setTag(tag);

			nodePoolList.add(nodePoolLists);
		}
		describeRCNodePoolResponse.setNodePoolList(nodePoolList);
	 
	 	return describeRCNodePoolResponse;
	}
}