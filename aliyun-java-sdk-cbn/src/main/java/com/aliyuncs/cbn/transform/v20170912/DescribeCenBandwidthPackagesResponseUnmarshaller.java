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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.DescribeCenBandwidthPackagesResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeCenBandwidthPackagesResponse.CenBandwidthPackage;
import com.aliyuncs.cbn.model.v20170912.DescribeCenBandwidthPackagesResponse.CenBandwidthPackage.OrginInterRegionBandwidthLimit;
import com.aliyuncs.cbn.model.v20170912.DescribeCenBandwidthPackagesResponse.CenBandwidthPackage.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenBandwidthPackagesResponseUnmarshaller {

	public static DescribeCenBandwidthPackagesResponse unmarshall(DescribeCenBandwidthPackagesResponse describeCenBandwidthPackagesResponse, UnmarshallerContext _ctx) {
		
		describeCenBandwidthPackagesResponse.setRequestId(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.RequestId"));
		describeCenBandwidthPackagesResponse.setPageSize(_ctx.integerValue("DescribeCenBandwidthPackagesResponse.PageSize"));
		describeCenBandwidthPackagesResponse.setPageNumber(_ctx.integerValue("DescribeCenBandwidthPackagesResponse.PageNumber"));
		describeCenBandwidthPackagesResponse.setTotalCount(_ctx.integerValue("DescribeCenBandwidthPackagesResponse.TotalCount"));

		List<CenBandwidthPackage> cenBandwidthPackages = new ArrayList<CenBandwidthPackage>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages.Length"); i++) {
			CenBandwidthPackage cenBandwidthPackage = new CenBandwidthPackage();
			cenBandwidthPackage.setReservationActiveTime(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].ReservationActiveTime"));
			cenBandwidthPackage.setStatus(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].Status"));
			cenBandwidthPackage.setCreationTime(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].CreationTime"));
			cenBandwidthPackage.setReservationOrderType(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].ReservationOrderType"));
			cenBandwidthPackage.setBandwidthPackageChargeType(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].BandwidthPackageChargeType"));
			cenBandwidthPackage.setCenBandwidthPackageId(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].CenBandwidthPackageId"));
			cenBandwidthPackage.setReservationInternetChargeType(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].ReservationInternetChargeType"));
			cenBandwidthPackage.setRatio(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].Ratio"));
			cenBandwidthPackage.setGeographicRegionAId(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].GeographicRegionAId"));
			cenBandwidthPackage.setTypeFor95(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].TypeFor95"));
			cenBandwidthPackage.setBandwidth(_ctx.longValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].Bandwidth"));
			cenBandwidthPackage.setDescription(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].Description"));
			cenBandwidthPackage.setExpiredTime(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].ExpiredTime"));
			cenBandwidthPackage.setReservationBandwidth(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].ReservationBandwidth"));
			cenBandwidthPackage.setGeographicSpanId(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].GeographicSpanId"));
			cenBandwidthPackage.setGeographicRegionBId(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].GeographicRegionBId"));
			cenBandwidthPackage.setResourceGroupId(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].ResourceGroupId"));
			cenBandwidthPackage.setIsCrossBorder(_ctx.booleanValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].IsCrossBorder"));
			cenBandwidthPackage.setBusinessStatus(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].BusinessStatus"));
			cenBandwidthPackage.setName(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].Name"));
			cenBandwidthPackage.setHasReservationData(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].HasReservationData"));

			List<String> cenIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].CenIds.Length"); j++) {
				cenIds.add(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].CenIds["+ j +"]"));
			}
			cenBandwidthPackage.setCenIds(cenIds);

			List<OrginInterRegionBandwidthLimit> orginInterRegionBandwidthLimits = new ArrayList<OrginInterRegionBandwidthLimit>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].OrginInterRegionBandwidthLimits.Length"); j++) {
				OrginInterRegionBandwidthLimit orginInterRegionBandwidthLimit = new OrginInterRegionBandwidthLimit();
				orginInterRegionBandwidthLimit.setBandwidthLimit(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].OrginInterRegionBandwidthLimits["+ j +"].BandwidthLimit"));
				orginInterRegionBandwidthLimit.setOppositeRegionId(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].OrginInterRegionBandwidthLimits["+ j +"].OppositeRegionId"));
				orginInterRegionBandwidthLimit.setGeographicSpanId(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].OrginInterRegionBandwidthLimits["+ j +"].GeographicSpanId"));
				orginInterRegionBandwidthLimit.setLocalRegionId(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].OrginInterRegionBandwidthLimits["+ j +"].LocalRegionId"));

				orginInterRegionBandwidthLimits.add(orginInterRegionBandwidthLimit);
			}
			cenBandwidthPackage.setOrginInterRegionBandwidthLimits(orginInterRegionBandwidthLimits);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			cenBandwidthPackage.setTags(tags);

			cenBandwidthPackages.add(cenBandwidthPackage);
		}
		describeCenBandwidthPackagesResponse.setCenBandwidthPackages(cenBandwidthPackages);
	 
	 	return describeCenBandwidthPackagesResponse;
	}
}