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

import com.aliyuncs.cloudcallcenter.model.v20170705.Query400CorpIdentifyDetailResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.Query400CorpIdentifyDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class Query400CorpIdentifyDetailResponseUnmarshaller {

	public static Query400CorpIdentifyDetailResponse unmarshall(Query400CorpIdentifyDetailResponse query400CorpIdentifyDetailResponse, UnmarshallerContext context) {
		
		query400CorpIdentifyDetailResponse.setRequestId(context.stringValue("Query400CorpIdentifyDetailResponse.RequestId"));
		query400CorpIdentifyDetailResponse.setSuccess(context.booleanValue("Query400CorpIdentifyDetailResponse.Success"));
		query400CorpIdentifyDetailResponse.setCode(context.stringValue("Query400CorpIdentifyDetailResponse.Code"));
		query400CorpIdentifyDetailResponse.setMessage(context.stringValue("Query400CorpIdentifyDetailResponse.Message"));
		query400CorpIdentifyDetailResponse.setHttpStatusCode(context.integerValue("Query400CorpIdentifyDetailResponse.HttpStatusCode"));

		Data data = new Data();
		data.setCorpName(context.stringValue("Query400CorpIdentifyDetailResponse.Data.CorpName"));
		data.setCorpNumber(context.stringValue("Query400CorpIdentifyDetailResponse.Data.CorpNumber"));
		data.setCorpCertType(context.stringValue("Query400CorpIdentifyDetailResponse.Data.CorpCertType"));
		data.setCorpCertNumber(context.stringValue("Query400CorpIdentifyDetailResponse.Data.CorpCertNumber"));
		data.setCorpRegisteredEffDate(context.stringValue("Query400CorpIdentifyDetailResponse.Data.CorpRegisteredEffDate"));
		data.setCorpRegisteredExpDate(context.stringValue("Query400CorpIdentifyDetailResponse.Data.CorpRegisteredExpDate"));
		data.setCorpRegisteredAddrProv(context.stringValue("Query400CorpIdentifyDetailResponse.Data.CorpRegisteredAddrProv"));
		data.setCorpRegisteredAddrCity(context.stringValue("Query400CorpIdentifyDetailResponse.Data.CorpRegisteredAddrCity"));
		data.setCorpRegisteredAddrArea(context.stringValue("Query400CorpIdentifyDetailResponse.Data.CorpRegisteredAddrArea"));
		data.setCorpRegisteredAddrDetail(context.stringValue("Query400CorpIdentifyDetailResponse.Data.CorpRegisteredAddrDetail"));
		data.setLegalPersonName(context.stringValue("Query400CorpIdentifyDetailResponse.Data.LegalPersonName"));
		data.setLegalPersonPhoneNumber(context.stringValue("Query400CorpIdentifyDetailResponse.Data.LegalPersonPhoneNumber"));
		data.setLegalPersonCertType(context.stringValue("Query400CorpIdentifyDetailResponse.Data.LegalPersonCertType"));
		data.setLegalPersonCertNumber(context.stringValue("Query400CorpIdentifyDetailResponse.Data.LegalPersonCertNumber"));
		data.setLegalPersonCertEffDate(context.stringValue("Query400CorpIdentifyDetailResponse.Data.LegalPersonCertEffDate"));
		data.setLegalPersonCertExpDate(context.stringValue("Query400CorpIdentifyDetailResponse.Data.LegalPersonCertExpDate"));
		data.setLegalPersonCertPic(context.stringValue("Query400CorpIdentifyDetailResponse.Data.LegalPersonCertPic"));
		data.setBusinessLicensePic(context.stringValue("Query400CorpIdentifyDetailResponse.Data.BusinessLicensePic"));
		data.setSpecId(context.longValue("Query400CorpIdentifyDetailResponse.Data.SpecId"));
		data.setRejectReason(context.stringValue("Query400CorpIdentifyDetailResponse.Data.RejectReason"));
		data.setReasonKey(context.stringValue("Query400CorpIdentifyDetailResponse.Data.ReasonKey"));
		data.setApplyRemark(context.stringValue("Query400CorpIdentifyDetailResponse.Data.ApplyRemark"));
		data.setAuditState(context.stringValue("Query400CorpIdentifyDetailResponse.Data.AuditState"));
		data.setCanModifyIdentify(context.booleanValue("Query400CorpIdentifyDetailResponse.Data.CanModifyIdentify"));
		data.setSpecIdArray(context.stringValue("Query400CorpIdentifyDetailResponse.Data.SpecIdArray"));
		query400CorpIdentifyDetailResponse.setData(data);
	 
	 	return query400CorpIdentifyDetailResponse;
	}
}