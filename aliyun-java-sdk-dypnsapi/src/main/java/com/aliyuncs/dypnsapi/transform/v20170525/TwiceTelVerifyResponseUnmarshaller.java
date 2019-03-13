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

import com.aliyuncs.dypnsapi.model.v20170525.TwiceTelVerifyResponse;
import com.aliyuncs.dypnsapi.model.v20170525.TwiceTelVerifyResponse.TwiceTelVerifyResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class TwiceTelVerifyResponseUnmarshaller {

	public static TwiceTelVerifyResponse unmarshall(TwiceTelVerifyResponse twiceTelVerifyResponse, UnmarshallerContext context) {
		
		twiceTelVerifyResponse.setRequestId(context.stringValue("TwiceTelVerifyResponse.RequestId"));
		twiceTelVerifyResponse.setCode(context.stringValue("TwiceTelVerifyResponse.Code"));
		twiceTelVerifyResponse.setMessage(context.stringValue("TwiceTelVerifyResponse.Message"));

		TwiceTelVerifyResult twiceTelVerifyResult = new TwiceTelVerifyResult();
		twiceTelVerifyResult.setCarrier(context.stringValue("TwiceTelVerifyResponse.TwiceTelVerifyResult.Carrier"));
		twiceTelVerifyResult.setVerifyResult(context.integerValue("TwiceTelVerifyResponse.TwiceTelVerifyResult.VerifyResult"));
		twiceTelVerifyResponse.setTwiceTelVerifyResult(twiceTelVerifyResult);
	 
	 	return twiceTelVerifyResponse;
	}
}