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

package com.aliyuncs.facebody.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.facebody.model.v20191230.SearchBodyTraceResponse;
import com.aliyuncs.facebody.model.v20191230.SearchBodyTraceResponse.Data;
import com.aliyuncs.facebody.model.v20191230.SearchBodyTraceResponse.Data.Trace;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchBodyTraceResponseUnmarshaller {

	public static SearchBodyTraceResponse unmarshall(SearchBodyTraceResponse searchBodyTraceResponse, UnmarshallerContext _ctx) {
		
		searchBodyTraceResponse.setRequestId(_ctx.stringValue("SearchBodyTraceResponse.RequestId"));
		searchBodyTraceResponse.setCode(_ctx.stringValue("SearchBodyTraceResponse.Code"));
		searchBodyTraceResponse.setMessage(_ctx.stringValue("SearchBodyTraceResponse.Message"));

		Data data = new Data();

		List<Trace> matchList = new ArrayList<Trace>();
		for (int i = 0; i < _ctx.lengthValue("SearchBodyTraceResponse.Data.MatchList.Length"); i++) {
			Trace trace = new Trace();
			trace.setDbId(_ctx.longValue("SearchBodyTraceResponse.Data.MatchList["+ i +"].DbId"));
			trace.setPersonId(_ctx.longValue("SearchBodyTraceResponse.Data.MatchList["+ i +"].PersonId"));
			trace.setTraceId(_ctx.longValue("SearchBodyTraceResponse.Data.MatchList["+ i +"].TraceId"));
			trace.setScore(_ctx.floatValue("SearchBodyTraceResponse.Data.MatchList["+ i +"].Score"));
			trace.setExtraData(_ctx.stringValue("SearchBodyTraceResponse.Data.MatchList["+ i +"].ExtraData"));

			matchList.add(trace);
		}
		data.setMatchList(matchList);
		searchBodyTraceResponse.setData(data);
	 
	 	return searchBodyTraceResponse;
	}
}