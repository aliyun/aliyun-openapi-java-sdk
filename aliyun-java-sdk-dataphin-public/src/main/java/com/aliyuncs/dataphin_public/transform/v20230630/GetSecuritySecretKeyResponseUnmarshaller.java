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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetSecuritySecretKeyResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetSecuritySecretKeyResponse.SecuritySecretKeyInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecuritySecretKeyResponseUnmarshaller {

	public static GetSecuritySecretKeyResponse unmarshall(GetSecuritySecretKeyResponse getSecuritySecretKeyResponse, UnmarshallerContext _ctx) {
		
		getSecuritySecretKeyResponse.setRequestId(_ctx.stringValue("GetSecuritySecretKeyResponse.RequestId"));
		getSecuritySecretKeyResponse.setSuccess(_ctx.booleanValue("GetSecuritySecretKeyResponse.Success"));
		getSecuritySecretKeyResponse.setHttpStatusCode(_ctx.integerValue("GetSecuritySecretKeyResponse.HttpStatusCode"));
		getSecuritySecretKeyResponse.setCode(_ctx.stringValue("GetSecuritySecretKeyResponse.Code"));
		getSecuritySecretKeyResponse.setMessage(_ctx.stringValue("GetSecuritySecretKeyResponse.Message"));

		SecuritySecretKeyInfo securitySecretKeyInfo = new SecuritySecretKeyInfo();
		securitySecretKeyInfo.setId(_ctx.longValue("GetSecuritySecretKeyResponse.SecuritySecretKeyInfo.Id"));
		securitySecretKeyInfo.setName(_ctx.stringValue("GetSecuritySecretKeyResponse.SecuritySecretKeyInfo.Name"));
		securitySecretKeyInfo.setDescription(_ctx.stringValue("GetSecuritySecretKeyResponse.SecuritySecretKeyInfo.Description"));
		securitySecretKeyInfo.setType(_ctx.stringValue("GetSecuritySecretKeyResponse.SecuritySecretKeyInfo.Type"));
		securitySecretKeyInfo.setAlgorithmType(_ctx.stringValue("GetSecuritySecretKeyResponse.SecuritySecretKeyInfo.AlgorithmType"));
		securitySecretKeyInfo.setGenerationType(_ctx.stringValue("GetSecuritySecretKeyResponse.SecuritySecretKeyInfo.GenerationType"));
		securitySecretKeyInfo.setSubKeyCount(_ctx.longValue("GetSecuritySecretKeyResponse.SecuritySecretKeyInfo.SubKeyCount"));
		securitySecretKeyInfo.setIsOwnerManageOnly(_ctx.booleanValue("GetSecuritySecretKeyResponse.SecuritySecretKeyInfo.IsOwnerManageOnly"));
		securitySecretKeyInfo.setEnableOpenapiQuery(_ctx.booleanValue("GetSecuritySecretKeyResponse.SecuritySecretKeyInfo.EnableOpenapiQuery"));
		securitySecretKeyInfo.setAlgorithmTypeAlias(_ctx.stringValue("GetSecuritySecretKeyResponse.SecuritySecretKeyInfo.AlgorithmTypeAlias"));
		securitySecretKeyInfo.setOwner(_ctx.stringValue("GetSecuritySecretKeyResponse.SecuritySecretKeyInfo.Owner"));
		securitySecretKeyInfo.setOwnerName(_ctx.stringValue("GetSecuritySecretKeyResponse.SecuritySecretKeyInfo.OwnerName"));

		List<String> secretKeyList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetSecuritySecretKeyResponse.SecuritySecretKeyInfo.SecretKeyList.Length"); i++) {
			secretKeyList.add(_ctx.stringValue("GetSecuritySecretKeyResponse.SecuritySecretKeyInfo.SecretKeyList["+ i +"]"));
		}
		securitySecretKeyInfo.setSecretKeyList(secretKeyList);
		getSecuritySecretKeyResponse.setSecuritySecretKeyInfo(securitySecretKeyInfo);
	 
	 	return getSecuritySecretKeyResponse;
	}
}