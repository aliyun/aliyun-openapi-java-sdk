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

import com.aliyuncs.mse.model.v20190531.ListGatewayDomainResponse;
import com.aliyuncs.mse.model.v20190531.ListGatewayDomainResponse.Domains;
import com.aliyuncs.mse.model.v20190531.ListGatewayDomainResponse.Domains.Comment;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewayDomainResponseUnmarshaller {

	public static ListGatewayDomainResponse unmarshall(ListGatewayDomainResponse listGatewayDomainResponse, UnmarshallerContext _ctx) {
		
		listGatewayDomainResponse.setRequestId(_ctx.stringValue("ListGatewayDomainResponse.RequestId"));
		listGatewayDomainResponse.setHttpStatusCode(_ctx.integerValue("ListGatewayDomainResponse.HttpStatusCode"));
		listGatewayDomainResponse.setMessage(_ctx.stringValue("ListGatewayDomainResponse.Message"));
		listGatewayDomainResponse.setCode(_ctx.integerValue("ListGatewayDomainResponse.Code"));
		listGatewayDomainResponse.setSuccess(_ctx.booleanValue("ListGatewayDomainResponse.Success"));

		List<Domains> data = new ArrayList<Domains>();
		for (int i = 0; i < _ctx.lengthValue("ListGatewayDomainResponse.Data.Length"); i++) {
			Domains domains = new Domains();
			domains.setId(_ctx.longValue("ListGatewayDomainResponse.Data["+ i +"].Id"));
			domains.setName(_ctx.stringValue("ListGatewayDomainResponse.Data["+ i +"].Name"));
			domains.setBizProtocol(_ctx.stringValue("ListGatewayDomainResponse.Data["+ i +"].Protocol"));
			domains.setMustHttps(_ctx.booleanValue("ListGatewayDomainResponse.Data["+ i +"].MustHttps"));
			domains.setCertIdentifier(_ctx.stringValue("ListGatewayDomainResponse.Data["+ i +"].CertIdentifier"));
			domains.setCertBeforeDate(_ctx.stringValue("ListGatewayDomainResponse.Data["+ i +"].CertBeforeDate"));
			domains.setGatewayId(_ctx.longValue("ListGatewayDomainResponse.Data["+ i +"].GatewayId"));
			domains.setGmtCreate(_ctx.stringValue("ListGatewayDomainResponse.Data["+ i +"].GmtCreate"));
			domains.setGmtModified(_ctx.stringValue("ListGatewayDomainResponse.Data["+ i +"].GmtModified"));
			domains.setStatus(_ctx.integerValue("ListGatewayDomainResponse.Data["+ i +"].Status"));
			domains.setType(_ctx.stringValue("ListGatewayDomainResponse.Data["+ i +"].Type"));

			Comment comment = new Comment();
			comment.setStatus(_ctx.stringValue("ListGatewayDomainResponse.Data["+ i +"].Comment.Status"));
			domains.setComment(comment);

			data.add(domains);
		}
		listGatewayDomainResponse.setData(data);
	 
	 	return listGatewayDomainResponse;
	}
}