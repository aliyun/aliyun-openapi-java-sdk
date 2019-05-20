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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetCorpIdentifyResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetCorpIdentifyResponse.CorpIdentify;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCorpIdentifyResponseUnmarshaller {

	public static GetCorpIdentifyResponse unmarshall(GetCorpIdentifyResponse getCorpIdentifyResponse, UnmarshallerContext context) {
		
		getCorpIdentifyResponse.setRequestId(context.stringValue("GetCorpIdentifyResponse.RequestId"));
		getCorpIdentifyResponse.setSuccess(context.booleanValue("GetCorpIdentifyResponse.Success"));
		getCorpIdentifyResponse.setCode(context.stringValue("GetCorpIdentifyResponse.Code"));
		getCorpIdentifyResponse.setMessage(context.stringValue("GetCorpIdentifyResponse.Message"));
		getCorpIdentifyResponse.setHttpStatusCode(context.integerValue("GetCorpIdentifyResponse.HttpStatusCode"));

		List<CorpIdentify> corpIdentifies = new ArrayList<CorpIdentify>();
		for (int i = 0; i < context.lengthValue("GetCorpIdentifyResponse.CorpIdentifies.Length"); i++) {
			CorpIdentify corpIdentify = new CorpIdentify();
			corpIdentify.setTaobaoUid(context.longValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].taobaoUid"));
			corpIdentify.setRamId(context.longValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].ramId"));
			corpIdentify.setOrderId(context.longValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].orderId"));
			corpIdentify.setPartnerId(context.longValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].partnerId"));
			corpIdentify.setApplyRemark(context.stringValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].applyRemark"));
			corpIdentify.setRegionNameProvince(context.stringValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].regionNameProvince"));
			corpIdentify.setRegionNameCity(context.stringValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].regionNameCity"));
			corpIdentify.setCorpName(context.stringValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].corpName"));
			corpIdentify.setLegalPersonName(context.stringValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].legalPersonName"));
			corpIdentify.setLegalPersonCertNumber(context.stringValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].legalPersonCertNumber"));
			corpIdentify.setManagerContactPhoneNumber(context.stringValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].managerContactPhoneNumber"));
			corpIdentify.setManagerName(context.stringValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].managerName"));
			corpIdentify.setBusinessLicenseAddress(context.stringValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].businessLicenseAddress"));
			corpIdentify.setManagerCertNumber(context.stringValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].managerCertNumber"));
			corpIdentify.setOrganizationCode(context.stringValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].organizationCode"));
			corpIdentify.setTelecomUndertakingPic(context.stringValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].telecomUndertakingPic"));
			corpIdentify.setManagerCertPic(context.stringValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].managerCertPic"));
			corpIdentify.setNumberApplicationLetterPic(context.stringValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].numberApplicationLetterPic"));
			corpIdentify.setBusinessLicensePic(context.stringValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].businessLicensePic"));
			corpIdentify.setProcedureDesc(context.stringValue("GetCorpIdentifyResponse.CorpIdentifies["+ i +"].procedureDesc"));

			corpIdentifies.add(corpIdentify);
		}
		getCorpIdentifyResponse.setCorpIdentifies(corpIdentifies);
	 
	 	return getCorpIdentifyResponse;
	}
}