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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.GetAutonomousNotifyEventsInRangeResponse;
import com.aliyuncs.das.model.v20200116.GetAutonomousNotifyEventsInRangeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAutonomousNotifyEventsInRangeResponseUnmarshaller {

	public static GetAutonomousNotifyEventsInRangeResponse unmarshall(GetAutonomousNotifyEventsInRangeResponse getAutonomousNotifyEventsInRangeResponse, UnmarshallerContext _ctx) {
		
		getAutonomousNotifyEventsInRangeResponse.setRequestId(_ctx.stringValue("GetAutonomousNotifyEventsInRangeResponse.RequestId"));
		getAutonomousNotifyEventsInRangeResponse.setCode(_ctx.stringValue("GetAutonomousNotifyEventsInRangeResponse.Code"));
		getAutonomousNotifyEventsInRangeResponse.setMessage(_ctx.stringValue("GetAutonomousNotifyEventsInRangeResponse.Message"));
		getAutonomousNotifyEventsInRangeResponse.setSuccess(_ctx.stringValue("GetAutonomousNotifyEventsInRangeResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("GetAutonomousNotifyEventsInRangeResponse.Data.Total"));
		data.setPageNo(_ctx.longValue("GetAutonomousNotifyEventsInRangeResponse.Data.PageNo"));
		data.setPageSize(_ctx.longValue("GetAutonomousNotifyEventsInRangeResponse.Data.PageSize"));
		data.setExtra(_ctx.stringValue("GetAutonomousNotifyEventsInRangeResponse.Data.Extra"));

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAutonomousNotifyEventsInRangeResponse.Data.List.Length"); i++) {
			list.add(_ctx.stringValue("GetAutonomousNotifyEventsInRangeResponse.Data.List["+ i +"]"));
		}
		data.setList(list);
		getAutonomousNotifyEventsInRangeResponse.setData(data);
	 
	 	return getAutonomousNotifyEventsInRangeResponse;
	}
}