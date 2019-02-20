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

import com.aliyuncs.linkwan.model.v20181230.GetRentedJoinPermissionResponse;
import com.aliyuncs.linkwan.model.v20181230.GetRentedJoinPermissionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRentedJoinPermissionResponseUnmarshaller {

	public static GetRentedJoinPermissionResponse unmarshall(GetRentedJoinPermissionResponse getRentedJoinPermissionResponse, UnmarshallerContext context) {
		
		getRentedJoinPermissionResponse.setRequestId(context.stringValue("GetRentedJoinPermissionResponse.RequestId"));
		getRentedJoinPermissionResponse.setSuccess(context.booleanValue("GetRentedJoinPermissionResponse.Success"));

		Data data = new Data();
		data.setJoinPermissionId(context.stringValue("GetRentedJoinPermissionResponse.Data.JoinPermissionId"));
		data.setJoinEui(context.stringValue("GetRentedJoinPermissionResponse.Data.JoinEui"));
		data.setFreqBandPlanGroupId(context.longValue("GetRentedJoinPermissionResponse.Data.FreqBandPlanGroupId"));
		data.setClassMode(context.stringValue("GetRentedJoinPermissionResponse.Data.ClassMode"));
		data.setType(context.stringValue("GetRentedJoinPermissionResponse.Data.Type"));
		data.setEnabled(context.booleanValue("GetRentedJoinPermissionResponse.Data.Enabled"));
		data.setRxDailySum(context.longValue("GetRentedJoinPermissionResponse.Data.RxDailySum"));
		data.setRxMonthSum(context.longValue("GetRentedJoinPermissionResponse.Data.RxMonthSum"));
		data.setTxDailySum(context.longValue("GetRentedJoinPermissionResponse.Data.TxDailySum"));
		data.setTxMonthSum(context.longValue("GetRentedJoinPermissionResponse.Data.TxMonthSum"));
		data.setCreateMillis(context.longValue("GetRentedJoinPermissionResponse.Data.CreateMillis"));
		data.setNodesCnt(context.longValue("GetRentedJoinPermissionResponse.Data.NodesCnt"));
		data.setJoinPermissionName(context.stringValue("GetRentedJoinPermissionResponse.Data.JoinPermissionName"));
		getRentedJoinPermissionResponse.setData(data);
	 
	 	return getRentedJoinPermissionResponse;
	}
}