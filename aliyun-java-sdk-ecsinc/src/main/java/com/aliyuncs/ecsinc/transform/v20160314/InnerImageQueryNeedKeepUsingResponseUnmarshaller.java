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

import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryNeedKeepUsingResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryNeedKeepUsingResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerImageQueryNeedKeepUsingResponseUnmarshaller {

	public static InnerImageQueryNeedKeepUsingResponse unmarshall(InnerImageQueryNeedKeepUsingResponse innerImageQueryNeedKeepUsingResponse, UnmarshallerContext context) {
		
		innerImageQueryNeedKeepUsingResponse.setRequestId(context.stringValue("InnerImageQueryNeedKeepUsingResponse.RequestId"));
		innerImageQueryNeedKeepUsingResponse.setCount(context.integerValue("InnerImageQueryNeedKeepUsingResponse.count"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerImageQueryNeedKeepUsingResponse.data.Length"); i++) {
			data.add(context.stringValue("InnerImageQueryNeedKeepUsingResponse.data["+ i +"]"));
		}
		innerImageQueryNeedKeepUsingResponse.setData(data);

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerImageQueryNeedKeepUsingResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerImageQueryNeedKeepUsingResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerImageQueryNeedKeepUsingResponse.errorCode.isSuccess"));
		innerImageQueryNeedKeepUsingResponse.setErrorCode(errorCode);
	 
	 	return innerImageQueryNeedKeepUsingResponse;
	}
}