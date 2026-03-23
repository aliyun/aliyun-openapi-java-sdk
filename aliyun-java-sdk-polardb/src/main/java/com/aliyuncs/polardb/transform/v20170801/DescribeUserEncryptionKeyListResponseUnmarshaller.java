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

import com.aliyuncs.polardb.model.v20170801.DescribeUserEncryptionKeyListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserEncryptionKeyListResponseUnmarshaller {

	public static DescribeUserEncryptionKeyListResponse unmarshall(DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyListResponse, UnmarshallerContext _ctx) {
		
		describeUserEncryptionKeyListResponse.setRequestId(_ctx.stringValue("DescribeUserEncryptionKeyListResponse.RequestId"));
		describeUserEncryptionKeyListResponse.setTotalRecordCount(_ctx.integerValue("DescribeUserEncryptionKeyListResponse.TotalRecordCount"));
		describeUserEncryptionKeyListResponse.setPageRecordCount(_ctx.integerValue("DescribeUserEncryptionKeyListResponse.PageRecordCount"));
		describeUserEncryptionKeyListResponse.setPageNumber(_ctx.integerValue("DescribeUserEncryptionKeyListResponse.PageNumber"));
		describeUserEncryptionKeyListResponse.setPageSize(_ctx.integerValue("DescribeUserEncryptionKeyListResponse.PageSize"));
		describeUserEncryptionKeyListResponse.setDBClusterId(_ctx.stringValue("DescribeUserEncryptionKeyListResponse.DBClusterId"));

		List<String> keyList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserEncryptionKeyListResponse.KeyList.Length"); i++) {
			keyList.add(_ctx.stringValue("DescribeUserEncryptionKeyListResponse.KeyList["+ i +"]"));
		}
		describeUserEncryptionKeyListResponse.setKeyList(keyList);
	 
	 	return describeUserEncryptionKeyListResponse;
	}
}