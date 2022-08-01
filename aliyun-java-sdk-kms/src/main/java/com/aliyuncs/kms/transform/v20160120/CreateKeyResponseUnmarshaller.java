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

import com.aliyuncs.kms.model.v20160120.CreateKeyResponse;
import com.aliyuncs.kms.model.v20160120.CreateKeyResponse.KeyMetadata;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateKeyResponseUnmarshaller {

	public static CreateKeyResponse unmarshall(CreateKeyResponse createKeyResponse, UnmarshallerContext _ctx) {
		
		createKeyResponse.setRequestId(_ctx.stringValue("CreateKeyResponse.RequestId"));

		KeyMetadata keyMetadata = new KeyMetadata();
		keyMetadata.setKeyId(_ctx.stringValue("CreateKeyResponse.KeyMetadata.KeyId"));
		keyMetadata.setNextRotationDate(_ctx.stringValue("CreateKeyResponse.KeyMetadata.NextRotationDate"));
		keyMetadata.setKeyState(_ctx.stringValue("CreateKeyResponse.KeyMetadata.KeyState"));
		keyMetadata.setRotationInterval(_ctx.stringValue("CreateKeyResponse.KeyMetadata.RotationInterval"));
		keyMetadata.setArn(_ctx.stringValue("CreateKeyResponse.KeyMetadata.Arn"));
		keyMetadata.setCreator(_ctx.stringValue("CreateKeyResponse.KeyMetadata.Creator"));
		keyMetadata.setLastRotationDate(_ctx.stringValue("CreateKeyResponse.KeyMetadata.LastRotationDate"));
		keyMetadata.setDeleteDate(_ctx.stringValue("CreateKeyResponse.KeyMetadata.DeleteDate"));
		keyMetadata.setPrimaryKeyVersion(_ctx.stringValue("CreateKeyResponse.KeyMetadata.PrimaryKeyVersion"));
		keyMetadata.setDescription(_ctx.stringValue("CreateKeyResponse.KeyMetadata.Description"));
		keyMetadata.setKeySpec(_ctx.stringValue("CreateKeyResponse.KeyMetadata.KeySpec"));
		keyMetadata.setOrigin(_ctx.stringValue("CreateKeyResponse.KeyMetadata.Origin"));
		keyMetadata.setMaterialExpireTime(_ctx.stringValue("CreateKeyResponse.KeyMetadata.MaterialExpireTime"));
		keyMetadata.setAutomaticRotation(_ctx.stringValue("CreateKeyResponse.KeyMetadata.AutomaticRotation"));
		keyMetadata.setProtectionLevel(_ctx.stringValue("CreateKeyResponse.KeyMetadata.ProtectionLevel"));
		keyMetadata.setKeyUsage(_ctx.stringValue("CreateKeyResponse.KeyMetadata.KeyUsage"));
		keyMetadata.setCreationDate(_ctx.stringValue("CreateKeyResponse.KeyMetadata.CreationDate"));
		keyMetadata.setDKMSInstanceId(_ctx.stringValue("CreateKeyResponse.KeyMetadata.DKMSInstanceId"));
		createKeyResponse.setKeyMetadata(keyMetadata);
	 
	 	return createKeyResponse;
	}
}