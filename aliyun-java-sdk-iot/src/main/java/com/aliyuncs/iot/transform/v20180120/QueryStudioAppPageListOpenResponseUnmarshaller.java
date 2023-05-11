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

import com.aliyuncs.iot.model.v20180120.QueryStudioAppPageListOpenResponse;
import com.aliyuncs.iot.model.v20180120.QueryStudioAppPageListOpenResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryStudioAppPageListOpenResponse.Data.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryStudioAppPageListOpenResponseUnmarshaller {

	public static QueryStudioAppPageListOpenResponse unmarshall(QueryStudioAppPageListOpenResponse queryStudioAppPageListOpenResponse, UnmarshallerContext _ctx) {
		
		queryStudioAppPageListOpenResponse.setRequestId(_ctx.stringValue("QueryStudioAppPageListOpenResponse.RequestId"));
		queryStudioAppPageListOpenResponse.setSuccess(_ctx.booleanValue("QueryStudioAppPageListOpenResponse.Success"));
		queryStudioAppPageListOpenResponse.setCode(_ctx.stringValue("QueryStudioAppPageListOpenResponse.Code"));
		queryStudioAppPageListOpenResponse.setErrorMessage(_ctx.stringValue("QueryStudioAppPageListOpenResponse.ErrorMessage"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("QueryStudioAppPageListOpenResponse.Data.PageSize"));
		data.setPageNo(_ctx.integerValue("QueryStudioAppPageListOpenResponse.Data.PageNo"));
		data.setTotal(_ctx.integerValue("QueryStudioAppPageListOpenResponse.Data.Total"));
		data.setTotalPage(_ctx.integerValue("QueryStudioAppPageListOpenResponse.Data.TotalPage"));

		List<PageInfo> list = new ArrayList<PageInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryStudioAppPageListOpenResponse.Data.List.Length"); i++) {
			PageInfo pageInfo = new PageInfo();
			pageInfo.setId(_ctx.integerValue("QueryStudioAppPageListOpenResponse.Data.List["+ i +"].Id"));
			pageInfo.setPageId(_ctx.stringValue("QueryStudioAppPageListOpenResponse.Data.List["+ i +"].PageId"));
			pageInfo.setPath(_ctx.stringValue("QueryStudioAppPageListOpenResponse.Data.List["+ i +"].Path"));
			pageInfo.setIsHidden(_ctx.integerValue("QueryStudioAppPageListOpenResponse.Data.List["+ i +"].IsHidden"));
			pageInfo.setIsHome(_ctx.integerValue("QueryStudioAppPageListOpenResponse.Data.List["+ i +"].IsHome"));
			pageInfo.setIsLoginPage(_ctx.integerValue("QueryStudioAppPageListOpenResponse.Data.List["+ i +"].IsLoginPage"));
			pageInfo.setName(_ctx.stringValue("QueryStudioAppPageListOpenResponse.Data.List["+ i +"].Name"));
			pageInfo.setGmtCreate(_ctx.stringValue("QueryStudioAppPageListOpenResponse.Data.List["+ i +"].GmtCreate"));
			pageInfo.setGmtModified(_ctx.stringValue("QueryStudioAppPageListOpenResponse.Data.List["+ i +"].GmtModified"));

			list.add(pageInfo);
		}
		data.setList(list);
		queryStudioAppPageListOpenResponse.setData(data);
	 
	 	return queryStudioAppPageListOpenResponse;
	}
}