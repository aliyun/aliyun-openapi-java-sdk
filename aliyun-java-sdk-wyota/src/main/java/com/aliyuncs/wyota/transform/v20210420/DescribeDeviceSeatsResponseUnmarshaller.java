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

import com.aliyuncs.wyota.model.v20210420.DescribeDeviceSeatsResponse;
import com.aliyuncs.wyota.model.v20210420.DescribeDeviceSeatsResponse.DeviceSeats;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeviceSeatsResponseUnmarshaller {

	public static DescribeDeviceSeatsResponse unmarshall(DescribeDeviceSeatsResponse describeDeviceSeatsResponse, UnmarshallerContext _ctx) {
		
		describeDeviceSeatsResponse.setRequestId(_ctx.stringValue("DescribeDeviceSeatsResponse.RequestId"));
		describeDeviceSeatsResponse.setCode(_ctx.stringValue("DescribeDeviceSeatsResponse.Code"));
		describeDeviceSeatsResponse.setMessage(_ctx.stringValue("DescribeDeviceSeatsResponse.Message"));
		describeDeviceSeatsResponse.setTotalCount(_ctx.longValue("DescribeDeviceSeatsResponse.TotalCount"));
		describeDeviceSeatsResponse.setPageSize(_ctx.integerValue("DescribeDeviceSeatsResponse.PageSize"));
		describeDeviceSeatsResponse.setPageNumber(_ctx.integerValue("DescribeDeviceSeatsResponse.PageNumber"));

		List<DeviceSeats> data = new ArrayList<DeviceSeats>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeviceSeatsResponse.Data.Length"); i++) {
			DeviceSeats deviceSeats = new DeviceSeats();
			deviceSeats.setSerialNo(_ctx.stringValue("DescribeDeviceSeatsResponse.Data["+ i +"].SerialNo"));
			deviceSeats.setSiteId(_ctx.stringValue("DescribeDeviceSeatsResponse.Data["+ i +"].SiteId"));
			deviceSeats.setSiteName(_ctx.stringValue("DescribeDeviceSeatsResponse.Data["+ i +"].SiteName"));
			deviceSeats.setSeatNo(_ctx.stringValue("DescribeDeviceSeatsResponse.Data["+ i +"].SeatNo"));
			deviceSeats.setSeatRow(_ctx.integerValue("DescribeDeviceSeatsResponse.Data["+ i +"].SeatRow"));
			deviceSeats.setSeatCol(_ctx.integerValue("DescribeDeviceSeatsResponse.Data["+ i +"].SeatCol"));
			deviceSeats.setSeatName(_ctx.stringValue("DescribeDeviceSeatsResponse.Data["+ i +"].SeatName"));

			data.add(deviceSeats);
		}
		describeDeviceSeatsResponse.setData(data);
	 
	 	return describeDeviceSeatsResponse;
	}
}