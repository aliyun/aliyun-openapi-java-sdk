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

import com.aliyuncs.kms.model.v20160120.ListSecretsResponse;
import com.aliyuncs.kms.model.v20160120.ListSecretsResponse.Secret;
import com.aliyuncs.kms.model.v20160120.ListSecretsResponse.Secret.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecretsResponseUnmarshaller {

	public static ListSecretsResponse unmarshall(ListSecretsResponse listSecretsResponse, UnmarshallerContext _ctx) {
		
		listSecretsResponse.setRequestId(_ctx.stringValue("ListSecretsResponse.RequestId"));
		listSecretsResponse.setPageNumber(_ctx.integerValue("ListSecretsResponse.PageNumber"));
		listSecretsResponse.setPageSize(_ctx.integerValue("ListSecretsResponse.PageSize"));
		listSecretsResponse.setTotalCount(_ctx.integerValue("ListSecretsResponse.TotalCount"));

		List<Secret> secretList = new ArrayList<Secret>();
		for (int i = 0; i < _ctx.lengthValue("ListSecretsResponse.SecretList.Length"); i++) {
			Secret secret = new Secret();
			secret.setSecretName(_ctx.stringValue("ListSecretsResponse.SecretList["+ i +"].SecretName"));
			secret.setCreateTime(_ctx.stringValue("ListSecretsResponse.SecretList["+ i +"].CreateTime"));
			secret.setUpdateTime(_ctx.stringValue("ListSecretsResponse.SecretList["+ i +"].UpdateTime"));
			secret.setPlannedDeleteTime(_ctx.stringValue("ListSecretsResponse.SecretList["+ i +"].PlannedDeleteTime"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListSecretsResponse.SecretList["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("ListSecretsResponse.SecretList["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("ListSecretsResponse.SecretList["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			secret.setTags(tags);

			secretList.add(secret);
		}
		listSecretsResponse.setSecretList(secretList);
	 
	 	return listSecretsResponse;
	}
}