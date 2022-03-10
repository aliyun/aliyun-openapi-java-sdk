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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListStandardGroupsResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListStandardGroupsResponse.StandardGroupListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStandardGroupsResponseUnmarshaller {

	public static ListStandardGroupsResponse unmarshall(ListStandardGroupsResponse listStandardGroupsResponse, UnmarshallerContext _ctx) {
		
		listStandardGroupsResponse.setRequestId(_ctx.stringValue("ListStandardGroupsResponse.RequestId"));
		listStandardGroupsResponse.setSuccess(_ctx.booleanValue("ListStandardGroupsResponse.Success"));
		listStandardGroupsResponse.setErrorMessage(_ctx.stringValue("ListStandardGroupsResponse.ErrorMessage"));
		listStandardGroupsResponse.setErrorCode(_ctx.stringValue("ListStandardGroupsResponse.ErrorCode"));

		List<StandardGroupListItem> standardGroupList = new ArrayList<StandardGroupListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListStandardGroupsResponse.StandardGroupList.Length"); i++) {
			StandardGroupListItem standardGroupListItem = new StandardGroupListItem();
			standardGroupListItem.setGroupName(_ctx.stringValue("ListStandardGroupsResponse.StandardGroupList["+ i +"].GroupName"));
			standardGroupListItem.setDescription(_ctx.stringValue("ListStandardGroupsResponse.StandardGroupList["+ i +"].Description"));
			standardGroupListItem.setDbType(_ctx.stringValue("ListStandardGroupsResponse.StandardGroupList["+ i +"].DbType"));
			standardGroupListItem.setLastMenderId(_ctx.longValue("ListStandardGroupsResponse.StandardGroupList["+ i +"].LastMenderId"));
			standardGroupListItem.setGroupMode(_ctx.stringValue("ListStandardGroupsResponse.StandardGroupList["+ i +"].GroupMode"));

			standardGroupList.add(standardGroupListItem);
		}
		listStandardGroupsResponse.setStandardGroupList(standardGroupList);
	 
	 	return listStandardGroupsResponse;
	}
}