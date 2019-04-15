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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsRiskControlQueryResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsRiskControlQueryResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsRiskControlQueryResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsRiskControlQueryResponseUnmarshaller {

	public static InnerEcsRiskControlQueryResponse unmarshall(InnerEcsRiskControlQueryResponse innerEcsRiskControlQueryResponse, UnmarshallerContext context) {
		
		innerEcsRiskControlQueryResponse.setRequestId(context.stringValue("InnerEcsRiskControlQueryResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsRiskControlQueryResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsRiskControlQueryResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsRiskControlQueryResponse.errorCode.isSuccess"));
		innerEcsRiskControlQueryResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setInstanceId(context.stringValue("InnerEcsRiskControlQueryResponse.data.instanceId"));
		data.setServiceCreatedTime(context.stringValue("InnerEcsRiskControlQueryResponse.data.serviceCreatedTime"));
		data.setBussinessCode(context.stringValue("InnerEcsRiskControlQueryResponse.data.bussinessCode"));
		data.setIdType(context.stringValue("InnerEcsRiskControlQueryResponse.data.idType"));
		data.setUserId(context.stringValue("InnerEcsRiskControlQueryResponse.data.userId"));
		data.setCoordinate(context.stringValue("InnerEcsRiskControlQueryResponse.data.coordinate"));
		innerEcsRiskControlQueryResponse.setData(data);
	 
	 	return innerEcsRiskControlQueryResponse;
	}
}