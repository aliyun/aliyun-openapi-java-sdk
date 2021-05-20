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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListDeviceGroupsResponse;
import com.aliyuncs.vcs.model.v20200515.ListDeviceGroupsResponse.DataItem;
import com.aliyuncs.vcs.model.v20200515.ListDeviceGroupsResponse.DataItem.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceGroupsResponseUnmarshaller {

	public static ListDeviceGroupsResponse unmarshall(ListDeviceGroupsResponse listDeviceGroupsResponse, UnmarshallerContext _ctx) {
		
		listDeviceGroupsResponse.setRequestId(_ctx.stringValue("ListDeviceGroupsResponse.RequestId"));
		listDeviceGroupsResponse.setMessage(_ctx.stringValue("ListDeviceGroupsResponse.Message"));
		listDeviceGroupsResponse.setCode(_ctx.stringValue("ListDeviceGroupsResponse.Code"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceGroupsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTotalCount(_ctx.stringValue("ListDeviceGroupsResponse.Data["+ i +"].TotalCount"));

			List<ListItem> list = new ArrayList<ListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDeviceGroupsResponse.Data["+ i +"].List.Length"); j++) {
				ListItem listItem = new ListItem();
				listItem.setInstallAddress(_ctx.stringValue("ListDeviceGroupsResponse.Data["+ i +"].List["+ j +"].InstallAddress"));
				listItem.setDeviceComputeStatus(_ctx.stringValue("ListDeviceGroupsResponse.Data["+ i +"].List["+ j +"].DeviceComputeStatus"));
				listItem.setDeviceSn(_ctx.stringValue("ListDeviceGroupsResponse.Data["+ i +"].List["+ j +"].DeviceSn"));
				listItem.setDeviceStreamStatus(_ctx.stringValue("ListDeviceGroupsResponse.Data["+ i +"].List["+ j +"].DeviceStreamStatus"));
				listItem.setDeviceGroup(_ctx.stringValue("ListDeviceGroupsResponse.Data["+ i +"].List["+ j +"].DeviceGroup"));
				listItem.setCodingFormat(_ctx.stringValue("ListDeviceGroupsResponse.Data["+ i +"].List["+ j +"].CodingFormat"));
				listItem.setType(_ctx.stringValue("ListDeviceGroupsResponse.Data["+ i +"].List["+ j +"].Type"));
				listItem.setRegionName(_ctx.stringValue("ListDeviceGroupsResponse.Data["+ i +"].List["+ j +"].RegionName"));
				listItem.setDataSourceType(_ctx.stringValue("ListDeviceGroupsResponse.Data["+ i +"].List["+ j +"].DataSourceType"));
				listItem.setDeviceCode(_ctx.stringValue("ListDeviceGroupsResponse.Data["+ i +"].List["+ j +"].DeviceCode"));
				listItem.setDeviceStatus(_ctx.stringValue("ListDeviceGroupsResponse.Data["+ i +"].List["+ j +"].DeviceStatus"));
				listItem.setRegionId(_ctx.stringValue("ListDeviceGroupsResponse.Data["+ i +"].List["+ j +"].RegionId"));
				listItem.setBitRate(_ctx.stringValue("ListDeviceGroupsResponse.Data["+ i +"].List["+ j +"].BitRate"));
				listItem.setResolvingPower(_ctx.stringValue("ListDeviceGroupsResponse.Data["+ i +"].List["+ j +"].ResolvingPower"));
				listItem.setDeviceName(_ctx.stringValue("ListDeviceGroupsResponse.Data["+ i +"].List["+ j +"].DeviceName"));

				list.add(listItem);
			}
			dataItem.setList(list);

			data.add(dataItem);
		}
		listDeviceGroupsResponse.setData(data);
	 
	 	return listDeviceGroupsResponse;
	}
}