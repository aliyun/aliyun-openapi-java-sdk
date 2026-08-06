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

import com.aliyuncs.nas.model.v20170626.DescribeAgenticSpacesResponse;
import com.aliyuncs.nas.model.v20170626.DescribeAgenticSpacesResponse.AgenticSpace;
import com.aliyuncs.nas.model.v20170626.DescribeAgenticSpacesResponse.AgenticSpace.Quota;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAgenticSpacesResponseUnmarshaller {

	public static DescribeAgenticSpacesResponse unmarshall(DescribeAgenticSpacesResponse describeAgenticSpacesResponse, UnmarshallerContext _ctx) {
		
		describeAgenticSpacesResponse.setRequestId(_ctx.stringValue("DescribeAgenticSpacesResponse.RequestId"));
		describeAgenticSpacesResponse.setNextToken(_ctx.stringValue("DescribeAgenticSpacesResponse.NextToken"));

		List<AgenticSpace> agenticSpaces = new ArrayList<AgenticSpace>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAgenticSpacesResponse.AgenticSpaces.Length"); i++) {
			AgenticSpace agenticSpace = new AgenticSpace();
			agenticSpace.setFileSystemPath(_ctx.stringValue("DescribeAgenticSpacesResponse.AgenticSpaces["+ i +"].FileSystemPath"));
			agenticSpace.setAzone(_ctx.stringValue("DescribeAgenticSpacesResponse.AgenticSpaces["+ i +"].Azone"));
			agenticSpace.setStatus(_ctx.stringValue("DescribeAgenticSpacesResponse.AgenticSpaces["+ i +"].Status"));
			agenticSpace.setDescription(_ctx.stringValue("DescribeAgenticSpacesResponse.AgenticSpaces["+ i +"].Description"));
			agenticSpace.setSpaceUsage(_ctx.longValue("DescribeAgenticSpacesResponse.AgenticSpaces["+ i +"].SpaceUsage"));
			agenticSpace.setFileSystemId(_ctx.stringValue("DescribeAgenticSpacesResponse.AgenticSpaces["+ i +"].FileSystemId"));
			agenticSpace.setAgenticSpaceId(_ctx.stringValue("DescribeAgenticSpacesResponse.AgenticSpaces["+ i +"].AgenticSpaceId"));
			agenticSpace.setUpdateTimeUtc(_ctx.stringValue("DescribeAgenticSpacesResponse.AgenticSpaces["+ i +"].UpdateTimeUtc"));
			agenticSpace.setCreateTimeUtc(_ctx.stringValue("DescribeAgenticSpacesResponse.AgenticSpaces["+ i +"].CreateTimeUtc"));
			agenticSpace.setFileCountUsage(_ctx.longValue("DescribeAgenticSpacesResponse.AgenticSpaces["+ i +"].FileCountUsage"));

			Quota quota = new Quota();
			quota.setFileCountLimit(_ctx.longValue("DescribeAgenticSpacesResponse.AgenticSpaces["+ i +"].Quota.FileCountLimit"));
			quota.setSizeLimit(_ctx.longValue("DescribeAgenticSpacesResponse.AgenticSpaces["+ i +"].Quota.SizeLimit"));
			agenticSpace.setQuota(quota);

			agenticSpaces.add(agenticSpace);
		}
		describeAgenticSpacesResponse.setAgenticSpaces(agenticSpaces);
	 
	 	return describeAgenticSpacesResponse;
	}
}