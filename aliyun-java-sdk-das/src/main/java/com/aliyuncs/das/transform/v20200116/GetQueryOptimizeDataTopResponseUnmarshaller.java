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

import com.aliyuncs.das.model.v20200116.GetQueryOptimizeDataTopResponse;
import com.aliyuncs.das.model.v20200116.GetQueryOptimizeDataTopResponse.Data;
import com.aliyuncs.das.model.v20200116.GetQueryOptimizeDataTopResponse.Data.QueryOptimizeDataTops;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQueryOptimizeDataTopResponseUnmarshaller {

	public static GetQueryOptimizeDataTopResponse unmarshall(GetQueryOptimizeDataTopResponse getQueryOptimizeDataTopResponse, UnmarshallerContext _ctx) {
		
		getQueryOptimizeDataTopResponse.setRequestId(_ctx.stringValue("GetQueryOptimizeDataTopResponse.RequestId"));
		getQueryOptimizeDataTopResponse.setCode(_ctx.stringValue("GetQueryOptimizeDataTopResponse.Code"));
		getQueryOptimizeDataTopResponse.setMessage(_ctx.stringValue("GetQueryOptimizeDataTopResponse.Message"));
		getQueryOptimizeDataTopResponse.setSuccess(_ctx.stringValue("GetQueryOptimizeDataTopResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("GetQueryOptimizeDataTopResponse.Data.Total"));
		data.setPageNo(_ctx.integerValue("GetQueryOptimizeDataTopResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("GetQueryOptimizeDataTopResponse.Data.PageSize"));
		data.setExtra(_ctx.stringValue("GetQueryOptimizeDataTopResponse.Data.Extra"));

		List<QueryOptimizeDataTops> list = new ArrayList<QueryOptimizeDataTops>();
		for (int i = 0; i < _ctx.lengthValue("GetQueryOptimizeDataTopResponse.Data.List.Length"); i++) {
			QueryOptimizeDataTops queryOptimizeDataTops = new QueryOptimizeDataTops();
			queryOptimizeDataTops.setInstanceId(_ctx.stringValue("GetQueryOptimizeDataTopResponse.Data.List["+ i +"].InstanceId"));
			queryOptimizeDataTops.setType(_ctx.stringValue("GetQueryOptimizeDataTopResponse.Data.List["+ i +"].Type"));
			queryOptimizeDataTops.setValue(_ctx.doubleValue("GetQueryOptimizeDataTopResponse.Data.List["+ i +"].Value"));

			list.add(queryOptimizeDataTops);
		}
		data.setList(list);
		getQueryOptimizeDataTopResponse.setData(data);
	 
	 	return getQueryOptimizeDataTopResponse;
	}
}