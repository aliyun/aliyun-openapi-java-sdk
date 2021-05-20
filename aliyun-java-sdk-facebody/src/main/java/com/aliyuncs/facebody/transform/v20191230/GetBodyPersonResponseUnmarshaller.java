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

import com.aliyuncs.facebody.model.v20191230.GetBodyPersonResponse;
import com.aliyuncs.facebody.model.v20191230.GetBodyPersonResponse.Data;
import com.aliyuncs.facebody.model.v20191230.GetBodyPersonResponse.Data.Trace;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBodyPersonResponseUnmarshaller {

	public static GetBodyPersonResponse unmarshall(GetBodyPersonResponse getBodyPersonResponse, UnmarshallerContext _ctx) {
		
		getBodyPersonResponse.setRequestId(_ctx.stringValue("GetBodyPersonResponse.RequestId"));
		getBodyPersonResponse.setCode(_ctx.stringValue("GetBodyPersonResponse.Code"));
		getBodyPersonResponse.setMessage(_ctx.stringValue("GetBodyPersonResponse.Message"));

		Data data = new Data();
		data.setInstanceId(_ctx.longValue("GetBodyPersonResponse.Data.InstanceId"));
		data.setDbId(_ctx.longValue("GetBodyPersonResponse.Data.DbId"));
		data.setId(_ctx.longValue("GetBodyPersonResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetBodyPersonResponse.Data.Name"));
		data.setTraceCount(_ctx.longValue("GetBodyPersonResponse.Data.TraceCount"));

		List<Trace> traceList = new ArrayList<Trace>();
		for (int i = 0; i < _ctx.lengthValue("GetBodyPersonResponse.Data.TraceList.Length"); i++) {
			Trace trace = new Trace();
			trace.setId(_ctx.longValue("GetBodyPersonResponse.Data.TraceList["+ i +"].Id"));
			trace.setExtraData(_ctx.stringValue("GetBodyPersonResponse.Data.TraceList["+ i +"].ExtraData"));

			traceList.add(trace);
		}
		data.setTraceList(traceList);
		getBodyPersonResponse.setData(data);
	 
	 	return getBodyPersonResponse;
	}
}