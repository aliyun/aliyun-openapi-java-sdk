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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeDnatEntriesResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeDnatEntriesResponse.DnatEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnatEntriesResponseUnmarshaller {

	public static DescribeDnatEntriesResponse unmarshall(DescribeDnatEntriesResponse describeDnatEntriesResponse, UnmarshallerContext _ctx) {
		
		describeDnatEntriesResponse.setRequestId(_ctx.stringValue("DescribeDnatEntriesResponse.RequestId"));
		describeDnatEntriesResponse.setTotalCount(_ctx.integerValue("DescribeDnatEntriesResponse.TotalCount"));
		describeDnatEntriesResponse.setPageSize(_ctx.integerValue("DescribeDnatEntriesResponse.PageSize"));
		describeDnatEntriesResponse.setPageNumber(_ctx.integerValue("DescribeDnatEntriesResponse.PageNumber"));

		List<DnatEntry> dnatEntries = new ArrayList<DnatEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnatEntriesResponse.DnatEntries.Length"); i++) {
			DnatEntry dnatEntry = new DnatEntry();
			dnatEntry.setType(_ctx.stringValue("DescribeDnatEntriesResponse.DnatEntries["+ i +"].Type"));
			dnatEntry.setSagId(_ctx.stringValue("DescribeDnatEntriesResponse.DnatEntries["+ i +"].SagId"));
			dnatEntry.setInternalIp(_ctx.stringValue("DescribeDnatEntriesResponse.DnatEntries["+ i +"].InternalIp"));
			dnatEntry.setInternalPort(_ctx.stringValue("DescribeDnatEntriesResponse.DnatEntries["+ i +"].InternalPort"));
			dnatEntry.setIpProtocol(_ctx.stringValue("DescribeDnatEntriesResponse.DnatEntries["+ i +"].IpProtocol"));
			dnatEntry.setExternalPort(_ctx.stringValue("DescribeDnatEntriesResponse.DnatEntries["+ i +"].ExternalPort"));
			dnatEntry.setDnatEntryId(_ctx.stringValue("DescribeDnatEntriesResponse.DnatEntries["+ i +"].DnatEntryId"));
			dnatEntry.setExternalIp(_ctx.stringValue("DescribeDnatEntriesResponse.DnatEntries["+ i +"].ExternalIp"));

			dnatEntries.add(dnatEntry);
		}
		describeDnatEntriesResponse.setDnatEntries(dnatEntries);
	 
	 	return describeDnatEntriesResponse;
	}
}