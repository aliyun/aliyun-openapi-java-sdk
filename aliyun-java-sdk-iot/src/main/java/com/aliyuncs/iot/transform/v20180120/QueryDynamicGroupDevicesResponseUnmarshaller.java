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

import com.aliyuncs.iot.model.v20180120.QueryDynamicGroupDevicesResponse;
import com.aliyuncs.iot.model.v20180120.QueryDynamicGroupDevicesResponse.SimpleDeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDynamicGroupDevicesResponseUnmarshaller {

	public static QueryDynamicGroupDevicesResponse unmarshall(QueryDynamicGroupDevicesResponse queryDynamicGroupDevicesResponse, UnmarshallerContext _ctx) {
		
		queryDynamicGroupDevicesResponse.setRequestId(_ctx.stringValue("QueryDynamicGroupDevicesResponse.RequestId"));
		queryDynamicGroupDevicesResponse.setNextToken(_ctx.stringValue("QueryDynamicGroupDevicesResponse.NextToken"));
		queryDynamicGroupDevicesResponse.setErrorMessage(_ctx.stringValue("QueryDynamicGroupDevicesResponse.ErrorMessage"));
		queryDynamicGroupDevicesResponse.setSuccess(_ctx.booleanValue("QueryDynamicGroupDevicesResponse.Success"));
		queryDynamicGroupDevicesResponse.setCode(_ctx.stringValue("QueryDynamicGroupDevicesResponse.Code"));
		queryDynamicGroupDevicesResponse.setPageSize(_ctx.integerValue("QueryDynamicGroupDevicesResponse.PageSize"));
		queryDynamicGroupDevicesResponse.setTotal(_ctx.integerValue("QueryDynamicGroupDevicesResponse.Total"));
		queryDynamicGroupDevicesResponse.setPageCount(_ctx.integerValue("QueryDynamicGroupDevicesResponse.PageCount"));
		queryDynamicGroupDevicesResponse.setPage(_ctx.integerValue("QueryDynamicGroupDevicesResponse.Page"));

		List<SimpleDeviceInfo> data = new ArrayList<SimpleDeviceInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDynamicGroupDevicesResponse.Data.Length"); i++) {
			SimpleDeviceInfo simpleDeviceInfo = new SimpleDeviceInfo();
			simpleDeviceInfo.setStatus(_ctx.stringValue("QueryDynamicGroupDevicesResponse.Data["+ i +"].Status"));
			simpleDeviceInfo.setProductName(_ctx.stringValue("QueryDynamicGroupDevicesResponse.Data["+ i +"].ProductName"));
			simpleDeviceInfo.setDeviceName(_ctx.stringValue("QueryDynamicGroupDevicesResponse.Data["+ i +"].DeviceName"));
			simpleDeviceInfo.setUtcActiveTime(_ctx.stringValue("QueryDynamicGroupDevicesResponse.Data["+ i +"].UtcActiveTime"));
			simpleDeviceInfo.setActiveTime(_ctx.stringValue("QueryDynamicGroupDevicesResponse.Data["+ i +"].ActiveTime"));
			simpleDeviceInfo.setProductKey(_ctx.stringValue("QueryDynamicGroupDevicesResponse.Data["+ i +"].ProductKey"));
			simpleDeviceInfo.setLastOnlineTime(_ctx.stringValue("QueryDynamicGroupDevicesResponse.Data["+ i +"].LastOnlineTime"));
			simpleDeviceInfo.setNodeType(_ctx.integerValue("QueryDynamicGroupDevicesResponse.Data["+ i +"].NodeType"));
			simpleDeviceInfo.setUtcLastOnlineTime(_ctx.stringValue("QueryDynamicGroupDevicesResponse.Data["+ i +"].UtcLastOnlineTime"));
			simpleDeviceInfo.setNickname(_ctx.stringValue("QueryDynamicGroupDevicesResponse.Data["+ i +"].Nickname"));
			simpleDeviceInfo.setCategoryKey(_ctx.stringValue("QueryDynamicGroupDevicesResponse.Data["+ i +"].CategoryKey"));
			simpleDeviceInfo.setIotId(_ctx.stringValue("QueryDynamicGroupDevicesResponse.Data["+ i +"].IotId"));

			data.add(simpleDeviceInfo);
		}
		queryDynamicGroupDevicesResponse.setData(data);
	 
	 	return queryDynamicGroupDevicesResponse;
	}
}