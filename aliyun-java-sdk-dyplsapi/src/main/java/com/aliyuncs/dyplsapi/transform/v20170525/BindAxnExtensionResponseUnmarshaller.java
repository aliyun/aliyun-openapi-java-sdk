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

import com.aliyuncs.dyplsapi.model.v20170525.BindAxnExtensionResponse;
import com.aliyuncs.dyplsapi.model.v20170525.BindAxnExtensionResponse.SecretBindDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindAxnExtensionResponseUnmarshaller {

	public static BindAxnExtensionResponse unmarshall(BindAxnExtensionResponse bindAxnExtensionResponse, UnmarshallerContext _ctx) {
		
		bindAxnExtensionResponse.setRequestId(_ctx.stringValue("BindAxnExtensionResponse.RequestId"));
		bindAxnExtensionResponse.setCode(_ctx.stringValue("BindAxnExtensionResponse.Code"));
		bindAxnExtensionResponse.setMessage(_ctx.stringValue("BindAxnExtensionResponse.Message"));

		SecretBindDTO secretBindDTO = new SecretBindDTO();
		secretBindDTO.setSubsId(_ctx.stringValue("BindAxnExtensionResponse.SecretBindDTO.SubsId"));
		secretBindDTO.setSecretNo(_ctx.stringValue("BindAxnExtensionResponse.SecretBindDTO.SecretNo"));
		secretBindDTO.setExtension(_ctx.stringValue("BindAxnExtensionResponse.SecretBindDTO.Extension"));
		bindAxnExtensionResponse.setSecretBindDTO(secretBindDTO);
	 
	 	return bindAxnExtensionResponse;
	}
}