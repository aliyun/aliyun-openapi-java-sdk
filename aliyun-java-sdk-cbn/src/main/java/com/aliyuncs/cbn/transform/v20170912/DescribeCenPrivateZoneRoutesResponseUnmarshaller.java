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

import com.aliyuncs.cbn.model.v20170912.DescribeCenPrivateZoneRoutesResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeCenPrivateZoneRoutesResponse.PrivateZoneInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenPrivateZoneRoutesResponseUnmarshaller {

	public static DescribeCenPrivateZoneRoutesResponse unmarshall(DescribeCenPrivateZoneRoutesResponse describeCenPrivateZoneRoutesResponse, UnmarshallerContext context) {
		
		describeCenPrivateZoneRoutesResponse.setRequestId(context.stringValue("DescribeCenPrivateZoneRoutesResponse.RequestId"));
		describeCenPrivateZoneRoutesResponse.setCenId(context.stringValue("DescribeCenPrivateZoneRoutesResponse.CenId"));
		describeCenPrivateZoneRoutesResponse.setPrivateZoneDnsServers(context.stringValue("DescribeCenPrivateZoneRoutesResponse.PrivateZoneDnsServers"));
		describeCenPrivateZoneRoutesResponse.setPageNumber(context.integerValue("DescribeCenPrivateZoneRoutesResponse.PageNumber"));
		describeCenPrivateZoneRoutesResponse.setTotalCount(context.integerValue("DescribeCenPrivateZoneRoutesResponse.TotalCount"));
		describeCenPrivateZoneRoutesResponse.setPageSize(context.integerValue("DescribeCenPrivateZoneRoutesResponse.PageSize"));

		List<PrivateZoneInfo> privateZoneInfos = new ArrayList<PrivateZoneInfo>();
		for (int i = 0; i < context.lengthValue("DescribeCenPrivateZoneRoutesResponse.PrivateZoneInfos.Length"); i++) {
			PrivateZoneInfo privateZoneInfo = new PrivateZoneInfo();
			privateZoneInfo.setAccessRegionId(context.stringValue("DescribeCenPrivateZoneRoutesResponse.PrivateZoneInfos["+ i +"].AccessRegionId"));
			privateZoneInfo.setHostRegionId(context.stringValue("DescribeCenPrivateZoneRoutesResponse.PrivateZoneInfos["+ i +"].HostRegionId"));
			privateZoneInfo.setHostVpcId(context.stringValue("DescribeCenPrivateZoneRoutesResponse.PrivateZoneInfos["+ i +"].HostVpcId"));
			privateZoneInfo.setStatus(context.stringValue("DescribeCenPrivateZoneRoutesResponse.PrivateZoneInfos["+ i +"].Status"));

			privateZoneInfos.add(privateZoneInfo);
		}
		describeCenPrivateZoneRoutesResponse.setPrivateZoneInfos(privateZoneInfos);
	 
	 	return describeCenPrivateZoneRoutesResponse;
	}
}