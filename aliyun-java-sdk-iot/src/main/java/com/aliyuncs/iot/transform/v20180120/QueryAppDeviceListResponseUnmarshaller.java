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

import com.aliyuncs.iot.model.v20180120.QueryAppDeviceListResponse;
import com.aliyuncs.iot.model.v20180120.QueryAppDeviceListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAppDeviceListResponseUnmarshaller {

	public static QueryAppDeviceListResponse unmarshall(QueryAppDeviceListResponse queryAppDeviceListResponse, UnmarshallerContext _ctx) {
		
		queryAppDeviceListResponse.setRequestId(_ctx.stringValue("QueryAppDeviceListResponse.RequestId"));
		queryAppDeviceListResponse.setSuccess(_ctx.booleanValue("QueryAppDeviceListResponse.Success"));
		queryAppDeviceListResponse.setErrorMessage(_ctx.stringValue("QueryAppDeviceListResponse.ErrorMessage"));
		queryAppDeviceListResponse.setCode(_ctx.stringValue("QueryAppDeviceListResponse.Code"));
		queryAppDeviceListResponse.setPage(_ctx.integerValue("QueryAppDeviceListResponse.Page"));
		queryAppDeviceListResponse.setPageSize(_ctx.integerValue("QueryAppDeviceListResponse.PageSize"));
		queryAppDeviceListResponse.setPageCount(_ctx.integerValue("QueryAppDeviceListResponse.PageCount"));
		queryAppDeviceListResponse.setTotal(_ctx.integerValue("QueryAppDeviceListResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAppDeviceListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setProductName(_ctx.stringValue("QueryAppDeviceListResponse.Data["+ i +"].ProductName"));
			dataItem.setProductKey(_ctx.stringValue("QueryAppDeviceListResponse.Data["+ i +"].ProductKey"));
			dataItem.setDeviceName(_ctx.stringValue("QueryAppDeviceListResponse.Data["+ i +"].DeviceName"));
			dataItem.setNodeType(_ctx.integerValue("QueryAppDeviceListResponse.Data["+ i +"].NodeType"));
			dataItem.setStatus(_ctx.stringValue("QueryAppDeviceListResponse.Data["+ i +"].Status"));
			dataItem.setActiveTime(_ctx.stringValue("QueryAppDeviceListResponse.Data["+ i +"].ActiveTime"));
			dataItem.setLastOnlineTime(_ctx.stringValue("QueryAppDeviceListResponse.Data["+ i +"].LastOnlineTime"));
			dataItem.setCreateTime(_ctx.stringValue("QueryAppDeviceListResponse.Data["+ i +"].CreateTime"));
			dataItem.setChildDeviceCount(_ctx.longValue("QueryAppDeviceListResponse.Data["+ i +"].ChildDeviceCount"));
			dataItem.setUtcActiveTime(_ctx.stringValue("QueryAppDeviceListResponse.Data["+ i +"].UtcActiveTime"));
			dataItem.setUtcLastOnlineTime(_ctx.stringValue("QueryAppDeviceListResponse.Data["+ i +"].UtcLastOnlineTime"));
			dataItem.setUtcCreateTime(_ctx.stringValue("QueryAppDeviceListResponse.Data["+ i +"].UtcCreateTime"));

			data.add(dataItem);
		}
		queryAppDeviceListResponse.setData(data);
	 
	 	return queryAppDeviceListResponse;
	}
}