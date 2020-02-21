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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAcceleratorsResponseUnmarshaller {

	public static ListAcceleratorsResponse unmarshall(ListAcceleratorsResponse listAcceleratorsResponse, UnmarshallerContext _ctx) {
		
		listAcceleratorsResponse.setRequestId(_ctx.stringValue("ListAcceleratorsResponse.RequestId"));
		listAcceleratorsResponse.setTotalCount(_ctx.integerValue("ListAcceleratorsResponse.TotalCount"));
		listAcceleratorsResponse.setPageNumber(_ctx.integerValue("ListAcceleratorsResponse.PageNumber"));
		listAcceleratorsResponse.setPageSize(_ctx.integerValue("ListAcceleratorsResponse.PageSize"));

		List<AcceleratorsItem> accelerators = new ArrayList<AcceleratorsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAcceleratorsResponse.Accelerators.Length"); i++) {
			AcceleratorsItem acceleratorsItem = new AcceleratorsItem();
			acceleratorsItem.setAcceleratorId(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].AcceleratorId"));
			acceleratorsItem.setName(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].Name"));
			acceleratorsItem.setDescription(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].Description"));
			acceleratorsItem.setBandwidth(_ctx.integerValue("ListAcceleratorsResponse.Accelerators["+ i +"].Bandwidth"));
			acceleratorsItem.setType(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].Type"));
			acceleratorsItem.setInstanceChargeType(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].InstanceChargeType"));
			acceleratorsItem.setExpiredTime(_ctx.longValue("ListAcceleratorsResponse.Accelerators["+ i +"].ExpiredTime"));
			acceleratorsItem.setCenId(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].CenId"));
			acceleratorsItem.setState(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].State"));
			acceleratorsItem.setDnsName(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].DnsName"));
			acceleratorsItem.setCreateTime(_ctx.longValue("ListAcceleratorsResponse.Accelerators["+ i +"].CreateTime"));
			acceleratorsItem.setRegionId(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].RegionId"));
			acceleratorsItem.setSpec(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].Spec"));

			BasicBandwidthPackage basicBandwidthPackage = new BasicBandwidthPackage();
			basicBandwidthPackage.setInstanceId(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].BasicBandwidthPackage.InstanceId"));
			basicBandwidthPackage.setBandwidth(_ctx.integerValue("ListAcceleratorsResponse.Accelerators["+ i +"].BasicBandwidthPackage.Bandwidth"));
			basicBandwidthPackage.setBandwidthType(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].BasicBandwidthPackage.BandwidthType"));
			acceleratorsItem.setBasicBandwidthPackage(basicBandwidthPackage);

			CrossDomainBandwidthPackage crossDomainBandwidthPackage = new CrossDomainBandwidthPackage();
			crossDomainBandwidthPackage.setInstanceId(_ctx.stringValue("ListAcceleratorsResponse.Accelerators["+ i +"].CrossDomainBandwidthPackage.InstanceId"));
			crossDomainBandwidthPackage.setBandwidth(_ctx.integerValue("ListAcceleratorsResponse.Accelerators["+ i +"].CrossDomainBandwidthPackage.Bandwidth"));
			acceleratorsItem.setCrossDomainBandwidthPackage(crossDomainBandwidthPackage);

			accelerators.add(acceleratorsItem);
		}
		listAcceleratorsResponse.setAccelerators(accelerators);
	 
	 	return listAcceleratorsResponse;
	}
}