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

import com.aliyuncs.vcs.model.v20200515.ListDevicesResponse;
import com.aliyuncs.vcs.model.v20200515.ListDevicesResponse.Data;
import com.aliyuncs.vcs.model.v20200515.ListDevicesResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevicesResponseUnmarshaller {

	public static ListDevicesResponse unmarshall(ListDevicesResponse listDevicesResponse, UnmarshallerContext _ctx) {
		
		listDevicesResponse.setRequestId(_ctx.stringValue("ListDevicesResponse.RequestId"));
		listDevicesResponse.setMessage(_ctx.stringValue("ListDevicesResponse.Message"));
		listDevicesResponse.setCode(_ctx.stringValue("ListDevicesResponse.Code"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListDevicesResponse.Data.TotalCount"));
		data.setPageSize(_ctx.integerValue("ListDevicesResponse.Data.PageSize"));
		data.setTotalPage(_ctx.integerValue("ListDevicesResponse.Data.TotalPage"));
		data.setPageNumber(_ctx.integerValue("ListDevicesResponse.Data.PageNumber"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("ListDevicesResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setStatus(_ctx.integerValue("ListDevicesResponse.Data.Records["+ i +"].Status"));
			record.setAccessProtocolType(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].AccessProtocolType"));
			record.setSipServerIp(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].SipServerIp"));
			record.setCoverImageUrl(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].CoverImageUrl"));
			record.setCreateTime(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].CreateTime"));
			record.setLatitude(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].Latitude"));
			record.setVendor(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].Vendor"));
			record.setLongitude(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].Longitude"));
			record.setSipGBId(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].SipGBId"));
			record.setDeviceDirection(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].DeviceDirection"));
			record.setSipPassword(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].SipPassword"));
			record.setDeviceType(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].DeviceType"));
			record.setDeviceAddress(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].DeviceAddress"));
			record.setGbId(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].GbId"));
			record.setBitRate(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].BitRate"));
			record.setDeviceSite(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].DeviceSite"));
			record.setSipServerPort(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].SipServerPort"));
			record.setResolution(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].Resolution"));
			record.setDeviceName(_ctx.stringValue("ListDevicesResponse.Data.Records["+ i +"].DeviceName"));

			records.add(record);
		}
		data.setRecords(records);
		listDevicesResponse.setData(data);
	 
	 	return listDevicesResponse;
	}
}