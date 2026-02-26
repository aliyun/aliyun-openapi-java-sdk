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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterEncryptionKeyResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterEncryptionKeyResponse.EncryptionKeyInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterEncryptionKeyResponseUnmarshaller {

	public static DescribeDBClusterEncryptionKeyResponse unmarshall(DescribeDBClusterEncryptionKeyResponse describeDBClusterEncryptionKeyResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterEncryptionKeyResponse.setRequestId(_ctx.stringValue("DescribeDBClusterEncryptionKeyResponse.RequestId"));

		List<EncryptionKeyInfo> encryptionKeyList = new ArrayList<EncryptionKeyInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterEncryptionKeyResponse.EncryptionKeyList.Length"); i++) {
			EncryptionKeyInfo encryptionKeyInfo = new EncryptionKeyInfo();
			encryptionKeyInfo.setAliasName(_ctx.stringValue("DescribeDBClusterEncryptionKeyResponse.EncryptionKeyList["+ i +"].AliasName"));
			encryptionKeyInfo.setCreator(_ctx.stringValue("DescribeDBClusterEncryptionKeyResponse.EncryptionKeyList["+ i +"].Creator"));
			encryptionKeyInfo.setDeleteDate(_ctx.stringValue("DescribeDBClusterEncryptionKeyResponse.EncryptionKeyList["+ i +"].DeleteDate"));
			encryptionKeyInfo.setDescription(_ctx.stringValue("DescribeDBClusterEncryptionKeyResponse.EncryptionKeyList["+ i +"].Description"));
			encryptionKeyInfo.setEncryptionKey(_ctx.stringValue("DescribeDBClusterEncryptionKeyResponse.EncryptionKeyList["+ i +"].EncryptionKey"));
			encryptionKeyInfo.setEncryptionKeyStatus(_ctx.stringValue("DescribeDBClusterEncryptionKeyResponse.EncryptionKeyList["+ i +"].EncryptionKeyStatus"));
			encryptionKeyInfo.setKeyType(_ctx.stringValue("DescribeDBClusterEncryptionKeyResponse.EncryptionKeyList["+ i +"].KeyType"));
			encryptionKeyInfo.setKeyUsage(_ctx.stringValue("DescribeDBClusterEncryptionKeyResponse.EncryptionKeyList["+ i +"].KeyUsage"));
			encryptionKeyInfo.setMaterialExpireTime(_ctx.stringValue("DescribeDBClusterEncryptionKeyResponse.EncryptionKeyList["+ i +"].MaterialExpireTime"));
			encryptionKeyInfo.setOrigin(_ctx.stringValue("DescribeDBClusterEncryptionKeyResponse.EncryptionKeyList["+ i +"].Origin"));
			encryptionKeyInfo.setUsedBy(_ctx.stringValue("DescribeDBClusterEncryptionKeyResponse.EncryptionKeyList["+ i +"].UsedBy"));

			encryptionKeyList.add(encryptionKeyInfo);
		}
		describeDBClusterEncryptionKeyResponse.setEncryptionKeyList(encryptionKeyList);
	 
	 	return describeDBClusterEncryptionKeyResponse;
	}
}