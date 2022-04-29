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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeFilesetsResponse;
import com.aliyuncs.nas.model.v20170626.DescribeFilesetsResponse.Entrie;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFilesetsResponseUnmarshaller {

	public static DescribeFilesetsResponse unmarshall(DescribeFilesetsResponse describeFilesetsResponse, UnmarshallerContext _ctx) {
		
		describeFilesetsResponse.setRequestId(_ctx.stringValue("DescribeFilesetsResponse.RequestId"));
		describeFilesetsResponse.setNextToken(_ctx.stringValue("DescribeFilesetsResponse.NextToken"));
		describeFilesetsResponse.setFileSystemId(_ctx.stringValue("DescribeFilesetsResponse.FileSystemId"));

		List<Entrie> entries = new ArrayList<Entrie>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFilesetsResponse.Entries.Length"); i++) {
			Entrie entrie = new Entrie();
			entrie.setDescription(_ctx.stringValue("DescribeFilesetsResponse.Entries["+ i +"].Description"));
			entrie.setFileSystemPath(_ctx.stringValue("DescribeFilesetsResponse.Entries["+ i +"].FileSystemPath"));
			entrie.setFsetId(_ctx.stringValue("DescribeFilesetsResponse.Entries["+ i +"].FsetId"));
			entrie.setStatus(_ctx.stringValue("DescribeFilesetsResponse.Entries["+ i +"].Status"));
			entrie.setCreateTime(_ctx.stringValue("DescribeFilesetsResponse.Entries["+ i +"].CreateTime"));
			entrie.setUpdateTime(_ctx.stringValue("DescribeFilesetsResponse.Entries["+ i +"].UpdateTime"));

			entries.add(entrie);
		}
		describeFilesetsResponse.setEntries(entries);
	 
	 	return describeFilesetsResponse;
	}
}