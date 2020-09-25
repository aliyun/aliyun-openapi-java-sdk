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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyuncvc.model.v20191030.ListConferenceDevicesResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.ListConferenceDevicesResponse.Data.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConferenceDevicesResponseUnmarshaller {

	public static ListConferenceDevicesResponse unmarshall(ListConferenceDevicesResponse listConferenceDevicesResponse, UnmarshallerContext _ctx) {
		
		listConferenceDevicesResponse.setRequestId(_ctx.stringValue("ListConferenceDevicesResponse.RequestId"));
		listConferenceDevicesResponse.setErrorCode(_ctx.integerValue("ListConferenceDevicesResponse.ErrorCode"));
		listConferenceDevicesResponse.setMessage(_ctx.stringValue("ListConferenceDevicesResponse.Message"));
		listConferenceDevicesResponse.setSuccess(_ctx.booleanValue("ListConferenceDevicesResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListConferenceDevicesResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("ListConferenceDevicesResponse.Data.PageSize"));
		data.setPageNumber(_ctx.integerValue("ListConferenceDevicesResponse.Data.PageNumber"));

		List<Data> conferences = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListConferenceDevicesResponse.Data.Conferences.Length"); i++) {
			Data data_ = new Data();
			data_.setActivationCode(_ctx.stringValue("ListConferenceDevicesResponse.Data.Conferences["+ i +"].ActivationCode"));
			data_.setConferenceCode(_ctx.stringValue("ListConferenceDevicesResponse.Data.Conferences["+ i +"].ConferenceCode"));
			data_.setConferenceName(_ctx.stringValue("ListConferenceDevicesResponse.Data.Conferences["+ i +"].ConferenceName"));
			data_.setCreateTime(_ctx.stringValue("ListConferenceDevicesResponse.Data.Conferences["+ i +"].CreateTime"));
			data_.setDeviceModel(_ctx.stringValue("ListConferenceDevicesResponse.Data.Conferences["+ i +"].DeviceModel"));
			data_.setManufacturer(_ctx.stringValue("ListConferenceDevicesResponse.Data.Conferences["+ i +"].Manufacturer"));
			data_.setPictureUrl(_ctx.stringValue("ListConferenceDevicesResponse.Data.Conferences["+ i +"].PictureUrl"));
			data_.setSN(_ctx.stringValue("ListConferenceDevicesResponse.Data.Conferences["+ i +"].SN"));
			data_.setStatus(_ctx.stringValue("ListConferenceDevicesResponse.Data.Conferences["+ i +"].Status"));
			data_.setCastScreenCode(_ctx.stringValue("ListConferenceDevicesResponse.Data.Conferences["+ i +"].CastScreenCode"));

			conferences.add(data_);
		}
		data.setConferences(conferences);
		listConferenceDevicesResponse.setData(listConferenceDevicesResponseData);
	 
	 	return listConferenceDevicesResponse;
	}
}