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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.GetAppSecretResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetAppSecretResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppSecretResponseUnmarshaller {

	public static GetAppSecretResponse unmarshall(GetAppSecretResponse getAppSecretResponse, UnmarshallerContext _ctx) {
		
		getAppSecretResponse.setRequestId(_ctx.stringValue("GetAppSecretResponse.RequestId"));

		Data data = new Data();
		data.setAppSecret(_ctx.stringValue("GetAppSecretResponse.Data.AppSecret"));
		data.setAppId(_ctx.stringValue("GetAppSecretResponse.Data.AppId"));
		getAppSecretResponse.setData(data);
	 
	 	return getAppSecretResponse;
	}
}