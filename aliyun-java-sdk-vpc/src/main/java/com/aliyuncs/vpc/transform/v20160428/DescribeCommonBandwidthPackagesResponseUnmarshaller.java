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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeCommonBandwidthPackagesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackage;
import com.aliyuncs.vpc.model.v20160428.DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackage.PublicIpAddresse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCommonBandwidthPackagesResponseUnmarshaller {

	public static DescribeCommonBandwidthPackagesResponse unmarshall(DescribeCommonBandwidthPackagesResponse describeCommonBandwidthPackagesResponse, UnmarshallerContext _ctx) {
		
		describeCommonBandwidthPackagesResponse.setRequestId(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.RequestId"));
		describeCommonBandwidthPackagesResponse.setTotalCount(_ctx.integerValue("DescribeCommonBandwidthPackagesResponse.TotalCount"));
		describeCommonBandwidthPackagesResponse.setPageNumber(_ctx.integerValue("DescribeCommonBandwidthPackagesResponse.PageNumber"));
		describeCommonBandwidthPackagesResponse.setPageSize(_ctx.integerValue("DescribeCommonBandwidthPackagesResponse.PageSize"));

		List<CommonBandwidthPackage> commonBandwidthPackages = new ArrayList<CommonBandwidthPackage>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages.Length"); i++) {
			CommonBandwidthPackage commonBandwidthPackage = new CommonBandwidthPackage();
			commonBandwidthPackage.setBandwidthPackageId(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].BandwidthPackageId"));
			commonBandwidthPackage.setRegionId(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].RegionId"));
			commonBandwidthPackage.setName(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].Name"));
			commonBandwidthPackage.setDescription(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].Description"));
			commonBandwidthPackage.setBandwidth(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].Bandwidth"));
			commonBandwidthPackage.setInstanceChargeType(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].InstanceChargeType"));
			commonBandwidthPackage.setInternetChargeType(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].InternetChargeType"));
			commonBandwidthPackage.setBusinessStatus(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].BusinessStatus"));
			commonBandwidthPackage.setCreationTime(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].CreationTime"));
			commonBandwidthPackage.setExpiredTime(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].ExpiredTime"));
			commonBandwidthPackage.setStatus(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].Status"));
			commonBandwidthPackage.setRatio(_ctx.integerValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].Ratio"));
			commonBandwidthPackage.setResourceGroupId(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].ResourceGroupId"));
			commonBandwidthPackage.setHasReservationData(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].HasReservationData"));
			commonBandwidthPackage.setReservationBandwidth(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].ReservationBandwidth"));
			commonBandwidthPackage.setReservationInternetChargeType(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].ReservationInternetChargeType"));
			commonBandwidthPackage.setReservationActiveTime(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].ReservationActiveTime"));
			commonBandwidthPackage.setReservationOrderType(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].ReservationOrderType"));
			commonBandwidthPackage.setISP(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].ISP"));
			commonBandwidthPackage.setDeletionProtection(_ctx.booleanValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].DeletionProtection"));

			List<PublicIpAddresse> publicIpAddresses = new ArrayList<PublicIpAddresse>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].PublicIpAddresses.Length"); j++) {
				PublicIpAddresse publicIpAddresse = new PublicIpAddresse();
				publicIpAddresse.setAllocationId(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].PublicIpAddresses["+ j +"].AllocationId"));
				publicIpAddresse.setIpAddress(_ctx.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].PublicIpAddresses["+ j +"].IpAddress"));

				publicIpAddresses.add(publicIpAddresse);
			}
			commonBandwidthPackage.setPublicIpAddresses(publicIpAddresses);

			commonBandwidthPackages.add(commonBandwidthPackage);
		}
		describeCommonBandwidthPackagesResponse.setCommonBandwidthPackages(commonBandwidthPackages);
	 
	 	return describeCommonBandwidthPackagesResponse;
	}
}