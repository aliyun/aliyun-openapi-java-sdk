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

import com.aliyuncs.iot.model.v20180120.QueryDeviceByTagsResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceByTagsResponse.SimpleDeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceByTagsResponseUnmarshaller {

	public static QueryDeviceByTagsResponse unmarshall(QueryDeviceByTagsResponse queryDeviceByTagsResponse, UnmarshallerContext _ctx) {
		
		queryDeviceByTagsResponse.setRequestId(_ctx.stringValue("QueryDeviceByTagsResponse.RequestId"));
		queryDeviceByTagsResponse.setSuccess(_ctx.booleanValue("QueryDeviceByTagsResponse.Success"));
		queryDeviceByTagsResponse.setCode(_ctx.stringValue("QueryDeviceByTagsResponse.Code"));
		queryDeviceByTagsResponse.setErrorMessage(_ctx.stringValue("QueryDeviceByTagsResponse.ErrorMessage"));
		queryDeviceByTagsResponse.setPage(_ctx.integerValue("QueryDeviceByTagsResponse.Page"));
		queryDeviceByTagsResponse.setPageSize(_ctx.integerValue("QueryDeviceByTagsResponse.PageSize"));
		queryDeviceByTagsResponse.setPageCount(_ctx.integerValue("QueryDeviceByTagsResponse.PageCount"));
		queryDeviceByTagsResponse.setTotal(_ctx.integerValue("QueryDeviceByTagsResponse.Total"));

		List<SimpleDeviceInfo> data = new ArrayList<SimpleDeviceInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceByTagsResponse.Data.Length"); i++) {
			SimpleDeviceInfo simpleDeviceInfo = new SimpleDeviceInfo();
			simpleDeviceInfo.setProductName(_ctx.stringValue("QueryDeviceByTagsResponse.Data["+ i +"].ProductName"));
			simpleDeviceInfo.setProductKey(_ctx.stringValue("QueryDeviceByTagsResponse.Data["+ i +"].ProductKey"));
			simpleDeviceInfo.setDeviceName(_ctx.stringValue("QueryDeviceByTagsResponse.Data["+ i +"].DeviceName"));
			simpleDeviceInfo.setIotId(_ctx.stringValue("QueryDeviceByTagsResponse.Data["+ i +"].IotId"));

			data.add(simpleDeviceInfo);
		}
		queryDeviceByTagsResponse.setData(data);
	 
	 	return queryDeviceByTagsResponse;
	}
}