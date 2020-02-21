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

import com.aliyuncs.ga.model.v20191120.ListBandwidthackagesResponse;
import com.aliyuncs.ga.model.v20191120.ListBandwidthackagesResponse.BandwidthPackage;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBandwidthackagesResponseUnmarshaller {

	public static ListBandwidthackagesResponse unmarshall(ListBandwidthackagesResponse listBandwidthackagesResponse, UnmarshallerContext _ctx) {
		
		listBandwidthackagesResponse.setRequestId(_ctx.stringValue("ListBandwidthackagesResponse.RequestId"));
		listBandwidthackagesResponse.setTotalCount(_ctx.integerValue("ListBandwidthackagesResponse.TotalCount"));
		listBandwidthackagesResponse.setPageNumber(_ctx.integerValue("ListBandwidthackagesResponse.PageNumber"));
		listBandwidthackagesResponse.setPageSize(_ctx.integerValue("ListBandwidthackagesResponse.PageSize"));

		List<BandwidthPackage> bandwidthPackages = new ArrayList<BandwidthPackage>();
		for (int i = 0; i < _ctx.lengthValue("ListBandwidthackagesResponse.BandwidthPackages.Length"); i++) {
			BandwidthPackage bandwidthPackage = new BandwidthPackage();
			bandwidthPackage.setBandwidthPackageId(_ctx.stringValue("ListBandwidthackagesResponse.BandwidthPackages["+ i +"].BandwidthPackageId"));
			bandwidthPackage.setName(_ctx.stringValue("ListBandwidthackagesResponse.BandwidthPackages["+ i +"].Name"));
			bandwidthPackage.setDescription(_ctx.stringValue("ListBandwidthackagesResponse.BandwidthPackages["+ i +"].Description"));
			bandwidthPackage.setState(_ctx.stringValue("ListBandwidthackagesResponse.BandwidthPackages["+ i +"].State"));
			bandwidthPackage.setBandwidth(_ctx.integerValue("ListBandwidthackagesResponse.BandwidthPackages["+ i +"].Bandwidth"));
			bandwidthPackage.setChargeType(_ctx.stringValue("ListBandwidthackagesResponse.BandwidthPackages["+ i +"].ChargeType"));
			bandwidthPackage.setExpiredTime(_ctx.stringValue("ListBandwidthackagesResponse.BandwidthPackages["+ i +"].ExpiredTime"));
			bandwidthPackage.setCreateTime(_ctx.stringValue("ListBandwidthackagesResponse.BandwidthPackages["+ i +"].CreateTime"));
			bandwidthPackage.setRegionId(_ctx.stringValue("ListBandwidthackagesResponse.BandwidthPackages["+ i +"].RegionId"));

			List<String> accelerators = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListBandwidthackagesResponse.BandwidthPackages["+ i +"].Accelerators.Length"); j++) {
				accelerators.add(_ctx.stringValue("ListBandwidthackagesResponse.BandwidthPackages["+ i +"].Accelerators["+ j +"]"));
			}
			bandwidthPackage.setAccelerators(accelerators);

			bandwidthPackages.add(bandwidthPackage);
		}
		listBandwidthackagesResponse.setBandwidthPackages(bandwidthPackages);
	 
	 	return listBandwidthackagesResponse;
	}
}