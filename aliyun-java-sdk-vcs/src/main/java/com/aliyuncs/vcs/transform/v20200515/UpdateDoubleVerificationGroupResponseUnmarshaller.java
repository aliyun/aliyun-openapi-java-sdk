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

import com.aliyuncs.vcs.model.v20200515.UpdateDoubleVerificationGroupResponse;
import com.aliyuncs.vcs.model.v20200515.UpdateDoubleVerificationGroupResponse.DoubleVerificationGroup;
import com.aliyuncs.vcs.model.v20200515.UpdateDoubleVerificationGroupResponse.DoubleVerificationGroup.PersonIdListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDoubleVerificationGroupResponseUnmarshaller {

	public static UpdateDoubleVerificationGroupResponse unmarshall(UpdateDoubleVerificationGroupResponse updateDoubleVerificationGroupResponse, UnmarshallerContext _ctx) {
		
		updateDoubleVerificationGroupResponse.setRequestId(_ctx.stringValue("UpdateDoubleVerificationGroupResponse.RequestId"));
		updateDoubleVerificationGroupResponse.setCode(_ctx.stringValue("UpdateDoubleVerificationGroupResponse.Code"));
		updateDoubleVerificationGroupResponse.setMessage(_ctx.stringValue("UpdateDoubleVerificationGroupResponse.Message"));

		DoubleVerificationGroup doubleVerificationGroup = new DoubleVerificationGroup();
		doubleVerificationGroup.setGroupId(_ctx.stringValue("UpdateDoubleVerificationGroupResponse.DoubleVerificationGroup.GroupId"));
		doubleVerificationGroup.setInterval(_ctx.longValue("UpdateDoubleVerificationGroupResponse.DoubleVerificationGroup.Interval"));
		doubleVerificationGroup.setLastChange(_ctx.stringValue("UpdateDoubleVerificationGroupResponse.DoubleVerificationGroup.LastChange"));
		doubleVerificationGroup.setMemberNumber(_ctx.longValue("UpdateDoubleVerificationGroupResponse.DoubleVerificationGroup.MemberNumber"));
		doubleVerificationGroup.setEnabled(_ctx.stringValue("UpdateDoubleVerificationGroupResponse.DoubleVerificationGroup.Enabled"));
		doubleVerificationGroup.setDeviceId(_ctx.stringValue("UpdateDoubleVerificationGroupResponse.DoubleVerificationGroup.DeviceId"));

		List<PersonIdListItem> personIdList = new ArrayList<PersonIdListItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateDoubleVerificationGroupResponse.DoubleVerificationGroup.PersonIdList.Length"); i++) {
			PersonIdListItem personIdListItem = new PersonIdListItem();
			personIdListItem.setPersonTableId(_ctx.stringValue("UpdateDoubleVerificationGroupResponse.DoubleVerificationGroup.PersonIdList["+ i +"].PersonTableId"));
			personIdListItem.setPersonId(_ctx.stringValue("UpdateDoubleVerificationGroupResponse.DoubleVerificationGroup.PersonIdList["+ i +"].PersonId"));

			personIdList.add(personIdListItem);
		}
		doubleVerificationGroup.setPersonIdList(personIdList);
		updateDoubleVerificationGroupResponse.setDoubleVerificationGroup(doubleVerificationGroup);
	 
	 	return updateDoubleVerificationGroupResponse;
	}
}