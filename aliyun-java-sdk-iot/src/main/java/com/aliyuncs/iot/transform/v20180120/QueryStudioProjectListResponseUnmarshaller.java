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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryStudioProjectListResponse;
import com.aliyuncs.iot.model.v20180120.QueryStudioProjectListResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryStudioProjectListResponse.Data.ProjectInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryStudioProjectListResponseUnmarshaller {

	public static QueryStudioProjectListResponse unmarshall(QueryStudioProjectListResponse queryStudioProjectListResponse, UnmarshallerContext _ctx) {
		
		queryStudioProjectListResponse.setRequestId(_ctx.stringValue("QueryStudioProjectListResponse.RequestId"));
		queryStudioProjectListResponse.setCode(_ctx.stringValue("QueryStudioProjectListResponse.Code"));
		queryStudioProjectListResponse.setErrorMessage(_ctx.stringValue("QueryStudioProjectListResponse.ErrorMessage"));
		queryStudioProjectListResponse.setSuccess(_ctx.booleanValue("QueryStudioProjectListResponse.Success"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("QueryStudioProjectListResponse.Data.PageNo"));
		data.setTotalPage(_ctx.integerValue("QueryStudioProjectListResponse.Data.TotalPage"));
		data.setPageSize(_ctx.integerValue("QueryStudioProjectListResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("QueryStudioProjectListResponse.Data.Total"));

		List<ProjectInfo> list = new ArrayList<ProjectInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryStudioProjectListResponse.Data.List.Length"); i++) {
			ProjectInfo projectInfo = new ProjectInfo();
			projectInfo.setGmtCreate(_ctx.longValue("QueryStudioProjectListResponse.Data.List["+ i +"].GmtCreate"));
			projectInfo.setDescription(_ctx.stringValue("QueryStudioProjectListResponse.Data.List["+ i +"].Description"));
			projectInfo.setName(_ctx.stringValue("QueryStudioProjectListResponse.Data.List["+ i +"].Name"));
			projectInfo.setGmtModified(_ctx.longValue("QueryStudioProjectListResponse.Data.List["+ i +"].GmtModified"));
			projectInfo.setProjectId(_ctx.stringValue("QueryStudioProjectListResponse.Data.List["+ i +"].ProjectId"));

			list.add(projectInfo);
		}
		data.setList(list);
		queryStudioProjectListResponse.setData(data);
	 
	 	return queryStudioProjectListResponse;
	}
}