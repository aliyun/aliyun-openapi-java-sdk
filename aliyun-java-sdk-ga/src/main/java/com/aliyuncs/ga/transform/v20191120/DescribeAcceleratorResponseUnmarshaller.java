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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.DescribeAcceleratorResponse;
import com.aliyuncs.ga.model.v20191120.DescribeAcceleratorResponse.BasicBandwidthPackage;
import com.aliyuncs.ga.model.v20191120.DescribeAcceleratorResponse.CrossDomainBandwidthPackage;
import com.aliyuncs.ga.model.v20191120.DescribeAcceleratorResponse.IpSetConfig;
import com.aliyuncs.ga.model.v20191120.DescribeAcceleratorResponse.ServiceManagedInfosItem;
import com.aliyuncs.ga.model.v20191120.DescribeAcceleratorResponse.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAcceleratorResponseUnmarshaller {

	public static DescribeAcceleratorResponse unmarshall(DescribeAcceleratorResponse describeAcceleratorResponse, UnmarshallerContext _ctx) {
		
		describeAcceleratorResponse.setRequestId(_ctx.stringValue("DescribeAcceleratorResponse.RequestId"));
		describeAcceleratorResponse.setDdosId(_ctx.stringValue("DescribeAcceleratorResponse.DdosId"));
		describeAcceleratorResponse.setDnsName(_ctx.stringValue("DescribeAcceleratorResponse.DnsName"));
		describeAcceleratorResponse.setDescription(_ctx.stringValue("DescribeAcceleratorResponse.Description"));
		describeAcceleratorResponse.setInstanceChargeType(_ctx.stringValue("DescribeAcceleratorResponse.InstanceChargeType"));
		describeAcceleratorResponse.setCreateTime(_ctx.longValue("DescribeAcceleratorResponse.CreateTime"));
		describeAcceleratorResponse.setSecondDnsName(_ctx.stringValue("DescribeAcceleratorResponse.SecondDnsName"));
		describeAcceleratorResponse.setName(_ctx.stringValue("DescribeAcceleratorResponse.Name"));
		describeAcceleratorResponse.setState(_ctx.stringValue("DescribeAcceleratorResponse.State"));
		describeAcceleratorResponse.setExpiredTime(_ctx.longValue("DescribeAcceleratorResponse.ExpiredTime"));
		describeAcceleratorResponse.setCenId(_ctx.stringValue("DescribeAcceleratorResponse.CenId"));
		describeAcceleratorResponse.setRegionId(_ctx.stringValue("DescribeAcceleratorResponse.RegionId"));
		describeAcceleratorResponse.setSpec(_ctx.stringValue("DescribeAcceleratorResponse.Spec"));
		describeAcceleratorResponse.setAcceleratorId(_ctx.stringValue("DescribeAcceleratorResponse.AcceleratorId"));
		describeAcceleratorResponse.setBandwidthBillingType(_ctx.stringValue("DescribeAcceleratorResponse.BandwidthBillingType"));
		describeAcceleratorResponse.setCrossPrivateState(_ctx.stringValue("DescribeAcceleratorResponse.CrossPrivateState"));
		describeAcceleratorResponse.setResourceGroupId(_ctx.stringValue("DescribeAcceleratorResponse.ResourceGroupId"));
		describeAcceleratorResponse.setCrossBorderMode(_ctx.stringValue("DescribeAcceleratorResponse.CrossBorderMode"));
		describeAcceleratorResponse.setCrossBorderStatus(_ctx.booleanValue("DescribeAcceleratorResponse.CrossBorderStatus"));
		describeAcceleratorResponse.setUpgradableStatus(_ctx.stringValue("DescribeAcceleratorResponse.UpgradableStatus"));
		describeAcceleratorResponse.setServiceId(_ctx.stringValue("DescribeAcceleratorResponse.ServiceId"));
		describeAcceleratorResponse.setServiceManaged(_ctx.booleanValue("DescribeAcceleratorResponse.ServiceManaged"));

		CrossDomainBandwidthPackage crossDomainBandwidthPackage = new CrossDomainBandwidthPackage();
		crossDomainBandwidthPackage.setBandwidth(_ctx.integerValue("DescribeAcceleratorResponse.CrossDomainBandwidthPackage.Bandwidth"));
		crossDomainBandwidthPackage.setInstanceId(_ctx.stringValue("DescribeAcceleratorResponse.CrossDomainBandwidthPackage.InstanceId"));
		describeAcceleratorResponse.setCrossDomainBandwidthPackage(crossDomainBandwidthPackage);

		BasicBandwidthPackage basicBandwidthPackage = new BasicBandwidthPackage();
		basicBandwidthPackage.setBandwidth(_ctx.integerValue("DescribeAcceleratorResponse.BasicBandwidthPackage.Bandwidth"));
		basicBandwidthPackage.setBandwidthType(_ctx.stringValue("DescribeAcceleratorResponse.BasicBandwidthPackage.BandwidthType"));
		basicBandwidthPackage.setInstanceId(_ctx.stringValue("DescribeAcceleratorResponse.BasicBandwidthPackage.InstanceId"));
		describeAcceleratorResponse.setBasicBandwidthPackage(basicBandwidthPackage);

		IpSetConfig ipSetConfig = new IpSetConfig();
		ipSetConfig.setAccessMode(_ctx.stringValue("DescribeAcceleratorResponse.IpSetConfig.AccessMode"));
		describeAcceleratorResponse.setIpSetConfig(ipSetConfig);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAcceleratorResponse.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setKey(_ctx.stringValue("DescribeAcceleratorResponse.Tags["+ i +"].Key"));
			tagsItem.setValue(_ctx.stringValue("DescribeAcceleratorResponse.Tags["+ i +"].Value"));

			tags.add(tagsItem);
		}
		describeAcceleratorResponse.setTags(tags);

		List<ServiceManagedInfosItem> serviceManagedInfos = new ArrayList<ServiceManagedInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAcceleratorResponse.ServiceManagedInfos.Length"); i++) {
			ServiceManagedInfosItem serviceManagedInfosItem = new ServiceManagedInfosItem();
			serviceManagedInfosItem.setAction(_ctx.stringValue("DescribeAcceleratorResponse.ServiceManagedInfos["+ i +"].Action"));
			serviceManagedInfosItem.setChildType(_ctx.stringValue("DescribeAcceleratorResponse.ServiceManagedInfos["+ i +"].ChildType"));
			serviceManagedInfosItem.setIsManaged(_ctx.booleanValue("DescribeAcceleratorResponse.ServiceManagedInfos["+ i +"].IsManaged"));

			serviceManagedInfos.add(serviceManagedInfosItem);
		}
		describeAcceleratorResponse.setServiceManagedInfos(serviceManagedInfos);
	 
	 	return describeAcceleratorResponse;
	}
}