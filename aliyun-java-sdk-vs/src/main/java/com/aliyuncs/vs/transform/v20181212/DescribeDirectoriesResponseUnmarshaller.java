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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeDirectoriesResponse;
import com.aliyuncs.vs.model.v20181212.DescribeDirectoriesResponse.Directory;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDirectoriesResponseUnmarshaller {

	public static DescribeDirectoriesResponse unmarshall(DescribeDirectoriesResponse describeDirectoriesResponse, UnmarshallerContext _ctx) {
		
		describeDirectoriesResponse.setRequestId(_ctx.stringValue("DescribeDirectoriesResponse.RequestId"));
		describeDirectoriesResponse.setPageNum(_ctx.longValue("DescribeDirectoriesResponse.PageNum"));
		describeDirectoriesResponse.setPageSize(_ctx.longValue("DescribeDirectoriesResponse.PageSize"));
		describeDirectoriesResponse.setTotalCount(_ctx.longValue("DescribeDirectoriesResponse.TotalCount"));
		describeDirectoriesResponse.setPageCount(_ctx.longValue("DescribeDirectoriesResponse.PageCount"));

		List<Directory> directories = new ArrayList<Directory>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDirectoriesResponse.Directories.Length"); i++) {
			Directory directory = new Directory();
			directory.setParentId(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].ParentId"));
			directory.setDescription(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].Description"));
			directory.setGroupId(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].GroupId"));
			directory.setName(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].Name"));
			directory.setCreatedTime(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].CreatedTime"));
			directory.setId(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].Id"));

			directories.add(directory);
		}
		describeDirectoriesResponse.setDirectories(directories);
	 
	 	return describeDirectoriesResponse;
	}
}