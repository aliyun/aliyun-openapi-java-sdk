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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.QueryAccelerationLogByCubeIdResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryAccelerationLogByCubeIdResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.QueryAccelerationLogByCubeIdResponse.Result.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAccelerationLogByCubeIdResponseUnmarshaller {

	public static QueryAccelerationLogByCubeIdResponse unmarshall(QueryAccelerationLogByCubeIdResponse queryAccelerationLogByCubeIdResponse, UnmarshallerContext _ctx) {
		
		queryAccelerationLogByCubeIdResponse.setRequestId(_ctx.stringValue("QueryAccelerationLogByCubeIdResponse.RequestId"));
		queryAccelerationLogByCubeIdResponse.setSuccess(_ctx.booleanValue("QueryAccelerationLogByCubeIdResponse.Success"));

		Result result = new Result();
		result.setTotalPages(_ctx.integerValue("QueryAccelerationLogByCubeIdResponse.Result.TotalPages"));
		result.setTotalNum(_ctx.integerValue("QueryAccelerationLogByCubeIdResponse.Result.TotalNum"));
		result.setPageNum(_ctx.integerValue("QueryAccelerationLogByCubeIdResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("QueryAccelerationLogByCubeIdResponse.Result.PageSize"));
		result.setPre(_ctx.integerValue("QueryAccelerationLogByCubeIdResponse.Result.Pre"));
		result.setNext(_ctx.integerValue("QueryAccelerationLogByCubeIdResponse.Result.Next"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAccelerationLogByCubeIdResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setJobId(_ctx.stringValue("QueryAccelerationLogByCubeIdResponse.Result.Data["+ i +"].JobId"));
			dataItem.setJobHistoryId(_ctx.stringValue("QueryAccelerationLogByCubeIdResponse.Result.Data["+ i +"].JobHistoryId"));
			dataItem.setJonStartDate(_ctx.stringValue("QueryAccelerationLogByCubeIdResponse.Result.Data["+ i +"].JonStartDate"));
			dataItem.setJobStatus(_ctx.stringValue("QueryAccelerationLogByCubeIdResponse.Result.Data["+ i +"].JobStatus"));
			dataItem.setDuration(_ctx.stringValue("QueryAccelerationLogByCubeIdResponse.Result.Data["+ i +"].Duration"));
			dataItem.setLog(_ctx.stringValue("QueryAccelerationLogByCubeIdResponse.Result.Data["+ i +"].Log"));

			data.add(dataItem);
		}
		result.setData(data);
		queryAccelerationLogByCubeIdResponse.setResult(result);
	 
	 	return queryAccelerationLogByCubeIdResponse;
	}
}