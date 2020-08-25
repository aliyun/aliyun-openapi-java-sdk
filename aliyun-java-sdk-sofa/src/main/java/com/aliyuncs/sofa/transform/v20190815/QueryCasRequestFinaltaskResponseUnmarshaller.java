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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryCasRequestFinaltaskResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCasRequestFinaltaskResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryCasRequestFinaltaskResponse.DataItem.Request;
import com.aliyuncs.sofa.model.v20190815.QueryCasRequestFinaltaskResponse.DataItem.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCasRequestFinaltaskResponseUnmarshaller {

	public static QueryCasRequestFinaltaskResponse unmarshall(QueryCasRequestFinaltaskResponse queryCasRequestFinaltaskResponse, UnmarshallerContext _ctx) {
		
		queryCasRequestFinaltaskResponse.setRequestId(_ctx.stringValue("QueryCasRequestFinaltaskResponse.RequestId"));
		queryCasRequestFinaltaskResponse.setResultCode(_ctx.stringValue("QueryCasRequestFinaltaskResponse.ResultCode"));
		queryCasRequestFinaltaskResponse.setResultMessage(_ctx.stringValue("QueryCasRequestFinaltaskResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCasRequestFinaltaskResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setContext(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Context"));
			dataItem.setExecutionTimes(_ctx.longValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].ExecutionTimes"));
			dataItem.setId(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Id"));
			dataItem.setResourceId(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].ResourceId"));
			dataItem.setResourceType(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].ResourceType"));
			dataItem.setStatus(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Status"));
			dataItem.setUtcCreate(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].UtcCreate"));
			dataItem.setUtcModified(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].UtcModified"));
			dataItem.setWorkspaceId(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].WorkspaceId"));

			Request request = new Request();
			request.setId(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Request.Id"));
			request.setOperator(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Request.Operator"));
			request.setStatus(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Request.Status"));
			request.setToken(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Request.Token"));
			request.setType(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Request.Type"));
			dataItem.setRequest(request);

			Resource resource = new Resource();
			resource.setAutoRenew(_ctx.booleanValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Resource.AutoRenew"));
			resource.setAutoRenewPeriod(_ctx.longValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Resource.AutoRenewPeriod"));
			resource.setDescription(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Resource.Description"));
			resource.setExpiredTime(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Resource.ExpiredTime"));
			resource.setIaasId(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Resource.IaasId"));
			resource.setIaasType(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Resource.IaasType"));
			resource.setId(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Resource.Id"));
			resource.setInstanceChargeType(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Resource.InstanceChargeType"));
			resource.setName(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Resource.Name"));
			resource.setRegionId(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Resource.RegionId"));
			resource.setUtcCreate(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Resource.UtcCreate"));
			resource.setUtcModified(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Resource.UtcModified"));
			resource.setZoneId(_ctx.stringValue("QueryCasRequestFinaltaskResponse.Data["+ i +"].Resource.ZoneId"));
			dataItem.setResource(resource);

			data.add(dataItem);
		}
		queryCasRequestFinaltaskResponse.setData(data);
	 
	 	return queryCasRequestFinaltaskResponse;
	}
}