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

import com.aliyuncs.ecs.model.v20140526.DescribePrefixListsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribePrefixListsResponse.PrefixList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePrefixListsResponseUnmarshaller {

	public static DescribePrefixListsResponse unmarshall(DescribePrefixListsResponse describePrefixListsResponse, UnmarshallerContext _ctx) {
		
		describePrefixListsResponse.setRequestId(_ctx.stringValue("DescribePrefixListsResponse.RequestId"));
		describePrefixListsResponse.setNextToken(_ctx.stringValue("DescribePrefixListsResponse.NextToken"));

		List<PrefixList> prefixLists = new ArrayList<PrefixList>();
		for (int i = 0; i < _ctx.lengthValue("DescribePrefixListsResponse.PrefixLists.Length"); i++) {
			PrefixList prefixList = new PrefixList();
			prefixList.setPrefixListId(_ctx.stringValue("DescribePrefixListsResponse.PrefixLists["+ i +"].PrefixListId"));
			prefixList.setPrefixListName(_ctx.stringValue("DescribePrefixListsResponse.PrefixLists["+ i +"].PrefixListName"));
			prefixList.setAddressFamily(_ctx.stringValue("DescribePrefixListsResponse.PrefixLists["+ i +"].AddressFamily"));
			prefixList.setMaxEntries(_ctx.integerValue("DescribePrefixListsResponse.PrefixLists["+ i +"].MaxEntries"));
			prefixList.setDescription(_ctx.stringValue("DescribePrefixListsResponse.PrefixLists["+ i +"].Description"));
			prefixList.setCreationTime(_ctx.stringValue("DescribePrefixListsResponse.PrefixLists["+ i +"].CreationTime"));
			prefixList.setAssociationCount(_ctx.integerValue("DescribePrefixListsResponse.PrefixLists["+ i +"].AssociationCount"));

			prefixLists.add(prefixList);
		}
		describePrefixListsResponse.setPrefixLists(prefixLists);
	 
	 	return describePrefixListsResponse;
	}
}