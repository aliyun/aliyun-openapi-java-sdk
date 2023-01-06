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

package com.aliyuncs.ims.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ims.model.v20190815.ListAppSecretIdsResponse;
import com.aliyuncs.ims.model.v20190815.ListAppSecretIdsResponse.AppSecret;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppSecretIdsResponseUnmarshaller {

	public static ListAppSecretIdsResponse unmarshall(ListAppSecretIdsResponse listAppSecretIdsResponse, UnmarshallerContext _ctx) {
		
		listAppSecretIdsResponse.setRequestId(_ctx.stringValue("ListAppSecretIdsResponse.RequestId"));

		List<AppSecret> appSecrets = new ArrayList<AppSecret>();
		for (int i = 0; i < _ctx.lengthValue("ListAppSecretIdsResponse.AppSecrets.Length"); i++) {
			AppSecret appSecret = new AppSecret();
			appSecret.setAppId(_ctx.stringValue("ListAppSecretIdsResponse.AppSecrets["+ i +"].AppId"));
			appSecret.setAppSecretId(_ctx.stringValue("ListAppSecretIdsResponse.AppSecrets["+ i +"].AppSecretId"));
			appSecret.setCreateDate(_ctx.stringValue("ListAppSecretIdsResponse.AppSecrets["+ i +"].CreateDate"));

			appSecrets.add(appSecret);
		}
		listAppSecretIdsResponse.setAppSecrets(appSecrets);
	 
	 	return listAppSecretIdsResponse;
	}
}