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

import com.aliyuncs.das.model.v20200116.GetQueryOptimizeExecErrorSampleResponse;
import com.aliyuncs.das.model.v20200116.GetQueryOptimizeExecErrorSampleResponse.Data;
import com.aliyuncs.das.model.v20200116.GetQueryOptimizeExecErrorSampleResponse.Data.QueryOptimizeExecErrorSamples;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQueryOptimizeExecErrorSampleResponseUnmarshaller {

	public static GetQueryOptimizeExecErrorSampleResponse unmarshall(GetQueryOptimizeExecErrorSampleResponse getQueryOptimizeExecErrorSampleResponse, UnmarshallerContext _ctx) {
		
		getQueryOptimizeExecErrorSampleResponse.setRequestId(_ctx.stringValue("GetQueryOptimizeExecErrorSampleResponse.RequestId"));
		getQueryOptimizeExecErrorSampleResponse.setCode(_ctx.stringValue("GetQueryOptimizeExecErrorSampleResponse.Code"));
		getQueryOptimizeExecErrorSampleResponse.setMessage(_ctx.stringValue("GetQueryOptimizeExecErrorSampleResponse.Message"));
		getQueryOptimizeExecErrorSampleResponse.setSuccess(_ctx.stringValue("GetQueryOptimizeExecErrorSampleResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("GetQueryOptimizeExecErrorSampleResponse.Data.Total"));
		data.setPageNo(_ctx.integerValue("GetQueryOptimizeExecErrorSampleResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("GetQueryOptimizeExecErrorSampleResponse.Data.PageSize"));
		data.setExtra(_ctx.stringValue("GetQueryOptimizeExecErrorSampleResponse.Data.Extra"));

		List<QueryOptimizeExecErrorSamples> list = new ArrayList<QueryOptimizeExecErrorSamples>();
		for (int i = 0; i < _ctx.lengthValue("GetQueryOptimizeExecErrorSampleResponse.Data.List.Length"); i++) {
			QueryOptimizeExecErrorSamples queryOptimizeExecErrorSamples = new QueryOptimizeExecErrorSamples();
			queryOptimizeExecErrorSamples.setOrigHost(_ctx.stringValue("GetQueryOptimizeExecErrorSampleResponse.Data.List["+ i +"].OrigHost"));
			queryOptimizeExecErrorSamples.setUser(_ctx.stringValue("GetQueryOptimizeExecErrorSampleResponse.Data.List["+ i +"].User"));
			queryOptimizeExecErrorSamples.setDbname(_ctx.stringValue("GetQueryOptimizeExecErrorSampleResponse.Data.List["+ i +"].Dbname"));
			queryOptimizeExecErrorSamples.setSqlId(_ctx.stringValue("GetQueryOptimizeExecErrorSampleResponse.Data.List["+ i +"].SqlId"));
			queryOptimizeExecErrorSamples.setSqlText(_ctx.stringValue("GetQueryOptimizeExecErrorSampleResponse.Data.List["+ i +"].SqlText"));
			queryOptimizeExecErrorSamples.setErrorCode(_ctx.stringValue("GetQueryOptimizeExecErrorSampleResponse.Data.List["+ i +"].ErrorCode"));
			queryOptimizeExecErrorSamples.setTimestamp(_ctx.longValue("GetQueryOptimizeExecErrorSampleResponse.Data.List["+ i +"].Timestamp"));

			list.add(queryOptimizeExecErrorSamples);
		}
		data.setList(list);
		getQueryOptimizeExecErrorSampleResponse.setData(data);
	 
	 	return getQueryOptimizeExecErrorSampleResponse;
	}
}