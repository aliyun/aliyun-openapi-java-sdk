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

package com.aliyuncs.linkwan.transform.v20181230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20181230.ListRentedJoinPermissionsResponse;
import com.aliyuncs.linkwan.model.v20181230.ListRentedJoinPermissionsResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.ListRentedJoinPermissionsResponse.Data.JoinPermission;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRentedJoinPermissionsResponseUnmarshaller {

	public static ListRentedJoinPermissionsResponse unmarshall(ListRentedJoinPermissionsResponse listRentedJoinPermissionsResponse, UnmarshallerContext context) {
		
		listRentedJoinPermissionsResponse.setRequestId(context.stringValue("ListRentedJoinPermissionsResponse.RequestId"));
		listRentedJoinPermissionsResponse.setSuccess(context.booleanValue("ListRentedJoinPermissionsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(context.longValue("ListRentedJoinPermissionsResponse.Data.TotalCount"));

		List<JoinPermission> list = new ArrayList<JoinPermission>();
		for (int i = 0; i < context.lengthValue("ListRentedJoinPermissionsResponse.Data.List.Length"); i++) {
			JoinPermission joinPermission = new JoinPermission();
			joinPermission.setJoinPermissionId(context.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].JoinPermissionId"));
			joinPermission.setOwnerAliyunId(context.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].OwnerAliyunId"));
			joinPermission.setJoinEui(context.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].JoinEui"));
			joinPermission.setFreqBandPlanGroupId(context.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].FreqBandPlanGroupId"));
			joinPermission.setClassMode(context.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].ClassMode"));
			joinPermission.setEnabled(context.booleanValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].Enabled"));
			joinPermission.setBoundNodeGroup(context.booleanValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].BoundNodeGroup"));
			joinPermission.setJoinPermissionName(context.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].JoinPermissionName"));
			joinPermission.setType(context.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].Type"));

			list.add(joinPermission);
		}
		data.setList(list);
		listRentedJoinPermissionsResponse.setData(data);
	 
	 	return listRentedJoinPermissionsResponse;
	}
}