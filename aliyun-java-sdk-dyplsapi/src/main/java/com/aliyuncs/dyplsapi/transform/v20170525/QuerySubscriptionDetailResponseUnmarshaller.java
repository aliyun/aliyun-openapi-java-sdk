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

package com.aliyuncs.dyplsapi.transform.v20170525;

import com.aliyuncs.dyplsapi.model.v20170525.QuerySubscriptionDetailResponse;
import com.aliyuncs.dyplsapi.model.v20170525.QuerySubscriptionDetailResponse.SecretBindDetailDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySubscriptionDetailResponseUnmarshaller {

	public static QuerySubscriptionDetailResponse unmarshall(QuerySubscriptionDetailResponse querySubscriptionDetailResponse, UnmarshallerContext context) {
		
		querySubscriptionDetailResponse.setRequestId(context.stringValue("QuerySubscriptionDetailResponse.RequestId"));
		querySubscriptionDetailResponse.setCode(context.stringValue("QuerySubscriptionDetailResponse.Code"));
		querySubscriptionDetailResponse.setMessage(context.stringValue("QuerySubscriptionDetailResponse.Message"));

		SecretBindDetailDTO secretBindDetailDTO = new SecretBindDetailDTO();
		secretBindDetailDTO.setSubsId(context.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.SubsId"));
		secretBindDetailDTO.setPhoneNoA(context.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.PhoneNoA"));
		secretBindDetailDTO.setPhoneNoX(context.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.PhoneNoX"));
		secretBindDetailDTO.setPhoneNoB(context.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.PhoneNoB"));
		secretBindDetailDTO.setExtension(context.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.Extension"));
		secretBindDetailDTO.setGroupId(context.longValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.GroupId"));
		secretBindDetailDTO.setGmtCreate(context.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.GmtCreate"));
		secretBindDetailDTO.setExpireDate(context.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.ExpireDate"));
		secretBindDetailDTO.setNeedRecord(context.booleanValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.NeedRecord"));
		secretBindDetailDTO.setCallRestrict(context.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.CallRestrict"));
		secretBindDetailDTO.setStatus(context.longValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.Status"));
		querySubscriptionDetailResponse.setSecretBindDetailDTO(secretBindDetailDTO);
	 
	 	return querySubscriptionDetailResponse;
	}
}