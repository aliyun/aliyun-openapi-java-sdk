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

import com.aliyuncs.vcs.model.v20200515.ListNVRChannelDeviceResponse;
import com.aliyuncs.vcs.model.v20200515.ListNVRChannelDeviceResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNVRChannelDeviceResponseUnmarshaller {

	public static ListNVRChannelDeviceResponse unmarshall(ListNVRChannelDeviceResponse listNVRChannelDeviceResponse, UnmarshallerContext _ctx) {
		
		listNVRChannelDeviceResponse.setRequestId(_ctx.stringValue("ListNVRChannelDeviceResponse.RequestId"));
		listNVRChannelDeviceResponse.setMessage(_ctx.stringValue("ListNVRChannelDeviceResponse.Message"));
		listNVRChannelDeviceResponse.setTotal(_ctx.stringValue("ListNVRChannelDeviceResponse.Total"));
		listNVRChannelDeviceResponse.setSuccess(_ctx.booleanValue("ListNVRChannelDeviceResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListNVRChannelDeviceResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDeviceType(_ctx.stringValue("ListNVRChannelDeviceResponse.Data["+ i +"].DeviceType"));
			dataItem.setSampleName(_ctx.stringValue("ListNVRChannelDeviceResponse.Data["+ i +"].SampleName"));
			dataItem.setCorpId(_ctx.stringValue("ListNVRChannelDeviceResponse.Data["+ i +"].CorpId"));
			dataItem.setVap(_ctx.stringValue("ListNVRChannelDeviceResponse.Data["+ i +"].Vap"));
			dataItem.setProjectName(_ctx.stringValue("ListNVRChannelDeviceResponse.Data["+ i +"].ProjectName"));
			dataItem.setRegionName(_ctx.stringValue("ListNVRChannelDeviceResponse.Data["+ i +"].RegionName"));
			dataItem.setDeviceSn(_ctx.stringValue("ListNVRChannelDeviceResponse.Data["+ i +"].DeviceSn"));
			dataItem.setDatasourceType(_ctx.stringValue("ListNVRChannelDeviceResponse.Data["+ i +"].DatasourceType"));
			dataItem.setDeviceCode(_ctx.stringValue("ListNVRChannelDeviceResponse.Data["+ i +"].DeviceCode"));
			dataItem.setDeviceStatus(_ctx.stringValue("ListNVRChannelDeviceResponse.Data["+ i +"].DeviceStatus"));
			dataItem.setStreamStatus(_ctx.stringValue("ListNVRChannelDeviceResponse.Data["+ i +"].StreamStatus"));
			dataItem.setComptureStatus(_ctx.stringValue("ListNVRChannelDeviceResponse.Data["+ i +"].ComptureStatus"));
			dataItem.setDeviceName(_ctx.stringValue("ListNVRChannelDeviceResponse.Data["+ i +"].DeviceName"));

			data.add(dataItem);
		}
		listNVRChannelDeviceResponse.setData(data);
	 
	 	return listNVRChannelDeviceResponse;
	}
}