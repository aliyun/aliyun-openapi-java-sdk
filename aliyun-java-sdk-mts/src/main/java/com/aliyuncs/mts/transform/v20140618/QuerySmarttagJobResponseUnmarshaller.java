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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QuerySmarttagJobResponse;
import com.aliyuncs.mts.model.v20140618.QuerySmarttagJobResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySmarttagJobResponseUnmarshaller {

	public static QuerySmarttagJobResponse unmarshall(QuerySmarttagJobResponse querySmarttagJobResponse, UnmarshallerContext _ctx) {
		
		querySmarttagJobResponse.setRequestId(_ctx.stringValue("QuerySmarttagJobResponse.RequestId"));
		querySmarttagJobResponse.setJobStatus(_ctx.stringValue("QuerySmarttagJobResponse.JobStatus"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("QuerySmarttagJobResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setType(_ctx.stringValue("QuerySmarttagJobResponse.Results["+ i +"].Type"));
			result.setData(_ctx.stringValue("QuerySmarttagJobResponse.Results["+ i +"].Data"));

			results.add(result);
		}
		querySmarttagJobResponse.setResults(results);
	 
	 	return querySmarttagJobResponse;
	}
}