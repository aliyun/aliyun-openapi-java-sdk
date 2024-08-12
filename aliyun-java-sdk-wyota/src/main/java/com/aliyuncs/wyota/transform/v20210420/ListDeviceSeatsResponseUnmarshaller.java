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

package com.aliyuncs.wyota.transform.v20210420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.wyota.model.v20210420.ListDeviceSeatsResponse;
import com.aliyuncs.wyota.model.v20210420.ListDeviceSeatsResponse.Data;
import com.aliyuncs.wyota.model.v20210420.ListDeviceSeatsResponse.Data.DeviceSeatDTOListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceSeatsResponseUnmarshaller {

	public static ListDeviceSeatsResponse unmarshall(ListDeviceSeatsResponse listDeviceSeatsResponse, UnmarshallerContext _ctx) {
		
		listDeviceSeatsResponse.setRequestId(_ctx.stringValue("ListDeviceSeatsResponse.RequestId"));
		listDeviceSeatsResponse.setMessage(_ctx.stringValue("ListDeviceSeatsResponse.Message"));
		listDeviceSeatsResponse.setCode(_ctx.stringValue("ListDeviceSeatsResponse.Code"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListDeviceSeatsResponse.Data.TotalCount"));

		List<DeviceSeatDTOListItem> deviceSeatDTOList = new ArrayList<DeviceSeatDTOListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceSeatsResponse.Data.DeviceSeatDTOList.Length"); i++) {
			DeviceSeatDTOListItem deviceSeatDTOListItem = new DeviceSeatDTOListItem();
			deviceSeatDTOListItem.setSerialNo(_ctx.stringValue("ListDeviceSeatsResponse.Data.DeviceSeatDTOList["+ i +"].SerialNo"));
			deviceSeatDTOListItem.setSiteId(_ctx.stringValue("ListDeviceSeatsResponse.Data.DeviceSeatDTOList["+ i +"].SiteId"));
			deviceSeatDTOListItem.setZoneId(_ctx.stringValue("ListDeviceSeatsResponse.Data.DeviceSeatDTOList["+ i +"].ZoneId"));
			deviceSeatDTOListItem.setSiteName(_ctx.stringValue("ListDeviceSeatsResponse.Data.DeviceSeatDTOList["+ i +"].SiteName"));
			deviceSeatDTOListItem.setSeatNo(_ctx.stringValue("ListDeviceSeatsResponse.Data.DeviceSeatDTOList["+ i +"].SeatNo"));
			deviceSeatDTOListItem.setSeatName(_ctx.stringValue("ListDeviceSeatsResponse.Data.DeviceSeatDTOList["+ i +"].SeatName"));
			deviceSeatDTOListItem.setLabel(_ctx.stringValue("ListDeviceSeatsResponse.Data.DeviceSeatDTOList["+ i +"].Label"));

			deviceSeatDTOList.add(deviceSeatDTOListItem);
		}
		data.setDeviceSeatDTOList(deviceSeatDTOList);
		listDeviceSeatsResponse.setData(data);
	 
	 	return listDeviceSeatsResponse;
	}
}