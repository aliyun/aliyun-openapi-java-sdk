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

import com.aliyuncs.mindlive_biz.model.v20210214.QueryDeviceConfigResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.QueryDeviceConfigResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceConfigResponseUnmarshaller {

	public static QueryDeviceConfigResponse unmarshall(QueryDeviceConfigResponse queryDeviceConfigResponse, UnmarshallerContext _ctx) {
		
		queryDeviceConfigResponse.setRequestId(_ctx.stringValue("QueryDeviceConfigResponse.RequestId"));
		queryDeviceConfigResponse.setErrorMessage(_ctx.stringValue("QueryDeviceConfigResponse.ErrorMessage"));
		queryDeviceConfigResponse.setSuccess(_ctx.booleanValue("QueryDeviceConfigResponse.Success"));
		queryDeviceConfigResponse.setErrorCode(_ctx.stringValue("QueryDeviceConfigResponse.ErrorCode"));

		Data data = new Data();
		data.setDeviceId(_ctx.stringValue("QueryDeviceConfigResponse.Data.DeviceId"));
		data.setDeviceConfig(_ctx.mapValue("QueryDeviceConfigResponse.Data.DeviceConfig"));
		queryDeviceConfigResponse.setData(data);
	 
	 	return queryDeviceConfigResponse;
	}
}