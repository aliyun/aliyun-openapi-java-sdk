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

import com.aliyuncs.mse.model.v20190531.GetBlackWhiteListResponse;
import com.aliyuncs.mse.model.v20190531.GetBlackWhiteListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBlackWhiteListResponseUnmarshaller {

	public static GetBlackWhiteListResponse unmarshall(GetBlackWhiteListResponse getBlackWhiteListResponse, UnmarshallerContext _ctx) {
		
		getBlackWhiteListResponse.setRequestId(_ctx.stringValue("GetBlackWhiteListResponse.RequestId"));
		getBlackWhiteListResponse.setHttpStatusCode(_ctx.integerValue("GetBlackWhiteListResponse.HttpStatusCode"));
		getBlackWhiteListResponse.setMessage(_ctx.stringValue("GetBlackWhiteListResponse.Message"));
		getBlackWhiteListResponse.setCode(_ctx.integerValue("GetBlackWhiteListResponse.Code"));
		getBlackWhiteListResponse.setSuccess(_ctx.booleanValue("GetBlackWhiteListResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetBlackWhiteListResponse.Data.Id"));
		data.setResourceId(_ctx.longValue("GetBlackWhiteListResponse.Data.ResourceId"));
		data.setResourceType(_ctx.stringValue("GetBlackWhiteListResponse.Data.ResourceType"));
		data.setContent(_ctx.stringValue("GetBlackWhiteListResponse.Data.Content"));
		data.setType(_ctx.stringValue("GetBlackWhiteListResponse.Data.Type"));
		data.setIsWhite(_ctx.booleanValue("GetBlackWhiteListResponse.Data.IsWhite"));
		data.setStatus(_ctx.stringValue("GetBlackWhiteListResponse.Data.Status"));
		data.setGatewayId(_ctx.longValue("GetBlackWhiteListResponse.Data.GatewayId"));
		data.setGatewayUniqueId(_ctx.stringValue("GetBlackWhiteListResponse.Data.GatewayUniqueId"));
		data.setGmtCreate(_ctx.stringValue("GetBlackWhiteListResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("GetBlackWhiteListResponse.Data.GmtModified"));
		getBlackWhiteListResponse.setData(data);
	 
	 	return getBlackWhiteListResponse;
	}
}