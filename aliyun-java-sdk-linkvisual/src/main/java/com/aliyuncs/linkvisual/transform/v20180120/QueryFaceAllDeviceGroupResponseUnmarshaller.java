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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryFaceAllDeviceGroupResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceAllDeviceGroupResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceAllDeviceGroupResponse.Data.DeviceGroupListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaceAllDeviceGroupResponseUnmarshaller {

	public static QueryFaceAllDeviceGroupResponse unmarshall(QueryFaceAllDeviceGroupResponse queryFaceAllDeviceGroupResponse, UnmarshallerContext _ctx) {
		
		queryFaceAllDeviceGroupResponse.setRequestId(_ctx.stringValue("QueryFaceAllDeviceGroupResponse.RequestId"));
		queryFaceAllDeviceGroupResponse.setSuccess(_ctx.booleanValue("QueryFaceAllDeviceGroupResponse.Success"));
		queryFaceAllDeviceGroupResponse.setCode(_ctx.stringValue("QueryFaceAllDeviceGroupResponse.Code"));
		queryFaceAllDeviceGroupResponse.setErrorMessage(_ctx.stringValue("QueryFaceAllDeviceGroupResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryFaceAllDeviceGroupResponse.Data.Total"));
		data.setPageNo(_ctx.integerValue("QueryFaceAllDeviceGroupResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("QueryFaceAllDeviceGroupResponse.Data.PageSize"));

		List<DeviceGroupListItem> deviceGroupList = new ArrayList<DeviceGroupListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryFaceAllDeviceGroupResponse.Data.DeviceGroupList.Length"); i++) {
			DeviceGroupListItem deviceGroupListItem = new DeviceGroupListItem();
			deviceGroupListItem.setDeviceGroupId(_ctx.stringValue("QueryFaceAllDeviceGroupResponse.Data.DeviceGroupList["+ i +"].DeviceGroupId"));
			deviceGroupListItem.setDeviceGroupName(_ctx.stringValue("QueryFaceAllDeviceGroupResponse.Data.DeviceGroupList["+ i +"].DeviceGroupName"));
			deviceGroupListItem.setModifiedTime(_ctx.stringValue("QueryFaceAllDeviceGroupResponse.Data.DeviceGroupList["+ i +"].ModifiedTime"));

			deviceGroupList.add(deviceGroupListItem);
		}
		data.setDeviceGroupList(deviceGroupList);
		queryFaceAllDeviceGroupResponse.setData(data);
	 
	 	return queryFaceAllDeviceGroupResponse;
	}
}