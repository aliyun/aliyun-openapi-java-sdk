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

package com.aliyuncs.viapiutils.transform.v20200401;

import com.aliyuncs.viapiutils.model.v20200401.GetOssStsTokenResponse;
import com.aliyuncs.viapiutils.model.v20200401.GetOssStsTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOssStsTokenResponseUnmarshaller {

	public static GetOssStsTokenResponse unmarshall(GetOssStsTokenResponse getOssStsTokenResponse, UnmarshallerContext _ctx) {
		
		getOssStsTokenResponse.setRequestId(_ctx.stringValue("GetOssStsTokenResponse.RequestId"));

		Data data = new Data();
		data.setAccessKeyId(_ctx.stringValue("GetOssStsTokenResponse.Data.AccessKeyId"));
		data.setAccessKeySecret(_ctx.stringValue("GetOssStsTokenResponse.Data.AccessKeySecret"));
		data.setSecurityToken(_ctx.stringValue("GetOssStsTokenResponse.Data.SecurityToken"));
		data.setScript(_ctx.stringValue("GetOssStsTokenResponse.Data.Script"));
		getOssStsTokenResponse.setData(data);
	 
	 	return getOssStsTokenResponse;
	}
}