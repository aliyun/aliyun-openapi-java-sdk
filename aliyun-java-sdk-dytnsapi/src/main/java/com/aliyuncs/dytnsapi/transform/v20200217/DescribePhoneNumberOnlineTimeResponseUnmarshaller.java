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

package com.aliyuncs.dytnsapi.transform.v20200217;

import com.aliyuncs.dytnsapi.model.v20200217.DescribePhoneNumberOnlineTimeResponse;
import com.aliyuncs.dytnsapi.model.v20200217.DescribePhoneNumberOnlineTimeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePhoneNumberOnlineTimeResponseUnmarshaller {

	public static DescribePhoneNumberOnlineTimeResponse unmarshall(DescribePhoneNumberOnlineTimeResponse describePhoneNumberOnlineTimeResponse, UnmarshallerContext _ctx) {
		
		describePhoneNumberOnlineTimeResponse.setRequestId(_ctx.stringValue("DescribePhoneNumberOnlineTimeResponse.RequestId"));
		describePhoneNumberOnlineTimeResponse.setCode(_ctx.stringValue("DescribePhoneNumberOnlineTimeResponse.Code"));
		describePhoneNumberOnlineTimeResponse.setMessage(_ctx.stringValue("DescribePhoneNumberOnlineTimeResponse.Message"));

		Data data = new Data();
		data.setVerifyResult(_ctx.stringValue("DescribePhoneNumberOnlineTimeResponse.Data.VerifyResult"));
		describePhoneNumberOnlineTimeResponse.setData(data);
	 
	 	return describePhoneNumberOnlineTimeResponse;
	}
}