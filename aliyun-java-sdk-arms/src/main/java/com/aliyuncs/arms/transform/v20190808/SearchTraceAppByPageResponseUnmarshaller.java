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

import com.aliyuncs.arms.model.v20190808.SearchTraceAppByPageResponse;
import com.aliyuncs.arms.model.v20190808.SearchTraceAppByPageResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.SearchTraceAppByPageResponse.PageBean.TraceApp;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTraceAppByPageResponseUnmarshaller {

	public static SearchTraceAppByPageResponse unmarshall(SearchTraceAppByPageResponse searchTraceAppByPageResponse, UnmarshallerContext _ctx) {
		
		searchTraceAppByPageResponse.setRequestId(_ctx.stringValue("SearchTraceAppByPageResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setPageNumber(_ctx.integerValue("SearchTraceAppByPageResponse.PageBean.PageNumber"));
		pageBean.setPageSize(_ctx.integerValue("SearchTraceAppByPageResponse.PageBean.PageSize"));
		pageBean.setTotalCount(_ctx.integerValue("SearchTraceAppByPageResponse.PageBean.TotalCount"));

		List<TraceApp> traceApps = new ArrayList<TraceApp>();
		for (int i = 0; i < _ctx.lengthValue("SearchTraceAppByPageResponse.PageBean.TraceApps.Length"); i++) {
			TraceApp traceApp = new TraceApp();
			traceApp.setType(_ctx.stringValue("SearchTraceAppByPageResponse.PageBean.TraceApps["+ i +"].Type"));
			traceApp.setAppName(_ctx.stringValue("SearchTraceAppByPageResponse.PageBean.TraceApps["+ i +"].AppName"));
			traceApp.setUpdateTime(_ctx.longValue("SearchTraceAppByPageResponse.PageBean.TraceApps["+ i +"].UpdateTime"));
			traceApp.setShow(_ctx.booleanValue("SearchTraceAppByPageResponse.PageBean.TraceApps["+ i +"].Show"));
			traceApp.setCreateTime(_ctx.longValue("SearchTraceAppByPageResponse.PageBean.TraceApps["+ i +"].CreateTime"));
			traceApp.setPid(_ctx.stringValue("SearchTraceAppByPageResponse.PageBean.TraceApps["+ i +"].Pid"));
			traceApp.setAppId(_ctx.longValue("SearchTraceAppByPageResponse.PageBean.TraceApps["+ i +"].AppId"));
			traceApp.setUserId(_ctx.stringValue("SearchTraceAppByPageResponse.PageBean.TraceApps["+ i +"].UserId"));
			traceApp.setRegionId(_ctx.stringValue("SearchTraceAppByPageResponse.PageBean.TraceApps["+ i +"].RegionId"));

			List<String> labels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchTraceAppByPageResponse.PageBean.TraceApps["+ i +"].Labels.Length"); j++) {
				labels.add(_ctx.stringValue("SearchTraceAppByPageResponse.PageBean.TraceApps["+ i +"].Labels["+ j +"]"));
			}
			traceApp.setLabels(labels);

			traceApps.add(traceApp);
		}
		pageBean.setTraceApps(traceApps);
		searchTraceAppByPageResponse.setPageBean(pageBean);
	 
	 	return searchTraceAppByPageResponse;
	}
}