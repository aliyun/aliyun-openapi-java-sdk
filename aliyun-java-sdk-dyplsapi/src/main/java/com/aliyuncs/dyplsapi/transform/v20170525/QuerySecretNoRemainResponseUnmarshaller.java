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

import com.aliyuncs.dyplsapi.model.v20170525.QuerySecretNoRemainResponse;
import com.aliyuncs.dyplsapi.model.v20170525.QuerySecretNoRemainResponse.SecretRemainDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySecretNoRemainResponseUnmarshaller {

	public static QuerySecretNoRemainResponse unmarshall(QuerySecretNoRemainResponse querySecretNoRemainResponse, UnmarshallerContext context) {
		
		querySecretNoRemainResponse.setRequestId(context.stringValue("QuerySecretNoRemainResponse.RequestId"));
		querySecretNoRemainResponse.setCode(context.stringValue("QuerySecretNoRemainResponse.Code"));
		querySecretNoRemainResponse.setMessage(context.stringValue("QuerySecretNoRemainResponse.Message"));

		SecretRemainDTO secretRemainDTO = new SecretRemainDTO();
		secretRemainDTO.setCity(context.stringValue("QuerySecretNoRemainResponse.SecretRemainDTO.City"));
		secretRemainDTO.setAmount(context.longValue("QuerySecretNoRemainResponse.SecretRemainDTO.Amount"));
		querySecretNoRemainResponse.setSecretRemainDTO(secretRemainDTO);
	 
	 	return querySecretNoRemainResponse;
	}
}