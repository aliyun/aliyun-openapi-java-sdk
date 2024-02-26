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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeAclEntriesResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeAclEntriesResponse.AclEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAclEntriesResponseUnmarshaller {

	public static DescribeAclEntriesResponse unmarshall(DescribeAclEntriesResponse describeAclEntriesResponse, UnmarshallerContext _ctx) {
		
		describeAclEntriesResponse.setRequestId(_ctx.stringValue("DescribeAclEntriesResponse.RequestId"));
		describeAclEntriesResponse.setNextToken(_ctx.stringValue("DescribeAclEntriesResponse.NextToken"));

		List<AclEntry> aclEntries = new ArrayList<AclEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAclEntriesResponse.AclEntries.Length"); i++) {
			AclEntry aclEntry = new AclEntry();
			aclEntry.setPolicy(_ctx.stringValue("DescribeAclEntriesResponse.AclEntries["+ i +"].Policy"));
			aclEntry.setSourceType(_ctx.stringValue("DescribeAclEntriesResponse.AclEntries["+ i +"].SourceType"));
			aclEntry.setSourceId(_ctx.stringValue("DescribeAclEntriesResponse.AclEntries["+ i +"].SourceId"));

			aclEntries.add(aclEntry);
		}
		describeAclEntriesResponse.setAclEntries(aclEntries);
	 
	 	return describeAclEntriesResponse;
	}
}