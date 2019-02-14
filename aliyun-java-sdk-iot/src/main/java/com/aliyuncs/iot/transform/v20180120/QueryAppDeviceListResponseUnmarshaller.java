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

	public static QueryAppDeviceListResponse unmarshall(QueryAppDeviceListResponse queryAppDeviceListResponse, UnmarshallerContext context) {
		
		queryAppDeviceListResponse.setRequestId(context.stringValue("QueryAppDeviceListResponse.RequestId"));
		queryAppDeviceListResponse.setSuccess(context.booleanValue("QueryAppDeviceListResponse.Success"));
		queryAppDeviceListResponse.setErrorMessage(context.stringValue("QueryAppDeviceListResponse.ErrorMessage"));
		queryAppDeviceListResponse.setCode(context.stringValue("QueryAppDeviceListResponse.Code"));
		queryAppDeviceListResponse.setPage(context.integerValue("QueryAppDeviceListResponse.Page"));
		queryAppDeviceListResponse.setPageSize(context.integerValue("QueryAppDeviceListResponse.PageSize"));
		queryAppDeviceListResponse.setPageCount(context.integerValue("QueryAppDeviceListResponse.PageCount"));
		queryAppDeviceListResponse.setTotal(context.integerValue("QueryAppDeviceListResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("QueryAppDeviceListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setProductName(context.stringValue("QueryAppDeviceListResponse.Data["+ i +"].ProductName"));
			dataItem.setProductKey(context.stringValue("QueryAppDeviceListResponse.Data["+ i +"].ProductKey"));
			dataItem.setDeviceName(context.stringValue("QueryAppDeviceListResponse.Data["+ i +"].DeviceName"));
			dataItem.setNodeType(context.integerValue("QueryAppDeviceListResponse.Data["+ i +"].NodeType"));
			dataItem.setStatus(context.stringValue("QueryAppDeviceListResponse.Data["+ i +"].Status"));
			dataItem.setActiveTime(context.stringValue("QueryAppDeviceListResponse.Data["+ i +"].ActiveTime"));
			dataItem.setLastOnlineTime(context.stringValue("QueryAppDeviceListResponse.Data["+ i +"].LastOnlineTime"));
			dataItem.setCreateTime(context.stringValue("QueryAppDeviceListResponse.Data["+ i +"].CreateTime"));
			dataItem.setChildDeviceCount(context.longValue("QueryAppDeviceListResponse.Data["+ i +"].ChildDeviceCount"));
			dataItem.setUtcActiveTime(context.stringValue("QueryAppDeviceListResponse.Data["+ i +"].UtcActiveTime"));
			dataItem.setUtcLastOnlineTime(context.stringValue("QueryAppDeviceListResponse.Data["+ i +"].UtcLastOnlineTime"));
			dataItem.setUtcCreateTime(context.stringValue("QueryAppDeviceListResponse.Data["+ i +"].UtcCreateTime"));

			data.add(dataItem);
		}
		queryAppDeviceListResponse.setData(data);
	 
	 	return queryAppDeviceListResponse;
	}
}