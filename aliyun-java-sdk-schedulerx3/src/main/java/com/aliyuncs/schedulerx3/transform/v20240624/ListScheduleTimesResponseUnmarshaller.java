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

import com.aliyuncs.schedulerx3.model.v20240624.ListScheduleTimesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScheduleTimesResponseUnmarshaller {

	public static ListScheduleTimesResponse unmarshall(ListScheduleTimesResponse listScheduleTimesResponse, UnmarshallerContext _ctx) {
		
		listScheduleTimesResponse.setRequestId(_ctx.stringValue("ListScheduleTimesResponse.RequestId"));
		listScheduleTimesResponse.setCode(_ctx.integerValue("ListScheduleTimesResponse.Code"));
		listScheduleTimesResponse.setMessage(_ctx.stringValue("ListScheduleTimesResponse.Message"));
		listScheduleTimesResponse.setSuccess(_ctx.booleanValue("ListScheduleTimesResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListScheduleTimesResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("ListScheduleTimesResponse.Data["+ i +"]"));
		}
		listScheduleTimesResponse.setData(data);
	 
	 	return listScheduleTimesResponse;
	}
}