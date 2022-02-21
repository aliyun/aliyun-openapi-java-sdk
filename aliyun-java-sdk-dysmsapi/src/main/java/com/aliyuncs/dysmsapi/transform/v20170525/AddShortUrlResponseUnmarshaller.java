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

package com.aliyuncs.dysmsapi.transform.v20170525;

import com.aliyuncs.dysmsapi.model.v20170525.AddShortUrlResponse;
import com.aliyuncs.dysmsapi.model.v20170525.AddShortUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddShortUrlResponseUnmarshaller {

	public static AddShortUrlResponse unmarshall(AddShortUrlResponse addShortUrlResponse, UnmarshallerContext _ctx) {
		
		addShortUrlResponse.setRequestId(_ctx.stringValue("AddShortUrlResponse.RequestId"));
		addShortUrlResponse.setCode(_ctx.stringValue("AddShortUrlResponse.Code"));
		addShortUrlResponse.setMessage(_ctx.stringValue("AddShortUrlResponse.Message"));

		Data data = new Data();
		data.setSourceUrl(_ctx.stringValue("AddShortUrlResponse.Data.SourceUrl"));
		data.setExpireDate(_ctx.stringValue("AddShortUrlResponse.Data.ExpireDate"));
		data.setShortUrl(_ctx.stringValue("AddShortUrlResponse.Data.ShortUrl"));
		addShortUrlResponse.setData(data);
	 
	 	return addShortUrlResponse;
	}
}