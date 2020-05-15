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

import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshTopappservicesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshTopappservicesResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshTopappservicesResponse.Response.DatasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsCloudmeshTopappservicesResponseUnmarshaller {

	public static QueryRmsCloudmeshTopappservicesResponse unmarshall(QueryRmsCloudmeshTopappservicesResponse queryRmsCloudmeshTopappservicesResponse, UnmarshallerContext _ctx) {
		
		queryRmsCloudmeshTopappservicesResponse.setRequestId(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.RequestId"));
		queryRmsCloudmeshTopappservicesResponse.setResultCode(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.ResultCode"));
		queryRmsCloudmeshTopappservicesResponse.setResultMessage(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.ResultMessage"));

		Response response = new Response();
		response.setErrMsg(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.Response.ErrMsg"));
		response.setSuccess(_ctx.booleanValue("QueryRmsCloudmeshTopappservicesResponse.Response.Success"));

		List<DatasItem> datas = new ArrayList<DatasItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshTopappservicesResponse.Response.Datas.Length"); i++) {
			DatasItem datasItem = new DatasItem();
			datasItem.setAppInstanceService(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.Response.Datas["+ i +"].AppInstanceService"));
			datasItem.setAppInstanceServiceId(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.Response.Datas["+ i +"].AppInstanceServiceId"));
			datasItem.setCluster(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.Response.Datas["+ i +"].Cluster"));
			datasItem.setCopiesNum(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.Response.Datas["+ i +"].CopiesNum"));
			datasItem.setCostTime(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.Response.Datas["+ i +"].CostTime"));
			datasItem.setErrorDetail(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.Response.Datas["+ i +"].ErrorDetail"));
			datasItem.setErrorRate(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.Response.Datas["+ i +"].ErrorRate"));
			datasItem.setFlowIn(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.Response.Datas["+ i +"].FlowIn"));
			datasItem.setFlowOut(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.Response.Datas["+ i +"].FlowOut"));
			datasItem.setNamespace(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.Response.Datas["+ i +"].Namespace"));
			datasItem.setReporter(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.Response.Datas["+ i +"].Reporter"));
			datasItem.setRqs(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.Response.Datas["+ i +"].Rqs"));
			datasItem.setTimeNoSec(_ctx.stringValue("QueryRmsCloudmeshTopappservicesResponse.Response.Datas["+ i +"].TimeNoSec"));

			datas.add(datasItem);
		}
		response.setDatas(datas);
		queryRmsCloudmeshTopappservicesResponse.setResponse(response);
	 
	 	return queryRmsCloudmeshTopappservicesResponse;
	}
}