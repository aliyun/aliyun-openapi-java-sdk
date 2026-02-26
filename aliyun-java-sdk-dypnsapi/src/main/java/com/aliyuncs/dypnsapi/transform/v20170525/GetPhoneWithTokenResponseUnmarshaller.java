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

package com.aliyuncs.dypnsapi.transform.v20170525;

import com.aliyuncs.dypnsapi.model.v20170525.GetPhoneWithTokenResponse;
import com.aliyuncs.dypnsapi.model.v20170525.GetPhoneWithTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPhoneWithTokenResponseUnmarshaller {

	public static GetPhoneWithTokenResponse unmarshall(GetPhoneWithTokenResponse getPhoneWithTokenResponse, UnmarshallerContext _ctx) {
		
		getPhoneWithTokenResponse.setRequestId(_ctx.stringValue("GetPhoneWithTokenResponse.RequestId"));
		getPhoneWithTokenResponse.setCode(_ctx.stringValue("GetPhoneWithTokenResponse.Code"));
		getPhoneWithTokenResponse.setMessage(_ctx.stringValue("GetPhoneWithTokenResponse.Message"));

		Data data = new Data();
		data.setMobile(_ctx.stringValue("GetPhoneWithTokenResponse.Data.Mobile"));
		getPhoneWithTokenResponse.setData(data);
	 
	 	return getPhoneWithTokenResponse;
	}
}