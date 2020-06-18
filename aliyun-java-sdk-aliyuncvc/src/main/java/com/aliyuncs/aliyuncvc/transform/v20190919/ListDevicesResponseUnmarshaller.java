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

package com.aliyuncs.aliyuncvc.transform.v20190919;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyuncvc.model.v20190919.ListDevicesResponse;
import com.aliyuncs.aliyuncvc.model.v20190919.ListDevicesResponse.Data.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevicesResponseUnmarshaller {

	public static ListDevicesResponse unmarshall(ListDevicesResponse listDevicesResponse, UnmarshallerContext _ctx) {
		
		listDevicesResponse.setRequestId(_ctx.stringValue("ListDevicesResponse.RequestId"));
		listDevicesResponse.setErrorCode(_ctx.integerValue("ListDevicesResponse.ErrorCode"));
		listDevicesResponse.setMessage(_ctx.stringValue("ListDevicesResponse.Message"));
		listDevicesResponse.setSuccess(_ctx.booleanValue("ListDevicesResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListDevicesResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("ListDevicesResponse.Data.PageSize"));
		data.setPageNumber(_ctx.integerValue("ListDevicesResponse.Data.PageNumber"));

		List<Data> devices = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListDevicesResponse.Data.Devices.Length"); i++) {
			Data data_ = new Data();
			data_.setActivationCode(_ctx.stringValue("ListDevicesResponse.Data.Devices["+ i +"].ActivationCode"));
			data_.setConferenceCode(_ctx.stringValue("ListDevicesResponse.Data.Devices["+ i +"].ConferenceCode"));
			data_.setConferenceName(_ctx.stringValue("ListDevicesResponse.Data.Devices["+ i +"].ConferenceName"));
			data_.setCreateTime(_ctx.stringValue("ListDevicesResponse.Data.Devices["+ i +"].CreateTime"));
			data_.setPictureUrl(_ctx.stringValue("ListDevicesResponse.Data.Devices["+ i +"].PictureUrl"));
			data_.setSN(_ctx.stringValue("ListDevicesResponse.Data.Devices["+ i +"].SN"));
			data_.setStatus(_ctx.stringValue("ListDevicesResponse.Data.Devices["+ i +"].Status"));
			data_.setCastScreenCode(_ctx.stringValue("ListDevicesResponse.Data.Devices["+ i +"].CastScreenCode"));

			devices.add(data_);
		}
		data.setDevices(devices);
		listDevicesResponse.setData(listDevicesResponseData);
	 
	 	return listDevicesResponse;
	}
}