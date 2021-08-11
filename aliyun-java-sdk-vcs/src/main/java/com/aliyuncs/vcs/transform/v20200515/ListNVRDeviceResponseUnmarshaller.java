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

import com.aliyuncs.vcs.model.v20200515.ListNVRDeviceResponse;
import com.aliyuncs.vcs.model.v20200515.ListNVRDeviceResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNVRDeviceResponseUnmarshaller {

	public static ListNVRDeviceResponse unmarshall(ListNVRDeviceResponse listNVRDeviceResponse, UnmarshallerContext _ctx) {
		
		listNVRDeviceResponse.setRequestId(_ctx.stringValue("ListNVRDeviceResponse.RequestId"));
		listNVRDeviceResponse.setSuccess(_ctx.booleanValue("ListNVRDeviceResponse.Success"));
		listNVRDeviceResponse.setTotal(_ctx.stringValue("ListNVRDeviceResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListNVRDeviceResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDeviceCode(_ctx.stringValue("ListNVRDeviceResponse.Data["+ i +"].DeviceCode"));
			dataItem.setDeviceName(_ctx.stringValue("ListNVRDeviceResponse.Data["+ i +"].DeviceName"));
			dataItem.setDeviceType(_ctx.stringValue("ListNVRDeviceResponse.Data["+ i +"].DeviceType"));
			dataItem.setDatasourceType(_ctx.stringValue("ListNVRDeviceResponse.Data["+ i +"].DatasourceType"));
			dataItem.setDeviceStatus(_ctx.stringValue("ListNVRDeviceResponse.Data["+ i +"].DeviceStatus"));
			dataItem.setStreamStatus(_ctx.stringValue("ListNVRDeviceResponse.Data["+ i +"].StreamStatus"));
			dataItem.setComptureStatus(_ctx.stringValue("ListNVRDeviceResponse.Data["+ i +"].ComptureStatus"));
			dataItem.setRegionName(_ctx.stringValue("ListNVRDeviceResponse.Data["+ i +"].RegionName"));
			dataItem.setProjectName(_ctx.stringValue("ListNVRDeviceResponse.Data["+ i +"].ProjectName"));
			dataItem.setRegistrationTime(_ctx.stringValue("ListNVRDeviceResponse.Data["+ i +"].RegistrationTime"));
			dataItem.setAccessQuota(_ctx.stringValue("ListNVRDeviceResponse.Data["+ i +"].AccessQuota"));
			dataItem.setChannel(_ctx.stringValue("ListNVRDeviceResponse.Data["+ i +"].Channel"));
			dataItem.setDeviceSn(_ctx.stringValue("ListNVRDeviceResponse.Data["+ i +"].DeviceSn"));
			dataItem.setType(_ctx.stringValue("ListNVRDeviceResponse.Data["+ i +"].Type"));
			dataItem.setCorpId(_ctx.stringValue("ListNVRDeviceResponse.Data["+ i +"].CorpId"));

			data.add(dataItem);
		}
		listNVRDeviceResponse.setData(data);
	 
	 	return listNVRDeviceResponse;
	}
}