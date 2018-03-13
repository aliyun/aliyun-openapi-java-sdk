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
package com.aliyuncs.ram.transform.v20150501;

import com.aliyuncs.ram.model.v20150501.GetPublicKeyResponse;
import com.aliyuncs.ram.model.v20150501.GetPublicKeyResponse.PublicKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPublicKeyResponseUnmarshaller {

	public static GetPublicKeyResponse unmarshall(GetPublicKeyResponse getPublicKeyResponse, UnmarshallerContext context) {
		
		getPublicKeyResponse.setRequestId(context.stringValue("GetPublicKeyResponse.RequestId"));

		PublicKey publicKey = new PublicKey();
		publicKey.setPublicKeyId(context.stringValue("GetPublicKeyResponse.PublicKey.PublicKeyId"));
		publicKey.setPublicKeySpec(context.stringValue("GetPublicKeyResponse.PublicKey.PublicKeySpec"));
		publicKey.setStatus(context.stringValue("GetPublicKeyResponse.PublicKey.Status"));
		publicKey.setCreateDate(context.stringValue("GetPublicKeyResponse.PublicKey.CreateDate"));
		getPublicKeyResponse.setPublicKey(publicKey);
	 
	 	return getPublicKeyResponse;
	}
}