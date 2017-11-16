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
package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeCommonBandwidthPackagesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackage;
import com.aliyuncs.vpc.model.v20160428.DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackage.PublicIpAddresse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCommonBandwidthPackagesResponseUnmarshaller {

	public static DescribeCommonBandwidthPackagesResponse unmarshall(DescribeCommonBandwidthPackagesResponse describeCommonBandwidthPackagesResponse, UnmarshallerContext context) {
		
		describeCommonBandwidthPackagesResponse.setRequestId(context.stringValue("DescribeCommonBandwidthPackagesResponse.RequestId"));
		describeCommonBandwidthPackagesResponse.setTotalCount(context.integerValue("DescribeCommonBandwidthPackagesResponse.TotalCount"));
		describeCommonBandwidthPackagesResponse.setPageNumber(context.integerValue("DescribeCommonBandwidthPackagesResponse.PageNumber"));
		describeCommonBandwidthPackagesResponse.setPageSize(context.integerValue("DescribeCommonBandwidthPackagesResponse.PageSize"));

		List<CommonBandwidthPackage> commonBandwidthPackages = new ArrayList<CommonBandwidthPackage>();
		for (int i = 0; i < context.lengthValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages.Length"); i++) {
			CommonBandwidthPackage commonBandwidthPackage = new CommonBandwidthPackage();
			commonBandwidthPackage.setBandwidthPackageId(context.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].BandwidthPackageId"));
			commonBandwidthPackage.setRegionId(context.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].RegionId"));
			commonBandwidthPackage.setName(context.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].Name"));
			commonBandwidthPackage.setDescription(context.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].Description"));
			commonBandwidthPackage.setBandwidth(context.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].Bandwidth"));
			commonBandwidthPackage.setInstanceChargeType(context.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].InstanceChargeType"));
			commonBandwidthPackage.setInternetChargeType(context.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].InternetChargeType"));
			commonBandwidthPackage.setBusinessStatus(context.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].BusinessStatus"));
			commonBandwidthPackage.setCreationTime(context.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].CreationTime"));
			commonBandwidthPackage.setExpiredTime(context.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].ExpiredTime"));
			commonBandwidthPackage.setStatus(context.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].Status"));
			commonBandwidthPackage.setRatio(context.integerValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].Ratio"));

			List<PublicIpAddresse> publicIpAddresses = new ArrayList<PublicIpAddresse>();
			for (int j = 0; j < context.lengthValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].PublicIpAddresses.Length"); j++) {
				PublicIpAddresse publicIpAddresse = new PublicIpAddresse();
				publicIpAddresse.setAllocationId(context.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].PublicIpAddresses["+ j +"].AllocationId"));
				publicIpAddresse.setIpAddress(context.stringValue("DescribeCommonBandwidthPackagesResponse.CommonBandwidthPackages["+ i +"].PublicIpAddresses["+ j +"].IpAddress"));

				publicIpAddresses.add(publicIpAddresse);
			}
			commonBandwidthPackage.setPublicIpAddresses(publicIpAddresses);

			commonBandwidthPackages.add(commonBandwidthPackage);
		}
		describeCommonBandwidthPackagesResponse.setCommonBandwidthPackages(commonBandwidthPackages);
	 
	 	return describeCommonBandwidthPackagesResponse;
	}
}