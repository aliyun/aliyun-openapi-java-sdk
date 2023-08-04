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

package com.aliyuncs.mns.transform.v20210319;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mns.model.v20210319.ListEventsResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEventsResponseUnmarshaller {

	public static ListEventsResponse unmarshall(ListEventsResponse listEventsResponse, UnmarshallerContext _ctx) {
		
		listEventsResponse.setRequestId(_ctx.stringValue("ListEventsResponse.RequestId"));
		listEventsResponse.setCode(_ctx.longValue("ListEventsResponse.Code"));
		listEventsResponse.setStatus(_ctx.stringValue("ListEventsResponse.Status"));
		listEventsResponse.setMessage(_ctx.stringValue("ListEventsResponse.Message"));
		listEventsResponse.setSuccess(_ctx.booleanValue("ListEventsResponse.Success"));

		List<Map<Object, Object>> data = _ctx.listMapValue("ListEventsResponse.Data");
		listEventsResponse.setData(data);
	 
	 	return listEventsResponse;
	}
}