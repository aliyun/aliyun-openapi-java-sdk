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

import com.aliyuncs.linkwan.model.v20190301.GetOwnedJoinPermissionResponse;
import com.aliyuncs.linkwan.model.v20190301.GetOwnedJoinPermissionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOwnedJoinPermissionResponseUnmarshaller {

	public static GetOwnedJoinPermissionResponse unmarshall(GetOwnedJoinPermissionResponse getOwnedJoinPermissionResponse, UnmarshallerContext _ctx) {
		
		getOwnedJoinPermissionResponse.setRequestId(_ctx.stringValue("GetOwnedJoinPermissionResponse.RequestId"));
		getOwnedJoinPermissionResponse.setSuccess(_ctx.booleanValue("GetOwnedJoinPermissionResponse.Success"));

		Data data = new Data();
		data.setJoinPermissionId(_ctx.stringValue("GetOwnedJoinPermissionResponse.Data.JoinPermissionId"));
		data.setRenterAliyunId(_ctx.stringValue("GetOwnedJoinPermissionResponse.Data.RenterAliyunId"));
		data.setJoinEui(_ctx.stringValue("GetOwnedJoinPermissionResponse.Data.JoinEui"));
		data.setFreqBandPlanGroupId(_ctx.longValue("GetOwnedJoinPermissionResponse.Data.FreqBandPlanGroupId"));
		data.setClassMode(_ctx.stringValue("GetOwnedJoinPermissionResponse.Data.ClassMode"));
		data.setEnabled(_ctx.booleanValue("GetOwnedJoinPermissionResponse.Data.Enabled"));
		data.setNodesCnt(_ctx.longValue("GetOwnedJoinPermissionResponse.Data.NodesCnt"));
		data.setDataDispatchDestination(_ctx.stringValue("GetOwnedJoinPermissionResponse.Data.DataDispatchDestination"));
		data.setRxDailySum(_ctx.longValue("GetOwnedJoinPermissionResponse.Data.RxDailySum"));
		data.setRxMonthSum(_ctx.longValue("GetOwnedJoinPermissionResponse.Data.RxMonthSum"));
		data.setTxDailySum(_ctx.longValue("GetOwnedJoinPermissionResponse.Data.TxDailySum"));
		data.setTxMonthSum(_ctx.longValue("GetOwnedJoinPermissionResponse.Data.TxMonthSum"));
		data.setCreateMillis(_ctx.longValue("GetOwnedJoinPermissionResponse.Data.CreateMillis"));
		data.setJoinPermissionName(_ctx.stringValue("GetOwnedJoinPermissionResponse.Data.JoinPermissionName"));
		data.setAuthState(_ctx.stringValue("GetOwnedJoinPermissionResponse.Data.AuthState"));
		data.setMulticastEnabled(_ctx.booleanValue("GetOwnedJoinPermissionResponse.Data.MulticastEnabled"));
		data.setMulticastNodeCapacity(_ctx.integerValue("GetOwnedJoinPermissionResponse.Data.MulticastNodeCapacity"));
		data.setMulticastNodeCount(_ctx.integerValue("GetOwnedJoinPermissionResponse.Data.MulticastNodeCount"));
		data.setRxDelay(_ctx.longValue("GetOwnedJoinPermissionResponse.Data.RxDelay"));
		data.setDataRate(_ctx.longValue("GetOwnedJoinPermissionResponse.Data.DataRate"));
		getOwnedJoinPermissionResponse.setData(data);
	 
	 	return getOwnedJoinPermissionResponse;
	}
}