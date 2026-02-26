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

package com.aliyuncs.xrengine.transform.v20221111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xrengine.model.v20221111.QueryBuildBreakpointResponse;
import com.aliyuncs.xrengine.model.v20221111.QueryBuildBreakpointResponse.Data;
import com.aliyuncs.xrengine.model.v20221111.QueryBuildBreakpointResponse.Data.BreakpointsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBuildBreakpointResponseUnmarshaller {

	public static QueryBuildBreakpointResponse unmarshall(QueryBuildBreakpointResponse queryBuildBreakpointResponse, UnmarshallerContext _ctx) {
		
		queryBuildBreakpointResponse.setRequestId(_ctx.stringValue("QueryBuildBreakpointResponse.RequestId"));
		queryBuildBreakpointResponse.setSuccess(_ctx.booleanValue("QueryBuildBreakpointResponse.Success"));
		queryBuildBreakpointResponse.setCode(_ctx.stringValue("QueryBuildBreakpointResponse.Code"));
		queryBuildBreakpointResponse.setMessage(_ctx.stringValue("QueryBuildBreakpointResponse.Message"));
		queryBuildBreakpointResponse.setErrorName(_ctx.stringValue("QueryBuildBreakpointResponse.ErrorName"));
		queryBuildBreakpointResponse.setHttpCode(_ctx.integerValue("QueryBuildBreakpointResponse.HttpCode"));

		Data data = new Data();
		data.setProjectId(_ctx.stringValue("QueryBuildBreakpointResponse.Data.ProjectId"));

		List<BreakpointsItem> breakpoints = new ArrayList<BreakpointsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryBuildBreakpointResponse.Data.Breakpoints.Length"); i++) {
			BreakpointsItem breakpointsItem = new BreakpointsItem();
			breakpointsItem.setAlgorithm(_ctx.stringValue("QueryBuildBreakpointResponse.Data.Breakpoints["+ i +"].Algorithm"));
			breakpointsItem.setJobId(_ctx.stringValue("QueryBuildBreakpointResponse.Data.Breakpoints["+ i +"].JobId"));

			breakpoints.add(breakpointsItem);
		}
		data.setBreakpoints(breakpoints);
		queryBuildBreakpointResponse.setData(data);
	 
	 	return queryBuildBreakpointResponse;
	}
}