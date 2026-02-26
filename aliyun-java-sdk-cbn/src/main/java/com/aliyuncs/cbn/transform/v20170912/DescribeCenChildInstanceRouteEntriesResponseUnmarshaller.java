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

import com.aliyuncs.cbn.model.v20170912.DescribeCenChildInstanceRouteEntriesResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntry;
import com.aliyuncs.cbn.model.v20170912.DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntry.CenRouteMapRecord;
import com.aliyuncs.cbn.model.v20170912.DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntry.Conflict;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenChildInstanceRouteEntriesResponseUnmarshaller {

	public static DescribeCenChildInstanceRouteEntriesResponse unmarshall(DescribeCenChildInstanceRouteEntriesResponse describeCenChildInstanceRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		describeCenChildInstanceRouteEntriesResponse.setRequestId(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.RequestId"));
		describeCenChildInstanceRouteEntriesResponse.setPageSize(_ctx.integerValue("DescribeCenChildInstanceRouteEntriesResponse.PageSize"));
		describeCenChildInstanceRouteEntriesResponse.setPageNumber(_ctx.integerValue("DescribeCenChildInstanceRouteEntriesResponse.PageNumber"));
		describeCenChildInstanceRouteEntriesResponse.setTotalCount(_ctx.integerValue("DescribeCenChildInstanceRouteEntriesResponse.TotalCount"));

		List<CenRouteEntry> cenRouteEntries = new ArrayList<CenRouteEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries.Length"); i++) {
			CenRouteEntry cenRouteEntry = new CenRouteEntry();
			cenRouteEntry.setStatus(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].Status"));
			cenRouteEntry.setType(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].Type"));
			cenRouteEntry.setPublishStatus(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].PublishStatus"));
			cenRouteEntry.setNextHopType(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].NextHopType"));
			cenRouteEntry.setOperationalMode(_ctx.booleanValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].OperationalMode"));
			cenRouteEntry.setNextHopRegionId(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].NextHopRegionId"));
			cenRouteEntry.setNextHopInstanceId(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].NextHopInstanceId"));
			cenRouteEntry.setDestinationCidrBlock(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].DestinationCidrBlock"));
			cenRouteEntry.setRouteTableId(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].RouteTableId"));
			cenRouteEntry.setMed(_ctx.longValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].Med"));
			cenRouteEntry.setVpnTunnelIp(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].VpnTunnelIp"));
			cenRouteEntry.setVpnTunnelId(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].VpnTunnelId"));

			List<String> communities = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].Communities.Length"); j++) {
				communities.add(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].Communities["+ j +"]"));
			}
			cenRouteEntry.setCommunities(communities);

			List<String> asPaths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].AsPaths.Length"); j++) {
				asPaths.add(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].AsPaths["+ j +"]"));
			}
			cenRouteEntry.setAsPaths(asPaths);

			List<CenRouteMapRecord> cenRouteMapRecords = new ArrayList<CenRouteMapRecord>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].CenRouteMapRecords.Length"); j++) {
				CenRouteMapRecord cenRouteMapRecord = new CenRouteMapRecord();
				cenRouteMapRecord.setRouteMapId(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].CenRouteMapRecords["+ j +"].RouteMapId"));
				cenRouteMapRecord.setRegionId(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].CenRouteMapRecords["+ j +"].RegionId"));

				cenRouteMapRecords.add(cenRouteMapRecord);
			}
			cenRouteEntry.setCenRouteMapRecords(cenRouteMapRecords);

			List<Conflict> conflicts = new ArrayList<Conflict>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].Conflicts.Length"); j++) {
				Conflict conflict = new Conflict();
				conflict.setStatus(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].Conflicts["+ j +"].Status"));
				conflict.setDestinationCidrBlock(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].Conflicts["+ j +"].DestinationCidrBlock"));
				conflict.setInstanceId(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].Conflicts["+ j +"].InstanceId"));
				conflict.setInstanceType(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].Conflicts["+ j +"].InstanceType"));
				conflict.setRegionId(_ctx.stringValue("DescribeCenChildInstanceRouteEntriesResponse.CenRouteEntries["+ i +"].Conflicts["+ j +"].RegionId"));

				conflicts.add(conflict);
			}
			cenRouteEntry.setConflicts(conflicts);

			cenRouteEntries.add(cenRouteEntry);
		}
		describeCenChildInstanceRouteEntriesResponse.setCenRouteEntries(cenRouteEntries);
	 
	 	return describeCenChildInstanceRouteEntriesResponse;
	}
}