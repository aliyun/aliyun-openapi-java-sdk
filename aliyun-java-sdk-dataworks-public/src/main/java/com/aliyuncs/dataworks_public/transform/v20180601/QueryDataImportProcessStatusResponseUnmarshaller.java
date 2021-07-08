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

package com.aliyuncs.dataworks_public.transform.v20180601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20180601.QueryDataImportProcessStatusResponse;
import com.aliyuncs.dataworks_public.model.v20180601.QueryDataImportProcessStatusResponse.Data;
import com.aliyuncs.dataworks_public.model.v20180601.QueryDataImportProcessStatusResponse.Data.ProjectListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDataImportProcessStatusResponseUnmarshaller {

	public static QueryDataImportProcessStatusResponse unmarshall(QueryDataImportProcessStatusResponse queryDataImportProcessStatusResponse, UnmarshallerContext _ctx) {
		
		queryDataImportProcessStatusResponse.setRequestId(_ctx.stringValue("QueryDataImportProcessStatusResponse.RequestId"));
		queryDataImportProcessStatusResponse.setMessage(_ctx.stringValue("QueryDataImportProcessStatusResponse.Message"));
		queryDataImportProcessStatusResponse.setCode(_ctx.integerValue("QueryDataImportProcessStatusResponse.Code"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("QueryDataImportProcessStatusResponse.Data.Status"));
		data.setMessage(_ctx.stringValue("QueryDataImportProcessStatusResponse.Data.Message"));

		List<ProjectListItem> projectList = new ArrayList<ProjectListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDataImportProcessStatusResponse.Data.ProjectList.Length"); i++) {
			ProjectListItem projectListItem = new ProjectListItem();
			projectListItem.setProjectName(_ctx.stringValue("QueryDataImportProcessStatusResponse.Data.ProjectList["+ i +"].ProjectName"));
			projectListItem.setProjectId(_ctx.stringValue("QueryDataImportProcessStatusResponse.Data.ProjectList["+ i +"].ProjectId"));
			projectListItem.setProjectIdentifier(_ctx.stringValue("QueryDataImportProcessStatusResponse.Data.ProjectList["+ i +"].ProjectIdentifier"));

			projectList.add(projectListItem);
		}
		data.setProjectList(projectList);
		queryDataImportProcessStatusResponse.setData(data);
	 
	 	return queryDataImportProcessStatusResponse;
	}
}