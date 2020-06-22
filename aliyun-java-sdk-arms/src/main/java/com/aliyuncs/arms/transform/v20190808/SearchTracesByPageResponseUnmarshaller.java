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

import com.aliyuncs.arms.model.v20190808.SearchTracesByPageResponse;
import com.aliyuncs.arms.model.v20190808.SearchTracesByPageResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.SearchTracesByPageResponse.PageBean.TraceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTracesByPageResponseUnmarshaller {

	public static SearchTracesByPageResponse unmarshall(SearchTracesByPageResponse searchTracesByPageResponse, UnmarshallerContext _ctx) {
		
		searchTracesByPageResponse.setRequestId(_ctx.stringValue("SearchTracesByPageResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotal(_ctx.integerValue("SearchTracesByPageResponse.PageBean.Total"));
		pageBean.setPageNumber(_ctx.integerValue("SearchTracesByPageResponse.PageBean.PageNumber"));
		pageBean.setPageSize(_ctx.integerValue("SearchTracesByPageResponse.PageBean.PageSize"));

		List<TraceInfo> traceInfos = new ArrayList<TraceInfo>();
		for (int i = 0; i < _ctx.lengthValue("SearchTracesByPageResponse.PageBean.TraceInfos.Length"); i++) {
			TraceInfo traceInfo = new TraceInfo();
			traceInfo.setTraceID(_ctx.stringValue("SearchTracesByPageResponse.PageBean.TraceInfos["+ i +"].TraceID"));
			traceInfo.setOperationName(_ctx.stringValue("SearchTracesByPageResponse.PageBean.TraceInfos["+ i +"].OperationName"));
			traceInfo.setServiceName(_ctx.stringValue("SearchTracesByPageResponse.PageBean.TraceInfos["+ i +"].ServiceName"));
			traceInfo.setServiceIp(_ctx.stringValue("SearchTracesByPageResponse.PageBean.TraceInfos["+ i +"].ServiceIp"));
			traceInfo.setDuration(_ctx.longValue("SearchTracesByPageResponse.PageBean.TraceInfos["+ i +"].Duration"));
			traceInfo.setTimestamp(_ctx.longValue("SearchTracesByPageResponse.PageBean.TraceInfos["+ i +"].Timestamp"));

			traceInfos.add(traceInfo);
		}
		pageBean.setTraceInfos(traceInfos);
		searchTracesByPageResponse.setPageBean(pageBean);
	 
	 	return searchTracesByPageResponse;
	}
}