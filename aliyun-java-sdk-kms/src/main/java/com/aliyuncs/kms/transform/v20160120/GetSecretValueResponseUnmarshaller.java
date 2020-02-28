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

import com.aliyuncs.kms.model.v20160120.GetSecretValueResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecretValueResponseUnmarshaller {

	public static GetSecretValueResponse unmarshall(GetSecretValueResponse getSecretValueResponse, UnmarshallerContext _ctx) {
		
		getSecretValueResponse.setRequestId(_ctx.stringValue("GetSecretValueResponse.RequestId"));
		getSecretValueResponse.setSecretName(_ctx.stringValue("GetSecretValueResponse.SecretName"));
		getSecretValueResponse.setVersionId(_ctx.stringValue("GetSecretValueResponse.VersionId"));
		getSecretValueResponse.setCreateTime(_ctx.stringValue("GetSecretValueResponse.CreateTime"));
		getSecretValueResponse.setSecretData(_ctx.stringValue("GetSecretValueResponse.SecretData"));
		getSecretValueResponse.setSecretDataType(_ctx.stringValue("GetSecretValueResponse.SecretDataType"));

		List<String> versionStages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetSecretValueResponse.VersionStages.Length"); i++) {
			versionStages.add(_ctx.stringValue("GetSecretValueResponse.VersionStages["+ i +"]"));
		}
		getSecretValueResponse.setVersionStages(versionStages);
	 
	 	return getSecretValueResponse;
	}
}