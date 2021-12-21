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
import com.aliyuncs.cbn.model.v20170912.DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntry.CenOutRouteMapRecord;
import com.aliyuncs.cbn.model.v20170912.DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntry.CenRouteMapRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenRegionDomainRouteEntriesResponseUnmarshaller {

	public static DescribeCenRegionDomainRouteEntriesResponse unmarshall(DescribeCenRegionDomainRouteEntriesResponse describeCenRegionDomainRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		describeCenRegionDomainRouteEntriesResponse.setRequestId(_ctx.stringValue("DescribeCenRegionDomainRouteEntriesResponse.RequestId"));
		describeCenRegionDomainRouteEntriesResponse.setPageSize(_ctx.integerValue("DescribeCenRegionDomainRouteEntriesResponse.PageSize"));
		describeCenRegionDomainRouteEntriesResponse.setPageNumber(_ctx.integerValue("DescribeCenRegionDomainRouteEntriesResponse.PageNumber"));
		describeCenRegionDomainRouteEntriesResponse.setTotalCount(_ctx.integerValue("DescribeCenRegionDomainRouteEntriesResponse.TotalCount"));

		List<CenRouteEntry> cenRouteEntries = new ArrayList<CenRouteEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries.Length"); i++) {
			CenRouteEntry cenRouteEntry = new CenRouteEntry();
			cenRouteEntry.setToOtherRegionStatus(_ctx.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].ToOtherRegionStatus"));
			cenRouteEntry.setType(_ctx.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].Type"));
			cenRouteEntry.setStatus(_ctx.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].Status"));
			cenRouteEntry.setNextHopType(_ctx.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].NextHopType"));
			cenRouteEntry.setNextHopInstanceId(_ctx.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].NextHopInstanceId"));
			cenRouteEntry.setNextHopRegionId(_ctx.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].NextHopRegionId"));
			cenRouteEntry.setDestinationCidrBlock(_ctx.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].DestinationCidrBlock"));
			cenRouteEntry.setPreference(_ctx.integerValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].Preference"));

			List<String> communities = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].Communities.Length"); j++) {
				communities.add(_ctx.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].Communities["+ j +"]"));
			}
			cenRouteEntry.setCommunities(communities);

			List<String> asPaths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].AsPaths.Length"); j++) {
				asPaths.add(_ctx.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].AsPaths["+ j +"]"));
			}
			cenRouteEntry.setAsPaths(asPaths);

			List<CenRouteMapRecord> cenRouteMapRecords = new ArrayList<CenRouteMapRecord>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].CenRouteMapRecords.Length"); j++) {
				CenRouteMapRecord cenRouteMapRecord = new CenRouteMapRecord();
				cenRouteMapRecord.setRouteMapId(_ctx.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].CenRouteMapRecords["+ j +"].RouteMapId"));
				cenRouteMapRecord.setRegionId(_ctx.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].CenRouteMapRecords["+ j +"].RegionId"));

				cenRouteMapRecords.add(cenRouteMapRecord);
			}
			cenRouteEntry.setCenRouteMapRecords(cenRouteMapRecords);

			List<CenOutRouteMapRecord> cenOutRouteMapRecords = new ArrayList<CenOutRouteMapRecord>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].CenOutRouteMapRecords.Length"); j++) {
				CenOutRouteMapRecord cenOutRouteMapRecord = new CenOutRouteMapRecord();
				cenOutRouteMapRecord.setRouteMapId(_ctx.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].CenOutRouteMapRecords["+ j +"].RouteMapId"));
				cenOutRouteMapRecord.setRegionId(_ctx.stringValue("DescribeCenRegionDomainRouteEntriesResponse.CenRouteEntries["+ i +"].CenOutRouteMapRecords["+ j +"].RegionId"));

				cenOutRouteMapRecords.add(cenOutRouteMapRecord);
			}
			cenRouteEntry.setCenOutRouteMapRecords(cenOutRouteMapRecords);

			cenRouteEntries.add(cenRouteEntry);
		}
		describeCenRegionDomainRouteEntriesResponse.setCenRouteEntries(cenRouteEntries);
	 
	 	return describeCenRegionDomainRouteEntriesResponse;
	}
}