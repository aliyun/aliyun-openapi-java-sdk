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

import com.aliyuncs.vpc.model.v20160428.ListFullNatEntriesResponse;
import com.aliyuncs.vpc.model.v20160428.ListFullNatEntriesResponse.FullNatEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFullNatEntriesResponseUnmarshaller {

	public static ListFullNatEntriesResponse unmarshall(ListFullNatEntriesResponse listFullNatEntriesResponse, UnmarshallerContext _ctx) {
		
		listFullNatEntriesResponse.setRequestId(_ctx.stringValue("ListFullNatEntriesResponse.RequestId"));
		listFullNatEntriesResponse.setNatGatewayId(_ctx.stringValue("ListFullNatEntriesResponse.NatGatewayId"));
		listFullNatEntriesResponse.setFullNatTableId(_ctx.stringValue("ListFullNatEntriesResponse.FullNatTableId"));
		listFullNatEntriesResponse.setTotalCount(_ctx.longValue("ListFullNatEntriesResponse.TotalCount"));
		listFullNatEntriesResponse.setNextToken(_ctx.stringValue("ListFullNatEntriesResponse.NextToken"));
		listFullNatEntriesResponse.setMaxResults(_ctx.longValue("ListFullNatEntriesResponse.MaxResults"));

		List<FullNatEntry> fullNatEntries = new ArrayList<FullNatEntry>();
		for (int i = 0; i < _ctx.lengthValue("ListFullNatEntriesResponse.FullNatEntries.Length"); i++) {
			FullNatEntry fullNatEntry = new FullNatEntry();
			fullNatEntry.setNatIp(_ctx.stringValue("ListFullNatEntriesResponse.FullNatEntries["+ i +"].NatIp"));
			fullNatEntry.setNatIpPort(_ctx.stringValue("ListFullNatEntriesResponse.FullNatEntries["+ i +"].NatIpPort"));
			fullNatEntry.setAccessIp(_ctx.stringValue("ListFullNatEntriesResponse.FullNatEntries["+ i +"].AccessIp"));
			fullNatEntry.setAccessPort(_ctx.stringValue("ListFullNatEntriesResponse.FullNatEntries["+ i +"].AccessPort"));
			fullNatEntry.setIpProtocol(_ctx.stringValue("ListFullNatEntriesResponse.FullNatEntries["+ i +"].IpProtocol"));
			fullNatEntry.setNetworkInterfaceId(_ctx.stringValue("ListFullNatEntriesResponse.FullNatEntries["+ i +"].NetworkInterfaceId"));
			fullNatEntry.setNetworkInterfaceType(_ctx.stringValue("ListFullNatEntriesResponse.FullNatEntries["+ i +"].NetworkInterfaceType"));
			fullNatEntry.setFullNatEntryName(_ctx.stringValue("ListFullNatEntriesResponse.FullNatEntries["+ i +"].FullNatEntryName"));
			fullNatEntry.setFullNatEntryDescription(_ctx.stringValue("ListFullNatEntriesResponse.FullNatEntries["+ i +"].FullNatEntryDescription"));
			fullNatEntry.setCreationTime(_ctx.stringValue("ListFullNatEntriesResponse.FullNatEntries["+ i +"].CreationTime"));
			fullNatEntry.setFullNatEntryId(_ctx.stringValue("ListFullNatEntriesResponse.FullNatEntries["+ i +"].FullNatEntryId"));
			fullNatEntry.setFullNatEntryStatus(_ctx.stringValue("ListFullNatEntriesResponse.FullNatEntries["+ i +"].FullNatEntryStatus"));
			fullNatEntry.setFullNatTableId(_ctx.stringValue("ListFullNatEntriesResponse.FullNatEntries["+ i +"].FullNatTableId"));
			fullNatEntry.setAccessDomain(_ctx.stringValue("ListFullNatEntriesResponse.FullNatEntries["+ i +"].AccessDomain"));
			fullNatEntry.setDomainResolve(_ctx.stringValue("ListFullNatEntriesResponse.FullNatEntries["+ i +"].DomainResolve"));

			fullNatEntries.add(fullNatEntry);
		}
		listFullNatEntriesResponse.setFullNatEntries(fullNatEntries);
	 
	 	return listFullNatEntriesResponse;
	}
}