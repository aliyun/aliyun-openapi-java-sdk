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

package com.aliyuncs.xtrace.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xtrace.model.v20190808.SearchTracesResponse;
import com.aliyuncs.xtrace.model.v20190808.SearchTracesResponse.PageBean;
import com.aliyuncs.xtrace.model.v20190808.SearchTracesResponse.PageBean.TraceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTracesResponseUnmarshaller {

	public static SearchTracesResponse unmarshall(SearchTracesResponse searchTracesResponse, UnmarshallerContext _ctx) {
		
		searchTracesResponse.setRequestId(_ctx.stringValue("SearchTracesResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotalCount(_ctx.longValue("SearchTracesResponse.PageBean.TotalCount"));
		pageBean.setPageSize(_ctx.integerValue("SearchTracesResponse.PageBean.PageSize"));
		pageBean.setPageNumber(_ctx.integerValue("SearchTracesResponse.PageBean.PageNumber"));

		List<TraceInfo> traceInfos = new ArrayList<TraceInfo>();
		for (int i = 0; i < _ctx.lengthValue("SearchTracesResponse.PageBean.TraceInfos.Length"); i++) {
			TraceInfo traceInfo = new TraceInfo();
			traceInfo.setTraceID(_ctx.stringValue("SearchTracesResponse.PageBean.TraceInfos["+ i +"].TraceID"));
			traceInfo.setOperationName(_ctx.stringValue("SearchTracesResponse.PageBean.TraceInfos["+ i +"].OperationName"));
			traceInfo.setServiceName(_ctx.stringValue("SearchTracesResponse.PageBean.TraceInfos["+ i +"].ServiceName"));
			traceInfo.setServiceIp(_ctx.stringValue("SearchTracesResponse.PageBean.TraceInfos["+ i +"].ServiceIp"));
			traceInfo.setDuration(_ctx.longValue("SearchTracesResponse.PageBean.TraceInfos["+ i +"].Duration"));
			traceInfo.setTimestamp(_ctx.longValue("SearchTracesResponse.PageBean.TraceInfos["+ i +"].Timestamp"));

			traceInfos.add(traceInfo);
		}
		pageBean.setTraceInfos(traceInfos);
		searchTracesResponse.setPageBean(pageBean);
	 
	 	return searchTracesResponse;
	}
}