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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.GetHotlineServiceStatisticsResponse;
import com.aliyuncs.aiccs.model.v20191015.GetHotlineServiceStatisticsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHotlineServiceStatisticsResponseUnmarshaller {

	public static GetHotlineServiceStatisticsResponse unmarshall(GetHotlineServiceStatisticsResponse getHotlineServiceStatisticsResponse, UnmarshallerContext _ctx) {
		
		getHotlineServiceStatisticsResponse.setRequestId(_ctx.stringValue("GetHotlineServiceStatisticsResponse.RequestId"));
		getHotlineServiceStatisticsResponse.setMessage(_ctx.stringValue("GetHotlineServiceStatisticsResponse.Message"));
		getHotlineServiceStatisticsResponse.setCode(_ctx.stringValue("GetHotlineServiceStatisticsResponse.Code"));
		getHotlineServiceStatisticsResponse.setSuccess(_ctx.stringValue("GetHotlineServiceStatisticsResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("GetHotlineServiceStatisticsResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("GetHotlineServiceStatisticsResponse.Data.PageSize"));
		data.setTotalNum(_ctx.integerValue("GetHotlineServiceStatisticsResponse.Data.TotalNum"));
		data.setRows(_ctx.stringValue("GetHotlineServiceStatisticsResponse.Data.Rows"));
		getHotlineServiceStatisticsResponse.setData(data);
	 
	 	return getHotlineServiceStatisticsResponse;
	}
}