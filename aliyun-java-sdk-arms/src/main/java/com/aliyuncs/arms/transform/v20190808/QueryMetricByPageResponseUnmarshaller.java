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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.QueryMetricByPageResponse;
import com.aliyuncs.arms.model.v20190808.QueryMetricByPageResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMetricByPageResponseUnmarshaller {

	public static QueryMetricByPageResponse unmarshall(QueryMetricByPageResponse queryMetricByPageResponse, UnmarshallerContext _ctx) {
		
		queryMetricByPageResponse.setRequestId(_ctx.stringValue("QueryMetricByPageResponse.RequestId"));
		queryMetricByPageResponse.setCode(_ctx.stringValue("QueryMetricByPageResponse.Code"));
		queryMetricByPageResponse.setSuccess(_ctx.booleanValue("QueryMetricByPageResponse.Success"));
		queryMetricByPageResponse.setMessage(_ctx.stringValue("QueryMetricByPageResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryMetricByPageResponse.Data.Total"));
		data.setPage(_ctx.integerValue("QueryMetricByPageResponse.Data.Page"));
		data.setPageSize(_ctx.integerValue("QueryMetricByPageResponse.Data.PageSize"));

		List<Map<Object, Object>> items = _ctx.listMapValue("QueryMetricByPageResponse.Data.Items");
		data.setItems(items);
		queryMetricByPageResponse.setData(data);
	 
	 	return queryMetricByPageResponse;
	}
}