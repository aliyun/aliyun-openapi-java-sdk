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

import com.aliyuncs.ga.model.v20191120.ListBandwidthPackagesResponse;
import com.aliyuncs.ga.model.v20191120.ListBandwidthPackagesResponse.BandwidthPackage;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBandwidthPackagesResponseUnmarshaller {

	public static ListBandwidthPackagesResponse unmarshall(ListBandwidthPackagesResponse listBandwidthPackagesResponse, UnmarshallerContext _ctx) {
		
		listBandwidthPackagesResponse.setRequestId(_ctx.stringValue("ListBandwidthPackagesResponse.RequestId"));
		listBandwidthPackagesResponse.setTotalCount(_ctx.integerValue("ListBandwidthPackagesResponse.TotalCount"));
		listBandwidthPackagesResponse.setPageSize(_ctx.integerValue("ListBandwidthPackagesResponse.PageSize"));
		listBandwidthPackagesResponse.setPageNumber(_ctx.integerValue("ListBandwidthPackagesResponse.PageNumber"));

		List<BandwidthPackage> bandwidthPackages = new ArrayList<BandwidthPackage>();
		for (int i = 0; i < _ctx.lengthValue("ListBandwidthPackagesResponse.BandwidthPackages.Length"); i++) {
			BandwidthPackage bandwidthPackage = new BandwidthPackage();
			bandwidthPackage.setType(_ctx.stringValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].Type"));
			bandwidthPackage.setBandwidthType(_ctx.stringValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].BandwidthType"));
			bandwidthPackage.setState(_ctx.stringValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].State"));
			bandwidthPackage.setCreateTime(_ctx.stringValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].CreateTime"));
			bandwidthPackage.setChargeType(_ctx.stringValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].ChargeType"));
			bandwidthPackage.setRegionId(_ctx.stringValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].RegionId"));
			bandwidthPackage.setCbnGeographicRegionIdA(_ctx.stringValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].CbnGeographicRegionIdA"));
			bandwidthPackage.setBandwidthPackageId(_ctx.stringValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].BandwidthPackageId"));
			bandwidthPackage.setBandwidth(_ctx.integerValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].Bandwidth"));
			bandwidthPackage.setDescription(_ctx.stringValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].Description"));
			bandwidthPackage.setExpiredTime(_ctx.stringValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].ExpiredTime"));
			bandwidthPackage.setCbnGeographicRegionIdB(_ctx.stringValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].CbnGeographicRegionIdB"));
			bandwidthPackage.setName(_ctx.stringValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].Name"));
			bandwidthPackage.setBillingType(_ctx.stringValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].BillingType"));
			bandwidthPackage.setRatio(_ctx.integerValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].Ratio"));

			List<String> accelerators = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].Accelerators.Length"); j++) {
				accelerators.add(_ctx.stringValue("ListBandwidthPackagesResponse.BandwidthPackages["+ i +"].Accelerators["+ j +"]"));
			}
			bandwidthPackage.setAccelerators(accelerators);

			bandwidthPackages.add(bandwidthPackage);
		}
		listBandwidthPackagesResponse.setBandwidthPackages(bandwidthPackages);
	 
	 	return listBandwidthPackagesResponse;
	}
}