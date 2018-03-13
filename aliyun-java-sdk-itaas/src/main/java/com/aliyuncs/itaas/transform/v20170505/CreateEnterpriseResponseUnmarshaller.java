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

import com.aliyuncs.itaas.model.v20170505.CreateEnterpriseResponse;
import com.aliyuncs.itaas.model.v20170505.CreateEnterpriseResponse.ErrorMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEnterpriseResponseUnmarshaller {

	public static CreateEnterpriseResponse unmarshall(CreateEnterpriseResponse createEnterpriseResponse, UnmarshallerContext context) {
		
		createEnterpriseResponse.setRequestId(context.stringValue("CreateEnterpriseResponse.RequestId"));
		createEnterpriseResponse.setErrorCode(context.integerValue("CreateEnterpriseResponse.ErrorCode"));
		createEnterpriseResponse.setErrorMsg(context.stringValue("CreateEnterpriseResponse.ErrorMsg"));
		createEnterpriseResponse.setSuccess(context.booleanValue("CreateEnterpriseResponse.Success"));

		List<ErrorMessage> errorListList = new ArrayList<ErrorMessage>();
		for (int i = 0; i < context.lengthValue("CreateEnterpriseResponse.ErrorList.Length"); i++) {
			ErrorMessage errorMessage = new ErrorMessage();
			errorMessage.setErrorMessage(context.stringValue("CreateEnterpriseResponse.ErrorList["+ i +"].ErrorMessage"));

			errorListList.add(errorMessage);
		}
		createEnterpriseResponse.setErrorList(errorListList);
	 
	 	return createEnterpriseResponse;
	}
}