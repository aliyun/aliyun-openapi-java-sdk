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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.QueryDevicePurifyPlanByPlanIdResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryDevicePurifyPlanByPlanIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDevicePurifyPlanByPlanIdResponseUnmarshaller {

	public static QueryDevicePurifyPlanByPlanIdResponse unmarshall(QueryDevicePurifyPlanByPlanIdResponse queryDevicePurifyPlanByPlanIdResponse, UnmarshallerContext _ctx) {
		
		queryDevicePurifyPlanByPlanIdResponse.setRequestId(_ctx.stringValue("QueryDevicePurifyPlanByPlanIdResponse.RequestId"));
		queryDevicePurifyPlanByPlanIdResponse.setSuccess(_ctx.booleanValue("QueryDevicePurifyPlanByPlanIdResponse.Success"));
		queryDevicePurifyPlanByPlanIdResponse.setErrorMessage(_ctx.stringValue("QueryDevicePurifyPlanByPlanIdResponse.ErrorMessage"));
		queryDevicePurifyPlanByPlanIdResponse.setCode(_ctx.stringValue("QueryDevicePurifyPlanByPlanIdResponse.Code"));

		Data data = new Data();
		data.setPlanId(_ctx.stringValue("QueryDevicePurifyPlanByPlanIdResponse.Data.PlanId"));
		data.setTenantId(_ctx.stringValue("QueryDevicePurifyPlanByPlanIdResponse.Data.TenantId"));
		data.setUserId(_ctx.stringValue("QueryDevicePurifyPlanByPlanIdResponse.Data.UserId"));
		data.setProductKey(_ctx.stringValue("QueryDevicePurifyPlanByPlanIdResponse.Data.ProductKey"));
		data.setDeviceName(_ctx.stringValue("QueryDevicePurifyPlanByPlanIdResponse.Data.DeviceName"));
		data.setIotId(_ctx.stringValue("QueryDevicePurifyPlanByPlanIdResponse.Data.IotId"));
		data.setStartTime(_ctx.integerValue("QueryDevicePurifyPlanByPlanIdResponse.Data.StartTime"));
		data.setEndTime(_ctx.integerValue("QueryDevicePurifyPlanByPlanIdResponse.Data.EndTime"));
		queryDevicePurifyPlanByPlanIdResponse.setData(data);
	 
	 	return queryDevicePurifyPlanByPlanIdResponse;
	}
}