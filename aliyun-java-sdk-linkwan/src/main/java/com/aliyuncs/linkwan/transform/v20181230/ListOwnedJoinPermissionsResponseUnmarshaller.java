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

import com.aliyuncs.linkwan.model.v20181230.ListOwnedJoinPermissionsResponse;
import com.aliyuncs.linkwan.model.v20181230.ListOwnedJoinPermissionsResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.ListOwnedJoinPermissionsResponse.Data.JoinPermission;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOwnedJoinPermissionsResponseUnmarshaller {

	public static ListOwnedJoinPermissionsResponse unmarshall(ListOwnedJoinPermissionsResponse listOwnedJoinPermissionsResponse, UnmarshallerContext context) {
		
		listOwnedJoinPermissionsResponse.setRequestId(context.stringValue("ListOwnedJoinPermissionsResponse.RequestId"));
		listOwnedJoinPermissionsResponse.setSuccess(context.booleanValue("ListOwnedJoinPermissionsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(context.longValue("ListOwnedJoinPermissionsResponse.Data.TotalCount"));

		List<JoinPermission> list = new ArrayList<JoinPermission>();
		for (int i = 0; i < context.lengthValue("ListOwnedJoinPermissionsResponse.Data.List.Length"); i++) {
			JoinPermission joinPermission = new JoinPermission();
			joinPermission.setJoinPermissionId(context.stringValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].JoinPermissionId"));
			joinPermission.setRenterAliyunId(context.stringValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].RenterAliyunId"));
			joinPermission.setJoinEui(context.stringValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].JoinEui"));
			joinPermission.setFreqBandPlanGroupId(context.longValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].FreqBandPlanGroupId"));
			joinPermission.setClassMode(context.stringValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].ClassMode"));
			joinPermission.setAuthState(context.stringValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].AuthState"));
			joinPermission.setEnabled(context.booleanValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].Enabled"));
			joinPermission.setNodesCnt(context.longValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].NodesCnt"));
			joinPermission.setDataDispatchDestination(context.stringValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].DataDispatchDestination"));
			joinPermission.setRxDailySum(context.longValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].RxDailySum"));
			joinPermission.setRxMonthSum(context.longValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].RxMonthSum"));
			joinPermission.setTxDailySum(context.longValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].TxDailySum"));
			joinPermission.setTxMonthSum(context.longValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].TxMonthSum"));
			joinPermission.setCreateMillis(context.longValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].CreateMillis"));
			joinPermission.setNodeGroupId(context.stringValue("ListOwnedJoinPermissionsResponse.Data.List["+ i +"].NodeGroupId"));

			list.add(joinPermission);
		}
		data.setList(list);
		listOwnedJoinPermissionsResponse.setData(data);
	 
	 	return listOwnedJoinPermissionsResponse;
	}
}