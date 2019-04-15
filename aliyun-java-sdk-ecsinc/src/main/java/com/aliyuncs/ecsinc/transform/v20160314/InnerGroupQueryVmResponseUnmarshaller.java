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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerGroupQueryVmResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerGroupQueryVmResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerGroupQueryVmResponseUnmarshaller {

	public static InnerGroupQueryVmResponse unmarshall(InnerGroupQueryVmResponse innerGroupQueryVmResponse, UnmarshallerContext context) {
		
		innerGroupQueryVmResponse.setRequestId(context.stringValue("InnerGroupQueryVmResponse.RequestId"));
		innerGroupQueryVmResponse.setCount(context.integerValue("InnerGroupQueryVmResponse.count"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerGroupQueryVmResponse.data.Length"); i++) {
			data.add(context.stringValue("InnerGroupQueryVmResponse.data["+ i +"]"));
		}
		innerGroupQueryVmResponse.setData(data);

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerGroupQueryVmResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerGroupQueryVmResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerGroupQueryVmResponse.errorCode.isSuccess"));
		innerGroupQueryVmResponse.setErrorCode(errorCode);
	 
	 	return innerGroupQueryVmResponse;
	}
}