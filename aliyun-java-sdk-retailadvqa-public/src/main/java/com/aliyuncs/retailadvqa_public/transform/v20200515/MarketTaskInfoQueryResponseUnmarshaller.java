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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.MarketTaskInfoQueryResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.MarketTaskInfoQueryResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class MarketTaskInfoQueryResponseUnmarshaller {

	public static MarketTaskInfoQueryResponse unmarshall(MarketTaskInfoQueryResponse marketTaskInfoQueryResponse, UnmarshallerContext _ctx) {
		
		marketTaskInfoQueryResponse.setRequestId(_ctx.stringValue("MarketTaskInfoQueryResponse.RequestId"));
		marketTaskInfoQueryResponse.setErrorDesc(_ctx.stringValue("MarketTaskInfoQueryResponse.ErrorDesc"));
		marketTaskInfoQueryResponse.setTraceId(_ctx.stringValue("MarketTaskInfoQueryResponse.TraceId"));
		marketTaskInfoQueryResponse.setErrorCode(_ctx.stringValue("MarketTaskInfoQueryResponse.ErrorCode"));
		marketTaskInfoQueryResponse.setSuccess(_ctx.booleanValue("MarketTaskInfoQueryResponse.Success"));

		Data data = new Data();
		data.setTotalNum(_ctx.longValue("MarketTaskInfoQueryResponse.Data.TotalNum"));
		data.setPageSize(_ctx.longValue("MarketTaskInfoQueryResponse.Data.PageSize"));
		data.setPageNum(_ctx.longValue("MarketTaskInfoQueryResponse.Data.PageNum"));

		List<Map<Object, Object>> data1 = _ctx.listMapValue("MarketTaskInfoQueryResponse.Data.Data");
		data.setData1(data1);
		marketTaskInfoQueryResponse.setData(data);
	 
	 	return marketTaskInfoQueryResponse;
	}
}