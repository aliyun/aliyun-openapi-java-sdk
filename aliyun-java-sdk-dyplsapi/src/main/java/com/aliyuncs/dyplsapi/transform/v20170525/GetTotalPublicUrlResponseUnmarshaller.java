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

package com.aliyuncs.dyplsapi.transform.v20170525;

import com.aliyuncs.dyplsapi.model.v20170525.GetTotalPublicUrlResponse;
import com.aliyuncs.dyplsapi.model.v20170525.GetTotalPublicUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTotalPublicUrlResponseUnmarshaller {

	public static GetTotalPublicUrlResponse unmarshall(GetTotalPublicUrlResponse getTotalPublicUrlResponse, UnmarshallerContext _ctx) {
		
		getTotalPublicUrlResponse.setRequestId(_ctx.stringValue("GetTotalPublicUrlResponse.RequestId"));
		getTotalPublicUrlResponse.setCode(_ctx.stringValue("GetTotalPublicUrlResponse.Code"));
		getTotalPublicUrlResponse.setMessage(_ctx.stringValue("GetTotalPublicUrlResponse.Message"));

		Data data = new Data();
		data.setPhonePublicUrl(_ctx.stringValue("GetTotalPublicUrlResponse.Data.PhonePublicUrl"));
		data.setRingPublicUrl(_ctx.stringValue("GetTotalPublicUrlResponse.Data.RingPublicUrl"));
		getTotalPublicUrlResponse.setData(data);
	 
	 	return getTotalPublicUrlResponse;
	}
}