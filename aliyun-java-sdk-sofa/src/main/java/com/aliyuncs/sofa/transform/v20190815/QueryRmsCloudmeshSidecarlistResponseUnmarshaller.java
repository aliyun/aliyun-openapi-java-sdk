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

import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshSidecarlistResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshSidecarlistResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshSidecarlistResponse.Response.Entity;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshSidecarlistResponse.Response.Entity.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsCloudmeshSidecarlistResponseUnmarshaller {

	public static QueryRmsCloudmeshSidecarlistResponse unmarshall(QueryRmsCloudmeshSidecarlistResponse queryRmsCloudmeshSidecarlistResponse, UnmarshallerContext _ctx) {
		
		queryRmsCloudmeshSidecarlistResponse.setRequestId(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.RequestId"));
		queryRmsCloudmeshSidecarlistResponse.setResultCode(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.ResultCode"));
		queryRmsCloudmeshSidecarlistResponse.setResultMessage(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.ResultMessage"));

		Response response = new Response();
		response.setErrMsg(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.Response.ErrMsg"));
		response.setSuccess(_ctx.booleanValue("QueryRmsCloudmeshSidecarlistResponse.Response.Success"));

		Entity entity = new Entity();
		entity.setCurrentPage(_ctx.longValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.CurrentPage"));
		entity.setPageSize(_ctx.longValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.PageSize"));
		entity.setTotalSize(_ctx.longValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.TotalSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAgreement(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.Data["+ i +"].Agreement"));
			dataItem.setAppService(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.Data["+ i +"].AppService"));
			dataItem.setAppServiceId(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.Data["+ i +"].AppServiceId"));
			dataItem.setCopiesNum(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.Data["+ i +"].CopiesNum"));
			dataItem.setCpu(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.Data["+ i +"].Cpu"));
			dataItem.setErrorRate(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.Data["+ i +"].ErrorRate"));
			dataItem.setFlowIn(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.Data["+ i +"].FlowIn"));
			dataItem.setFlowOut(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.Data["+ i +"].FlowOut"));
			dataItem.setMen(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.Data["+ i +"].Men"));
			dataItem.setPodName(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.Data["+ i +"].PodName"));
			dataItem.setResponseTime(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.Data["+ i +"].ResponseTime"));
			dataItem.setRqs(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.Data["+ i +"].Rqs"));
			dataItem.setSidecarVersion(_ctx.stringValue("QueryRmsCloudmeshSidecarlistResponse.Response.Entity.Data["+ i +"].SidecarVersion"));

			data.add(dataItem);
		}
		entity.setData(data);
		response.setEntity(entity);
		queryRmsCloudmeshSidecarlistResponse.setResponse(response);
	 
	 	return queryRmsCloudmeshSidecarlistResponse;
	}
}