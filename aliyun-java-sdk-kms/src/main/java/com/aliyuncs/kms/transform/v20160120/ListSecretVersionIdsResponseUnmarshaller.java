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

import com.aliyuncs.kms.model.v20160120.ListSecretVersionIdsResponse;
import com.aliyuncs.kms.model.v20160120.ListSecretVersionIdsResponse.VersionId;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecretVersionIdsResponseUnmarshaller {

	public static ListSecretVersionIdsResponse unmarshall(ListSecretVersionIdsResponse listSecretVersionIdsResponse, UnmarshallerContext _ctx) {
		
		listSecretVersionIdsResponse.setRequestId(_ctx.stringValue("ListSecretVersionIdsResponse.RequestId"));
		listSecretVersionIdsResponse.setPageNumber(_ctx.integerValue("ListSecretVersionIdsResponse.PageNumber"));
		listSecretVersionIdsResponse.setPageSize(_ctx.integerValue("ListSecretVersionIdsResponse.PageSize"));
		listSecretVersionIdsResponse.setSecretName(_ctx.stringValue("ListSecretVersionIdsResponse.SecretName"));
		listSecretVersionIdsResponse.setTotalCount(_ctx.integerValue("ListSecretVersionIdsResponse.TotalCount"));

		List<VersionId> versionIds = new ArrayList<VersionId>();
		for (int i = 0; i < _ctx.lengthValue("ListSecretVersionIdsResponse.VersionIds.Length"); i++) {
			VersionId versionId = new VersionId();
			versionId.setCreateTime(_ctx.stringValue("ListSecretVersionIdsResponse.VersionIds["+ i +"].CreateTime"));
			versionId.setVersionId(_ctx.stringValue("ListSecretVersionIdsResponse.VersionIds["+ i +"].VersionId"));

			List<String> versionStages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListSecretVersionIdsResponse.VersionIds["+ i +"].VersionStages.Length"); j++) {
				versionStages.add(_ctx.stringValue("ListSecretVersionIdsResponse.VersionIds["+ i +"].VersionStages["+ j +"]"));
			}
			versionId.setVersionStages(versionStages);

			versionIds.add(versionId);
		}
		listSecretVersionIdsResponse.setVersionIds(versionIds);
	 
	 	return listSecretVersionIdsResponse;
	}
}