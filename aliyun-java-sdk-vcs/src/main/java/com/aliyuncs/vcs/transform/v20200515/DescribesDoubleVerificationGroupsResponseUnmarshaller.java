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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.DescribesDoubleVerificationGroupsResponse;
import com.aliyuncs.vcs.model.v20200515.DescribesDoubleVerificationGroupsResponse.DoubleVerificationGroups;
import com.aliyuncs.vcs.model.v20200515.DescribesDoubleVerificationGroupsResponse.DoubleVerificationGroups.DoubleVerificationGroupListItem;
import com.aliyuncs.vcs.model.v20200515.DescribesDoubleVerificationGroupsResponse.DoubleVerificationGroups.DoubleVerificationGroupListItem.PersonIdListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribesDoubleVerificationGroupsResponseUnmarshaller {

	public static DescribesDoubleVerificationGroupsResponse unmarshall(DescribesDoubleVerificationGroupsResponse describesDoubleVerificationGroupsResponse, UnmarshallerContext _ctx) {
		
		describesDoubleVerificationGroupsResponse.setRequestId(_ctx.stringValue("DescribesDoubleVerificationGroupsResponse.RequestId"));
		describesDoubleVerificationGroupsResponse.setMessage(_ctx.stringValue("DescribesDoubleVerificationGroupsResponse.Message"));
		describesDoubleVerificationGroupsResponse.setCode(_ctx.stringValue("DescribesDoubleVerificationGroupsResponse.Code"));

		DoubleVerificationGroups doubleVerificationGroups = new DoubleVerificationGroups();
		doubleVerificationGroups.setTotalNum(_ctx.longValue("DescribesDoubleVerificationGroupsResponse.DoubleVerificationGroups.TotalNum"));
		doubleVerificationGroups.setPageSize(_ctx.longValue("DescribesDoubleVerificationGroupsResponse.DoubleVerificationGroups.PageSize"));
		doubleVerificationGroups.setPageNum(_ctx.longValue("DescribesDoubleVerificationGroupsResponse.DoubleVerificationGroups.PageNum"));

		List<DoubleVerificationGroupListItem> doubleVerificationGroupList = new ArrayList<DoubleVerificationGroupListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribesDoubleVerificationGroupsResponse.DoubleVerificationGroups.DoubleVerificationGroupList.Length"); i++) {
			DoubleVerificationGroupListItem doubleVerificationGroupListItem = new DoubleVerificationGroupListItem();
			doubleVerificationGroupListItem.setDeviceId(_ctx.stringValue("DescribesDoubleVerificationGroupsResponse.DoubleVerificationGroups.DoubleVerificationGroupList["+ i +"].DeviceId"));
			doubleVerificationGroupListItem.setLastChange(_ctx.stringValue("DescribesDoubleVerificationGroupsResponse.DoubleVerificationGroups.DoubleVerificationGroupList["+ i +"].LastChange"));
			doubleVerificationGroupListItem.setMemberNumber(_ctx.longValue("DescribesDoubleVerificationGroupsResponse.DoubleVerificationGroups.DoubleVerificationGroupList["+ i +"].MemberNumber"));
			doubleVerificationGroupListItem.setEnabled(_ctx.stringValue("DescribesDoubleVerificationGroupsResponse.DoubleVerificationGroups.DoubleVerificationGroupList["+ i +"].Enabled"));
			doubleVerificationGroupListItem.setInterval(_ctx.longValue("DescribesDoubleVerificationGroupsResponse.DoubleVerificationGroups.DoubleVerificationGroupList["+ i +"].Interval"));
			doubleVerificationGroupListItem.setGroupId(_ctx.stringValue("DescribesDoubleVerificationGroupsResponse.DoubleVerificationGroups.DoubleVerificationGroupList["+ i +"].GroupId"));

			List<PersonIdListItem> personIdList = new ArrayList<PersonIdListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribesDoubleVerificationGroupsResponse.DoubleVerificationGroups.DoubleVerificationGroupList["+ i +"].PersonIdList.Length"); j++) {
				PersonIdListItem personIdListItem = new PersonIdListItem();
				personIdListItem.setPersonTableId(_ctx.stringValue("DescribesDoubleVerificationGroupsResponse.DoubleVerificationGroups.DoubleVerificationGroupList["+ i +"].PersonIdList["+ j +"].PersonTableId"));
				personIdListItem.setPersonId(_ctx.stringValue("DescribesDoubleVerificationGroupsResponse.DoubleVerificationGroups.DoubleVerificationGroupList["+ i +"].PersonIdList["+ j +"].PersonId"));

				personIdList.add(personIdListItem);
			}
			doubleVerificationGroupListItem.setPersonIdList(personIdList);

			doubleVerificationGroupList.add(doubleVerificationGroupListItem);
		}
		doubleVerificationGroups.setDoubleVerificationGroupList(doubleVerificationGroupList);
		describesDoubleVerificationGroupsResponse.setDoubleVerificationGroups(doubleVerificationGroups);
	 
	 	return describesDoubleVerificationGroupsResponse;
	}
}