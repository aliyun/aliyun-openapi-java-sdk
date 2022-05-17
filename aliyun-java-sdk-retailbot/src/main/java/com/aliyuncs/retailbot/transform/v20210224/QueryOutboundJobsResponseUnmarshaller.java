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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailbot.model.v20210224.QueryOutboundJobsResponse;
import com.aliyuncs.retailbot.model.v20210224.QueryOutboundJobsResponse.Content;
import com.aliyuncs.retailbot.model.v20210224.QueryOutboundJobsResponse.Content.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOutboundJobsResponseUnmarshaller {

	public static QueryOutboundJobsResponse unmarshall(QueryOutboundJobsResponse queryOutboundJobsResponse, UnmarshallerContext _ctx) {
		
		queryOutboundJobsResponse.setFirst(_ctx.booleanValue("QueryOutboundJobsResponse.First"));
		queryOutboundJobsResponse.setLast(_ctx.booleanValue("QueryOutboundJobsResponse.Last"));

		Content content = new Content();
		content.setSuccess(_ctx.booleanValue("QueryOutboundJobsResponse.Content.Success"));
		content.setCode(_ctx.stringValue("QueryOutboundJobsResponse.Content.Code"));
		content.setMessage(_ctx.stringValue("QueryOutboundJobsResponse.Content.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryOutboundJobsResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("QueryOutboundJobsResponse.Content.Data["+ i +"].Id"));
			dataItem.setGmtCreate(_ctx.stringValue("QueryOutboundJobsResponse.Content.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("QueryOutboundJobsResponse.Content.Data["+ i +"].GmtModified"));
			dataItem.setTenantId(_ctx.longValue("QueryOutboundJobsResponse.Content.Data["+ i +"].TenantId"));
			dataItem.setSaasId(_ctx.stringValue("QueryOutboundJobsResponse.Content.Data["+ i +"].SaasId"));
			dataItem.setShopId(_ctx.longValue("QueryOutboundJobsResponse.Content.Data["+ i +"].ShopId"));
			dataItem.setAppCode(_ctx.stringValue("QueryOutboundJobsResponse.Content.Data["+ i +"].AppCode"));
			dataItem.setAppId(_ctx.stringValue("QueryOutboundJobsResponse.Content.Data["+ i +"].AppId"));
			dataItem.setVersion(_ctx.stringValue("QueryOutboundJobsResponse.Content.Data["+ i +"].Version"));
			dataItem.setJobName(_ctx.stringValue("QueryOutboundJobsResponse.Content.Data["+ i +"].JobName"));
			dataItem.setStartTime(_ctx.stringValue("QueryOutboundJobsResponse.Content.Data["+ i +"].StartTime"));
			dataItem.setEndTime(_ctx.stringValue("QueryOutboundJobsResponse.Content.Data["+ i +"].EndTime"));
			dataItem.setCrowdType(_ctx.integerValue("QueryOutboundJobsResponse.Content.Data["+ i +"].CrowdType"));
			dataItem.setCrowdConfig(_ctx.stringValue("QueryOutboundJobsResponse.Content.Data["+ i +"].CrowdConfig"));
			dataItem.setRunType(_ctx.integerValue("QueryOutboundJobsResponse.Content.Data["+ i +"].RunType"));
			dataItem.setRunConfig(_ctx.stringValue("QueryOutboundJobsResponse.Content.Data["+ i +"].RunConfig"));
			dataItem.setStatus(_ctx.integerValue("QueryOutboundJobsResponse.Content.Data["+ i +"].Status"));
			dataItem.setConfig(_ctx.stringValue("QueryOutboundJobsResponse.Content.Data["+ i +"].Config"));

			data.add(dataItem);
		}
		content.setData(data);
		queryOutboundJobsResponse.setContent(content);
	 
	 	return queryOutboundJobsResponse;
	}
}