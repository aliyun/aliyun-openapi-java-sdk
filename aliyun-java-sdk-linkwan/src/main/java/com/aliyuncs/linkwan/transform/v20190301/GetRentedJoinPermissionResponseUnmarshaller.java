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

import com.aliyuncs.linkwan.model.v20190301.GetRentedJoinPermissionResponse;
import com.aliyuncs.linkwan.model.v20190301.GetRentedJoinPermissionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRentedJoinPermissionResponseUnmarshaller {

	public static GetRentedJoinPermissionResponse unmarshall(GetRentedJoinPermissionResponse getRentedJoinPermissionResponse, UnmarshallerContext _ctx) {
		
		getRentedJoinPermissionResponse.setRequestId(_ctx.stringValue("GetRentedJoinPermissionResponse.RequestId"));
		getRentedJoinPermissionResponse.setSuccess(_ctx.booleanValue("GetRentedJoinPermissionResponse.Success"));

		Data data = new Data();
		data.setJoinPermissionId(_ctx.stringValue("GetRentedJoinPermissionResponse.Data.JoinPermissionId"));
		data.setJoinEui(_ctx.stringValue("GetRentedJoinPermissionResponse.Data.JoinEui"));
		data.setFreqBandPlanGroupId(_ctx.longValue("GetRentedJoinPermissionResponse.Data.FreqBandPlanGroupId"));
		data.setClassMode(_ctx.stringValue("GetRentedJoinPermissionResponse.Data.ClassMode"));
		data.setType(_ctx.stringValue("GetRentedJoinPermissionResponse.Data.Type"));
		data.setEnabled(_ctx.booleanValue("GetRentedJoinPermissionResponse.Data.Enabled"));
		data.setRxDailySum(_ctx.longValue("GetRentedJoinPermissionResponse.Data.RxDailySum"));
		data.setRxMonthSum(_ctx.longValue("GetRentedJoinPermissionResponse.Data.RxMonthSum"));
		data.setTxDailySum(_ctx.longValue("GetRentedJoinPermissionResponse.Data.TxDailySum"));
		data.setTxMonthSum(_ctx.longValue("GetRentedJoinPermissionResponse.Data.TxMonthSum"));
		data.setCreateMillis(_ctx.longValue("GetRentedJoinPermissionResponse.Data.CreateMillis"));
		data.setNodesCnt(_ctx.longValue("GetRentedJoinPermissionResponse.Data.NodesCnt"));
		data.setJoinPermissionName(_ctx.stringValue("GetRentedJoinPermissionResponse.Data.JoinPermissionName"));
		data.setBoundNodeGroupId(_ctx.stringValue("GetRentedJoinPermissionResponse.Data.BoundNodeGroupId"));
		data.setBoundNodeGroupName(_ctx.stringValue("GetRentedJoinPermissionResponse.Data.BoundNodeGroupName"));
		data.setRxDelay(_ctx.longValue("GetRentedJoinPermissionResponse.Data.RxDelay"));
		data.setDataRate(_ctx.longValue("GetRentedJoinPermissionResponse.Data.DataRate"));
		getRentedJoinPermissionResponse.setData(data);
	 
	 	return getRentedJoinPermissionResponse;
	}
}