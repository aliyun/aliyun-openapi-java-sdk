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

package com.aliyuncs.retailbot.transform.v20210224;

import com.aliyuncs.retailbot.model.v20210224.GetOssTokenResponse;
import com.aliyuncs.retailbot.model.v20210224.GetOssTokenResponse.WebUpoadPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOssTokenResponseUnmarshaller {

	public static GetOssTokenResponse unmarshall(GetOssTokenResponse getOssTokenResponse, UnmarshallerContext _ctx) {
		

		WebUpoadPolicy webUpoadPolicy = new WebUpoadPolicy();
		webUpoadPolicy.setAccessId(_ctx.stringValue("GetOssTokenResponse.WebUpoadPolicy.AccessId"));
		webUpoadPolicy.setPolicy(_ctx.stringValue("GetOssTokenResponse.WebUpoadPolicy.Policy"));
		webUpoadPolicy.setSignature(_ctx.stringValue("GetOssTokenResponse.WebUpoadPolicy.Signature"));
		webUpoadPolicy.setDir(_ctx.stringValue("GetOssTokenResponse.WebUpoadPolicy.Dir"));
		webUpoadPolicy.setHost(_ctx.stringValue("GetOssTokenResponse.WebUpoadPolicy.Host"));
		webUpoadPolicy.setExpire(_ctx.stringValue("GetOssTokenResponse.WebUpoadPolicy.Expire"));
		getOssTokenResponse.setWebUpoadPolicy(webUpoadPolicy);
	 
	 	return getOssTokenResponse;
	}
}