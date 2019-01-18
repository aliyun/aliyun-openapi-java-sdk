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

import com.aliyuncs.linkwan.model.v20181230.GetJoinPermissionAuthOrderResponse;
import com.aliyuncs.linkwan.model.v20181230.GetJoinPermissionAuthOrderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJoinPermissionAuthOrderResponseUnmarshaller {

	public static GetJoinPermissionAuthOrderResponse unmarshall(GetJoinPermissionAuthOrderResponse getJoinPermissionAuthOrderResponse, UnmarshallerContext context) {
		
		getJoinPermissionAuthOrderResponse.setRequestId(context.stringValue("GetJoinPermissionAuthOrderResponse.RequestId"));
		getJoinPermissionAuthOrderResponse.setSuccess(context.booleanValue("GetJoinPermissionAuthOrderResponse.Success"));

		Data data = new Data();
		data.setOrderId(context.stringValue("GetJoinPermissionAuthOrderResponse.Data.OrderId"));
		data.setJoinPermissionId(context.stringValue("GetJoinPermissionAuthOrderResponse.Data.JoinPermissionId"));
		data.setJoinEui(context.stringValue("GetJoinPermissionAuthOrderResponse.Data.JoinEui"));
		data.setOwnerAliyunId(context.stringValue("GetJoinPermissionAuthOrderResponse.Data.OwnerAliyunId"));
		data.setRenterAliyunId(context.stringValue("GetJoinPermissionAuthOrderResponse.Data.RenterAliyunId"));
		data.setOrderState(context.stringValue("GetJoinPermissionAuthOrderResponse.Data.OrderState"));
		data.setApplyingMillis(context.longValue("GetJoinPermissionAuthOrderResponse.Data.ApplyingMillis"));
		data.setAcceptedMillis(context.longValue("GetJoinPermissionAuthOrderResponse.Data.AcceptedMillis"));
		data.setRejectedMillis(context.longValue("GetJoinPermissionAuthOrderResponse.Data.RejectedMillis"));
		data.setCanceledMillis(context.longValue("GetJoinPermissionAuthOrderResponse.Data.CanceledMillis"));
		getJoinPermissionAuthOrderResponse.setData(data);
	 
	 	return getJoinPermissionAuthOrderResponse;
	}
}