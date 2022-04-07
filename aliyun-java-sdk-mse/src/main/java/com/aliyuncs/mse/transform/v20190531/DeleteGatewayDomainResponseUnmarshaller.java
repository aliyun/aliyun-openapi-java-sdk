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

import com.aliyuncs.mse.model.v20190531.DeleteGatewayDomainResponse;
import com.aliyuncs.mse.model.v20190531.DeleteGatewayDomainResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteGatewayDomainResponseUnmarshaller {

	public static DeleteGatewayDomainResponse unmarshall(DeleteGatewayDomainResponse deleteGatewayDomainResponse, UnmarshallerContext _ctx) {
		
		deleteGatewayDomainResponse.setRequestId(_ctx.stringValue("DeleteGatewayDomainResponse.RequestId"));
		deleteGatewayDomainResponse.setHttpStatusCode(_ctx.integerValue("DeleteGatewayDomainResponse.HttpStatusCode"));
		deleteGatewayDomainResponse.setMessage(_ctx.stringValue("DeleteGatewayDomainResponse.Message"));
		deleteGatewayDomainResponse.setCode(_ctx.integerValue("DeleteGatewayDomainResponse.Code"));
		deleteGatewayDomainResponse.setSuccess(_ctx.booleanValue("DeleteGatewayDomainResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("DeleteGatewayDomainResponse.Data.Id"));
		data.setName(_ctx.stringValue("DeleteGatewayDomainResponse.Data.Name"));
		data.setGatewayUniqueId(_ctx.stringValue("DeleteGatewayDomainResponse.Data.GatewayUniqueId"));
		data.setGatewayId(_ctx.longValue("DeleteGatewayDomainResponse.Data.GatewayId"));
		data.setBizProtocol(_ctx.stringValue("DeleteGatewayDomainResponse.Data.Protocol"));
		data.setMustHttps(_ctx.booleanValue("DeleteGatewayDomainResponse.Data.MustHttps"));
		data.setCertIdentifier(_ctx.stringValue("DeleteGatewayDomainResponse.Data.CertIdentifier"));
		data.setGmtCreate(_ctx.stringValue("DeleteGatewayDomainResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("DeleteGatewayDomainResponse.Data.GmtModified"));
		deleteGatewayDomainResponse.setData(data);
	 
	 	return deleteGatewayDomainResponse;
	}
}