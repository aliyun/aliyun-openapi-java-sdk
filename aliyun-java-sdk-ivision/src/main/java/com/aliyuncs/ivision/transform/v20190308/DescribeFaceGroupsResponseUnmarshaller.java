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

package com.aliyuncs.ivision.transform.v20190308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivision.model.v20190308.DescribeFaceGroupsResponse;
import com.aliyuncs.ivision.model.v20190308.DescribeFaceGroupsResponse.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFaceGroupsResponseUnmarshaller {

	public static DescribeFaceGroupsResponse unmarshall(DescribeFaceGroupsResponse describeFaceGroupsResponse, UnmarshallerContext _ctx) {
		
		describeFaceGroupsResponse.setRequestId(_ctx.stringValue("DescribeFaceGroupsResponse.RequestId"));
		describeFaceGroupsResponse.setTotalNum(_ctx.longValue("DescribeFaceGroupsResponse.TotalNum"));
		describeFaceGroupsResponse.setPageSize(_ctx.longValue("DescribeFaceGroupsResponse.PageSize"));
		describeFaceGroupsResponse.setCurrentPage(_ctx.longValue("DescribeFaceGroupsResponse.CurrentPage"));
		describeFaceGroupsResponse.setNextPageToken(_ctx.stringValue("DescribeFaceGroupsResponse.NextPageToken"));

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFaceGroupsResponse.Groups.Length"); i++) {
			Group group = new Group();
			group.setCreationTime(_ctx.stringValue("DescribeFaceGroupsResponse.Groups["+ i +"].CreationTime"));
			group.setGroupId(_ctx.stringValue("DescribeFaceGroupsResponse.Groups["+ i +"].GroupId"));
			group.setName(_ctx.stringValue("DescribeFaceGroupsResponse.Groups["+ i +"].Name"));

			groups.add(group);
		}
		describeFaceGroupsResponse.setGroups(groups);
	 
	 	return describeFaceGroupsResponse;
	}
}