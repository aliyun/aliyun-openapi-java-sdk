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

import com.aliyuncs.retailadvqa_public.model.v20200515.ActivityInfoQueryResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.ActivityInfoQueryResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ActivityInfoQueryResponseUnmarshaller {

	public static ActivityInfoQueryResponse unmarshall(ActivityInfoQueryResponse activityInfoQueryResponse, UnmarshallerContext _ctx) {
		
		activityInfoQueryResponse.setRequestId(_ctx.stringValue("ActivityInfoQueryResponse.RequestId"));
		activityInfoQueryResponse.setErrorDesc(_ctx.stringValue("ActivityInfoQueryResponse.ErrorDesc"));
		activityInfoQueryResponse.setTraceId(_ctx.stringValue("ActivityInfoQueryResponse.TraceId"));
		activityInfoQueryResponse.setErrorCode(_ctx.stringValue("ActivityInfoQueryResponse.ErrorCode"));
		activityInfoQueryResponse.setSuccess(_ctx.booleanValue("ActivityInfoQueryResponse.Success"));

		Data data = new Data();
		data.setTotalNum(_ctx.longValue("ActivityInfoQueryResponse.Data.TotalNum"));
		data.setPageSize(_ctx.longValue("ActivityInfoQueryResponse.Data.PageSize"));
		data.setPageNum(_ctx.longValue("ActivityInfoQueryResponse.Data.PageNum"));

		List<Map<Object, Object>> data1 = _ctx.listMapValue("ActivityInfoQueryResponse.Data.Data");
		data.setData1(data1);
		activityInfoQueryResponse.setData(data);
	 
	 	return activityInfoQueryResponse;
	}
}