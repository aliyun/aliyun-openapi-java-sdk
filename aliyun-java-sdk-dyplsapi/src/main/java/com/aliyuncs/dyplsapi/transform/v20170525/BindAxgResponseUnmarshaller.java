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

import com.aliyuncs.dyplsapi.model.v20170525.BindAxgResponse;
import com.aliyuncs.dyplsapi.model.v20170525.BindAxgResponse.SecretBindDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindAxgResponseUnmarshaller {

	public static BindAxgResponse unmarshall(BindAxgResponse bindAxgResponse, UnmarshallerContext _ctx) {
		
		bindAxgResponse.setRequestId(_ctx.stringValue("BindAxgResponse.RequestId"));
		bindAxgResponse.setCode(_ctx.stringValue("BindAxgResponse.Code"));
		bindAxgResponse.setMessage(_ctx.stringValue("BindAxgResponse.Message"));

		SecretBindDTO secretBindDTO = new SecretBindDTO();
		secretBindDTO.setExtension(_ctx.stringValue("BindAxgResponse.SecretBindDTO.Extension"));
		secretBindDTO.setSubsId(_ctx.stringValue("BindAxgResponse.SecretBindDTO.SubsId"));
		secretBindDTO.setSecretNo(_ctx.stringValue("BindAxgResponse.SecretBindDTO.SecretNo"));
		bindAxgResponse.setSecretBindDTO(secretBindDTO);
	 
	 	return bindAxgResponse;
	}
}