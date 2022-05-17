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

package com.aliyuncs.retailbot.transform.v20210224;

import com.aliyuncs.retailbot.model.v20210224.QueryOutboundJobResponse;
import com.aliyuncs.retailbot.model.v20210224.QueryOutboundJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOutboundJobResponseUnmarshaller {

	public static QueryOutboundJobResponse unmarshall(QueryOutboundJobResponse queryOutboundJobResponse, UnmarshallerContext _ctx) {
		
		queryOutboundJobResponse.setCode(_ctx.stringValue("QueryOutboundJobResponse.Code"));
		queryOutboundJobResponse.setMessage(_ctx.stringValue("QueryOutboundJobResponse.Message"));

		Data data = new Data();
		data.setId(_ctx.longValue("QueryOutboundJobResponse.Data.Id"));
		data.setGmtCreate(_ctx.stringValue("QueryOutboundJobResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("QueryOutboundJobResponse.Data.GmtModified"));
		data.setTenantId(_ctx.longValue("QueryOutboundJobResponse.Data.TenantId"));
		data.setSaasId(_ctx.stringValue("QueryOutboundJobResponse.Data.SaasId"));
		data.setShopId(_ctx.longValue("QueryOutboundJobResponse.Data.ShopId"));
		data.setAppCode(_ctx.stringValue("QueryOutboundJobResponse.Data.AppCode"));
		data.setAppId(_ctx.stringValue("QueryOutboundJobResponse.Data.AppId"));
		data.setVersion(_ctx.stringValue("QueryOutboundJobResponse.Data.Version"));
		data.setJobName(_ctx.stringValue("QueryOutboundJobResponse.Data.JobName"));
		data.setStartTime(_ctx.stringValue("QueryOutboundJobResponse.Data.StartTime"));
		data.setEndTime(_ctx.stringValue("QueryOutboundJobResponse.Data.EndTime"));
		data.setCrowdType(_ctx.integerValue("QueryOutboundJobResponse.Data.CrowdType"));
		data.setCrowdConfig(_ctx.stringValue("QueryOutboundJobResponse.Data.CrowdConfig"));
		data.setRunType(_ctx.integerValue("QueryOutboundJobResponse.Data.RunType"));
		data.setRunConfig(_ctx.stringValue("QueryOutboundJobResponse.Data.RunConfig"));
		data.setStatus(_ctx.integerValue("QueryOutboundJobResponse.Data.Status"));
		data.setConfig(_ctx.stringValue("QueryOutboundJobResponse.Data.Config"));
		queryOutboundJobResponse.setData(data);
	 
	 	return queryOutboundJobResponse;
	}
}