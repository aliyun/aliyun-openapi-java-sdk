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

package com.aliyuncs.arms.transform.v20190219;

import com.aliyuncs.arms.model.v20190219.GetTokenResponse;
import com.aliyuncs.arms.model.v20190219.GetTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTokenResponseUnmarshaller {

	public static GetTokenResponse unmarshall(GetTokenResponse getTokenResponse, UnmarshallerContext _ctx) {
		
		getTokenResponse.setRequestId(_ctx.stringValue("GetTokenResponse.RequestId"));

		Data data = new Data();
		data.setDomain(_ctx.stringValue("GetTokenResponse.Data.Domain"));
		data.setLicenseKey(_ctx.stringValue("GetTokenResponse.Data.LicenseKey"));
		data.setPid(_ctx.stringValue("GetTokenResponse.Data.Pid"));
		getTokenResponse.setData(data);
	 
	 	return getTokenResponse;
	}
}