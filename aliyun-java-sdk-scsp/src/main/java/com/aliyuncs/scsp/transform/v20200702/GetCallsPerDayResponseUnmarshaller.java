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

package com.aliyuncs.scsp.transform.v20200702;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scsp.model.v20200702.GetCallsPerDayResponse;
import com.aliyuncs.scsp.model.v20200702.GetCallsPerDayResponse.Data;
import com.aliyuncs.scsp.model.v20200702.GetCallsPerDayResponse.Data.CallsPerdayResponseListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCallsPerDayResponseUnmarshaller {

	public static GetCallsPerDayResponse unmarshall(GetCallsPerDayResponse getCallsPerDayResponse, UnmarshallerContext _ctx) {
		
		getCallsPerDayResponse.setRequestId(_ctx.stringValue("GetCallsPerDayResponse.RequestId"));
		getCallsPerDayResponse.setMessage(_ctx.stringValue("GetCallsPerDayResponse.Message"));
		getCallsPerDayResponse.setCode(_ctx.stringValue("GetCallsPerDayResponse.Code"));
		getCallsPerDayResponse.setSuccess(_ctx.stringValue("GetCallsPerDayResponse.Success"));

		Data data = new Data();
		data.setTotalNum(_ctx.longValue("GetCallsPerDayResponse.Data.TotalNum"));
		data.setPageSize(_ctx.longValue("GetCallsPerDayResponse.Data.PageSize"));
		data.setPageNo(_ctx.stringValue("GetCallsPerDayResponse.Data.PageNo"));

		List<CallsPerdayResponseListItem> callsPerdayResponseList = new ArrayList<CallsPerdayResponseListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCallsPerDayResponse.Data.CallsPerdayResponseList.Length"); i++) {
			CallsPerdayResponseListItem callsPerdayResponseListItem = new CallsPerdayResponseListItem();
			callsPerdayResponseListItem.setCallOutCnt(_ctx.stringValue("GetCallsPerDayResponse.Data.CallsPerdayResponseList["+ i +"].CallOutCnt"));
			callsPerdayResponseListItem.setTenantId(_ctx.stringValue("GetCallsPerDayResponse.Data.CallsPerdayResponseList["+ i +"].TenantId"));
			callsPerdayResponseListItem.setDataId(_ctx.stringValue("GetCallsPerDayResponse.Data.CallsPerdayResponseList["+ i +"].DataId"));
			callsPerdayResponseListItem.setPhoneNum(_ctx.stringValue("GetCallsPerDayResponse.Data.CallsPerdayResponseList["+ i +"].PhoneNum"));
			callsPerdayResponseListItem.setTenantName(_ctx.stringValue("GetCallsPerDayResponse.Data.CallsPerdayResponseList["+ i +"].TenantName"));
			callsPerdayResponseListItem.setCallInCnt(_ctx.stringValue("GetCallsPerDayResponse.Data.CallsPerdayResponseList["+ i +"].CallInCnt"));
			callsPerdayResponseListItem.setMinuteId(_ctx.stringValue("GetCallsPerDayResponse.Data.CallsPerdayResponseList["+ i +"].MinuteId"));
			callsPerdayResponseListItem.setHourId(_ctx.stringValue("GetCallsPerDayResponse.Data.CallsPerdayResponseList["+ i +"].HourId"));

			callsPerdayResponseList.add(callsPerdayResponseListItem);
		}
		data.setCallsPerdayResponseList(callsPerdayResponseList);
		getCallsPerDayResponse.setData(data);
	 
	 	return getCallsPerDayResponse;
	}
}