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

import com.aliyuncs.miniapplcdp.model.v20200113.GetHistoryStatsResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetHistoryStatsResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHistoryStatsResponseUnmarshaller {

	public static GetHistoryStatsResponse unmarshall(GetHistoryStatsResponse getHistoryStatsResponse, UnmarshallerContext _ctx) {
		
		getHistoryStatsResponse.setRequestId(_ctx.stringValue("GetHistoryStatsResponse.RequestId"));

		Data data = new Data();
		data.setHistoryPv(_ctx.mapValue("GetHistoryStatsResponse.Data.HistoryPv"));
		data.setHistoryUv(_ctx.mapValue("GetHistoryStatsResponse.Data.HistoryUv"));
		getHistoryStatsResponse.setData(data);
	 
	 	return getHistoryStatsResponse;
	}
}