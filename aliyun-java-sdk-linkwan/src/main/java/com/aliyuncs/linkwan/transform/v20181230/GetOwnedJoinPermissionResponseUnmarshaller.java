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

import com.aliyuncs.linkwan.model.v20181230.GetOwnedJoinPermissionResponse;
import com.aliyuncs.linkwan.model.v20181230.GetOwnedJoinPermissionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOwnedJoinPermissionResponseUnmarshaller {

	public static GetOwnedJoinPermissionResponse unmarshall(GetOwnedJoinPermissionResponse getOwnedJoinPermissionResponse, UnmarshallerContext context) {
		
		getOwnedJoinPermissionResponse.setRequestId(context.stringValue("GetOwnedJoinPermissionResponse.RequestId"));
		getOwnedJoinPermissionResponse.setSuccess(context.booleanValue("GetOwnedJoinPermissionResponse.Success"));

		Data data = new Data();
		data.setJoinPermissionId(context.stringValue("GetOwnedJoinPermissionResponse.Data.JoinPermissionId"));
		data.setRenterAliyunId(context.stringValue("GetOwnedJoinPermissionResponse.Data.RenterAliyunId"));
		data.setJoinEui(context.stringValue("GetOwnedJoinPermissionResponse.Data.JoinEui"));
		data.setFreqBandPlanGroupId(context.longValue("GetOwnedJoinPermissionResponse.Data.FreqBandPlanGroupId"));
		data.setClassMode(context.stringValue("GetOwnedJoinPermissionResponse.Data.ClassMode"));
		data.setAuthState(context.stringValue("GetOwnedJoinPermissionResponse.Data.AuthState"));
		data.setEnabled(context.booleanValue("GetOwnedJoinPermissionResponse.Data.Enabled"));
		data.setNodesCnt(context.longValue("GetOwnedJoinPermissionResponse.Data.NodesCnt"));
		data.setDataDispatchDestination(context.stringValue("GetOwnedJoinPermissionResponse.Data.DataDispatchDestination"));
		data.setRxDailySum(context.longValue("GetOwnedJoinPermissionResponse.Data.RxDailySum"));
		data.setRxMonthSum(context.longValue("GetOwnedJoinPermissionResponse.Data.RxMonthSum"));
		data.setTxDailySum(context.longValue("GetOwnedJoinPermissionResponse.Data.TxDailySum"));
		data.setTxMonthSum(context.longValue("GetOwnedJoinPermissionResponse.Data.TxMonthSum"));
		data.setCreateMillis(context.longValue("GetOwnedJoinPermissionResponse.Data.CreateMillis"));
		data.setNodeGroupId(context.stringValue("GetOwnedJoinPermissionResponse.Data.NodeGroupId"));
		getOwnedJoinPermissionResponse.setData(data);
	 
	 	return getOwnedJoinPermissionResponse;
	}
}