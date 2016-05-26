/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeBandwidthPackagesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeBandwidthPackagesResponse.BandwidthPackage;
import com.aliyuncs.ecs.model.v20140526.DescribeBandwidthPackagesResponse.BandwidthPackage.PublicIpAddresse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBandwidthPackagesResponseUnmarshaller {

	public static DescribeBandwidthPackagesResponse unmarshall(DescribeBandwidthPackagesResponse describeBandwidthPackagesResponse, UnmarshallerContext context) {
		
		describeBandwidthPackagesResponse.setRequestId(context.stringValue("DescribeBandwidthPackagesResponse.RequestId"));
		describeBandwidthPackagesResponse.setTotalCount(context.integerValue("DescribeBandwidthPackagesResponse.TotalCount"));
		describeBandwidthPackagesResponse.setPageNumber(context.integerValue("DescribeBandwidthPackagesResponse.PageNumber"));
		describeBandwidthPackagesResponse.setPageSize(context.integerValue("DescribeBandwidthPackagesResponse.PageSize"));

		List<BandwidthPackage> bandwidthPackages = new ArrayList<BandwidthPackage>();
		for (int i = 0; i < context.lengthValue("DescribeBandwidthPackagesResponse.BandwidthPackages.Length"); i++) {
			BandwidthPackage bandwidthPackage = new BandwidthPackage();
			bandwidthPackage.setBandwidthPackageId(context.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].BandwidthPackageId"));
			bandwidthPackage.setRegionId(context.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].RegionId"));
			bandwidthPackage.setName(context.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].Name"));
			bandwidthPackage.setDescription(context.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].Description"));
			bandwidthPackage.setZoneId(context.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].ZoneId"));
			bandwidthPackage.setNatGatewayId(context.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].NatGatewayId"));
			bandwidthPackage.setBandwidth(context.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].Bandwidth"));
			bandwidthPackage.setInstanceChargeType(context.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].InstanceChargeType"));
			bandwidthPackage.setInternetChargeType(context.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].InternetChargeType"));
			bandwidthPackage.setBusinessStatus(context.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].BusinessStatus"));
			bandwidthPackage.setIpCount(context.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].IpCount"));
			bandwidthPackage.setCreationTime(context.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].CreationTime"));
			bandwidthPackage.setStatus(context.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].Status"));

			List<PublicIpAddresse> publicIpAddresses = new ArrayList<PublicIpAddresse>();
			for (int j = 0; j < context.lengthValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].PublicIpAddresses.Length"); j++) {
				PublicIpAddresse publicIpAddresse = new PublicIpAddresse();
				publicIpAddresse.setAllocationId(context.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].PublicIpAddresses["+ j +"].AllocationId"));
				publicIpAddresse.setIpAddress(context.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].PublicIpAddresses["+ j +"].IpAddress"));

				publicIpAddresses.add(publicIpAddresse);
			}
			bandwidthPackage.setPublicIpAddresses(publicIpAddresses);

			bandwidthPackages.add(bandwidthPackage);
		}
		describeBandwidthPackagesResponse.setBandwidthPackages(bandwidthPackages);
	 
	 	return describeBandwidthPackagesResponse;
	}
}