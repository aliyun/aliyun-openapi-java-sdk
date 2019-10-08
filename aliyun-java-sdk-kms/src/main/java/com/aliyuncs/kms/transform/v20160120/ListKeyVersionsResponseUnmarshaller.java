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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.kms.model.v20160120.ListKeyVersionsResponse;
import com.aliyuncs.kms.model.v20160120.ListKeyVersionsResponse.KeyVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListKeyVersionsResponseUnmarshaller {

	public static ListKeyVersionsResponse unmarshall(ListKeyVersionsResponse listKeyVersionsResponse, UnmarshallerContext _ctx) {
		
		listKeyVersionsResponse.setRequestId(_ctx.stringValue("ListKeyVersionsResponse.RequestId"));
		listKeyVersionsResponse.setTotalCount(_ctx.integerValue("ListKeyVersionsResponse.TotalCount"));
		listKeyVersionsResponse.setPageNumber(_ctx.integerValue("ListKeyVersionsResponse.PageNumber"));
		listKeyVersionsResponse.setPageSize(_ctx.integerValue("ListKeyVersionsResponse.PageSize"));

		List<KeyVersion> keyVersions = new ArrayList<KeyVersion>();
		for (int i = 0; i < _ctx.lengthValue("ListKeyVersionsResponse.KeyVersions.Length"); i++) {
			KeyVersion keyVersion = new KeyVersion();
			keyVersion.setKeyId(_ctx.stringValue("ListKeyVersionsResponse.KeyVersions["+ i +"].KeyId"));
			keyVersion.setKeyVersionId(_ctx.stringValue("ListKeyVersionsResponse.KeyVersions["+ i +"].KeyVersionId"));
			keyVersion.setCreationDate(_ctx.stringValue("ListKeyVersionsResponse.KeyVersions["+ i +"].CreationDate"));

			keyVersions.add(keyVersion);
		}
		listKeyVersionsResponse.setKeyVersions(keyVersions);
	 
	 	return listKeyVersionsResponse;
	}
}