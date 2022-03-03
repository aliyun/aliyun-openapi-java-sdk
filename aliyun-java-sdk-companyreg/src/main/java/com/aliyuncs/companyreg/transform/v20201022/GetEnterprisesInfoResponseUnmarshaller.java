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

package com.aliyuncs.companyreg.transform.v20201022;

import com.aliyuncs.companyreg.model.v20201022.GetEnterprisesInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEnterprisesInfoResponseUnmarshaller {

	public static GetEnterprisesInfoResponse unmarshall(GetEnterprisesInfoResponse getEnterprisesInfoResponse, UnmarshallerContext _ctx) {
		
		getEnterprisesInfoResponse.setRequestId(_ctx.stringValue("GetEnterprisesInfoResponse.RequestId"));
		getEnterprisesInfoResponse.setEnterpriseStatus(_ctx.stringValue("GetEnterprisesInfoResponse.EnterpriseStatus"));
		getEnterprisesInfoResponse.setCorporation(_ctx.stringValue("GetEnterprisesInfoResponse.Corporation"));
		getEnterprisesInfoResponse.setEnterpriseName(_ctx.stringValue("GetEnterprisesInfoResponse.EnterpriseName"));
		getEnterprisesInfoResponse.setEstablishDate(_ctx.stringValue("GetEnterprisesInfoResponse.EstablishDate"));
		getEnterprisesInfoResponse.setEntityType(_ctx.stringValue("GetEnterprisesInfoResponse.EntityType"));
		getEnterprisesInfoResponse.setToBusinessTerm(_ctx.stringValue("GetEnterprisesInfoResponse.ToBusinessTerm"));
		getEnterprisesInfoResponse.setFromBusinessTerm(_ctx.stringValue("GetEnterprisesInfoResponse.FromBusinessTerm"));
		getEnterprisesInfoResponse.setAreaName(_ctx.stringValue("GetEnterprisesInfoResponse.AreaName"));
		getEnterprisesInfoResponse.setIndustryCode(_ctx.stringValue("GetEnterprisesInfoResponse.IndustryCode"));
		getEnterprisesInfoResponse.setAddress(_ctx.stringValue("GetEnterprisesInfoResponse.Address"));
		getEnterprisesInfoResponse.setRegisteredCapital(_ctx.stringValue("GetEnterprisesInfoResponse.RegisteredCapital"));
		getEnterprisesInfoResponse.setTaxNo(_ctx.stringValue("GetEnterprisesInfoResponse.TaxNo"));
		getEnterprisesInfoResponse.setChangeDate(_ctx.stringValue("GetEnterprisesInfoResponse.ChangeDate"));
		getEnterprisesInfoResponse.setIndustryCoName(_ctx.stringValue("GetEnterprisesInfoResponse.IndustryCoName"));
		getEnterprisesInfoResponse.setRegCityName(_ctx.stringValue("GetEnterprisesInfoResponse.RegCityName"));
		getEnterprisesInfoResponse.setBusinessScope(_ctx.stringValue("GetEnterprisesInfoResponse.BusinessScope"));
		getEnterprisesInfoResponse.setEnterpriseType(_ctx.stringValue("GetEnterprisesInfoResponse.EnterpriseType"));
	 
	 	return getEnterprisesInfoResponse;
	}
}