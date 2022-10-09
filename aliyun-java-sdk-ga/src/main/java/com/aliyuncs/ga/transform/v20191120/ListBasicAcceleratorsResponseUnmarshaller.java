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

import com.aliyuncs.ga.model.v20191120.ListBasicAcceleratorsResponse;
import com.aliyuncs.ga.model.v20191120.ListBasicAcceleratorsResponse.AcceleratorsItem;
import com.aliyuncs.ga.model.v20191120.ListBasicAcceleratorsResponse.AcceleratorsItem.BasicBandwidthPackage;
import com.aliyuncs.ga.model.v20191120.ListBasicAcceleratorsResponse.AcceleratorsItem.CrossDomainBandwidthPackage;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBasicAcceleratorsResponseUnmarshaller {

	public static ListBasicAcceleratorsResponse unmarshall(ListBasicAcceleratorsResponse listBasicAcceleratorsResponse, UnmarshallerContext _ctx) {
		
		listBasicAcceleratorsResponse.setRequestId(_ctx.stringValue("ListBasicAcceleratorsResponse.RequestId"));
		listBasicAcceleratorsResponse.setTotalCount(_ctx.integerValue("ListBasicAcceleratorsResponse.TotalCount"));
		listBasicAcceleratorsResponse.setPageSize(_ctx.integerValue("ListBasicAcceleratorsResponse.PageSize"));
		listBasicAcceleratorsResponse.setPageNumber(_ctx.integerValue("ListBasicAcceleratorsResponse.PageNumber"));

		List<AcceleratorsItem> accelerators = new ArrayList<AcceleratorsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBasicAcceleratorsResponse.Accelerators.Length"); i++) {
			AcceleratorsItem acceleratorsItem = new AcceleratorsItem();
			acceleratorsItem.setType(_ctx.stringValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].Type"));
			acceleratorsItem.setState(_ctx.stringValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].State"));
			acceleratorsItem.setCreateTime(_ctx.longValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].CreateTime"));
			acceleratorsItem.setRegionId(_ctx.stringValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].RegionId"));
			acceleratorsItem.setInstanceChargeType(_ctx.stringValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].InstanceChargeType"));
			acceleratorsItem.setAcceleratorId(_ctx.stringValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].AcceleratorId"));
			acceleratorsItem.setDescription(_ctx.stringValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].Description"));
			acceleratorsItem.setExpiredTime(_ctx.longValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].ExpiredTime"));
			acceleratorsItem.setName(_ctx.stringValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].Name"));
			acceleratorsItem.setBasicEndpointGroupId(_ctx.stringValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].BasicEndpointGroupId"));
			acceleratorsItem.setBasicIpSetId(_ctx.stringValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].BasicIpSetId"));
			acceleratorsItem.setBandwidthBillingType(_ctx.stringValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].BandwidthBillingType"));

			BasicBandwidthPackage basicBandwidthPackage = new BasicBandwidthPackage();
			basicBandwidthPackage.setBandwidth(_ctx.integerValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].BasicBandwidthPackage.Bandwidth"));
			basicBandwidthPackage.setBandwidthType(_ctx.stringValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].BasicBandwidthPackage.BandwidthType"));
			basicBandwidthPackage.setInstanceId(_ctx.stringValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].BasicBandwidthPackage.InstanceId"));
			acceleratorsItem.setBasicBandwidthPackage(basicBandwidthPackage);

			CrossDomainBandwidthPackage crossDomainBandwidthPackage = new CrossDomainBandwidthPackage();
			crossDomainBandwidthPackage.setBandwidth(_ctx.integerValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].CrossDomainBandwidthPackage.Bandwidth"));
			crossDomainBandwidthPackage.setInstanceId(_ctx.stringValue("ListBasicAcceleratorsResponse.Accelerators["+ i +"].CrossDomainBandwidthPackage.InstanceId"));
			acceleratorsItem.setCrossDomainBandwidthPackage(crossDomainBandwidthPackage);

			accelerators.add(acceleratorsItem);
		}
		listBasicAcceleratorsResponse.setAccelerators(accelerators);
	 
	 	return listBasicAcceleratorsResponse;
	}
}