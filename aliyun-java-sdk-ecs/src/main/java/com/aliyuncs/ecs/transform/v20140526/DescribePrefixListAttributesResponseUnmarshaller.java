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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribePrefixListAttributesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribePrefixListAttributesResponse.Entry;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePrefixListAttributesResponseUnmarshaller {

	public static DescribePrefixListAttributesResponse unmarshall(DescribePrefixListAttributesResponse describePrefixListAttributesResponse, UnmarshallerContext _ctx) {
		
		describePrefixListAttributesResponse.setRequestId(_ctx.stringValue("DescribePrefixListAttributesResponse.RequestId"));
		describePrefixListAttributesResponse.setPrefixListId(_ctx.stringValue("DescribePrefixListAttributesResponse.PrefixListId"));
		describePrefixListAttributesResponse.setPrefixListName(_ctx.stringValue("DescribePrefixListAttributesResponse.PrefixListName"));
		describePrefixListAttributesResponse.setAddressFamily(_ctx.stringValue("DescribePrefixListAttributesResponse.AddressFamily"));
		describePrefixListAttributesResponse.setMaxEntries(_ctx.integerValue("DescribePrefixListAttributesResponse.MaxEntries"));
		describePrefixListAttributesResponse.setDescription(_ctx.stringValue("DescribePrefixListAttributesResponse.Description"));
		describePrefixListAttributesResponse.setCreationTime(_ctx.stringValue("DescribePrefixListAttributesResponse.CreationTime"));

		List<Entry> entries = new ArrayList<Entry>();
		for (int i = 0; i < _ctx.lengthValue("DescribePrefixListAttributesResponse.Entries.Length"); i++) {
			Entry entry = new Entry();
			entry.setCidr(_ctx.stringValue("DescribePrefixListAttributesResponse.Entries["+ i +"].Cidr"));
			entry.setDescription(_ctx.stringValue("DescribePrefixListAttributesResponse.Entries["+ i +"].Description"));

			entries.add(entry);
		}
		describePrefixListAttributesResponse.setEntries(entries);
	 
	 	return describePrefixListAttributesResponse;
	}
}