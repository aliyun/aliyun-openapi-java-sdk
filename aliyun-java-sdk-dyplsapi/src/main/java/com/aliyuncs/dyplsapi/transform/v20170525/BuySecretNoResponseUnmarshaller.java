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

import com.aliyuncs.dyplsapi.model.v20170525.BuySecretNoResponse;
import com.aliyuncs.dyplsapi.model.v20170525.BuySecretNoResponse.SecretBuyInfoDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class BuySecretNoResponseUnmarshaller {

	public static BuySecretNoResponse unmarshall(BuySecretNoResponse buySecretNoResponse, UnmarshallerContext context) {
		
		buySecretNoResponse.setRequestId(context.stringValue("BuySecretNoResponse.RequestId"));
		buySecretNoResponse.setCode(context.stringValue("BuySecretNoResponse.Code"));
		buySecretNoResponse.setMessage(context.stringValue("BuySecretNoResponse.Message"));

		SecretBuyInfoDTO secretBuyInfoDTO = new SecretBuyInfoDTO();
		secretBuyInfoDTO.setSecretNo(context.stringValue("BuySecretNoResponse.SecretBuyInfoDTO.SecretNo"));
		buySecretNoResponse.setSecretBuyInfoDTO(secretBuyInfoDTO);
	 
	 	return buySecretNoResponse;
	}
}