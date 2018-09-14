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

import com.aliyuncs.cbn.model.v20170912.DescribeCenRegionDomainRouteEntriesResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntry;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenRegionDomainRouteEntriesResponseUnmarshaller {

	public static DescribeCenRegionDomainRouteEntriesResponse unmarshall(DescribeCenRegionDomainRouteEntriesResponse describeCenRegionDomainRouteEntriesResponse, UnmarshallerContext context) {
		
		describeCenRegionDomainRouteEntriesResponse.setRequestId(context.stringValue("DescribeCenRegionDomainRouteEntriesResponse.RequestId"));
		describeCenRegionDomainRouteEntriesResponse.setPageNumber(context.integerValue("DescribeCenRegionDomainRouteEntriesResponse.PageNumber"));
		describeCenRegionDomainRouteEntriesResponse.setTotalCount(context.integerValue("DescribeCenRegionDomainRouteEntriesResponse.TotalCount"));
		describeCenRegionDomainRouteEntriesResponse.setPageSize(context.integerValue("DescribeCenRegionDomainRouteEntriesResponse.PageSize"));

		List<CenRouteEntry> cenRouteEntries = new ArrayList<CenRouteEntry>();
		for (int i = 0; i < context.lengthValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries.Length"); i++) {
			CenRouteEntry cenRouteEntry = new CenRouteEntry();
			cenRouteEntry.setDestinationCidrBlock(context.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].DestinationCidrBlock"));
			cenRouteEntry.setType(context.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].Type"));
			cenRouteEntry.setNextHopInstanceId(context.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].NextHopInstanceId"));
			cenRouteEntry.setNextHopType(context.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].NextHopType"));
			cenRouteEntry.setNextHopRegionId(context.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].NextHopRegionId"));

			cenRouteEntries.add(cenRouteEntry);
		}
		describeCenRegionDomainRouteEntriesResponse.setCenRouteEntries(cenRouteEntries);
	 
	 	return describeCenRegionDomainRouteEntriesResponse;
	}
}