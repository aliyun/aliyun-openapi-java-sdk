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

import com.aliyuncs.iot.model.v20180120.QueryDeviceGroupByTagsResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceGroupByTagsResponse.DeviceGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceGroupByTagsResponseUnmarshaller {

	public static QueryDeviceGroupByTagsResponse unmarshall(QueryDeviceGroupByTagsResponse queryDeviceGroupByTagsResponse, UnmarshallerContext _ctx) {
		
		queryDeviceGroupByTagsResponse.setRequestId(_ctx.stringValue("QueryDeviceGroupByTagsResponse.RequestId"));
		queryDeviceGroupByTagsResponse.setSuccess(_ctx.booleanValue("QueryDeviceGroupByTagsResponse.Success"));
		queryDeviceGroupByTagsResponse.setCode(_ctx.stringValue("QueryDeviceGroupByTagsResponse.Code"));
		queryDeviceGroupByTagsResponse.setErrorMessage(_ctx.stringValue("QueryDeviceGroupByTagsResponse.ErrorMessage"));
		queryDeviceGroupByTagsResponse.setPage(_ctx.integerValue("QueryDeviceGroupByTagsResponse.Page"));
		queryDeviceGroupByTagsResponse.setPageSize(_ctx.integerValue("QueryDeviceGroupByTagsResponse.PageSize"));
		queryDeviceGroupByTagsResponse.setPageCount(_ctx.integerValue("QueryDeviceGroupByTagsResponse.PageCount"));
		queryDeviceGroupByTagsResponse.setTotal(_ctx.integerValue("QueryDeviceGroupByTagsResponse.Total"));

		List<DeviceGroup> data = new ArrayList<DeviceGroup>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceGroupByTagsResponse.Data.Length"); i++) {
			DeviceGroup deviceGroup = new DeviceGroup();
			deviceGroup.setGroupId(_ctx.stringValue("QueryDeviceGroupByTagsResponse.Data["+ i +"].GroupId"));
			deviceGroup.setGroupName(_ctx.stringValue("QueryDeviceGroupByTagsResponse.Data["+ i +"].GroupName"));

			data.add(deviceGroup);
		}
		queryDeviceGroupByTagsResponse.setData(data);
	 
	 	return queryDeviceGroupByTagsResponse;
	}
}