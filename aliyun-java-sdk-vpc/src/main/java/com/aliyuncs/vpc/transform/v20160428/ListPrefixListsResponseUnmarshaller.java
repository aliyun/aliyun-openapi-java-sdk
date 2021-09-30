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

import com.aliyuncs.vpc.model.v20160428.ListPrefixListsResponse;
import com.aliyuncs.vpc.model.v20160428.ListPrefixListsResponse.PrefixList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrefixListsResponseUnmarshaller {

	public static ListPrefixListsResponse unmarshall(ListPrefixListsResponse listPrefixListsResponse, UnmarshallerContext _ctx) {
		
		listPrefixListsResponse.setRequestId(_ctx.stringValue("ListPrefixListsResponse.RequestId"));
		listPrefixListsResponse.setNextToken(_ctx.stringValue("ListPrefixListsResponse.NextToken"));
		listPrefixListsResponse.setTotalCount(_ctx.longValue("ListPrefixListsResponse.TotalCount"));
		listPrefixListsResponse.setMaxResults(_ctx.longValue("ListPrefixListsResponse.MaxResults"));

		List<PrefixList> prefixLists = new ArrayList<PrefixList>();
		for (int i = 0; i < _ctx.lengthValue("ListPrefixListsResponse.PrefixLists.Length"); i++) {
			PrefixList prefixList = new PrefixList();
			prefixList.setPrefixListId(_ctx.stringValue("ListPrefixListsResponse.PrefixLists["+ i +"].PrefixListId"));
			prefixList.setPrefixListStatus(_ctx.stringValue("ListPrefixListsResponse.PrefixLists["+ i +"].PrefixListStatus"));
			prefixList.setPrefixListName(_ctx.stringValue("ListPrefixListsResponse.PrefixLists["+ i +"].PrefixListName"));
			prefixList.setPrefixListDescription(_ctx.stringValue("ListPrefixListsResponse.PrefixLists["+ i +"].PrefixListDescription"));
			prefixList.setIpVersion(_ctx.stringValue("ListPrefixListsResponse.PrefixLists["+ i +"].IpVersion"));
			prefixList.setCreationTime(_ctx.stringValue("ListPrefixListsResponse.PrefixLists["+ i +"].CreationTime"));

			List<String> cidrBlocks = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPrefixListsResponse.PrefixLists["+ i +"].CidrBlocks.Length"); j++) {
				cidrBlocks.add(_ctx.stringValue("ListPrefixListsResponse.PrefixLists["+ i +"].CidrBlocks["+ j +"]"));
			}
			prefixList.setCidrBlocks(cidrBlocks);

			prefixLists.add(prefixList);
		}
		listPrefixListsResponse.setPrefixLists(prefixLists);
	 
	 	return listPrefixListsResponse;
	}
}