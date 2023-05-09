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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryDeviceByStatusResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceByStatusResponse.SimpleDeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceByStatusResponseUnmarshaller {

	public static QueryDeviceByStatusResponse unmarshall(QueryDeviceByStatusResponse queryDeviceByStatusResponse, UnmarshallerContext _ctx) {
		
		queryDeviceByStatusResponse.setRequestId(_ctx.stringValue("QueryDeviceByStatusResponse.RequestId"));
		queryDeviceByStatusResponse.setErrorMessage(_ctx.stringValue("QueryDeviceByStatusResponse.ErrorMessage"));
		queryDeviceByStatusResponse.setSuccess(_ctx.booleanValue("QueryDeviceByStatusResponse.Success"));
		queryDeviceByStatusResponse.setCode(_ctx.stringValue("QueryDeviceByStatusResponse.Code"));
		queryDeviceByStatusResponse.setPageSize(_ctx.integerValue("QueryDeviceByStatusResponse.PageSize"));
		queryDeviceByStatusResponse.setTotal(_ctx.integerValue("QueryDeviceByStatusResponse.Total"));
		queryDeviceByStatusResponse.setPageCount(_ctx.integerValue("QueryDeviceByStatusResponse.PageCount"));
		queryDeviceByStatusResponse.setPage(_ctx.integerValue("QueryDeviceByStatusResponse.Page"));

		List<SimpleDeviceInfo> data = new ArrayList<SimpleDeviceInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceByStatusResponse.Data.Length"); i++) {
			SimpleDeviceInfo simpleDeviceInfo = new SimpleDeviceInfo();
			simpleDeviceInfo.setStatus(_ctx.stringValue("QueryDeviceByStatusResponse.Data["+ i +"].Status"));
			simpleDeviceInfo.setProductKey(_ctx.stringValue("QueryDeviceByStatusResponse.Data["+ i +"].ProductKey"));
			simpleDeviceInfo.setDeviceName(_ctx.stringValue("QueryDeviceByStatusResponse.Data["+ i +"].DeviceName"));
			simpleDeviceInfo.setUtcModified(_ctx.stringValue("QueryDeviceByStatusResponse.Data["+ i +"].UtcModified"));
			simpleDeviceInfo.setDeviceSecret(_ctx.stringValue("QueryDeviceByStatusResponse.Data["+ i +"].DeviceSecret"));
			simpleDeviceInfo.setUtcCreate(_ctx.stringValue("QueryDeviceByStatusResponse.Data["+ i +"].UtcCreate"));
			simpleDeviceInfo.setGmtCreate(_ctx.stringValue("QueryDeviceByStatusResponse.Data["+ i +"].GmtCreate"));
			simpleDeviceInfo.setNickname(_ctx.stringValue("QueryDeviceByStatusResponse.Data["+ i +"].Nickname"));
			simpleDeviceInfo.setGmtModified(_ctx.stringValue("QueryDeviceByStatusResponse.Data["+ i +"].GmtModified"));
			simpleDeviceInfo.setIotId(_ctx.stringValue("QueryDeviceByStatusResponse.Data["+ i +"].IotId"));

			data.add(simpleDeviceInfo);
		}
		queryDeviceByStatusResponse.setData(data);
	 
	 	return queryDeviceByStatusResponse;
	}
}