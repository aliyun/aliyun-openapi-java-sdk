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

import com.aliyuncs.iot.model.v20180120.QueryStudioAppDomainListOpenResponse;
import com.aliyuncs.iot.model.v20180120.QueryStudioAppDomainListOpenResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryStudioAppDomainListOpenResponse.Data.DomainInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryStudioAppDomainListOpenResponseUnmarshaller {

	public static QueryStudioAppDomainListOpenResponse unmarshall(QueryStudioAppDomainListOpenResponse queryStudioAppDomainListOpenResponse, UnmarshallerContext _ctx) {
		
		queryStudioAppDomainListOpenResponse.setRequestId(_ctx.stringValue("QueryStudioAppDomainListOpenResponse.RequestId"));
		queryStudioAppDomainListOpenResponse.setSuccess(_ctx.booleanValue("QueryStudioAppDomainListOpenResponse.Success"));
		queryStudioAppDomainListOpenResponse.setCode(_ctx.stringValue("QueryStudioAppDomainListOpenResponse.Code"));
		queryStudioAppDomainListOpenResponse.setErrorMessage(_ctx.stringValue("QueryStudioAppDomainListOpenResponse.ErrorMessage"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("QueryStudioAppDomainListOpenResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("QueryStudioAppDomainListOpenResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("QueryStudioAppDomainListOpenResponse.Data.Total"));
		data.setTotalPage(_ctx.integerValue("QueryStudioAppDomainListOpenResponse.Data.TotalPage"));

		List<DomainInfo> list = new ArrayList<DomainInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryStudioAppDomainListOpenResponse.Data.List.Length"); i++) {
			DomainInfo domainInfo = new DomainInfo();
			domainInfo.setTenantId(_ctx.stringValue("QueryStudioAppDomainListOpenResponse.Data.List["+ i +"].TenantId"));
			domainInfo.setAppId(_ctx.stringValue("QueryStudioAppDomainListOpenResponse.Data.List["+ i +"].AppId"));
			domainInfo.setProjectId(_ctx.stringValue("QueryStudioAppDomainListOpenResponse.Data.List["+ i +"].ProjectId"));
			domainInfo.setHost(_ctx.stringValue("QueryStudioAppDomainListOpenResponse.Data.List["+ i +"].Host"));
			domainInfo.setId(_ctx.integerValue("QueryStudioAppDomainListOpenResponse.Data.List["+ i +"].Id"));
			domainInfo.setIsBeian(_ctx.stringValue("QueryStudioAppDomainListOpenResponse.Data.List["+ i +"].IsBeian"));
			domainInfo.setBizProtocol(_ctx.stringValue("QueryStudioAppDomainListOpenResponse.Data.List["+ i +"].Protocol"));
			domainInfo.setGmtCreate(_ctx.stringValue("QueryStudioAppDomainListOpenResponse.Data.List["+ i +"].GmtCreate"));
			domainInfo.setGmtModified(_ctx.stringValue("QueryStudioAppDomainListOpenResponse.Data.List["+ i +"].GmtModified"));

			list.add(domainInfo);
		}
		data.setList(list);
		queryStudioAppDomainListOpenResponse.setData(data);
	 
	 	return queryStudioAppDomainListOpenResponse;
	}
}