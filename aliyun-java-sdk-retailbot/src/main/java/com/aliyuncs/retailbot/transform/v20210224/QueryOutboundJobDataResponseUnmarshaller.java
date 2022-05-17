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

import com.aliyuncs.retailbot.model.v20210224.QueryOutboundJobDataResponse;
import com.aliyuncs.retailbot.model.v20210224.QueryOutboundJobDataResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOutboundJobDataResponseUnmarshaller {

	public static QueryOutboundJobDataResponse unmarshall(QueryOutboundJobDataResponse queryOutboundJobDataResponse, UnmarshallerContext _ctx) {
		
		queryOutboundJobDataResponse.setSuccess(_ctx.booleanValue("QueryOutboundJobDataResponse.Success"));
		queryOutboundJobDataResponse.setCode(_ctx.stringValue("QueryOutboundJobDataResponse.Code"));
		queryOutboundJobDataResponse.setMessage(_ctx.stringValue("QueryOutboundJobDataResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryOutboundJobDataResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("QueryOutboundJobDataResponse.Data["+ i +"].Id"));
			dataItem.setGmtCreate(_ctx.stringValue("QueryOutboundJobDataResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("QueryOutboundJobDataResponse.Data["+ i +"].GmtModified"));
			dataItem.setTenantId(_ctx.longValue("QueryOutboundJobDataResponse.Data["+ i +"].TenantId"));
			dataItem.setSaasId(_ctx.stringValue("QueryOutboundJobDataResponse.Data["+ i +"].SaasId"));
			dataItem.setAppCode(_ctx.stringValue("QueryOutboundJobDataResponse.Data["+ i +"].AppCode"));
			dataItem.setJobId(_ctx.longValue("QueryOutboundJobDataResponse.Data["+ i +"].JobId"));
			dataItem.setStatus(_ctx.integerValue("QueryOutboundJobDataResponse.Data["+ i +"].Status"));
			dataItem.setBatchNo(_ctx.stringValue("QueryOutboundJobDataResponse.Data["+ i +"].BatchNo"));
			dataItem.setStartTime(_ctx.stringValue("QueryOutboundJobDataResponse.Data["+ i +"].StartTime"));
			dataItem.setEndTime(_ctx.stringValue("QueryOutboundJobDataResponse.Data["+ i +"].EndTime"));
			dataItem.setConfig(_ctx.stringValue("QueryOutboundJobDataResponse.Data["+ i +"].Config"));
			dataItem.setExecuteTime(_ctx.stringValue("QueryOutboundJobDataResponse.Data["+ i +"].ExecuteTime"));
			dataItem.setFinishTime(_ctx.stringValue("QueryOutboundJobDataResponse.Data["+ i +"].FinishTime"));
			dataItem.setCount(_ctx.integerValue("QueryOutboundJobDataResponse.Data["+ i +"].Count"));
			dataItem.setCallCount(_ctx.integerValue("QueryOutboundJobDataResponse.Data["+ i +"].CallCount"));
			dataItem.setSuccessCount(_ctx.integerValue("QueryOutboundJobDataResponse.Data["+ i +"].SuccessCount"));

			data.add(dataItem);
		}
		queryOutboundJobDataResponse.setData(data);
	 
	 	return queryOutboundJobDataResponse;
	}
}