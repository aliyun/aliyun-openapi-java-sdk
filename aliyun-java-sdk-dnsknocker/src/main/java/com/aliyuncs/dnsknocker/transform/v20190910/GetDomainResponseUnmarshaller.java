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

package com.aliyuncs.dnsknocker.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dnsknocker.model.v20190910.GetDomainResponse;
import com.aliyuncs.dnsknocker.model.v20190910.GetDomainResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDomainResponseUnmarshaller {

	public static GetDomainResponse unmarshall(GetDomainResponse getDomainResponse, UnmarshallerContext _ctx) {
		
		getDomainResponse.setRequestId(_ctx.stringValue("GetDomainResponse.RequestId"));
		getDomainResponse.setResultCode(_ctx.stringValue("GetDomainResponse.ResultCode"));
		getDomainResponse.setResultMessage(_ctx.stringValue("GetDomainResponse.ResultMessage"));
		getDomainResponse.setSuccess(_ctx.stringValue("GetDomainResponse.Success"));
		getDomainResponse.setTransactionId(_ctx.stringValue("GetDomainResponse.TransactionId"));

		List<Data> domain = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("GetDomainResponse.Domain.Length"); i++) {
			Data data = new Data();
			data.setDomainName(_ctx.stringValue("GetDomainResponse.Domain["+ i +"].DomainName"));
			data.setExists(_ctx.stringValue("GetDomainResponse.Domain["+ i +"].Exists"));
			data.setMessage(_ctx.stringValue("GetDomainResponse.Domain["+ i +"].Message"));

			domain.add(data);
		}
		getDomainResponse.setDomain(domain);
	 
	 	return getDomainResponse;
	}
}