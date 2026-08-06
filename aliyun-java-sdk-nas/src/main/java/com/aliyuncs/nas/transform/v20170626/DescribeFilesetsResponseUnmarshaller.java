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
import com.aliyuncs.nas.model.v20170626.DescribeFilesetsResponse.Entrie.Quota;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFilesetsResponseUnmarshaller {

	public static DescribeFilesetsResponse unmarshall(DescribeFilesetsResponse describeFilesetsResponse, UnmarshallerContext _ctx) {
		
		describeFilesetsResponse.setRequestId(_ctx.stringValue("DescribeFilesetsResponse.RequestId"));
		describeFilesetsResponse.setTotalCount(_ctx.integerValue("DescribeFilesetsResponse.TotalCount"));
		describeFilesetsResponse.setNextToken(_ctx.stringValue("DescribeFilesetsResponse.NextToken"));
		describeFilesetsResponse.setPageSize(_ctx.integerValue("DescribeFilesetsResponse.PageSize"));
		describeFilesetsResponse.setPageNumber(_ctx.integerValue("DescribeFilesetsResponse.PageNumber"));
		describeFilesetsResponse.setFileSystemId(_ctx.stringValue("DescribeFilesetsResponse.FileSystemId"));

		List<Entrie> entries = new ArrayList<Entrie>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFilesetsResponse.Entries.Length"); i++) {
			Entrie entrie = new Entrie();
			entrie.setFileSystemPath(_ctx.stringValue("DescribeFilesetsResponse.Entries["+ i +"].FileSystemPath"));
			entrie.setFsetId(_ctx.stringValue("DescribeFilesetsResponse.Entries["+ i +"].FsetId"));
			entrie.setStatus(_ctx.stringValue("DescribeFilesetsResponse.Entries["+ i +"].Status"));
			entrie.setDescription(_ctx.stringValue("DescribeFilesetsResponse.Entries["+ i +"].Description"));
			entrie.setSpaceUsage(_ctx.longValue("DescribeFilesetsResponse.Entries["+ i +"].SpaceUsage"));
			entrie.setCreateTime(_ctx.stringValue("DescribeFilesetsResponse.Entries["+ i +"].CreateTime"));
			entrie.setUpdateTime(_ctx.stringValue("DescribeFilesetsResponse.Entries["+ i +"].UpdateTime"));
			entrie.setFileSystemId(_ctx.stringValue("DescribeFilesetsResponse.Entries["+ i +"].FileSystemId"));
			entrie.setDeletionProtection(_ctx.booleanValue("DescribeFilesetsResponse.Entries["+ i +"].DeletionProtection"));
			entrie.setFileCountUsage(_ctx.longValue("DescribeFilesetsResponse.Entries["+ i +"].FileCountUsage"));

			Quota quota = new Quota();
			quota.setFileCountLimit(_ctx.longValue("DescribeFilesetsResponse.Entries["+ i +"].Quota.FileCountLimit"));
			quota.setSizeLimit(_ctx.longValue("DescribeFilesetsResponse.Entries["+ i +"].Quota.SizeLimit"));
			entrie.setQuota(quota);

			entries.add(entrie);
		}
		describeFilesetsResponse.setEntries(entries);
	 
	 	return describeFilesetsResponse;
	}
}