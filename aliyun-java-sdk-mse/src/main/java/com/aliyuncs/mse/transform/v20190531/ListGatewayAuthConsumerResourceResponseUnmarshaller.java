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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListGatewayAuthConsumerResourceResponse;
import com.aliyuncs.mse.model.v20190531.ListGatewayAuthConsumerResourceResponse.Data;
import com.aliyuncs.mse.model.v20190531.ListGatewayAuthConsumerResourceResponse.Data.Consumers;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewayAuthConsumerResourceResponseUnmarshaller {

	public static ListGatewayAuthConsumerResourceResponse unmarshall(ListGatewayAuthConsumerResourceResponse listGatewayAuthConsumerResourceResponse, UnmarshallerContext _ctx) {
		
		listGatewayAuthConsumerResourceResponse.setRequestId(_ctx.stringValue("ListGatewayAuthConsumerResourceResponse.RequestId"));
		listGatewayAuthConsumerResourceResponse.setSuccess(_ctx.booleanValue("ListGatewayAuthConsumerResourceResponse.Success"));
		listGatewayAuthConsumerResourceResponse.setCode(_ctx.integerValue("ListGatewayAuthConsumerResourceResponse.Code"));
		listGatewayAuthConsumerResourceResponse.setErrorCode(_ctx.stringValue("ListGatewayAuthConsumerResourceResponse.ErrorCode"));
		listGatewayAuthConsumerResourceResponse.setHttpStatusCode(_ctx.integerValue("ListGatewayAuthConsumerResourceResponse.HttpStatusCode"));
		listGatewayAuthConsumerResourceResponse.setMessage(_ctx.stringValue("ListGatewayAuthConsumerResourceResponse.Message"));
		listGatewayAuthConsumerResourceResponse.setDynamicCode(_ctx.stringValue("ListGatewayAuthConsumerResourceResponse.DynamicCode"));
		listGatewayAuthConsumerResourceResponse.setDynamicMessage(_ctx.stringValue("ListGatewayAuthConsumerResourceResponse.DynamicMessage"));

		Data data = new Data();
		data.setTotalSize(_ctx.longValue("ListGatewayAuthConsumerResourceResponse.Data.TotalSize"));
		data.setPageNumber(_ctx.integerValue("ListGatewayAuthConsumerResourceResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListGatewayAuthConsumerResourceResponse.Data.PageSize"));

		List<Consumers> result = new ArrayList<Consumers>();
		for (int i = 0; i < _ctx.lengthValue("ListGatewayAuthConsumerResourceResponse.Data.Result.Length"); i++) {
			Consumers consumers = new Consumers();
			consumers.setId(_ctx.longValue("ListGatewayAuthConsumerResourceResponse.Data.Result["+ i +"].Id"));
			consumers.setConsumerId(_ctx.longValue("ListGatewayAuthConsumerResourceResponse.Data.Result["+ i +"].ConsumerId"));
			consumers.setRouteId(_ctx.longValue("ListGatewayAuthConsumerResourceResponse.Data.Result["+ i +"].RouteId"));
			consumers.setRouteName(_ctx.stringValue("ListGatewayAuthConsumerResourceResponse.Data.Result["+ i +"].RouteName"));
			consumers.setResourceStatus(_ctx.booleanValue("ListGatewayAuthConsumerResourceResponse.Data.Result["+ i +"].ResourceStatus"));
			consumers.setGatewayUniqueId(_ctx.stringValue("ListGatewayAuthConsumerResourceResponse.Data.Result["+ i +"].GatewayUniqueId"));
			consumers.setGmtCreate(_ctx.stringValue("ListGatewayAuthConsumerResourceResponse.Data.Result["+ i +"].GmtCreate"));
			consumers.setGmtModified(_ctx.stringValue("ListGatewayAuthConsumerResourceResponse.Data.Result["+ i +"].GmtModified"));

			result.add(consumers);
		}
		data.setResult(result);
		listGatewayAuthConsumerResourceResponse.setData(data);
	 
	 	return listGatewayAuthConsumerResourceResponse;
	}
}