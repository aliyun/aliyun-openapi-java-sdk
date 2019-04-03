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

package com.aliyuncs.uis.transform.v20180821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.uis.model.v20180821.DescribeDnatEntriesResponse;
import com.aliyuncs.uis.model.v20180821.DescribeDnatEntriesResponse.UisDnatEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnatEntriesResponseUnmarshaller {

	public static DescribeDnatEntriesResponse unmarshall(DescribeDnatEntriesResponse describeDnatEntriesResponse, UnmarshallerContext context) {
		
		describeDnatEntriesResponse.setRequestId(context.stringValue("DescribeDnatEntriesResponse.RequestId"));
		describeDnatEntriesResponse.setTotalCount(context.integerValue("DescribeDnatEntriesResponse.TotalCount"));
		describeDnatEntriesResponse.setPageNumber(context.integerValue("DescribeDnatEntriesResponse.PageNumber"));
		describeDnatEntriesResponse.setPageSize(context.integerValue("DescribeDnatEntriesResponse.PageSize"));

		List<UisDnatEntry> uisDnatEntries = new ArrayList<UisDnatEntry>();
		for (int i = 0; i < context.lengthValue("DescribeDnatEntriesResponse.UisDnatEntries.Length"); i++) {
			UisDnatEntry uisDnatEntry = new UisDnatEntry();
			uisDnatEntry.setUisDnatId(context.stringValue("DescribeDnatEntriesResponse.UisDnatEntries["+ i +"].UisDnatId"));
			uisDnatEntry.setDestinationIp(context.stringValue("DescribeDnatEntriesResponse.UisDnatEntries["+ i +"].DestinationIp"));
			uisDnatEntry.setDestinationPort(context.integerValue("DescribeDnatEntriesResponse.UisDnatEntries["+ i +"].DestinationPort"));
			uisDnatEntry.setOriginalIp(context.stringValue("DescribeDnatEntriesResponse.UisDnatEntries["+ i +"].OriginalIp"));
			uisDnatEntry.setOriginalPort(context.integerValue("DescribeDnatEntriesResponse.UisDnatEntries["+ i +"].OriginalPort"));
			uisDnatEntry.setIpProtocol(context.stringValue("DescribeDnatEntriesResponse.UisDnatEntries["+ i +"].IpProtocol"));

			uisDnatEntries.add(uisDnatEntry);
		}
		describeDnatEntriesResponse.setUisDnatEntries(uisDnatEntries);
	 
	 	return describeDnatEntriesResponse;
	}
}