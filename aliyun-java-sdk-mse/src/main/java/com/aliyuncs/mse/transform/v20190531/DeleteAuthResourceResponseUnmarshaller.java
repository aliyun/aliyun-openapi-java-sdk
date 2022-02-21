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

import com.aliyuncs.mse.model.v20190531.DeleteAuthResourceResponse;
import com.aliyuncs.mse.model.v20190531.DeleteAuthResourceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAuthResourceResponseUnmarshaller {

	public static DeleteAuthResourceResponse unmarshall(DeleteAuthResourceResponse deleteAuthResourceResponse, UnmarshallerContext _ctx) {
		
		deleteAuthResourceResponse.setRequestId(_ctx.stringValue("DeleteAuthResourceResponse.RequestId"));
		deleteAuthResourceResponse.setHttpStatusCode(_ctx.integerValue("DeleteAuthResourceResponse.HttpStatusCode"));
		deleteAuthResourceResponse.setMessage(_ctx.stringValue("DeleteAuthResourceResponse.Message"));
		deleteAuthResourceResponse.setCode(_ctx.integerValue("DeleteAuthResourceResponse.Code"));
		deleteAuthResourceResponse.setSuccess(_ctx.booleanValue("DeleteAuthResourceResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("DeleteAuthResourceResponse.Data.Id"));
		data.setAuthId(_ctx.longValue("DeleteAuthResourceResponse.Data.AuthId"));
		data.setGatewayUniqueId(_ctx.stringValue("DeleteAuthResourceResponse.Data.GatewayUniqueId"));
		data.setGatewayId(_ctx.longValue("DeleteAuthResourceResponse.Data.GatewayId"));
		data.setDomainId(_ctx.longValue("DeleteAuthResourceResponse.Data.DomainId"));
		data.setDomainName(_ctx.stringValue("DeleteAuthResourceResponse.Data.DomainName"));
		data.setPath(_ctx.stringValue("DeleteAuthResourceResponse.Data.Path"));
		data.setIsWhite(_ctx.booleanValue("DeleteAuthResourceResponse.Data.IsWhite"));
		data.setGmtCreate(_ctx.stringValue("DeleteAuthResourceResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("DeleteAuthResourceResponse.Data.GmtModified"));
		deleteAuthResourceResponse.setData(data);
	 
	 	return deleteAuthResourceResponse;
	}
}