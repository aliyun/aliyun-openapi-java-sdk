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

package com.aliyuncs.schedulerx3.transform.v20240624;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx3.model.v20240624.ListCalendarNamesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCalendarNamesResponseUnmarshaller {

	public static ListCalendarNamesResponse unmarshall(ListCalendarNamesResponse listCalendarNamesResponse, UnmarshallerContext _ctx) {
		
		listCalendarNamesResponse.setRequestId(_ctx.stringValue("ListCalendarNamesResponse.RequestId"));
		listCalendarNamesResponse.setCode(_ctx.integerValue("ListCalendarNamesResponse.Code"));
		listCalendarNamesResponse.setMessage(_ctx.stringValue("ListCalendarNamesResponse.Message"));
		listCalendarNamesResponse.setSuccess(_ctx.booleanValue("ListCalendarNamesResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListCalendarNamesResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("ListCalendarNamesResponse.Data["+ i +"]"));
		}
		listCalendarNamesResponse.setData(data);
	 
	 	return listCalendarNamesResponse;
	}
}