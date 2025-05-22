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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceEncryptionKeyResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceEncryptionKeyResponse.EncryptionKeyInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceEncryptionKeyResponseUnmarshaller {

	public static DescribeDBInstanceEncryptionKeyResponse unmarshall(DescribeDBInstanceEncryptionKeyResponse describeDBInstanceEncryptionKeyResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceEncryptionKeyResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.RequestId"));
		describeDBInstanceEncryptionKeyResponse.setCreator(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.Creator"));
		describeDBInstanceEncryptionKeyResponse.setDeleteDate(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.DeleteDate"));
		describeDBInstanceEncryptionKeyResponse.setDescription(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.Description"));
		describeDBInstanceEncryptionKeyResponse.setEncryptionKey(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.EncryptionKey"));
		describeDBInstanceEncryptionKeyResponse.setEncryptionKeyStatus(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.EncryptionKeyStatus"));
		describeDBInstanceEncryptionKeyResponse.setKeyUsage(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.KeyUsage"));
		describeDBInstanceEncryptionKeyResponse.setMaterialExpireTime(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.MaterialExpireTime"));
		describeDBInstanceEncryptionKeyResponse.setOrigin(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.Origin"));

		List<EncryptionKeyInfo> encryptionKeyList = new ArrayList<EncryptionKeyInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceEncryptionKeyResponse.EncryptionKeyList.Length"); i++) {
			EncryptionKeyInfo encryptionKeyInfo = new EncryptionKeyInfo();
			encryptionKeyInfo.setAliasName(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.EncryptionKeyList["+ i +"].AliasName"));
			encryptionKeyInfo.setCreator(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.EncryptionKeyList["+ i +"].Creator"));
			encryptionKeyInfo.setDeleteDate(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.EncryptionKeyList["+ i +"].DeleteDate"));
			encryptionKeyInfo.setDescription(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.EncryptionKeyList["+ i +"].Description"));
			encryptionKeyInfo.setEncryptionKey(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.EncryptionKeyList["+ i +"].EncryptionKey"));
			encryptionKeyInfo.setEncryptionKeyStatus(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.EncryptionKeyList["+ i +"].EncryptionKeyStatus"));
			encryptionKeyInfo.setKeyType(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.EncryptionKeyList["+ i +"].KeyType"));
			encryptionKeyInfo.setKeyUsage(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.EncryptionKeyList["+ i +"].KeyUsage"));
			encryptionKeyInfo.setMaterialExpireTime(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.EncryptionKeyList["+ i +"].MaterialExpireTime"));
			encryptionKeyInfo.setOrigin(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.EncryptionKeyList["+ i +"].Origin"));
			encryptionKeyInfo.setUsedBy(_ctx.stringValue("DescribeDBInstanceEncryptionKeyResponse.EncryptionKeyList["+ i +"].UsedBy"));

			encryptionKeyList.add(encryptionKeyInfo);
		}
		describeDBInstanceEncryptionKeyResponse.setEncryptionKeyList(encryptionKeyList);
	 
	 	return describeDBInstanceEncryptionKeyResponse;
	}
}