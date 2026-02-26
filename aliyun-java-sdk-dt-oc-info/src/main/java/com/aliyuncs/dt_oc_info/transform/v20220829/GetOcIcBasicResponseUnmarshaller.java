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

package com.aliyuncs.dt_oc_info.transform.v20220829;

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcBasicResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcBasicResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIcBasicResponseUnmarshaller {

	public static GetOcIcBasicResponse unmarshall(GetOcIcBasicResponse getOcIcBasicResponse, UnmarshallerContext _ctx) {
		
		getOcIcBasicResponse.setRequestId(_ctx.stringValue("GetOcIcBasicResponse.RequestId"));
		getOcIcBasicResponse.setCode(_ctx.stringValue("GetOcIcBasicResponse.Code"));
		getOcIcBasicResponse.setSuccess(_ctx.booleanValue("GetOcIcBasicResponse.Success"));
		getOcIcBasicResponse.setMessage(_ctx.stringValue("GetOcIcBasicResponse.Message"));
		getOcIcBasicResponse.setTotalNum(_ctx.integerValue("GetOcIcBasicResponse.TotalNum"));
		getOcIcBasicResponse.setPageIndex(_ctx.integerValue("GetOcIcBasicResponse.PageIndex"));
		getOcIcBasicResponse.setPageNum(_ctx.integerValue("GetOcIcBasicResponse.PageNum"));

		Data data = new Data();
		data.setEntName(_ctx.stringValue("GetOcIcBasicResponse.Data.EntName"));
		data.setLegalName(_ctx.stringValue("GetOcIcBasicResponse.Data.LegalName"));
		data.setEsDate(_ctx.stringValue("GetOcIcBasicResponse.Data.EsDate"));
		data.setEntStatus(_ctx.stringValue("GetOcIcBasicResponse.Data.EntStatus"));
		data.setRegCap(_ctx.stringValue("GetOcIcBasicResponse.Data.RegCap"));
		data.setRecCap(_ctx.stringValue("GetOcIcBasicResponse.Data.RecCap"));
		data.setSocialCreditCode(_ctx.stringValue("GetOcIcBasicResponse.Data.SocialCreditCode"));
		data.setLicenseNumber(_ctx.stringValue("GetOcIcBasicResponse.Data.LicenseNumber"));
		data.setOrgNo(_ctx.stringValue("GetOcIcBasicResponse.Data.OrgNo"));
		data.setTaxNum(_ctx.stringValue("GetOcIcBasicResponse.Data.TaxNum"));
		data.setEntType(_ctx.stringValue("GetOcIcBasicResponse.Data.EntType"));
		data.setIndustryNameLv1(_ctx.stringValue("GetOcIcBasicResponse.Data.IndustryNameLv1"));
		data.setIndustryNameLv2(_ctx.stringValue("GetOcIcBasicResponse.Data.IndustryNameLv2"));
		data.setOpFrom(_ctx.stringValue("GetOcIcBasicResponse.Data.OpFrom"));
		data.setOpTo(_ctx.stringValue("GetOcIcBasicResponse.Data.OpTo"));
		data.setStaffNum(_ctx.stringValue("GetOcIcBasicResponse.Data.StaffNum"));
		data.setInsuredNum(_ctx.stringValue("GetOcIcBasicResponse.Data.InsuredNum"));
		data.setEntNameEng(_ctx.stringValue("GetOcIcBasicResponse.Data.EntNameEng"));
		data.setFormerNames(_ctx.stringValue("GetOcIcBasicResponse.Data.FormerNames"));
		data.setRegOrg(_ctx.stringValue("GetOcIcBasicResponse.Data.RegOrg"));
		data.setCheckDate(_ctx.stringValue("GetOcIcBasicResponse.Data.CheckDate"));
		data.setOpScope(_ctx.stringValue("GetOcIcBasicResponse.Data.OpScope"));
		data.setEntAddress(_ctx.stringValue("GetOcIcBasicResponse.Data.EntAddress"));
		data.setEntBrief(_ctx.stringValue("GetOcIcBasicResponse.Data.EntBrief"));
		data.setRegOrgProvince(_ctx.stringValue("GetOcIcBasicResponse.Data.RegOrgProvince"));
		data.setRegOrgCity(_ctx.stringValue("GetOcIcBasicResponse.Data.RegOrgCity"));
		data.setRegOrgDistrict(_ctx.stringValue("GetOcIcBasicResponse.Data.RegOrgDistrict"));
		getOcIcBasicResponse.setData(data);
	 
	 	return getOcIcBasicResponse;
	}
}