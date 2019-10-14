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

import com.aliyuncs.linkwan.model.v20190301.ListOwnedJoinPermissionsResponse;
import com.aliyuncs.linkwan.model.v20190301.ListOwnedJoinPermissionsResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListOwnedJoinPermissionsResponse.Data.JoinPermission;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOwnedJoinPermissionsResponseUnmarshaller {

	public static ListOwnedJoinPermissionsResponse unmarshall(ListOwnedJoinPermissionsResponse listOwnedJoinPermissionsResponse, UnmarshallerContext _ctx) {
		
		listOwnedJoinPermissionsResponse.setRequestId(_ctx.stringValue("ListOwnedJoinPermissionsResponse.RequestId"));
		listOwnedJoinPermissionsResponse.setSuccess(_ctx.booleanValue("ListOwnedJoinPermissionsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListOwnedJoinPermissionsResponse.Data.TotalCount"));

		List<JoinPermission> list = new ArrayList<JoinPermission>();
		for (int i = 0; i < _ctx.lengthValue("ListOwnedJoinPermissionsResponse.Data.List.Length"); i++) {
			JoinPermission joinPermission = new JoinPermission();
			joinPermission.setJoinPermissionId(_ctx.stringValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].JoinPermissionId"));
			joinPermission.setRenterAliyunId(_ctx.stringValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].RenterAliyunId"));
			joinPermission.setJoinEui(_ctx.stringValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].JoinEui"));
			joinPermission.setFreqBandPlanGroupId(_ctx.longValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].FreqBandPlanGroupId"));
			joinPermission.setClassMode(_ctx.stringValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].ClassMode"));
			joinPermission.setAuthState(_ctx.stringValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].AuthState"));
			joinPermission.setEnabled(_ctx.booleanValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].Enabled"));
			joinPermission.setJoinPermissionName(_ctx.stringValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].JoinPermissionName"));
			joinPermission.setRxDelay(_ctx.longValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].RxDelay"));
			joinPermission.setDataRate(_ctx.longValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].DataRate"));

			list.add(joinPermission);
		}
		data.setList(list);
		listOwnedJoinPermissionsResponse.setData(data);
	 
	 	return listOwnedJoinPermissionsResponse;
	}
}