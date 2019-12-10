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

import com.aliyuncs.smartag.model.v20180313.DescribeSnatEntriesResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSnatEntriesResponse.SnatEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnatEntriesResponseUnmarshaller {

	public static DescribeSnatEntriesResponse unmarshall(DescribeSnatEntriesResponse describeSnatEntriesResponse, UnmarshallerContext _ctx) {
		
		describeSnatEntriesResponse.setRequestId(_ctx.stringValue("DescribeSnatEntriesResponse.RequestId"));
		describeSnatEntriesResponse.setTotalCount(_ctx.integerValue("DescribeSnatEntriesResponse.TotalCount"));
		describeSnatEntriesResponse.setPageNumber(_ctx.integerValue("DescribeSnatEntriesResponse.PageNumber"));
		describeSnatEntriesResponse.setPageSize(_ctx.integerValue("DescribeSnatEntriesResponse.PageSize"));

		List<SnatEntry> snatEntries = new ArrayList<SnatEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSnatEntriesResponse.SnatEntries.Length"); i++) {
			SnatEntry snatEntry = new SnatEntry();
			snatEntry.setInstanceId(_ctx.stringValue("DescribeSnatEntriesResponse.SnatEntries["+ i +"].InstanceId"));
			snatEntry.setCidrBlock(_ctx.stringValue("DescribeSnatEntriesResponse.SnatEntries["+ i +"].CidrBlock"));
			snatEntry.setSnatIp(_ctx.stringValue("DescribeSnatEntriesResponse.SnatEntries["+ i +"].SnatIp"));
			snatEntry.setCreateTime(_ctx.longValue("DescribeSnatEntriesResponse.SnatEntries["+ i +"].CreateTime"));

			snatEntries.add(snatEntry);
		}
		describeSnatEntriesResponse.setSnatEntries(snatEntries);
	 
	 	return describeSnatEntriesResponse;
	}
}