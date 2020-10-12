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
import com.aliyuncs.aliyuncvc.model.v20191030.ListConferenceDevicesResponse.ConferencesDatas;
import com.aliyuncs.aliyuncvc.model.v20191030.ListConferenceDevicesResponse.ConferencesDatas.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConferenceDevicesResponseUnmarshaller {

	public static ListConferenceDevicesResponse unmarshall(ListConferenceDevicesResponse listConferenceDevicesResponse, UnmarshallerContext _ctx) {
		
		listConferenceDevicesResponse.setRequestId(_ctx.stringValue("ListConferenceDevicesResponse.RequestId"));
		listConferenceDevicesResponse.setErrorCode(_ctx.integerValue("ListConferenceDevicesResponse.ErrorCode"));
		listConferenceDevicesResponse.setMessage(_ctx.stringValue("ListConferenceDevicesResponse.Message"));
		listConferenceDevicesResponse.setSuccess(_ctx.booleanValue("ListConferenceDevicesResponse.Success"));

		ConferencesDatas conferencesDatas = new ConferencesDatas();
		conferencesDatas.setTotal(_ctx.integerValue("ListConferenceDevicesResponse.ConferencesDatas.Total"));
		conferencesDatas.setPageSize(_ctx.integerValue("ListConferenceDevicesResponse.ConferencesDatas.PageSize"));
		conferencesDatas.setPageNumber(_ctx.integerValue("ListConferenceDevicesResponse.ConferencesDatas.PageNumber"));

		List<Data> conferences = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListConferenceDevicesResponse.ConferencesDatas.Conferences.Length"); i++) {
			Data data = new Data();
			data.setActivationCode(_ctx.stringValue("ListConferenceDevicesResponse.ConferencesDatas.Conferences["+ i +"].ActivationCode"));
			data.setConferenceCode(_ctx.stringValue("ListConferenceDevicesResponse.ConferencesDatas.Conferences["+ i +"].ConferenceCode"));
			data.setConferenceName(_ctx.stringValue("ListConferenceDevicesResponse.ConferencesDatas.Conferences["+ i +"].ConferenceName"));
			data.setCreateTime(_ctx.stringValue("ListConferenceDevicesResponse.ConferencesDatas.Conferences["+ i +"].CreateTime"));
			data.setDeviceModel(_ctx.stringValue("ListConferenceDevicesResponse.ConferencesDatas.Conferences["+ i +"].DeviceModel"));
			data.setManufacturer(_ctx.stringValue("ListConferenceDevicesResponse.ConferencesDatas.Conferences["+ i +"].Manufacturer"));
			data.setPictureUrl(_ctx.stringValue("ListConferenceDevicesResponse.ConferencesDatas.Conferences["+ i +"].PictureUrl"));
			data.setSN(_ctx.stringValue("ListConferenceDevicesResponse.ConferencesDatas.Conferences["+ i +"].SN"));
			data.setStatus(_ctx.stringValue("ListConferenceDevicesResponse.ConferencesDatas.Conferences["+ i +"].Status"));
			data.setCastScreenCode(_ctx.stringValue("ListConferenceDevicesResponse.ConferencesDatas.Conferences["+ i +"].CastScreenCode"));

			conferences.add(data);
		}
		conferencesDatas.setConferences(conferences);
		listConferenceDevicesResponse.setConferencesDatas(conferencesDatas);
	 
	 	return listConferenceDevicesResponse;
	}
}