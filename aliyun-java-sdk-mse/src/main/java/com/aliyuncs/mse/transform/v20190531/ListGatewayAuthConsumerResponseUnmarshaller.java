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

import com.aliyuncs.mse.model.v20190531.ListGatewayAuthConsumerResponse;
import com.aliyuncs.mse.model.v20190531.ListGatewayAuthConsumerResponse.Data;
import com.aliyuncs.mse.model.v20190531.ListGatewayAuthConsumerResponse.Data.Consumers;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewayAuthConsumerResponseUnmarshaller {

	public static ListGatewayAuthConsumerResponse unmarshall(ListGatewayAuthConsumerResponse listGatewayAuthConsumerResponse, UnmarshallerContext _ctx) {
		
		listGatewayAuthConsumerResponse.setRequestId(_ctx.stringValue("ListGatewayAuthConsumerResponse.RequestId"));
		listGatewayAuthConsumerResponse.setSuccess(_ctx.booleanValue("ListGatewayAuthConsumerResponse.Success"));
		listGatewayAuthConsumerResponse.setCode(_ctx.integerValue("ListGatewayAuthConsumerResponse.Code"));
		listGatewayAuthConsumerResponse.setErrorCode(_ctx.stringValue("ListGatewayAuthConsumerResponse.ErrorCode"));
		listGatewayAuthConsumerResponse.setHttpStatusCode(_ctx.integerValue("ListGatewayAuthConsumerResponse.HttpStatusCode"));
		listGatewayAuthConsumerResponse.setMessage(_ctx.stringValue("ListGatewayAuthConsumerResponse.Message"));
		listGatewayAuthConsumerResponse.setDynamicCode(_ctx.stringValue("ListGatewayAuthConsumerResponse.DynamicCode"));
		listGatewayAuthConsumerResponse.setDynamicMessage(_ctx.stringValue("ListGatewayAuthConsumerResponse.DynamicMessage"));

		Data data = new Data();
		data.setTotalSize(_ctx.longValue("ListGatewayAuthConsumerResponse.Data.TotalSize"));
		data.setPageNumber(_ctx.integerValue("ListGatewayAuthConsumerResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListGatewayAuthConsumerResponse.Data.PageSize"));

		List<Consumers> result = new ArrayList<Consumers>();
		for (int i = 0; i < _ctx.lengthValue("ListGatewayAuthConsumerResponse.Data.Result.Length"); i++) {
			Consumers consumers = new Consumers();
			consumers.setId(_ctx.longValue("ListGatewayAuthConsumerResponse.Data.Result["+ i +"].Id"));
			consumers.setName(_ctx.stringValue("ListGatewayAuthConsumerResponse.Data.Result["+ i +"].Name"));
			consumers.setConsumerStatus(_ctx.booleanValue("ListGatewayAuthConsumerResponse.Data.Result["+ i +"].ConsumerStatus"));
			consumers.setPrimaryUser(_ctx.stringValue("ListGatewayAuthConsumerResponse.Data.Result["+ i +"].PrimaryUser"));
			consumers.setGatewayUniqueId(_ctx.stringValue("ListGatewayAuthConsumerResponse.Data.Result["+ i +"].GatewayUniqueId"));
			consumers.setType(_ctx.stringValue("ListGatewayAuthConsumerResponse.Data.Result["+ i +"].Type"));
			consumers.setDescription(_ctx.stringValue("ListGatewayAuthConsumerResponse.Data.Result["+ i +"].Description"));
			consumers.setGmtCreate(_ctx.stringValue("ListGatewayAuthConsumerResponse.Data.Result["+ i +"].GmtCreate"));
			consumers.setGmtModified(_ctx.stringValue("ListGatewayAuthConsumerResponse.Data.Result["+ i +"].GmtModified"));

			result.add(consumers);
		}
		data.setResult(result);
		listGatewayAuthConsumerResponse.setData(data);
	 
	 	return listGatewayAuthConsumerResponse;
	}
}