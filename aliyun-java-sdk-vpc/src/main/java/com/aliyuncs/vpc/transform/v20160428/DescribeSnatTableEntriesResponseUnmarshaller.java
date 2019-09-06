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

import com.aliyuncs.vpc.model.v20160428.DescribeSnatTableEntriesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeSnatTableEntriesResponse.SnatTableEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnatTableEntriesResponseUnmarshaller {

	public static DescribeSnatTableEntriesResponse unmarshall(DescribeSnatTableEntriesResponse describeSnatTableEntriesResponse, UnmarshallerContext _ctx) {
		
		describeSnatTableEntriesResponse.setRequestId(_ctx.stringValue("DescribeSnatTableEntriesResponse.RequestId"));
		describeSnatTableEntriesResponse.setTotalCount(_ctx.integerValue("DescribeSnatTableEntriesResponse.TotalCount"));
		describeSnatTableEntriesResponse.setPageNumber(_ctx.integerValue("DescribeSnatTableEntriesResponse.PageNumber"));
		describeSnatTableEntriesResponse.setPageSize(_ctx.integerValue("DescribeSnatTableEntriesResponse.PageSize"));

		List<SnatTableEntry> snatTableEntries = new ArrayList<SnatTableEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSnatTableEntriesResponse.SnatTableEntries.Length"); i++) {
			SnatTableEntry snatTableEntry = new SnatTableEntry();
			snatTableEntry.setSnatTableId(_ctx.stringValue("DescribeSnatTableEntriesResponse.SnatTableEntries["+ i +"].SnatTableId"));
			snatTableEntry.setSnatEntryId(_ctx.stringValue("DescribeSnatTableEntriesResponse.SnatTableEntries["+ i +"].SnatEntryId"));
			snatTableEntry.setSourceVSwitchId(_ctx.stringValue("DescribeSnatTableEntriesResponse.SnatTableEntries["+ i +"].SourceVSwitchId"));
			snatTableEntry.setSourceCIDR(_ctx.stringValue("DescribeSnatTableEntriesResponse.SnatTableEntries["+ i +"].SourceCIDR"));
			snatTableEntry.setSnatIp(_ctx.stringValue("DescribeSnatTableEntriesResponse.SnatTableEntries["+ i +"].SnatIp"));
			snatTableEntry.setStatus(_ctx.stringValue("DescribeSnatTableEntriesResponse.SnatTableEntries["+ i +"].Status"));
			snatTableEntry.setSnatEntryName(_ctx.stringValue("DescribeSnatTableEntriesResponse.SnatTableEntries["+ i +"].SnatEntryName"));

			snatTableEntries.add(snatTableEntry);
		}
		describeSnatTableEntriesResponse.setSnatTableEntries(snatTableEntries);
	 
	 	return describeSnatTableEntriesResponse;
	}
}