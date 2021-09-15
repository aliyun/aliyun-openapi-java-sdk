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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.GetRealtimeStatsResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetRealtimeStatsResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRealtimeStatsResponseUnmarshaller {

	public static GetRealtimeStatsResponse unmarshall(GetRealtimeStatsResponse getRealtimeStatsResponse, UnmarshallerContext _ctx) {
		
		getRealtimeStatsResponse.setRequestId(_ctx.stringValue("GetRealtimeStatsResponse.RequestId"));

		Data data = new Data();
		data.setTotalUvCount(_ctx.mapValue("GetRealtimeStatsResponse.Data.TotalUvCount"));
		data.setTotalPvCount(_ctx.mapValue("GetRealtimeStatsResponse.Data.TotalPvCount"));
		data.setTodayPvCount(_ctx.mapValue("GetRealtimeStatsResponse.Data.TodayPvCount"));
		data.setTodayUvCount(_ctx.mapValue("GetRealtimeStatsResponse.Data.TodayUvCount"));
		getRealtimeStatsResponse.setData(data);
	 
	 	return getRealtimeStatsResponse;
	}
}