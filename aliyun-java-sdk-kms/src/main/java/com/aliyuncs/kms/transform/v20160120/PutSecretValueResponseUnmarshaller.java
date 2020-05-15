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

import com.aliyuncs.kms.model.v20160120.PutSecretValueResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutSecretValueResponseUnmarshaller {

	public static PutSecretValueResponse unmarshall(PutSecretValueResponse putSecretValueResponse, UnmarshallerContext _ctx) {
		
		putSecretValueResponse.setRequestId(_ctx.stringValue("PutSecretValueResponse.RequestId"));
		putSecretValueResponse.setSecretName(_ctx.stringValue("PutSecretValueResponse.SecretName"));
		putSecretValueResponse.setVersionId(_ctx.stringValue("PutSecretValueResponse.VersionId"));

		List<String> versionStages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PutSecretValueResponse.VersionStages.Length"); i++) {
			versionStages.add(_ctx.stringValue("PutSecretValueResponse.VersionStages["+ i +"]"));
		}
		putSecretValueResponse.setVersionStages(versionStages);
	 
	 	return putSecretValueResponse;
	}
}