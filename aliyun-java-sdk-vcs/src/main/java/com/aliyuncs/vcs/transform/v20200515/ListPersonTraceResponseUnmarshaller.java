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

import com.aliyuncs.vcs.model.v20200515.ListPersonTraceResponse;
import com.aliyuncs.vcs.model.v20200515.ListPersonTraceResponse.Day;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPersonTraceResponseUnmarshaller {

	public static ListPersonTraceResponse unmarshall(ListPersonTraceResponse listPersonTraceResponse, UnmarshallerContext _ctx) {
		
		listPersonTraceResponse.setRequestId(_ctx.stringValue("ListPersonTraceResponse.RequestId"));
		listPersonTraceResponse.setTotalCount(_ctx.integerValue("ListPersonTraceResponse.TotalCount"));
		listPersonTraceResponse.setPageSize(_ctx.integerValue("ListPersonTraceResponse.PageSize"));
		listPersonTraceResponse.setMessage(_ctx.stringValue("ListPersonTraceResponse.Message"));
		listPersonTraceResponse.setPageNumber(_ctx.integerValue("ListPersonTraceResponse.PageNumber"));
		listPersonTraceResponse.setCode(_ctx.stringValue("ListPersonTraceResponse.Code"));
		listPersonTraceResponse.setSuccess(_ctx.stringValue("ListPersonTraceResponse.Success"));

		List<Day> data = new ArrayList<Day>();
		for (int i = 0; i < _ctx.lengthValue("ListPersonTraceResponse.Data.Length"); i++) {
			Day day = new Day();
			day.setStartTargetImage(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].StartTargetImage"));
			day.setStartSourceImage(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].StartSourceImage"));
			day.setCorpId(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].CorpId"));
			day.setPersonId(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].PersonId"));
			day.setDeviceId(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].DeviceId"));
			day.setEndTargetImage(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].EndTargetImage"));
			day.setEndSourceImage(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].EndSourceImage"));
			day.setStartTime(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].StartTime"));
			day.setDate(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].Date"));
			day.setLastTime(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].LastTime"));
			day.setGroupId(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].GroupId"));

			data.add(day);
		}
		listPersonTraceResponse.setData(data);
	 
	 	return listPersonTraceResponse;
	}
}