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

package com.aliyuncs.kms.transform.v20160120;

import com.aliyuncs.kms.model.v20160120.CreateKeyVersionResponse;
import com.aliyuncs.kms.model.v20160120.CreateKeyVersionResponse.KeyVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateKeyVersionResponseUnmarshaller {

	public static CreateKeyVersionResponse unmarshall(CreateKeyVersionResponse createKeyVersionResponse, UnmarshallerContext _ctx) {
		
		createKeyVersionResponse.setRequestId(_ctx.stringValue("CreateKeyVersionResponse.RequestId"));

		KeyVersion keyVersion = new KeyVersion();
		keyVersion.setKeyId(_ctx.stringValue("CreateKeyVersionResponse.KeyVersion.KeyId"));
		keyVersion.setKeyVersionId(_ctx.stringValue("CreateKeyVersionResponse.KeyVersion.KeyVersionId"));
		keyVersion.setCreationDate(_ctx.stringValue("CreateKeyVersionResponse.KeyVersion.CreationDate"));
		createKeyVersionResponse.setKeyVersion(keyVersion);
	 
	 	return createKeyVersionResponse;
	}
}