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

import com.aliyuncs.kms.model.v20160120.DescribeKeyResponse;
import com.aliyuncs.kms.model.v20160120.DescribeKeyResponse.KeyMetadata;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKeyResponseUnmarshaller {

	public static DescribeKeyResponse unmarshall(DescribeKeyResponse describeKeyResponse, UnmarshallerContext _ctx) {
		
		describeKeyResponse.setRequestId(_ctx.stringValue("DescribeKeyResponse.RequestId"));

		KeyMetadata keyMetadata = new KeyMetadata();
		keyMetadata.setCreationDate(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.CreationDate"));
		keyMetadata.setDescription(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.Description"));
		keyMetadata.setKeyId(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.KeyId"));
		keyMetadata.setKeyState(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.KeyState"));
		keyMetadata.setKeyUsage(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.KeyUsage"));
		keyMetadata.setDeleteDate(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.DeleteDate"));
		keyMetadata.setCreator(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.Creator"));
		keyMetadata.setArn(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.Arn"));
		keyMetadata.setOrigin(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.Origin"));
		keyMetadata.setMaterialExpireTime(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.MaterialExpireTime"));
		keyMetadata.setProtectionLevel(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.ProtectionLevel"));
		keyMetadata.setPrimaryKeyVersion(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.PrimaryKeyVersion"));
		keyMetadata.setLastRotationDate(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.LastRotationDate"));
		keyMetadata.setAutomaticRotation(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.AutomaticRotation"));
		keyMetadata.setRotationInterval(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.RotationInterval"));
		keyMetadata.setNextRotationDate(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.NextRotationDate"));
		keyMetadata.setKeySpec(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.KeySpec"));
		keyMetadata.setDeletionProtection(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.DeletionProtection"));
		keyMetadata.setDeletionProtectionDescription(_ctx.stringValue("DescribeKeyResponse.KeyMetadata.DeletionProtectionDescription"));
		describeKeyResponse.setKeyMetadata(keyMetadata);
	 
	 	return describeKeyResponse;
	}
}