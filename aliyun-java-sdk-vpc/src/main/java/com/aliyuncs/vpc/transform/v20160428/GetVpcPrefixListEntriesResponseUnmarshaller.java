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

import com.aliyuncs.vpc.model.v20160428.GetVpcPrefixListEntriesResponse;
import com.aliyuncs.vpc.model.v20160428.GetVpcPrefixListEntriesResponse.PrefixListCidrs;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVpcPrefixListEntriesResponseUnmarshaller {

	public static GetVpcPrefixListEntriesResponse unmarshall(GetVpcPrefixListEntriesResponse getVpcPrefixListEntriesResponse, UnmarshallerContext _ctx) {
		
		getVpcPrefixListEntriesResponse.setRequestId(_ctx.stringValue("GetVpcPrefixListEntriesResponse.RequestId"));
		getVpcPrefixListEntriesResponse.setNextToken(_ctx.stringValue("GetVpcPrefixListEntriesResponse.NextToken"));
		getVpcPrefixListEntriesResponse.setTotalCount(_ctx.longValue("GetVpcPrefixListEntriesResponse.TotalCount"));
		getVpcPrefixListEntriesResponse.setCount(_ctx.longValue("GetVpcPrefixListEntriesResponse.Count"));

		List<PrefixListCidrs> prefixListEntry = new ArrayList<PrefixListCidrs>();
		for (int i = 0; i < _ctx.lengthValue("GetVpcPrefixListEntriesResponse.PrefixListEntry.Length"); i++) {
			PrefixListCidrs prefixListCidrs = new PrefixListCidrs();
			prefixListCidrs.setPrefixListId(_ctx.stringValue("GetVpcPrefixListEntriesResponse.PrefixListEntry["+ i +"].PrefixListId"));
			prefixListCidrs.setCidr(_ctx.stringValue("GetVpcPrefixListEntriesResponse.PrefixListEntry["+ i +"].Cidr"));
			prefixListCidrs.setDescription(_ctx.stringValue("GetVpcPrefixListEntriesResponse.PrefixListEntry["+ i +"].Description"));

			prefixListEntry.add(prefixListCidrs);
		}
		getVpcPrefixListEntriesResponse.setPrefixListEntry(prefixListEntry);
	 
	 	return getVpcPrefixListEntriesResponse;
	}
}