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

import com.aliyuncs.iot.model.v20180120.QueryDeviceListByDeviceGroupResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceListByDeviceGroupResponse.SimpleDeviceInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceListByDeviceGroupResponseUnmarshaller {

	public static QueryDeviceListByDeviceGroupResponse unmarshall(QueryDeviceListByDeviceGroupResponse queryDeviceListByDeviceGroupResponse, UnmarshallerContext context) {
		
		queryDeviceListByDeviceGroupResponse.setRequestId(context.stringValue("QueryDeviceListByDeviceGroupResponse.RequestId"));
		queryDeviceListByDeviceGroupResponse.setSuccess(context.booleanValue("QueryDeviceListByDeviceGroupResponse.Success"));
		queryDeviceListByDeviceGroupResponse.setCode(context.stringValue("QueryDeviceListByDeviceGroupResponse.Code"));
		queryDeviceListByDeviceGroupResponse.setErrorMessage(context.stringValue("QueryDeviceListByDeviceGroupResponse.ErrorMessage"));
		queryDeviceListByDeviceGroupResponse.setPage(context.integerValue("QueryDeviceListByDeviceGroupResponse.Page"));
		queryDeviceListByDeviceGroupResponse.setPageSize(context.integerValue("QueryDeviceListByDeviceGroupResponse.PageSize"));
		queryDeviceListByDeviceGroupResponse.setPageCount(context.integerValue("QueryDeviceListByDeviceGroupResponse.PageCount"));
		queryDeviceListByDeviceGroupResponse.setTotal(context.integerValue("QueryDeviceListByDeviceGroupResponse.Total"));

		List<SimpleDeviceInfo> data = new ArrayList<SimpleDeviceInfo>();
		for (int i = 0; i < context.lengthValue("QueryDeviceListByDeviceGroupResponse.Data.Length"); i++) {
			SimpleDeviceInfo simpleDeviceInfo = new SimpleDeviceInfo();
			simpleDeviceInfo.setProductName(context.stringValue("QueryDeviceListByDeviceGroupResponse.Data["+ i +"].ProductName"));
			simpleDeviceInfo.setProductKey(context.stringValue("QueryDeviceListByDeviceGroupResponse.Data["+ i +"].ProductKey"));
			simpleDeviceInfo.setDeviceName(context.stringValue("QueryDeviceListByDeviceGroupResponse.Data["+ i +"].DeviceName"));
			simpleDeviceInfo.setIotId(context.stringValue("QueryDeviceListByDeviceGroupResponse.Data["+ i +"].IotId"));

			data.add(simpleDeviceInfo);
		}
		queryDeviceListByDeviceGroupResponse.setData(data);
	 
	 	return queryDeviceListByDeviceGroupResponse;
	}
}