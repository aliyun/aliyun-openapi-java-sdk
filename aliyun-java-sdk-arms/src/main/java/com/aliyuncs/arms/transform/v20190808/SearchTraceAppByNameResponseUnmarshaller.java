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

import com.aliyuncs.arms.model.v20190808.SearchTraceAppByNameResponse;
import com.aliyuncs.arms.model.v20190808.SearchTraceAppByNameResponse.TraceApp;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTraceAppByNameResponseUnmarshaller {

	public static SearchTraceAppByNameResponse unmarshall(SearchTraceAppByNameResponse searchTraceAppByNameResponse, UnmarshallerContext _ctx) {
		
		searchTraceAppByNameResponse.setRequestId(_ctx.stringValue("SearchTraceAppByNameResponse.RequestId"));

		List<TraceApp> traceApps = new ArrayList<TraceApp>();
		for (int i = 0; i < _ctx.lengthValue("SearchTraceAppByNameResponse.TraceApps.Length"); i++) {
			TraceApp traceApp = new TraceApp();
			traceApp.setType(_ctx.stringValue("SearchTraceAppByNameResponse.TraceApps["+ i +"].Type"));
			traceApp.setAppName(_ctx.stringValue("SearchTraceAppByNameResponse.TraceApps["+ i +"].AppName"));
			traceApp.setUpdateTime(_ctx.longValue("SearchTraceAppByNameResponse.TraceApps["+ i +"].UpdateTime"));
			traceApp.setShow(_ctx.booleanValue("SearchTraceAppByNameResponse.TraceApps["+ i +"].Show"));
			traceApp.setCreateTime(_ctx.longValue("SearchTraceAppByNameResponse.TraceApps["+ i +"].CreateTime"));
			traceApp.setPid(_ctx.stringValue("SearchTraceAppByNameResponse.TraceApps["+ i +"].Pid"));
			traceApp.setAppId(_ctx.longValue("SearchTraceAppByNameResponse.TraceApps["+ i +"].AppId"));
			traceApp.setUserId(_ctx.stringValue("SearchTraceAppByNameResponse.TraceApps["+ i +"].UserId"));
			traceApp.setRegionId(_ctx.stringValue("SearchTraceAppByNameResponse.TraceApps["+ i +"].RegionId"));

			List<String> labels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchTraceAppByNameResponse.TraceApps["+ i +"].Labels.Length"); j++) {
				labels.add(_ctx.stringValue("SearchTraceAppByNameResponse.TraceApps["+ i +"].Labels["+ j +"]"));
			}
			traceApp.setLabels(labels);

			traceApps.add(traceApp);
		}
		searchTraceAppByNameResponse.setTraceApps(traceApps);
	 
	 	return searchTraceAppByNameResponse;
	}
}