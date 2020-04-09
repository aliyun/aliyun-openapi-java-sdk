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

import com.aliyuncs.linkvisual.model.v20180120.GetDevicePurifyJobByJobIdResponse;
import com.aliyuncs.linkvisual.model.v20180120.GetDevicePurifyJobByJobIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDevicePurifyJobByJobIdResponseUnmarshaller {

	public static GetDevicePurifyJobByJobIdResponse unmarshall(GetDevicePurifyJobByJobIdResponse getDevicePurifyJobByJobIdResponse, UnmarshallerContext _ctx) {
		
		getDevicePurifyJobByJobIdResponse.setRequestId(_ctx.stringValue("GetDevicePurifyJobByJobIdResponse.RequestId"));
		getDevicePurifyJobByJobIdResponse.setSuccess(_ctx.booleanValue("GetDevicePurifyJobByJobIdResponse.Success"));
		getDevicePurifyJobByJobIdResponse.setErrorMessage(_ctx.stringValue("GetDevicePurifyJobByJobIdResponse.ErrorMessage"));
		getDevicePurifyJobByJobIdResponse.setCode(_ctx.stringValue("GetDevicePurifyJobByJobIdResponse.Code"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("GetDevicePurifyJobByJobIdResponse.Data.JobId"));
		data.setTenantId(_ctx.stringValue("GetDevicePurifyJobByJobIdResponse.Data.TenantId"));
		data.setUserId(_ctx.stringValue("GetDevicePurifyJobByJobIdResponse.Data.UserId"));
		data.setProductKey(_ctx.stringValue("GetDevicePurifyJobByJobIdResponse.Data.ProductKey"));
		data.setDeviceName(_ctx.stringValue("GetDevicePurifyJobByJobIdResponse.Data.DeviceName"));
		data.setIotId(_ctx.stringValue("GetDevicePurifyJobByJobIdResponse.Data.IotId"));
		data.setStartTime(_ctx.longValue("GetDevicePurifyJobByJobIdResponse.Data.StartTime"));
		data.setEndTime(_ctx.longValue("GetDevicePurifyJobByJobIdResponse.Data.EndTime"));
		data.setPlanId(_ctx.stringValue("GetDevicePurifyJobByJobIdResponse.Data.PlanId"));
		data.setPurifyRecordNameUrl(_ctx.stringValue("GetDevicePurifyJobByJobIdResponse.Data.PurifyRecordNameUrl"));
		data.setPurifyRecordIndexUrl(_ctx.stringValue("GetDevicePurifyJobByJobIdResponse.Data.PurifyRecordIndexUrl"));
		data.setStatus(_ctx.integerValue("GetDevicePurifyJobByJobIdResponse.Data.Status"));
		getDevicePurifyJobByJobIdResponse.setData(data);
	 
	 	return getDevicePurifyJobByJobIdResponse;
	}
}