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

package com.aliyuncs.linkwan.transform.v20190301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20190301.ListRentedJoinPermissionsResponse;
import com.aliyuncs.linkwan.model.v20190301.ListRentedJoinPermissionsResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListRentedJoinPermissionsResponse.Data.JoinPermission;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRentedJoinPermissionsResponseUnmarshaller {

	public static ListRentedJoinPermissionsResponse unmarshall(ListRentedJoinPermissionsResponse listRentedJoinPermissionsResponse, UnmarshallerContext _ctx) {
		
		listRentedJoinPermissionsResponse.setRequestId(_ctx.stringValue("ListRentedJoinPermissionsResponse.RequestId"));
		listRentedJoinPermissionsResponse.setSuccess(_ctx.booleanValue("ListRentedJoinPermissionsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListRentedJoinPermissionsResponse.Data.TotalCount"));

		List<JoinPermission> list = new ArrayList<JoinPermission>();
		for (int i = 0; i < _ctx.lengthValue("ListRentedJoinPermissionsResponse.Data.List.Length"); i++) {
			JoinPermission joinPermission = new JoinPermission();
			joinPermission.setJoinPermissionId(_ctx.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].JoinPermissionId"));
			joinPermission.setOwnerAliyunId(_ctx.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].OwnerAliyunId"));
			joinPermission.setJoinEui(_ctx.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].JoinEui"));
			joinPermission.setFreqBandPlanGroupId(_ctx.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].FreqBandPlanGroupId"));
			joinPermission.setClassMode(_ctx.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].ClassMode"));
			joinPermission.setEnabled(_ctx.booleanValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].Enabled"));
			joinPermission.setBoundNodeGroup(_ctx.booleanValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].BoundNodeGroup"));
			joinPermission.setJoinPermissionName(_ctx.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].JoinPermissionName"));
			joinPermission.setType(_ctx.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].Type"));
			joinPermission.setBoundNodeGroupName(_ctx.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].BoundNodeGroupName"));
			joinPermission.setBoundNodeGroupId(_ctx.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].BoundNodeGroupId"));
			joinPermission.setRxDelay(_ctx.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].RxDelay"));
			joinPermission.setDataRate(_ctx.stringValue("ListRentedJoinPermissionsResponse.Data.List["+ i +"].DataRate"));

			list.add(joinPermission);
		}
		data.setList(list);
		listRentedJoinPermissionsResponse.setData(data);
	 
	 	return listRentedJoinPermissionsResponse;
	}
}