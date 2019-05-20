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

import com.aliyuncs.cloudcallcenter.model.v20170705.Query400NumberManagerIdentifyDetailResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.Query400NumberManagerIdentifyDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class Query400NumberManagerIdentifyDetailResponseUnmarshaller {

	public static Query400NumberManagerIdentifyDetailResponse unmarshall(Query400NumberManagerIdentifyDetailResponse query400NumberManagerIdentifyDetailResponse, UnmarshallerContext context) {
		
		query400NumberManagerIdentifyDetailResponse.setRequestId(context.stringValue("Query400NumberManagerIdentifyDetailResponse.RequestId"));
		query400NumberManagerIdentifyDetailResponse.setSuccess(context.booleanValue("Query400NumberManagerIdentifyDetailResponse.Success"));
		query400NumberManagerIdentifyDetailResponse.setCode(context.stringValue("Query400NumberManagerIdentifyDetailResponse.Code"));
		query400NumberManagerIdentifyDetailResponse.setMessage(context.stringValue("Query400NumberManagerIdentifyDetailResponse.Message"));
		query400NumberManagerIdentifyDetailResponse.setHttpStatusCode(context.integerValue("Query400NumberManagerIdentifyDetailResponse.HttpStatusCode"));

		Data data = new Data();
		data.setAliyunUid(context.longValue("Query400NumberManagerIdentifyDetailResponse.Data.AliyunUid"));
		data.setPartnerId(context.longValue("Query400NumberManagerIdentifyDetailResponse.Data.PartnerId"));
		data.setManagerName(context.stringValue("Query400NumberManagerIdentifyDetailResponse.Data.ManagerName"));
		data.setManagerMobilePhone(context.stringValue("Query400NumberManagerIdentifyDetailResponse.Data.ManagerMobilePhone"));
		data.setManagerCertType(context.stringValue("Query400NumberManagerIdentifyDetailResponse.Data.ManagerCertType"));
		data.setManagerCertNumber(context.stringValue("Query400NumberManagerIdentifyDetailResponse.Data.ManagerCertNumber"));
		data.setManagerCertEffDate(context.stringValue("Query400NumberManagerIdentifyDetailResponse.Data.ManagerCertEffDate"));
		data.setManagerCertExpDate(context.stringValue("Query400NumberManagerIdentifyDetailResponse.Data.ManagerCertExpDate"));
		data.setManagerCertPic(context.stringValue("Query400NumberManagerIdentifyDetailResponse.Data.ManagerCertPic"));
		data.setUnifiedstandardAgreement(context.stringValue("Query400NumberManagerIdentifyDetailResponse.Data.UnifiedstandardAgreement"));
		data.setEmpowerment(context.stringValue("Query400NumberManagerIdentifyDetailResponse.Data.Empowerment"));
		data.setSupplementaryMaterial(context.stringValue("Query400NumberManagerIdentifyDetailResponse.Data.SupplementaryMaterial"));
		data.setRejectReason(context.stringValue("Query400NumberManagerIdentifyDetailResponse.Data.RejectReason"));
		data.setReasonKey(context.stringValue("Query400NumberManagerIdentifyDetailResponse.Data.ReasonKey"));
		query400NumberManagerIdentifyDetailResponse.setData(data);
	 
	 	return query400NumberManagerIdentifyDetailResponse;
	}
}