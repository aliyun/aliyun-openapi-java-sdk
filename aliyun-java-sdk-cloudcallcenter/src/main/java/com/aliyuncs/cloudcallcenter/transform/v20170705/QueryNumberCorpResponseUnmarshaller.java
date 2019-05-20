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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumberCorpResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumberCorpResponse.Data;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumberCorpResponse.Data.QueryCorpDomain;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumberCorpResponse.Data.QueryCorpDomain.QueryCorpIdentifyDomain;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumberCorpResponse.Data.QueryCorpDomain.QueryCorpIdentifyDomain.AuditRemarkInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryNumberCorpResponseUnmarshaller {

	public static QueryNumberCorpResponse unmarshall(QueryNumberCorpResponse queryNumberCorpResponse, UnmarshallerContext context) {
		
		queryNumberCorpResponse.setRequestId(context.stringValue("QueryNumberCorpResponse.RequestId"));
		queryNumberCorpResponse.setSuccess(context.booleanValue("QueryNumberCorpResponse.Success"));
		queryNumberCorpResponse.setCode(context.stringValue("QueryNumberCorpResponse.Code"));
		queryNumberCorpResponse.setMessage(context.stringValue("QueryNumberCorpResponse.Message"));
		queryNumberCorpResponse.setHttpStatusCode(context.integerValue("QueryNumberCorpResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTotalCount(context.integerValue("QueryNumberCorpResponse.Data.TotalCount"));
		data.setPageNumber(context.integerValue("QueryNumberCorpResponse.Data.PageNumber"));
		data.setPageSize(context.integerValue("QueryNumberCorpResponse.Data.PageSize"));

		List<QueryCorpDomain> list = new ArrayList<QueryCorpDomain>();
		for (int i = 0; i < context.lengthValue("QueryNumberCorpResponse.Data.List.Length"); i++) {
			QueryCorpDomain queryCorpDomain = new QueryCorpDomain();
			queryCorpDomain.setCorpName(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].CorpName"));

			List<QueryCorpIdentifyDomain> identify = new ArrayList<QueryCorpIdentifyDomain>();
			for (int j = 0; j < context.lengthValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify.Length"); j++) {
				QueryCorpIdentifyDomain queryCorpIdentifyDomain = new QueryCorpIdentifyDomain();
				queryCorpIdentifyDomain.setApplyRemark(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].ApplyRemark"));
				queryCorpIdentifyDomain.setAuditState(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].AuditState"));
				queryCorpIdentifyDomain.setCorpName(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].CorpName"));
				queryCorpIdentifyDomain.setRegionNameProvince(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].RegionNameProvince"));
				queryCorpIdentifyDomain.setRegionNameCity(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].RegionNameCity"));
				queryCorpIdentifyDomain.setOrderId(context.longValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].OrderId"));
				queryCorpIdentifyDomain.setSpecName(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].SpecName"));
				queryCorpIdentifyDomain.setRemainCount(context.integerValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].RemainCount"));
				queryCorpIdentifyDomain.setBuyCountLimit(context.integerValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].BuyCountLimit"));
				queryCorpIdentifyDomain.setCanApplyOffsite(context.booleanValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].CanApplyOffsite"));
				queryCorpIdentifyDomain.setRealNameInsId(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].RealNameInsId"));
				queryCorpIdentifyDomain.setSpecId(context.longValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].SpecId"));
				queryCorpIdentifyDomain.setSpecIdArray(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].SpecIdArray"));
				queryCorpIdentifyDomain.setRegisteredFundCode(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].RegisteredFundCode"));
				queryCorpIdentifyDomain.setGmtCreate(context.longValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].GmtCreate"));
				queryCorpIdentifyDomain.setBusinessLicenseAddress(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].BusinessLicenseAddress"));
				queryCorpIdentifyDomain.setBusinessLicensePic(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].BusinessLicensePic"));
				queryCorpIdentifyDomain.setLegalPersonCertNumber(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].LegalPersonCertNumber"));
				queryCorpIdentifyDomain.setLegalPersonrCertNumber(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].LegalPersonrCertNumber"));
				queryCorpIdentifyDomain.setLegalPersonName(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].LegalPersonName"));
				queryCorpIdentifyDomain.setManagerCertNumber(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].ManagerCertNumber"));
				queryCorpIdentifyDomain.setManagerCertPic(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].ManagerCertPic"));
				queryCorpIdentifyDomain.setManagerContactPhoneNumber(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].ManagerContactPhoneNumber"));
				queryCorpIdentifyDomain.setManagerName(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].ManagerName"));
				queryCorpIdentifyDomain.setNumberApplicationLetterPic(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].NumberApplicationLetterPic"));
				queryCorpIdentifyDomain.setOrganizationCode(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].OrganizationCode"));
				queryCorpIdentifyDomain.setTelecomUndertakingPic(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].TelecomUndertakingPic"));
				queryCorpIdentifyDomain.setProcedureDesc(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].ProcedureDesc"));

				AuditRemarkInfo auditRemarkInfo = new AuditRemarkInfo();
				auditRemarkInfo.setRejectDate(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].AuditRemarkInfo.RejectDate"));
				auditRemarkInfo.setRejectInfo(context.stringValue("QueryNumberCorpResponse.Data.List["+ i +"].Identify["+ j +"].AuditRemarkInfo.RejectInfo"));
				queryCorpIdentifyDomain.setAuditRemarkInfo(auditRemarkInfo);

				identify.add(queryCorpIdentifyDomain);
			}
			queryCorpDomain.setIdentify(identify);

			list.add(queryCorpDomain);
		}
		data.setList(list);
		queryNumberCorpResponse.setData(data);
	 
	 	return queryNumberCorpResponse;
	}
}