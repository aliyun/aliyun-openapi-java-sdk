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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.QueryServiceTimeConfigResponse;
import com.aliyuncs.edas.model.v20170801.QueryServiceTimeConfigResponse.Data;
import com.aliyuncs.edas.model.v20170801.QueryServiceTimeConfigResponse.Data.MseServiceTime;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryServiceTimeConfigResponseUnmarshaller {

	public static QueryServiceTimeConfigResponse unmarshall(QueryServiceTimeConfigResponse queryServiceTimeConfigResponse, UnmarshallerContext _ctx) {
		
		queryServiceTimeConfigResponse.setCode(_ctx.integerValue("QueryServiceTimeConfigResponse.Code"));
		queryServiceTimeConfigResponse.setMessage(_ctx.stringValue("QueryServiceTimeConfigResponse.Message"));
		queryServiceTimeConfigResponse.setSuccess(_ctx.booleanValue("QueryServiceTimeConfigResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("QueryServiceTimeConfigResponse.Data.PageNumber"));
		data.setTotalSize(_ctx.integerValue("QueryServiceTimeConfigResponse.Data.TotalSize"));
		data.setPageSize(_ctx.integerValue("QueryServiceTimeConfigResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("QueryServiceTimeConfigResponse.Data.CurrentPage"));

		List<MseServiceTime> result = new ArrayList<MseServiceTime>();
		for (int i = 0; i < _ctx.lengthValue("QueryServiceTimeConfigResponse.Data.Result.Length"); i++) {
			MseServiceTime mseServiceTime = new MseServiceTime();
			mseServiceTime.setId(_ctx.longValue("QueryServiceTimeConfigResponse.Data.Result["+ i +"].Id"));
			mseServiceTime.setPath(_ctx.stringValue("QueryServiceTimeConfigResponse.Data.Result["+ i +"].Path"));
			mseServiceTime.setConsumerAppName(_ctx.stringValue("QueryServiceTimeConfigResponse.Data.Result["+ i +"].ConsumerAppName"));
			mseServiceTime.setTimeout(_ctx.stringValue("QueryServiceTimeConfigResponse.Data.Result["+ i +"].Timeout"));
			mseServiceTime.setConsumerAppId(_ctx.stringValue("QueryServiceTimeConfigResponse.Data.Result["+ i +"].ConsumerAppId"));

			result.add(mseServiceTime);
		}
		data.setResult(result);
		queryServiceTimeConfigResponse.setData(data);
	 
	 	return queryServiceTimeConfigResponse;
	}
}