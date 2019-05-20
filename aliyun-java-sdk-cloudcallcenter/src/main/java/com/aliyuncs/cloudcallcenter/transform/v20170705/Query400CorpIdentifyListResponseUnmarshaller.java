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

import com.aliyuncs.cloudcallcenter.model.v20170705.Query400CorpIdentifyListResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.Query400CorpIdentifyListResponse.Data;
import com.aliyuncs.cloudcallcenter.model.v20170705.Query400CorpIdentifyListResponse.Data.Number400CorpIdentifyDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class Query400CorpIdentifyListResponseUnmarshaller {

	public static Query400CorpIdentifyListResponse unmarshall(Query400CorpIdentifyListResponse query400CorpIdentifyListResponse, UnmarshallerContext context) {
		
		query400CorpIdentifyListResponse.setRequestId(context.stringValue("Query400CorpIdentifyListResponse.RequestId"));
		query400CorpIdentifyListResponse.setSuccess(context.booleanValue("Query400CorpIdentifyListResponse.Success"));
		query400CorpIdentifyListResponse.setCode(context.stringValue("Query400CorpIdentifyListResponse.Code"));
		query400CorpIdentifyListResponse.setMessage(context.stringValue("Query400CorpIdentifyListResponse.Message"));
		query400CorpIdentifyListResponse.setHttpStatusCode(context.integerValue("Query400CorpIdentifyListResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTotalCount(context.integerValue("Query400CorpIdentifyListResponse.Data.TotalCount"));
		data.setPageNumber(context.integerValue("Query400CorpIdentifyListResponse.Data.PageNumber"));
		data.setPageSize(context.integerValue("Query400CorpIdentifyListResponse.Data.PageSize"));

		List<Number400CorpIdentifyDomain> corpIdentifies = new ArrayList<Number400CorpIdentifyDomain>();
		for (int i = 0; i < context.lengthValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies.Length"); i++) {
			Number400CorpIdentifyDomain number400CorpIdentifyDomain = new Number400CorpIdentifyDomain();
			number400CorpIdentifyDomain.setApplyRemark(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].ApplyRemark"));
			number400CorpIdentifyDomain.setAuditState(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].AuditState"));
			number400CorpIdentifyDomain.setBusinessLicensePic(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].BusinessLicensePic"));
			number400CorpIdentifyDomain.setBuyCountLimit(context.integerValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].BuyCountLimit"));
			number400CorpIdentifyDomain.setCanModifyIdentify(context.booleanValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].CanModifyIdentify"));
			number400CorpIdentifyDomain.setCorpCertNumber(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].CorpCertNumber"));
			number400CorpIdentifyDomain.setCorpCertType(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].CorpCertType"));
			number400CorpIdentifyDomain.setCorpName(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].CorpName"));
			number400CorpIdentifyDomain.setCorpNumber(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].CorpNumber"));
			number400CorpIdentifyDomain.setCorpRegisteredAddrArea(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].CorpRegisteredAddrArea"));
			number400CorpIdentifyDomain.setCorpRegisteredAddrCity(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].CorpRegisteredAddrCity"));
			number400CorpIdentifyDomain.setCorpRegisteredAddrDetail(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].CorpRegisteredAddrDetail"));
			number400CorpIdentifyDomain.setCorpRegisteredAddrProv(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].CorpRegisteredAddrProv"));
			number400CorpIdentifyDomain.setCorpRegisteredEffDate(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].CorpRegisteredEffDate"));
			number400CorpIdentifyDomain.setCorpRegisteredExpDate(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].CorpRegisteredExpDate"));
			number400CorpIdentifyDomain.setLegalPersonCertEffDate(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].LegalPersonCertEffDate"));
			number400CorpIdentifyDomain.setLegalPersonCertExpDate(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].LegalPersonCertExpDate"));
			number400CorpIdentifyDomain.setLegalPersonCertNumber(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].LegalPersonCertNumber"));
			number400CorpIdentifyDomain.setLegalPersonCertPic(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].LegalPersonCertPic"));
			number400CorpIdentifyDomain.setLegalPersonCertType(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].LegalPersonCertType"));
			number400CorpIdentifyDomain.setLegalPersonName(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].LegalPersonName"));
			number400CorpIdentifyDomain.setLegalPersonPhoneNumber(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].LegalPersonPhoneNumber"));
			number400CorpIdentifyDomain.setOrderId(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].OrderId"));
			number400CorpIdentifyDomain.setOrderTime(context.longValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].OrderTime"));
			number400CorpIdentifyDomain.setPartnerId(context.longValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].PartnerId"));
			number400CorpIdentifyDomain.setRealNameInsId(context.longValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].RealNameInsId"));
			number400CorpIdentifyDomain.setRemainCount(context.integerValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].RemainCount"));
			number400CorpIdentifyDomain.setSpecId(context.longValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].SpecId"));
			number400CorpIdentifyDomain.setSpecName(context.stringValue("Query400CorpIdentifyListResponse.Data.CorpIdentifies["+ i +"].SpecName"));

			corpIdentifies.add(number400CorpIdentifyDomain);
		}
		data.setCorpIdentifies(corpIdentifies);
		query400CorpIdentifyListResponse.setData(data);
	 
	 	return query400CorpIdentifyListResponse;
	}
}