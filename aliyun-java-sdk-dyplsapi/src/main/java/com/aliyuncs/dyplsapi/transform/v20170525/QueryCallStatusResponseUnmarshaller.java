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

import com.aliyuncs.dyplsapi.model.v20170525.QueryCallStatusResponse;
import com.aliyuncs.dyplsapi.model.v20170525.QueryCallStatusResponse.SecretCallStatusDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCallStatusResponseUnmarshaller {

	public static QueryCallStatusResponse unmarshall(QueryCallStatusResponse queryCallStatusResponse, UnmarshallerContext _ctx) {
		
		queryCallStatusResponse.setRequestId(_ctx.stringValue("QueryCallStatusResponse.RequestId"));
		queryCallStatusResponse.setCode(_ctx.stringValue("QueryCallStatusResponse.Code"));
		queryCallStatusResponse.setMessage(_ctx.stringValue("QueryCallStatusResponse.Message"));

		SecretCallStatusDTO secretCallStatusDTO = new SecretCallStatusDTO();
		secretCallStatusDTO.setCalledNo(_ctx.stringValue("QueryCallStatusResponse.SecretCallStatusDTO.CalledNo"));
		secretCallStatusDTO.setStatus(_ctx.integerValue("QueryCallStatusResponse.SecretCallStatusDTO.Status"));
		queryCallStatusResponse.setSecretCallStatusDTO(secretCallStatusDTO);
	 
	 	return queryCallStatusResponse;
	}
}