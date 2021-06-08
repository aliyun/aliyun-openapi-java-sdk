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

package com.aliyuncs.alb.transform.v20200616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alb.model.v20200616.ListAclEntriesResponse;
import com.aliyuncs.alb.model.v20200616.ListAclEntriesResponse.AclEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAclEntriesResponseUnmarshaller {

	public static ListAclEntriesResponse unmarshall(ListAclEntriesResponse listAclEntriesResponse, UnmarshallerContext _ctx) {
		
		listAclEntriesResponse.setRequestId(_ctx.stringValue("ListAclEntriesResponse.RequestId"));
		listAclEntriesResponse.setMaxResults(_ctx.integerValue("ListAclEntriesResponse.MaxResults"));
		listAclEntriesResponse.setNextToken(_ctx.stringValue("ListAclEntriesResponse.NextToken"));
		listAclEntriesResponse.setTotalCount(_ctx.integerValue("ListAclEntriesResponse.TotalCount"));

		List<AclEntry> aclEntries = new ArrayList<AclEntry>();
		for (int i = 0; i < _ctx.lengthValue("ListAclEntriesResponse.AclEntries.Length"); i++) {
			AclEntry aclEntry = new AclEntry();
			aclEntry.setDescription(_ctx.stringValue("ListAclEntriesResponse.AclEntries["+ i +"].Description"));
			aclEntry.setEntry(_ctx.stringValue("ListAclEntriesResponse.AclEntries["+ i +"].Entry"));
			aclEntry.setStatus(_ctx.stringValue("ListAclEntriesResponse.AclEntries["+ i +"].Status"));

			aclEntries.add(aclEntry);
		}
		listAclEntriesResponse.setAclEntries(aclEntries);
	 
	 	return listAclEntriesResponse;
	}
}