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

import com.aliyuncs.dyplsapi.model.v20170525.BindAxbResponse;
import com.aliyuncs.dyplsapi.model.v20170525.BindAxbResponse.SecretBindDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindAxbResponseUnmarshaller {

	public static BindAxbResponse unmarshall(BindAxbResponse bindAxbResponse, UnmarshallerContext _ctx) {
		
		bindAxbResponse.setRequestId(_ctx.stringValue("BindAxbResponse.RequestId"));
		bindAxbResponse.setCode(_ctx.stringValue("BindAxbResponse.Code"));
		bindAxbResponse.setMessage(_ctx.stringValue("BindAxbResponse.Message"));

		SecretBindDTO secretBindDTO = new SecretBindDTO();
		secretBindDTO.setExtension(_ctx.stringValue("BindAxbResponse.SecretBindDTO.Extension"));
		secretBindDTO.setSubsId(_ctx.stringValue("BindAxbResponse.SecretBindDTO.SubsId"));
		secretBindDTO.setSecretNo(_ctx.stringValue("BindAxbResponse.SecretBindDTO.SecretNo"));
		bindAxbResponse.setSecretBindDTO(secretBindDTO);
	 
	 	return bindAxbResponse;
	}
}