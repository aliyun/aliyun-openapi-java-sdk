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

import com.aliyuncs.mse.model.v20190531.GetGatewayAuthConsumerDetailResponse;
import com.aliyuncs.mse.model.v20190531.GetGatewayAuthConsumerDetailResponse.Data;
import com.aliyuncs.mse.model.v20190531.GetGatewayAuthConsumerDetailResponse.Data.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGatewayAuthConsumerDetailResponseUnmarshaller {

	public static GetGatewayAuthConsumerDetailResponse unmarshall(GetGatewayAuthConsumerDetailResponse getGatewayAuthConsumerDetailResponse, UnmarshallerContext _ctx) {
		
		getGatewayAuthConsumerDetailResponse.setRequestId(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.RequestId"));
		getGatewayAuthConsumerDetailResponse.setSuccess(_ctx.booleanValue("GetGatewayAuthConsumerDetailResponse.Success"));
		getGatewayAuthConsumerDetailResponse.setCode(_ctx.integerValue("GetGatewayAuthConsumerDetailResponse.Code"));
		getGatewayAuthConsumerDetailResponse.setErrorCode(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.ErrorCode"));
		getGatewayAuthConsumerDetailResponse.setHttpStatusCode(_ctx.integerValue("GetGatewayAuthConsumerDetailResponse.HttpStatusCode"));
		getGatewayAuthConsumerDetailResponse.setMessage(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Message"));
		getGatewayAuthConsumerDetailResponse.setDynamicCode(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.DynamicCode"));
		getGatewayAuthConsumerDetailResponse.setDynamicMessage(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.DynamicMessage"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetGatewayAuthConsumerDetailResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.Name"));
		data.setConsumerStatus(_ctx.booleanValue("GetGatewayAuthConsumerDetailResponse.Data.ConsumerStatus"));
		data.setPrimaryUser(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.PrimaryUser"));
		data.setGatewayUniqueId(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.GatewayUniqueId"));
		data.setType(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.Type"));
		data.setGmtCreate(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.GmtModified"));
		data.setDescription(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.Description"));
		data.setEncodeType(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.EncodeType"));
		data.setJwks(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.Jwks"));
		data.setTokenName(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.TokenName"));
		data.setTokenPass(_ctx.booleanValue("GetGatewayAuthConsumerDetailResponse.Data.TokenPass"));
		data.setTokenPosition(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.TokenPosition"));
		data.setTokenPrefix(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.TokenPrefix"));
		data.setKeyName(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.KeyName"));
		data.setKeyValue(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.KeyValue"));

		List<Resource> resourceList = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayAuthConsumerDetailResponse.Data.ResourceList.Length"); i++) {
			Resource resource = new Resource();
			resource.setId(_ctx.longValue("GetGatewayAuthConsumerDetailResponse.Data.ResourceList["+ i +"].Id"));
			resource.setConsumerId(_ctx.longValue("GetGatewayAuthConsumerDetailResponse.Data.ResourceList["+ i +"].ConsumerId"));
			resource.setRouteId(_ctx.longValue("GetGatewayAuthConsumerDetailResponse.Data.ResourceList["+ i +"].RouteId"));
			resource.setRouteName(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.ResourceList["+ i +"].RouteName"));
			resource.setResourceStatus(_ctx.booleanValue("GetGatewayAuthConsumerDetailResponse.Data.ResourceList["+ i +"].ResourceStatus"));
			resource.setGatewayUniqueId(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.ResourceList["+ i +"].GatewayUniqueId"));
			resource.setGmtCreate(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.ResourceList["+ i +"].GmtCreate"));
			resource.setGmtModified(_ctx.stringValue("GetGatewayAuthConsumerDetailResponse.Data.ResourceList["+ i +"].GmtModified"));

			resourceList.add(resource);
		}
		data.setResourceList(resourceList);
		getGatewayAuthConsumerDetailResponse.setData(data);
	 
	 	return getGatewayAuthConsumerDetailResponse;
	}
}