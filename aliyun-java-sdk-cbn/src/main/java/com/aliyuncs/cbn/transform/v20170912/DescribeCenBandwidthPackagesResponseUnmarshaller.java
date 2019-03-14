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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenBandwidthPackagesResponseUnmarshaller {

	public static DescribeCenBandwidthPackagesResponse unmarshall(DescribeCenBandwidthPackagesResponse describeCenBandwidthPackagesResponse, UnmarshallerContext context) {
		
		describeCenBandwidthPackagesResponse.setRequestId(context.stringValue("DescribeCenBandwidthPackagesResponse.RequestId"));
		describeCenBandwidthPackagesResponse.setTotalCount(context.integerValue("DescribeCenBandwidthPackagesResponse.TotalCount"));
		describeCenBandwidthPackagesResponse.setPageNumber(context.integerValue("DescribeCenBandwidthPackagesResponse.PageNumber"));
		describeCenBandwidthPackagesResponse.setPageSize(context.integerValue("DescribeCenBandwidthPackagesResponse.PageSize"));

		List<CenBandwidthPackage> cenBandwidthPackages = new ArrayList<CenBandwidthPackage>();
		for (int i = 0; i < context.lengthValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages.Length"); i++) {
			CenBandwidthPackage cenBandwidthPackage = new CenBandwidthPackage();
			cenBandwidthPackage.setCenBandwidthPackageId(context.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].CenBandwidthPackageId"));
			cenBandwidthPackage.setName(context.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].Name"));
			cenBandwidthPackage.setDescription(context.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].Description"));
			cenBandwidthPackage.setBandwidth(context.longValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].Bandwidth"));
			cenBandwidthPackage.setBandwidthPackageChargeType(context.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].BandwidthPackageChargeType"));
			cenBandwidthPackage.setGeographicRegionAId(context.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].GeographicRegionAId"));
			cenBandwidthPackage.setGeographicRegionBId(context.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].GeographicRegionBId"));
			cenBandwidthPackage.setGeographicSpanId(context.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].GeographicSpanId"));
			cenBandwidthPackage.setBusinessStatus(context.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].BusinessStatus"));
			cenBandwidthPackage.setCreationTime(context.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].CreationTime"));
			cenBandwidthPackage.setExpiredTime(context.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].ExpiredTime"));
			cenBandwidthPackage.setStatus(context.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].Status"));
			cenBandwidthPackage.setIsCrossBorder(context.booleanValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].IsCrossBorder"));

			List<String> cenIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].CenIds.Length"); j++) {
				cenIds.add(context.stringValue("DescribeCenBandwidthPackagesResponse.CenBandwidthPackages["+ i +"].CenIds["+ j +"]"));
			}
			cenBandwidthPackage.setCenIds(cenIds);

			cenBandwidthPackages.add(cenBandwidthPackage);
		}
		describeCenBandwidthPackagesResponse.setCenBandwidthPackages(cenBandwidthPackages);
	 
	 	return describeCenBandwidthPackagesResponse;
	}
}