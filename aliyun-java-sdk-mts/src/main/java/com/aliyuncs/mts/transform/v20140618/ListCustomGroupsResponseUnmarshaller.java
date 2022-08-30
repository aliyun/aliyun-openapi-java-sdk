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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.ListCustomGroupsResponse;
import com.aliyuncs.mts.model.v20140618.ListCustomGroupsResponse.CustomGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomGroupsResponseUnmarshaller {

	public static ListCustomGroupsResponse unmarshall(ListCustomGroupsResponse listCustomGroupsResponse, UnmarshallerContext _ctx) {
		
		listCustomGroupsResponse.setRequestId(_ctx.stringValue("ListCustomGroupsResponse.RequestId"));
		listCustomGroupsResponse.setPageNumber(_ctx.integerValue("ListCustomGroupsResponse.PageNumber"));
		listCustomGroupsResponse.setPageSize(_ctx.integerValue("ListCustomGroupsResponse.PageSize"));
		listCustomGroupsResponse.setTotalCount(_ctx.longValue("ListCustomGroupsResponse.TotalCount"));

		List<CustomGroup> customGroups = new ArrayList<CustomGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomGroupsResponse.CustomGroups.Length"); i++) {
			CustomGroup customGroup = new CustomGroup();
			customGroup.setCustomGroupId(_ctx.stringValue("ListCustomGroupsResponse.CustomGroups["+ i +"].CustomGroupId"));
			customGroup.setCustomGroupName(_ctx.stringValue("ListCustomGroupsResponse.CustomGroups["+ i +"].CustomGroupName"));
			customGroup.setCustomGroupDescription(_ctx.stringValue("ListCustomGroupsResponse.CustomGroups["+ i +"].CustomGroupDescription"));

			customGroups.add(customGroup);
		}
		listCustomGroupsResponse.setCustomGroups(customGroups);
	 
	 	return listCustomGroupsResponse;
	}
}