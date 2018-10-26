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

	public static BindAxnExtensionResponse unmarshall(BindAxnExtensionResponse bindAxnExtensionResponse, UnmarshallerContext context) {
		
		bindAxnExtensionResponse.setRequestId(context.stringValue("BindAxnExtensionResponse.RequestId"));
		bindAxnExtensionResponse.setCode(context.stringValue("BindAxnExtensionResponse.Code"));
		bindAxnExtensionResponse.setMessage(context.stringValue("BindAxnExtensionResponse.Message"));

		SecretBindDTO secretBindDTO = new SecretBindDTO();
		secretBindDTO.setSubsId(context.stringValue("BindAxnExtensionResponse.SecretBindDTO.SubsId"));
		secretBindDTO.setSecretNo(context.stringValue("BindAxnExtensionResponse.SecretBindDTO.SecretNo"));
		secretBindDTO.setExtension(context.stringValue("BindAxnExtensionResponse.SecretBindDTO.Extension"));
		bindAxnExtensionResponse.setSecretBindDTO(secretBindDTO);
	 
	 	return bindAxnExtensionResponse;
	}
}