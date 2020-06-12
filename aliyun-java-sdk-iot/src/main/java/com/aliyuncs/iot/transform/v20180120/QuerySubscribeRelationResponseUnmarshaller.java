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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QuerySubscribeRelationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySubscribeRelationResponseUnmarshaller {

	public static QuerySubscribeRelationResponse unmarshall(QuerySubscribeRelationResponse querySubscribeRelationResponse, UnmarshallerContext _ctx) {
		
		querySubscribeRelationResponse.setRequestId(_ctx.stringValue("QuerySubscribeRelationResponse.RequestId"));
		querySubscribeRelationResponse.setSuccess(_ctx.booleanValue("QuerySubscribeRelationResponse.Success"));
		querySubscribeRelationResponse.setCode(_ctx.stringValue("QuerySubscribeRelationResponse.Code"));
		querySubscribeRelationResponse.setErrorMessage(_ctx.stringValue("QuerySubscribeRelationResponse.ErrorMessage"));
		querySubscribeRelationResponse.setProductKey(_ctx.stringValue("QuerySubscribeRelationResponse.ProductKey"));
		querySubscribeRelationResponse.setType(_ctx.stringValue("QuerySubscribeRelationResponse.Type"));
		querySubscribeRelationResponse.setDeviceDataFlag(_ctx.booleanValue("QuerySubscribeRelationResponse.DeviceDataFlag"));
		querySubscribeRelationResponse.setDeviceLifeCycleFlag(_ctx.booleanValue("QuerySubscribeRelationResponse.DeviceLifeCycleFlag"));
		querySubscribeRelationResponse.setDeviceStatusChangeFlag(_ctx.booleanValue("QuerySubscribeRelationResponse.DeviceStatusChangeFlag"));
		querySubscribeRelationResponse.setDeviceTopoLifeCycleFlag(_ctx.booleanValue("QuerySubscribeRelationResponse.DeviceTopoLifeCycleFlag"));
		querySubscribeRelationResponse.setFoundDeviceListFlag(_ctx.booleanValue("QuerySubscribeRelationResponse.FoundDeviceListFlag"));
		querySubscribeRelationResponse.setOtaEventFlag(_ctx.booleanValue("QuerySubscribeRelationResponse.OtaEventFlag"));
		querySubscribeRelationResponse.setThingHistoryFlag(_ctx.booleanValue("QuerySubscribeRelationResponse.ThingHistoryFlag"));
		querySubscribeRelationResponse.setMnsConfiguration(_ctx.stringValue("QuerySubscribeRelationResponse.MnsConfiguration"));

		List<String> consumerGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QuerySubscribeRelationResponse.ConsumerGroupIds.Length"); i++) {
			consumerGroupIds.add(_ctx.stringValue("QuerySubscribeRelationResponse.ConsumerGroupIds["+ i +"]"));
		}
		querySubscribeRelationResponse.setConsumerGroupIds(consumerGroupIds);
	 
	 	return querySubscribeRelationResponse;
	}
}