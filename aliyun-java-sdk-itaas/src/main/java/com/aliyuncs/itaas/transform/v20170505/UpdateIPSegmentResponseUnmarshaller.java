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

package com.aliyuncs.itaas.transform.v20170505;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itaas.model.v20170505.UpdateIPSegmentResponse;
import com.aliyuncs.itaas.model.v20170505.UpdateIPSegmentResponse.ErrorMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateIPSegmentResponseUnmarshaller {

	public static UpdateIPSegmentResponse unmarshall(UpdateIPSegmentResponse updateIPSegmentResponse, UnmarshallerContext context) {
		
		updateIPSegmentResponse.setRequestId(context.stringValue("UpdateIPSegmentResponse.RequestId"));
		updateIPSegmentResponse.setErrorCode(context.integerValue("UpdateIPSegmentResponse.ErrorCode"));
		updateIPSegmentResponse.setErrorMsg(context.stringValue("UpdateIPSegmentResponse.ErrorMsg"));
		updateIPSegmentResponse.setSuccess(context.booleanValue("UpdateIPSegmentResponse.Success"));

		List<ErrorMessage> errorList = new ArrayList<ErrorMessage>();
		for (int i = 0; i < context.lengthValue("UpdateIPSegmentResponse.ErrorList.Length"); i++) {
			ErrorMessage errorMessage = new ErrorMessage();
			errorMessage.setErrorMessage(context.stringValue("UpdateIPSegmentResponse.ErrorList["+ i +"].ErrorMessage"));

			errorList.add(errorMessage);
		}
		updateIPSegmentResponse.setErrorList(errorList);
	 
	 	return updateIPSegmentResponse;
	}
}