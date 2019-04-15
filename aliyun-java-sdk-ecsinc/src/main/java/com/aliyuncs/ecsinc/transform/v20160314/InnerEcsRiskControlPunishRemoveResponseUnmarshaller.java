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

package com.aliyuncs.ecsinc.transform.v20160314;

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsRiskControlPunishRemoveResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsRiskControlPunishRemoveResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsRiskControlPunishRemoveResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsRiskControlPunishRemoveResponseUnmarshaller {

	public static InnerEcsRiskControlPunishRemoveResponse unmarshall(InnerEcsRiskControlPunishRemoveResponse innerEcsRiskControlPunishRemoveResponse, UnmarshallerContext context) {
		
		innerEcsRiskControlPunishRemoveResponse.setRequestId(context.stringValue("InnerEcsRiskControlPunishRemoveResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsRiskControlPunishRemoveResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsRiskControlPunishRemoveResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsRiskControlPunishRemoveResponse.errorCode.isSuccess"));
		innerEcsRiskControlPunishRemoveResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setResult(context.stringValue("InnerEcsRiskControlPunishRemoveResponse.data.result"));
		data.setIsSync(context.booleanValue("InnerEcsRiskControlPunishRemoveResponse.data.isSync"));
		innerEcsRiskControlPunishRemoveResponse.setData(data);
	 
	 	return innerEcsRiskControlPunishRemoveResponse;
	}
}