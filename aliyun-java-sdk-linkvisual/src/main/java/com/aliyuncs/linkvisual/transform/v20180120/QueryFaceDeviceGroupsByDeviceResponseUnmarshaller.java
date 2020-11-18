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

import com.aliyuncs.linkvisual.model.v20180120.QueryFaceDeviceGroupsByDeviceResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceDeviceGroupsByDeviceResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceDeviceGroupsByDeviceResponse.Data.DeviceGroupListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaceDeviceGroupsByDeviceResponseUnmarshaller {

	public static QueryFaceDeviceGroupsByDeviceResponse unmarshall(QueryFaceDeviceGroupsByDeviceResponse queryFaceDeviceGroupsByDeviceResponse, UnmarshallerContext _ctx) {
		
		queryFaceDeviceGroupsByDeviceResponse.setRequestId(_ctx.stringValue("QueryFaceDeviceGroupsByDeviceResponse.RequestId"));
		queryFaceDeviceGroupsByDeviceResponse.setSuccess(_ctx.booleanValue("QueryFaceDeviceGroupsByDeviceResponse.Success"));
		queryFaceDeviceGroupsByDeviceResponse.setCode(_ctx.stringValue("QueryFaceDeviceGroupsByDeviceResponse.Code"));
		queryFaceDeviceGroupsByDeviceResponse.setErrorMessage(_ctx.stringValue("QueryFaceDeviceGroupsByDeviceResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryFaceDeviceGroupsByDeviceResponse.Data.Total"));
		data.setPageNo(_ctx.integerValue("QueryFaceDeviceGroupsByDeviceResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("QueryFaceDeviceGroupsByDeviceResponse.Data.PageSize"));

		List<DeviceGroupListItem> deviceGroupList = new ArrayList<DeviceGroupListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryFaceDeviceGroupsByDeviceResponse.Data.DeviceGroupList.Length"); i++) {
			DeviceGroupListItem deviceGroupListItem = new DeviceGroupListItem();
			deviceGroupListItem.setDeviceGroupId(_ctx.stringValue("QueryFaceDeviceGroupsByDeviceResponse.Data.DeviceGroupList["+ i +"].DeviceGroupId"));
			deviceGroupListItem.setDeviceGroupName(_ctx.stringValue("QueryFaceDeviceGroupsByDeviceResponse.Data.DeviceGroupList["+ i +"].DeviceGroupName"));
			deviceGroupListItem.setModifiedTime(_ctx.stringValue("QueryFaceDeviceGroupsByDeviceResponse.Data.DeviceGroupList["+ i +"].ModifiedTime"));

			deviceGroupList.add(deviceGroupListItem);
		}
		data.setDeviceGroupList(deviceGroupList);
		queryFaceDeviceGroupsByDeviceResponse.setData(data);
	 
	 	return queryFaceDeviceGroupsByDeviceResponse;
	}
}