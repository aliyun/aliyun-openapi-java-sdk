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

package com.aliyuncs.eiam.transform.v20211201;

import com.aliyuncs.eiam.model.v20211201.GetDomainResponse;
import com.aliyuncs.eiam.model.v20211201.GetDomainResponse.Domain;
import com.aliyuncs.eiam.model.v20211201.GetDomainResponse.Domain.Filing;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDomainResponseUnmarshaller {

	public static GetDomainResponse unmarshall(GetDomainResponse getDomainResponse, UnmarshallerContext _ctx) {
		
		getDomainResponse.setRequestId(_ctx.stringValue("GetDomainResponse.RequestId"));

		Domain domain = new Domain();
		domain.setInstanceId(_ctx.stringValue("GetDomainResponse.Domain.InstanceId"));
		domain.setDomainId(_ctx.stringValue("GetDomainResponse.Domain.DomainId"));
		domain.setDomain(_ctx.stringValue("GetDomainResponse.Domain.Domain"));
		domain.setDomainType(_ctx.stringValue("GetDomainResponse.Domain.DomainType"));
		domain.setLockMode(_ctx.stringValue("GetDomainResponse.Domain.LockMode"));
		domain.setDefaultDomain(_ctx.booleanValue("GetDomainResponse.Domain.DefaultDomain"));
		domain.setCreateTime(_ctx.longValue("GetDomainResponse.Domain.CreateTime"));
		domain.setUpdateTime(_ctx.longValue("GetDomainResponse.Domain.UpdateTime"));

		Filing filing = new Filing();
		filing.setIcpNumber(_ctx.stringValue("GetDomainResponse.Domain.Filing.IcpNumber"));
		domain.setFiling(filing);
		getDomainResponse.setDomain(domain);
	 
	 	return getDomainResponse;
	}
}