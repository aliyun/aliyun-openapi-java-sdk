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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListVersionDeviceGroupsResponse;
import com.aliyuncs.iovcc.model.v20180501.ListVersionDeviceGroupsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVersionDeviceGroupsResponseUnmarshaller {

	public static ListVersionDeviceGroupsResponse unmarshall(ListVersionDeviceGroupsResponse listVersionDeviceGroupsResponse, UnmarshallerContext _ctx) {
		
		listVersionDeviceGroupsResponse.setRequestId(_ctx.stringValue("ListVersionDeviceGroupsResponse.RequestId"));

		List<Result> deviceGroupList = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("ListVersionDeviceGroupsResponse.DeviceGroupList.Length"); i++) {
			Result result = new Result();
			result.setId(_ctx.stringValue("ListVersionDeviceGroupsResponse.DeviceGroupList["+ i +"].Id"));
			result.setName(_ctx.stringValue("ListVersionDeviceGroupsResponse.DeviceGroupList["+ i +"].Name"));
			result.setDescription(_ctx.stringValue("ListVersionDeviceGroupsResponse.DeviceGroupList["+ i +"].Description"));
			result.setGmtCreate(_ctx.stringValue("ListVersionDeviceGroupsResponse.DeviceGroupList["+ i +"].GmtCreate"));
			result.setGmtModify(_ctx.stringValue("ListVersionDeviceGroupsResponse.DeviceGroupList["+ i +"].GmtModify"));

			deviceGroupList.add(result);
		}
		listVersionDeviceGroupsResponse.setDeviceGroupList(deviceGroupList);
	 
	 	return listVersionDeviceGroupsResponse;
	}
}