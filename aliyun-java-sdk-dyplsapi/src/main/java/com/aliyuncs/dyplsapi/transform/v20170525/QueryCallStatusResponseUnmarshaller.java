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

	public static QueryCallStatusResponse unmarshall(QueryCallStatusResponse queryCallStatusResponse, UnmarshallerContext context) {
		
		queryCallStatusResponse.setRequestId(context.stringValue("QueryCallStatusResponse.RequestId"));
		queryCallStatusResponse.setCode(context.stringValue("QueryCallStatusResponse.Code"));
		queryCallStatusResponse.setMessage(context.stringValue("QueryCallStatusResponse.Message"));

		SecretCallStatusDTO secretCallStatusDTO = new SecretCallStatusDTO();
		secretCallStatusDTO.setStatus(context.integerValue("QueryCallStatusResponse.SecretCallStatusDTO.Status"));
		secretCallStatusDTO.setCalledNo(context.stringValue("QueryCallStatusResponse.SecretCallStatusDTO.CalledNo"));
		queryCallStatusResponse.setSecretCallStatusDTO(secretCallStatusDTO);
	 
	 	return queryCallStatusResponse;
	}
}