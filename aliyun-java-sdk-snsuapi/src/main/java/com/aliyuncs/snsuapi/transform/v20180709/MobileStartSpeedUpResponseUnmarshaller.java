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

package com.aliyuncs.snsuapi.transform.v20180709;

import com.aliyuncs.snsuapi.model.v20180709.MobileStartSpeedUpResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MobileStartSpeedUpResponseUnmarshaller {

	public static MobileStartSpeedUpResponse unmarshall(MobileStartSpeedUpResponse mobileStartSpeedUpResponse, UnmarshallerContext context) {
		
		mobileStartSpeedUpResponse.setRequestId(context.stringValue("MobileStartSpeedUpResponse.RequestId"));
		mobileStartSpeedUpResponse.setResultCode(context.stringValue("MobileStartSpeedUpResponse.ResultCode"));
		mobileStartSpeedUpResponse.setResultMessage(context.stringValue("MobileStartSpeedUpResponse.ResultMessage"));
		mobileStartSpeedUpResponse.setResultModule(context.stringValue("MobileStartSpeedUpResponse.ResultModule"));
	 
	 	return mobileStartSpeedUpResponse;
	}
}