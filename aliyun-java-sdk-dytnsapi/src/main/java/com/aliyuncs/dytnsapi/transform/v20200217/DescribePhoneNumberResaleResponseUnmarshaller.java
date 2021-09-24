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

import com.aliyuncs.dytnsapi.model.v20200217.DescribePhoneNumberResaleResponse;
import com.aliyuncs.dytnsapi.model.v20200217.DescribePhoneNumberResaleResponse.TwiceTelVerify;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePhoneNumberResaleResponseUnmarshaller {

	public static DescribePhoneNumberResaleResponse unmarshall(DescribePhoneNumberResaleResponse describePhoneNumberResaleResponse, UnmarshallerContext _ctx) {
		
		describePhoneNumberResaleResponse.setRequestId(_ctx.stringValue("DescribePhoneNumberResaleResponse.RequestId"));
		describePhoneNumberResaleResponse.setCode(_ctx.stringValue("DescribePhoneNumberResaleResponse.Code"));
		describePhoneNumberResaleResponse.setMessage(_ctx.stringValue("DescribePhoneNumberResaleResponse.Message"));

		TwiceTelVerify twiceTelVerify = new TwiceTelVerify();
		twiceTelVerify.setCarrier(_ctx.stringValue("DescribePhoneNumberResaleResponse.TwiceTelVerify.Carrier"));
		twiceTelVerify.setVerifyResult(_ctx.integerValue("DescribePhoneNumberResaleResponse.TwiceTelVerify.VerifyResult"));
		describePhoneNumberResaleResponse.setTwiceTelVerify(twiceTelVerify);
	 
	 	return describePhoneNumberResaleResponse;
	}
}