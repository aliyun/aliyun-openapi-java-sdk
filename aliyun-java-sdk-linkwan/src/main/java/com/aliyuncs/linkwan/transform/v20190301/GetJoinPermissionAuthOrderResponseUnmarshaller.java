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

import com.aliyuncs.linkwan.model.v20190301.GetJoinPermissionAuthOrderResponse;
import com.aliyuncs.linkwan.model.v20190301.GetJoinPermissionAuthOrderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJoinPermissionAuthOrderResponseUnmarshaller {

	public static GetJoinPermissionAuthOrderResponse unmarshall(GetJoinPermissionAuthOrderResponse getJoinPermissionAuthOrderResponse, UnmarshallerContext _ctx) {
		
		getJoinPermissionAuthOrderResponse.setRequestId(_ctx.stringValue("GetJoinPermissionAuthOrderResponse.RequestId"));
		getJoinPermissionAuthOrderResponse.setSuccess(_ctx.booleanValue("GetJoinPermissionAuthOrderResponse.Success"));

		Data data = new Data();
		data.setOrderId(_ctx.stringValue("GetJoinPermissionAuthOrderResponse.Data.OrderId"));
		data.setJoinPermissionId(_ctx.stringValue("GetJoinPermissionAuthOrderResponse.Data.JoinPermissionId"));
		data.setOwnerAliyunId(_ctx.stringValue("GetJoinPermissionAuthOrderResponse.Data.OwnerAliyunId"));
		data.setRenterAliyunId(_ctx.stringValue("GetJoinPermissionAuthOrderResponse.Data.RenterAliyunId"));
		data.setOrderState(_ctx.stringValue("GetJoinPermissionAuthOrderResponse.Data.OrderState"));
		data.setApplyingMillis(_ctx.longValue("GetJoinPermissionAuthOrderResponse.Data.ApplyingMillis"));
		data.setAcceptedMillis(_ctx.longValue("GetJoinPermissionAuthOrderResponse.Data.AcceptedMillis"));
		data.setRejectedMillis(_ctx.longValue("GetJoinPermissionAuthOrderResponse.Data.RejectedMillis"));
		data.setCanceledMillis(_ctx.longValue("GetJoinPermissionAuthOrderResponse.Data.CanceledMillis"));
		getJoinPermissionAuthOrderResponse.setData(data);
	 
	 	return getJoinPermissionAuthOrderResponse;
	}
}