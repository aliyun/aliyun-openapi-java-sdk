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

import com.aliyuncs.ga.model.v20191120.ListAcceleratorsResponse;
import com.aliyuncs.ga.model.v20191120.ListAcceleratorsResponse.AcceleratorsItem;
import com.aliyuncs.ga.model.v20191120.ListAcceleratorsResponse.AcceleratorsItem.BasicBandwidthPackage;
import com.aliyuncs.ga.model.v20191120.ListAcceleratorsResponse.AcceleratorsItem.CrossDomainBandwidthPackage;
import com.aliyuncs.ga.model.v20191120.ListAcceleratorsResponse.AcceleratorsItem.IpSetConfig;
import com.aliyuncs.ga.model.v20191120.ListAcceleratorsResponse.AcceleratorsItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAcceleratorsResponseUnmarshaller {

	public static ListAcceleratorsResponse unmarshall(ListAcceleratorsResponse listAcceleratorsResponse, UnmarshallerContext _ctx) {
		
		listAcceleratorsResponse.setRequestId(_ctx.stringValue("ListAcceleratorsResponse.RequestId"));
		listAcceleratorsResponse.setTotalCount(_ctx.integerValue("ListAcceleratorsResponse.TotalCount"));
		listAcceleratorsResponse.setPageSize(_ctx.integerValue("ListAcceleratorsResponse.PageSize"));
		listAcceleratorsResponse.setPageNumber(_ctx.integerValue("ListAcceleratorsResponse.PageNumber"));

		List<AcceleratorsItem> accelerators = new ArrayList<AcceleratorsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAcceleratorsResponse.Accelerators.Length"); i++) {
			AcceleratorsItem acceleratorsItem = new AcceleratorsItem();
			acceleratorsItem.setDnsName(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].DnsName"));
			acceleratorsItem.setType(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].Type"));
			acceleratorsItem.setSecondDnsName(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].SecondDnsName"));
			acceleratorsItem.setSpec(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].Spec"));
			acceleratorsItem.setState(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].State"));
			acceleratorsItem.setCreateTime(_ctx.longValue("ListAcceleratorsResponse.Accelerators["+ i +"].CreateTime"));
			acceleratorsItem.setCenId(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].CenId"));
			acceleratorsItem.setDdosId(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].DdosId"));
			acceleratorsItem.setRegionId(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].RegionId"));
			acceleratorsItem.setInstanceChargeType(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].InstanceChargeType"));
			acceleratorsItem.setAcceleratorId(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].AcceleratorId"));
			acceleratorsItem.setDescription(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].Description"));
			acceleratorsItem.setBandwidth(_ctx.integerValue("ListAcceleratorsResponse.Accelerators["+ i +"].Bandwidth"));
			acceleratorsItem.setBandwidthBillingType(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].BandwidthBillingType"));
			acceleratorsItem.setExpiredTime(_ctx.longValue("ListAcceleratorsResponse.Accelerators["+ i +"].ExpiredTime"));
			acceleratorsItem.setName(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].Name"));
			acceleratorsItem.setResourceGroupId(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].ResourceGroupId"));
			acceleratorsItem.setCrossBorderMode(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].CrossBorderMode"));
			acceleratorsItem.setCrossBorderStatus(_ctx.booleanValue("ListAcceleratorsResponse.Accelerators["+ i +"].CrossBorderStatus"));
			acceleratorsItem.setUpgradableStatus(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].UpgradableStatus"));

			BasicBandwidthPackage basicBandwidthPackage = new BasicBandwidthPackage();
			basicBandwidthPackage.setBandwidth(_ctx.integerValue("ListAcceleratorsResponse.Accelerators["+ i +"].BasicBandwidthPackage.Bandwidth"));
			basicBandwidthPackage.setBandwidthType(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].BasicBandwidthPackage.BandwidthType"));
			basicBandwidthPackage.setInstanceId(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].BasicBandwidthPackage.InstanceId"));
			acceleratorsItem.setBasicBandwidthPackage(basicBandwidthPackage);

			CrossDomainBandwidthPackage crossDomainBandwidthPackage = new CrossDomainBandwidthPackage();
			crossDomainBandwidthPackage.setBandwidth(_ctx.integerValue("ListAcceleratorsResponse.Accelerators["+ i +"].CrossDomainBandwidthPackage.Bandwidth"));
			crossDomainBandwidthPackage.setInstanceId(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].CrossDomainBandwidthPackage.InstanceId"));
			acceleratorsItem.setCrossDomainBandwidthPackage(crossDomainBandwidthPackage);

			IpSetConfig ipSetConfig = new IpSetConfig();
			ipSetConfig.setAccessMode(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].IpSetConfig.AccessMode"));
			acceleratorsItem.setIpSetConfig(ipSetConfig);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAcceleratorsResponse.Accelerators["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			acceleratorsItem.setTags(tags);

			accelerators.add(acceleratorsItem);
		}
		listAcceleratorsResponse.setAccelerators(accelerators);
	 
	 	return listAcceleratorsResponse;
	}
}