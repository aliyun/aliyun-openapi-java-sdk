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

package com.aliyuncs.websitebuild.transform.v20250429;

import com.aliyuncs.websitebuild.model.v20250429.GetDomainInfoForPartnerResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetDomainInfoForPartnerResponse.Data;
import com.aliyuncs.websitebuild.model.v20250429.GetDomainInfoForPartnerResponse.Data.Ownership;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDomainInfoForPartnerResponseUnmarshaller {

	public static GetDomainInfoForPartnerResponse unmarshall(GetDomainInfoForPartnerResponse getDomainInfoForPartnerResponse, UnmarshallerContext _ctx) {
		
		getDomainInfoForPartnerResponse.setRequestId(_ctx.stringValue("GetDomainInfoForPartnerResponse.RequestId"));

		Data data = new Data();
		data.setDomainName(_ctx.stringValue("GetDomainInfoForPartnerResponse.Data.DomainName"));
		data.setRegistrar(_ctx.stringValue("GetDomainInfoForPartnerResponse.Data.Registrar"));
		data.setNameServers(_ctx.stringValue("GetDomainInfoForPartnerResponse.Data.NameServers"));

		Ownership ownership = new Ownership();
		ownership.setAccount(_ctx.stringValue("GetDomainInfoForPartnerResponse.Data.Ownership.Account"));
		ownership.setProvider(_ctx.stringValue("GetDomainInfoForPartnerResponse.Data.Ownership.Provider"));
		data.setOwnership(ownership);
		getDomainInfoForPartnerResponse.setData(data);
	 
	 	return getDomainInfoForPartnerResponse;
	}
}