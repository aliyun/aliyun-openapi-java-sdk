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

	public static QuerySubscriptionDetailResponse unmarshall(QuerySubscriptionDetailResponse querySubscriptionDetailResponse, UnmarshallerContext _ctx) {
		
		querySubscriptionDetailResponse.setRequestId(_ctx.stringValue("QuerySubscriptionDetailResponse.RequestId"));
		querySubscriptionDetailResponse.setCode(_ctx.stringValue("QuerySubscriptionDetailResponse.Code"));
		querySubscriptionDetailResponse.setMessage(_ctx.stringValue("QuerySubscriptionDetailResponse.Message"));

		SecretBindDetailDTO secretBindDetailDTO = new SecretBindDetailDTO();
		secretBindDetailDTO.setSubsId(_ctx.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.SubsId"));
		secretBindDetailDTO.setPhoneNoA(_ctx.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.PhoneNoA"));
		secretBindDetailDTO.setPhoneNoX(_ctx.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.PhoneNoX"));
		secretBindDetailDTO.setPhoneNoB(_ctx.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.PhoneNoB"));
		secretBindDetailDTO.setExtension(_ctx.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.Extension"));
		secretBindDetailDTO.setGroupId(_ctx.longValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.GroupId"));
		secretBindDetailDTO.setGmtCreate(_ctx.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.GmtCreate"));
		secretBindDetailDTO.setExpireDate(_ctx.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.ExpireDate"));
		secretBindDetailDTO.setNeedRecord(_ctx.booleanValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.NeedRecord"));
		secretBindDetailDTO.setCallRestrict(_ctx.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.CallRestrict"));
		secretBindDetailDTO.setStatus(_ctx.longValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.Status"));
		secretBindDetailDTO.setASRStatus(_ctx.booleanValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.ASRStatus"));
		secretBindDetailDTO.setASRModelId(_ctx.stringValue("QuerySubscriptionDetailResponse.SecretBindDetailDTO.ASRModelId"));
		querySubscriptionDetailResponse.setSecretBindDetailDTO(secretBindDetailDTO);
	 
	 	return querySubscriptionDetailResponse;
	}
}