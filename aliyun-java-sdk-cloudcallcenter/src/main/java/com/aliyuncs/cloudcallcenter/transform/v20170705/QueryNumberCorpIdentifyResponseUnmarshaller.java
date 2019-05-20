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

import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumberCorpIdentifyResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumberCorpIdentifyResponse.Data;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumberCorpIdentifyResponse.Data.QueryCorpIdentifyDomain;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumberCorpIdentifyResponse.Data.QueryCorpIdentifyDomain.AuditRemarkInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryNumberCorpIdentifyResponseUnmarshaller {

	public static QueryNumberCorpIdentifyResponse unmarshall(QueryNumberCorpIdentifyResponse queryNumberCorpIdentifyResponse, UnmarshallerContext context) {
		
		queryNumberCorpIdentifyResponse.setRequestId(context.stringValue("QueryNumberCorpIdentifyResponse.RequestId"));
		queryNumberCorpIdentifyResponse.setSuccess(context.booleanValue("QueryNumberCorpIdentifyResponse.Success"));
		queryNumberCorpIdentifyResponse.setCode(context.stringValue("QueryNumberCorpIdentifyResponse.Code"));
		queryNumberCorpIdentifyResponse.setMessage(context.stringValue("QueryNumberCorpIdentifyResponse.Message"));
		queryNumberCorpIdentifyResponse.setHttpStatusCode(context.integerValue("QueryNumberCorpIdentifyResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTotalCount(context.integerValue("QueryNumberCorpIdentifyResponse.Data.TotalCount"));
		data.setPageNumber(context.integerValue("QueryNumberCorpIdentifyResponse.Data.PageNumber"));
		data.setPageSize(context.integerValue("QueryNumberCorpIdentifyResponse.Data.PageSize"));

		List<QueryCorpIdentifyDomain> list = new ArrayList<QueryCorpIdentifyDomain>();
		for (int i = 0; i < context.lengthValue("QueryNumberCorpIdentifyResponse.Data.List.Length"); i++) {
			QueryCorpIdentifyDomain queryCorpIdentifyDomain = new QueryCorpIdentifyDomain();
			queryCorpIdentifyDomain.setApplyRemark(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].ApplyRemark"));
			queryCorpIdentifyDomain.setAuditState(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].AuditState"));
			queryCorpIdentifyDomain.setCorpName(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].CorpName"));
			queryCorpIdentifyDomain.setRegionNameProvince(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].RegionNameProvince"));
			queryCorpIdentifyDomain.setRegionNameCity(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].RegionNameCity"));
			queryCorpIdentifyDomain.setOrderId(context.longValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].OrderId"));
			queryCorpIdentifyDomain.setSpecName(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].SpecName"));
			queryCorpIdentifyDomain.setRemainCount(context.integerValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].RemainCount"));
			queryCorpIdentifyDomain.setBuyCountLimit(context.integerValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].BuyCountLimit"));
			queryCorpIdentifyDomain.setCanApplyOffsite(context.booleanValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].CanApplyOffsite"));
			queryCorpIdentifyDomain.setRealNameInsId(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].RealNameInsId"));
			queryCorpIdentifyDomain.setSpecId(context.longValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].SpecId"));
			queryCorpIdentifyDomain.setSpecIdArray(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].SpecIdArray"));
			queryCorpIdentifyDomain.setRegisteredFundCode(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].RegisteredFundCode"));
			queryCorpIdentifyDomain.setGmtCreate(context.longValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].GmtCreate"));
			queryCorpIdentifyDomain.setBusinessLicenseAddress(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].BusinessLicenseAddress"));
			queryCorpIdentifyDomain.setBusinessLicensePic(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].BusinessLicensePic"));
			queryCorpIdentifyDomain.setLegalPersonCertNumber(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].LegalPersonCertNumber"));
			queryCorpIdentifyDomain.setLegalPersonrCertNumber(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].LegalPersonrCertNumber"));
			queryCorpIdentifyDomain.setLegalPersonName(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].LegalPersonName"));
			queryCorpIdentifyDomain.setManagerCertNumber(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].ManagerCertNumber"));
			queryCorpIdentifyDomain.setManagerCertPic(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].ManagerCertPic"));
			queryCorpIdentifyDomain.setManagerContactPhoneNumber(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].ManagerContactPhoneNumber"));
			queryCorpIdentifyDomain.setManagerName(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].ManagerName"));
			queryCorpIdentifyDomain.setNumberApplicationLetterPic(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].NumberApplicationLetterPic"));
			queryCorpIdentifyDomain.setOrganizationCode(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].OrganizationCode"));
			queryCorpIdentifyDomain.setTelecomUndertakingPic(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].TelecomUndertakingPic"));
			queryCorpIdentifyDomain.setProcedureDesc(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].ProcedureDesc"));
			queryCorpIdentifyDomain.setCorporationCertPic(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].CorporationCertPic"));
			queryCorpIdentifyDomain.setBusinessType(context.integerValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].BusinessType"));
			queryCorpIdentifyDomain.setBusinessTypeDesc(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].BusinessTypeDesc"));
			queryCorpIdentifyDomain.setOffsiteCertPic(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].OffsiteCertPic"));

			AuditRemarkInfo auditRemarkInfo = new AuditRemarkInfo();
			auditRemarkInfo.setRejectDate(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].AuditRemarkInfo.RejectDate"));
			auditRemarkInfo.setRejectInfo(context.stringValue("QueryNumberCorpIdentifyResponse.Data.List["+ i +"].AuditRemarkInfo.RejectInfo"));
			queryCorpIdentifyDomain.setAuditRemarkInfo(auditRemarkInfo);

			list.add(queryCorpIdentifyDomain);
		}
		data.setList(list);
		queryNumberCorpIdentifyResponse.setData(data);
	 
	 	return queryNumberCorpIdentifyResponse;
	}
}