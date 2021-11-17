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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.QueryDeviceBoundStatusResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.QueryDeviceBoundStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceBoundStatusResponseUnmarshaller {

	public static QueryDeviceBoundStatusResponse unmarshall(QueryDeviceBoundStatusResponse queryDeviceBoundStatusResponse, UnmarshallerContext _ctx) {
		
		queryDeviceBoundStatusResponse.setRequestId(_ctx.stringValue("QueryDeviceBoundStatusResponse.RequestId"));
		queryDeviceBoundStatusResponse.setErrorMessage(_ctx.stringValue("QueryDeviceBoundStatusResponse.ErrorMessage"));
		queryDeviceBoundStatusResponse.setSuccess(_ctx.booleanValue("QueryDeviceBoundStatusResponse.Success"));
		queryDeviceBoundStatusResponse.setErrorCode(_ctx.stringValue("QueryDeviceBoundStatusResponse.ErrorCode"));

		Data data = new Data();
		data.setDeviceId(_ctx.stringValue("QueryDeviceBoundStatusResponse.Data.DeviceId"));
		data.setUserSource(_ctx.stringValue("QueryDeviceBoundStatusResponse.Data.UserSource"));
		data.setBindAt(_ctx.longValue("QueryDeviceBoundStatusResponse.Data.BindAt"));
		data.setUserId(_ctx.stringValue("QueryDeviceBoundStatusResponse.Data.UserId"));
		queryDeviceBoundStatusResponse.setData(data);
	 
	 	return queryDeviceBoundStatusResponse;
	}
}