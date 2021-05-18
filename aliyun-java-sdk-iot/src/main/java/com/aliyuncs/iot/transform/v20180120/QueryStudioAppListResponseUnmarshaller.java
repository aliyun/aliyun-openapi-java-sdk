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

import com.aliyuncs.iot.model.v20180120.QueryStudioAppListResponse;
import com.aliyuncs.iot.model.v20180120.QueryStudioAppListResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryStudioAppListResponse.Data.AppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryStudioAppListResponseUnmarshaller {

	public static QueryStudioAppListResponse unmarshall(QueryStudioAppListResponse queryStudioAppListResponse, UnmarshallerContext _ctx) {
		
		queryStudioAppListResponse.setRequestId(_ctx.stringValue("QueryStudioAppListResponse.RequestId"));
		queryStudioAppListResponse.setSuccess(_ctx.booleanValue("QueryStudioAppListResponse.Success"));
		queryStudioAppListResponse.setCode(_ctx.stringValue("QueryStudioAppListResponse.Code"));
		queryStudioAppListResponse.setErrorMessage(_ctx.stringValue("QueryStudioAppListResponse.ErrorMessage"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("QueryStudioAppListResponse.Data.PageSize"));
		data.setPageNo(_ctx.integerValue("QueryStudioAppListResponse.Data.PageNo"));
		data.setTotal(_ctx.integerValue("QueryStudioAppListResponse.Data.Total"));
		data.setTotalPage(_ctx.integerValue("QueryStudioAppListResponse.Data.TotalPage"));

		List<AppInfo> list = new ArrayList<AppInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryStudioAppListResponse.Data.List.Length"); i++) {
			AppInfo appInfo = new AppInfo();
			appInfo.setName(_ctx.stringValue("QueryStudioAppListResponse.Data.List["+ i +"].Name"));
			appInfo.setAppId(_ctx.stringValue("QueryStudioAppListResponse.Data.List["+ i +"].AppId"));
			appInfo.setAppKey(_ctx.stringValue("QueryStudioAppListResponse.Data.List["+ i +"].AppKey"));
			appInfo.setAppSecret(_ctx.stringValue("QueryStudioAppListResponse.Data.List["+ i +"].AppSecret"));
			appInfo.setProjectId(_ctx.stringValue("QueryStudioAppListResponse.Data.List["+ i +"].ProjectId"));
			appInfo.setType(_ctx.stringValue("QueryStudioAppListResponse.Data.List["+ i +"].Type"));
			appInfo.setDescription(_ctx.stringValue("QueryStudioAppListResponse.Data.List["+ i +"].Description"));
			appInfo.setGmtCreate(_ctx.stringValue("QueryStudioAppListResponse.Data.List["+ i +"].GmtCreate"));
			appInfo.setGmtModified(_ctx.stringValue("QueryStudioAppListResponse.Data.List["+ i +"].GmtModified"));
			appInfo.setGmtRelease(_ctx.stringValue("QueryStudioAppListResponse.Data.List["+ i +"].GmtRelease"));

			list.add(appInfo);
		}
		data.setList(list);
		queryStudioAppListResponse.setData(data);
	 
	 	return queryStudioAppListResponse;
	}
}