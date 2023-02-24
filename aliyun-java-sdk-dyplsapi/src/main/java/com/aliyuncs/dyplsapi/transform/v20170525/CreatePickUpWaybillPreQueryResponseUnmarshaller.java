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

package com.aliyuncs.dyplsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dyplsapi.model.v20170525.CreatePickUpWaybillPreQueryResponse;
import com.aliyuncs.dyplsapi.model.v20170525.CreatePickUpWaybillPreQueryResponse.Data;
import com.aliyuncs.dyplsapi.model.v20170525.CreatePickUpWaybillPreQueryResponse.Data.TdTimeSelect;
import com.aliyuncs.dyplsapi.model.v20170525.CreatePickUpWaybillPreQueryResponse.Data.TdTimeSelect.RealTime;
import com.aliyuncs.dyplsapi.model.v20170525.CreatePickUpWaybillPreQueryResponse.Data.TdTimeSelect.TdAppointTimeDTO;
import com.aliyuncs.dyplsapi.model.v20170525.CreatePickUpWaybillPreQueryResponse.Data.TdTimeSelect.TdAppointTimeDTO.TdAppointTimeSlotDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePickUpWaybillPreQueryResponseUnmarshaller {

	public static CreatePickUpWaybillPreQueryResponse unmarshall(CreatePickUpWaybillPreQueryResponse createPickUpWaybillPreQueryResponse, UnmarshallerContext _ctx) {
		
		createPickUpWaybillPreQueryResponse.setRequestId(_ctx.stringValue("CreatePickUpWaybillPreQueryResponse.RequestId"));
		createPickUpWaybillPreQueryResponse.setHttpStatusCode(_ctx.integerValue("CreatePickUpWaybillPreQueryResponse.HttpStatusCode"));
		createPickUpWaybillPreQueryResponse.setMessage(_ctx.stringValue("CreatePickUpWaybillPreQueryResponse.Message"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("CreatePickUpWaybillPreQueryResponse.Data.Success"));
		data.setErrorCode(_ctx.stringValue("CreatePickUpWaybillPreQueryResponse.Data.ErrorCode"));
		data.setErrorMsg(_ctx.stringValue("CreatePickUpWaybillPreQueryResponse.Data.ErrorMsg"));
		data.setCode(_ctx.stringValue("CreatePickUpWaybillPreQueryResponse.Data.Code"));
		data.setMessage(_ctx.stringValue("CreatePickUpWaybillPreQueryResponse.Data.Message"));

		List<TdTimeSelect> cpTimeSelectList = new ArrayList<TdTimeSelect>();
		for (int i = 0; i < _ctx.lengthValue("CreatePickUpWaybillPreQueryResponse.Data.CpTimeSelectList.Length"); i++) {
			TdTimeSelect tdTimeSelect = new TdTimeSelect();
			tdTimeSelect.setPrePrice(_ctx.stringValue("CreatePickUpWaybillPreQueryResponse.Data.CpTimeSelectList["+ i +"].PrePrice"));

			RealTime realTime = new RealTime();
			realTime.setName(_ctx.stringValue("CreatePickUpWaybillPreQueryResponse.Data.CpTimeSelectList["+ i +"].RealTime.Name"));
			realTime.setSelectable(_ctx.booleanValue("CreatePickUpWaybillPreQueryResponse.Data.CpTimeSelectList["+ i +"].RealTime.Selectable"));
			realTime.setSelectDisableTip(_ctx.stringValue("CreatePickUpWaybillPreQueryResponse.Data.CpTimeSelectList["+ i +"].RealTime.SelectDisableTip"));
			tdTimeSelect.setRealTime(realTime);

			List<TdAppointTimeDTO> appointTimes = new ArrayList<TdAppointTimeDTO>();
			for (int j = 0; j < _ctx.lengthValue("CreatePickUpWaybillPreQueryResponse.Data.CpTimeSelectList["+ i +"].AppointTimes.Length"); j++) {
				TdAppointTimeDTO tdAppointTimeDTO = new TdAppointTimeDTO();
				tdAppointTimeDTO.setDate(_ctx.stringValue("CreatePickUpWaybillPreQueryResponse.Data.CpTimeSelectList["+ i +"].AppointTimes["+ j +"].Date"));
				tdAppointTimeDTO.setDateSelectable(_ctx.booleanValue("CreatePickUpWaybillPreQueryResponse.Data.CpTimeSelectList["+ i +"].AppointTimes["+ j +"].DateSelectable"));

				List<TdAppointTimeSlotDTO> timeList = new ArrayList<TdAppointTimeSlotDTO>();
				for (int k = 0; k < _ctx.lengthValue("CreatePickUpWaybillPreQueryResponse.Data.CpTimeSelectList["+ i +"].AppointTimes["+ j +"].TimeList.Length"); k++) {
					TdAppointTimeSlotDTO tdAppointTimeSlotDTO = new TdAppointTimeSlotDTO();
					tdAppointTimeSlotDTO.setStartTime(_ctx.stringValue("CreatePickUpWaybillPreQueryResponse.Data.CpTimeSelectList["+ i +"].AppointTimes["+ j +"].TimeList["+ k +"].StartTime"));
					tdAppointTimeSlotDTO.setEndTime(_ctx.stringValue("CreatePickUpWaybillPreQueryResponse.Data.CpTimeSelectList["+ i +"].AppointTimes["+ j +"].TimeList["+ k +"].EndTime"));
					tdAppointTimeSlotDTO.setSelectable(_ctx.booleanValue("CreatePickUpWaybillPreQueryResponse.Data.CpTimeSelectList["+ i +"].AppointTimes["+ j +"].TimeList["+ k +"].Selectable"));
					tdAppointTimeSlotDTO.setSelectDisableTip(_ctx.stringValue("CreatePickUpWaybillPreQueryResponse.Data.CpTimeSelectList["+ i +"].AppointTimes["+ j +"].TimeList["+ k +"].SelectDisableTip"));

					timeList.add(tdAppointTimeSlotDTO);
				}
				tdAppointTimeDTO.setTimeList(timeList);

				appointTimes.add(tdAppointTimeDTO);
			}
			tdTimeSelect.setAppointTimes(appointTimes);

			cpTimeSelectList.add(tdTimeSelect);
		}
		data.setCpTimeSelectList(cpTimeSelectList);
		createPickUpWaybillPreQueryResponse.setData(data);
	 
	 	return createPickUpWaybillPreQueryResponse;
	}
}