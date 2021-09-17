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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dyplsapi.model.v20170525.QuerySecretNoRemainResponse;
import com.aliyuncs.dyplsapi.model.v20170525.QuerySecretNoRemainResponse.SecretRemainDTO;
import com.aliyuncs.dyplsapi.model.v20170525.QuerySecretNoRemainResponse.SecretRemainDTO.RemainDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySecretNoRemainResponseUnmarshaller {

	public static QuerySecretNoRemainResponse unmarshall(QuerySecretNoRemainResponse querySecretNoRemainResponse, UnmarshallerContext _ctx) {
		
		querySecretNoRemainResponse.setRequestId(_ctx.stringValue("QuerySecretNoRemainResponse.RequestId"));
		querySecretNoRemainResponse.setCode(_ctx.stringValue("QuerySecretNoRemainResponse.Code"));
		querySecretNoRemainResponse.setMessage(_ctx.stringValue("QuerySecretNoRemainResponse.Message"));

		SecretRemainDTO secretRemainDTO = new SecretRemainDTO();
		secretRemainDTO.setAmount(_ctx.longValue("QuerySecretNoRemainResponse.SecretRemainDTO.Amount"));
		secretRemainDTO.setCity(_ctx.stringValue("QuerySecretNoRemainResponse.SecretRemainDTO.City"));

		List<RemainDTO> remainDTOList = new ArrayList<RemainDTO>();
		for (int i = 0; i < _ctx.lengthValue("QuerySecretNoRemainResponse.SecretRemainDTO.RemainDTOList.Length"); i++) {
			RemainDTO remainDTO = new RemainDTO();
			remainDTO.setAmount(_ctx.longValue("QuerySecretNoRemainResponse.SecretRemainDTO.RemainDTOList["+ i +"].Amount"));
			remainDTO.setCity(_ctx.stringValue("QuerySecretNoRemainResponse.SecretRemainDTO.RemainDTOList["+ i +"].City"));

			remainDTOList.add(remainDTO);
		}
		secretRemainDTO.setRemainDTOList(remainDTOList);
		querySecretNoRemainResponse.setSecretRemainDTO(secretRemainDTO);
	 
	 	return querySecretNoRemainResponse;
	}
}