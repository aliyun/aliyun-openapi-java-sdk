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

import com.aliyuncs.mse.model.v20190531.GetGatewayDomainDetailResponse;
import com.aliyuncs.mse.model.v20190531.GetGatewayDomainDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGatewayDomainDetailResponseUnmarshaller {

	public static GetGatewayDomainDetailResponse unmarshall(GetGatewayDomainDetailResponse getGatewayDomainDetailResponse, UnmarshallerContext _ctx) {
		
		getGatewayDomainDetailResponse.setRequestId(_ctx.stringValue("GetGatewayDomainDetailResponse.RequestId"));
		getGatewayDomainDetailResponse.setHttpStatusCode(_ctx.integerValue("GetGatewayDomainDetailResponse.HttpStatusCode"));
		getGatewayDomainDetailResponse.setMessage(_ctx.stringValue("GetGatewayDomainDetailResponse.Message"));
		getGatewayDomainDetailResponse.setCode(_ctx.integerValue("GetGatewayDomainDetailResponse.Code"));
		getGatewayDomainDetailResponse.setSuccess(_ctx.booleanValue("GetGatewayDomainDetailResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetGatewayDomainDetailResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetGatewayDomainDetailResponse.Data.Name"));
		data.setGatewayUniqueId(_ctx.stringValue("GetGatewayDomainDetailResponse.Data.GatewayUniqueId"));
		data.setGatewayId(_ctx.longValue("GetGatewayDomainDetailResponse.Data.GatewayId"));
		data.setBizProtocol(_ctx.stringValue("GetGatewayDomainDetailResponse.Data.Protocol"));
		data.setMustHttps(_ctx.booleanValue("GetGatewayDomainDetailResponse.Data.MustHttps"));
		data.setCertIdentifier(_ctx.stringValue("GetGatewayDomainDetailResponse.Data.CertIdentifier"));
		data.setGmtCreate(_ctx.stringValue("GetGatewayDomainDetailResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("GetGatewayDomainDetailResponse.Data.GmtModified"));
		data.setCertName(_ctx.stringValue("GetGatewayDomainDetailResponse.Data.CertName"));
		data.setCommonName(_ctx.stringValue("GetGatewayDomainDetailResponse.Data.CommonName"));
		data.setSans(_ctx.stringValue("GetGatewayDomainDetailResponse.Data.Sans"));
		data.setBeforeDate(_ctx.longValue("GetGatewayDomainDetailResponse.Data.BeforeDate"));
		data.setAfterDate(_ctx.longValue("GetGatewayDomainDetailResponse.Data.AfterDate"));
		data.setAlgorithm(_ctx.stringValue("GetGatewayDomainDetailResponse.Data.Algorithm"));
		data.setIssuer(_ctx.stringValue("GetGatewayDomainDetailResponse.Data.Issuer"));
		data.setGmtBefore(_ctx.stringValue("GetGatewayDomainDetailResponse.Data.GmtBefore"));
		data.setGmtAfter(_ctx.stringValue("GetGatewayDomainDetailResponse.Data.GmtAfter"));
		getGatewayDomainDetailResponse.setData(data);
	 
	 	return getGatewayDomainDetailResponse;
	}
}