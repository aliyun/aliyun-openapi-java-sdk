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

package com.aliyuncs.ltl.transform.v20190510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ltl.model.v20190510.ListDeviceGroupResponse;
import com.aliyuncs.ltl.model.v20190510.ListDeviceGroupResponse.Data;
import com.aliyuncs.ltl.model.v20190510.ListDeviceGroupResponse.Data.DeviceGroupInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceGroupResponseUnmarshaller {

	public static ListDeviceGroupResponse unmarshall(ListDeviceGroupResponse listDeviceGroupResponse, UnmarshallerContext _ctx) {
		
		listDeviceGroupResponse.setRequestId(_ctx.stringValue("ListDeviceGroupResponse.RequestId"));
		listDeviceGroupResponse.setCode(_ctx.integerValue("ListDeviceGroupResponse.Code"));
		listDeviceGroupResponse.setSuccess(_ctx.booleanValue("ListDeviceGroupResponse.Success"));
		listDeviceGroupResponse.setMessage(_ctx.stringValue("ListDeviceGroupResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListDeviceGroupResponse.Data.Total"));
		data.setNum(_ctx.integerValue("ListDeviceGroupResponse.Data.Num"));
		data.setSize(_ctx.integerValue("ListDeviceGroupResponse.Data.Size"));

		List<DeviceGroupInfo> pageData = new ArrayList<DeviceGroupInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceGroupResponse.Data.PageData.Length"); i++) {
			DeviceGroupInfo deviceGroupInfo = new DeviceGroupInfo();
			deviceGroupInfo.setDeviceGroupId(_ctx.stringValue("ListDeviceGroupResponse.Data.PageData["+ i +"].DeviceGroupId"));
			deviceGroupInfo.setProductKey(_ctx.stringValue("ListDeviceGroupResponse.Data.PageData["+ i +"].ProductKey"));
			deviceGroupInfo.setAuthorizeType(_ctx.stringValue("ListDeviceGroupResponse.Data.PageData["+ i +"].AuthorizeType"));
			deviceGroupInfo.setStatus(_ctx.stringValue("ListDeviceGroupResponse.Data.PageData["+ i +"].Status"));
			deviceGroupInfo.setOwnerUid(_ctx.stringValue("ListDeviceGroupResponse.Data.PageData["+ i +"].OwnerUid"));
			deviceGroupInfo.setOwnerName(_ctx.stringValue("ListDeviceGroupResponse.Data.PageData["+ i +"].OwnerName"));
			deviceGroupInfo.setRemark(_ctx.stringValue("ListDeviceGroupResponse.Data.PageData["+ i +"].Remark"));

			pageData.add(deviceGroupInfo);
		}
		data.setPageData(pageData);
		listDeviceGroupResponse.setData(data);
	 
	 	return listDeviceGroupResponse;
	}
}