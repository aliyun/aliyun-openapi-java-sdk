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

import com.aliyuncs.dyplsapi.model.v20170525.QuerySecretNoDetailResponse;
import com.aliyuncs.dyplsapi.model.v20170525.QuerySecretNoDetailResponse.SecretNoInfoDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySecretNoDetailResponseUnmarshaller {

	public static QuerySecretNoDetailResponse unmarshall(QuerySecretNoDetailResponse querySecretNoDetailResponse, UnmarshallerContext _ctx) {
		
		querySecretNoDetailResponse.setRequestId(_ctx.stringValue("QuerySecretNoDetailResponse.RequestId"));
		querySecretNoDetailResponse.setCode(_ctx.stringValue("QuerySecretNoDetailResponse.Code"));
		querySecretNoDetailResponse.setMessage(_ctx.stringValue("QuerySecretNoDetailResponse.Message"));

		SecretNoInfoDTO secretNoInfoDTO = new SecretNoInfoDTO();
		secretNoInfoDTO.setPurchaseTime(_ctx.stringValue("QuerySecretNoDetailResponse.SecretNoInfoDTO.PurchaseTime"));
		secretNoInfoDTO.setVendor(_ctx.longValue("QuerySecretNoDetailResponse.SecretNoInfoDTO.Vendor"));
		secretNoInfoDTO.setProvince(_ctx.stringValue("QuerySecretNoDetailResponse.SecretNoInfoDTO.Province"));
		secretNoInfoDTO.setCity(_ctx.stringValue("QuerySecretNoDetailResponse.SecretNoInfoDTO.City"));
		secretNoInfoDTO.setSecretStatus(_ctx.longValue("QuerySecretNoDetailResponse.SecretNoInfoDTO.SecretStatus"));
		secretNoInfoDTO.setCertifyStatus(_ctx.integerValue("QuerySecretNoDetailResponse.SecretNoInfoDTO.CertifyStatus"));
		querySecretNoDetailResponse.setSecretNoInfoDTO(secretNoInfoDTO);
	 
	 	return querySecretNoDetailResponse;
	}
}