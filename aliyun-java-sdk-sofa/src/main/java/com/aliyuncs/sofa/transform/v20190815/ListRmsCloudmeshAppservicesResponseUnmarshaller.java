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

import com.aliyuncs.sofa.model.v20190815.ListRmsCloudmeshAppservicesResponse;
import com.aliyuncs.sofa.model.v20190815.ListRmsCloudmeshAppservicesResponse.Response;
import com.aliyuncs.sofa.model.v20190815.ListRmsCloudmeshAppservicesResponse.Response.Result;
import com.aliyuncs.sofa.model.v20190815.ListRmsCloudmeshAppservicesResponse.Response.Result.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRmsCloudmeshAppservicesResponseUnmarshaller {

	public static ListRmsCloudmeshAppservicesResponse unmarshall(ListRmsCloudmeshAppservicesResponse listRmsCloudmeshAppservicesResponse, UnmarshallerContext _ctx) {
		
		listRmsCloudmeshAppservicesResponse.setRequestId(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.RequestId"));
		listRmsCloudmeshAppservicesResponse.setResultCode(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.ResultCode"));
		listRmsCloudmeshAppservicesResponse.setResultMessage(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.ResultMessage"));

		Response response = new Response();
		response.setErrMsg(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.Response.ErrMsg"));
		response.setSuccess(_ctx.booleanValue("ListRmsCloudmeshAppservicesResponse.Response.Success"));

		Result result = new Result();
		result.setCurrentPage(_ctx.longValue("ListRmsCloudmeshAppservicesResponse.Response.Result.CurrentPage"));
		result.setPageSize(_ctx.longValue("ListRmsCloudmeshAppservicesResponse.Response.Result.PageSize"));
		result.setTotalSize(_ctx.longValue("ListRmsCloudmeshAppservicesResponse.Response.Result.TotalSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRmsCloudmeshAppservicesResponse.Response.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAppInstanceService(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.Response.Result.Data["+ i +"].AppInstanceService"));
			dataItem.setAppInstanceServiceId(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.Response.Result.Data["+ i +"].AppInstanceServiceId"));
			dataItem.setCluster(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.Response.Result.Data["+ i +"].Cluster"));
			dataItem.setCopiesNum(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.Response.Result.Data["+ i +"].CopiesNum"));
			dataItem.setCostTime(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.Response.Result.Data["+ i +"].CostTime"));
			dataItem.setErrorDetail(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.Response.Result.Data["+ i +"].ErrorDetail"));
			dataItem.setErrorRate(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.Response.Result.Data["+ i +"].ErrorRate"));
			dataItem.setFlowIn(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.Response.Result.Data["+ i +"].FlowIn"));
			dataItem.setFlowOut(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.Response.Result.Data["+ i +"].FlowOut"));
			dataItem.setNamespace(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.Response.Result.Data["+ i +"].Namespace"));
			dataItem.setReporter(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.Response.Result.Data["+ i +"].Reporter"));
			dataItem.setRqs(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.Response.Result.Data["+ i +"].Rqs"));
			dataItem.setTimeNoSec(_ctx.stringValue("ListRmsCloudmeshAppservicesResponse.Response.Result.Data["+ i +"].TimeNoSec"));

			data.add(dataItem);
		}
		result.setData(data);
		response.setResult(result);
		listRmsCloudmeshAppservicesResponse.setResponse(response);
	 
	 	return listRmsCloudmeshAppservicesResponse;
	}
}