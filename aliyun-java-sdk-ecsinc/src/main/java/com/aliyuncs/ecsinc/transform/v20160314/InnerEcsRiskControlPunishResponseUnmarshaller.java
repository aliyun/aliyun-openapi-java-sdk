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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsRiskControlPunishResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsRiskControlPunishResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsRiskControlPunishResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsRiskControlPunishResponseUnmarshaller {

	public static InnerEcsRiskControlPunishResponse unmarshall(InnerEcsRiskControlPunishResponse innerEcsRiskControlPunishResponse, UnmarshallerContext context) {
		
		innerEcsRiskControlPunishResponse.setRequestId(context.stringValue("InnerEcsRiskControlPunishResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsRiskControlPunishResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsRiskControlPunishResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsRiskControlPunishResponse.errorCode.isSuccess"));
		innerEcsRiskControlPunishResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setResult(context.stringValue("InnerEcsRiskControlPunishResponse.data.result"));
		data.setIsSync(context.booleanValue("InnerEcsRiskControlPunishResponse.data.isSync"));
		innerEcsRiskControlPunishResponse.setData(data);
	 
	 	return innerEcsRiskControlPunishResponse;
	}
}