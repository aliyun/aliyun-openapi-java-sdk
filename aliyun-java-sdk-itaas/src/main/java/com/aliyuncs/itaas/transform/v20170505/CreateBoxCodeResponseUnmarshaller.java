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

import com.aliyuncs.itaas.model.v20170505.CreateBoxCodeResponse;
import com.aliyuncs.itaas.model.v20170505.CreateBoxCodeResponse.Data;
import com.aliyuncs.itaas.model.v20170505.CreateBoxCodeResponse.ErrorMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBoxCodeResponseUnmarshaller {

	public static CreateBoxCodeResponse unmarshall(CreateBoxCodeResponse createBoxCodeResponse, UnmarshallerContext context) {
		
		createBoxCodeResponse.setRequestId(context.stringValue("CreateBoxCodeResponse.RequestId"));
		createBoxCodeResponse.setErrorCode(context.integerValue("CreateBoxCodeResponse.ErrorCode"));
		createBoxCodeResponse.setErrorMsg(context.stringValue("CreateBoxCodeResponse.ErrorMsg"));
		createBoxCodeResponse.setSuccess(context.booleanValue("CreateBoxCodeResponse.Success"));

		Data data = new Data();
		data.setClientAppid(context.stringValue("CreateBoxCodeResponse.Data.ClientAppid"));
		data.setCode(context.stringValue("CreateBoxCodeResponse.Data.Code"));
		data.setCurrentTimeMillis(context.longValue("CreateBoxCodeResponse.Data.CurrentTimeMillis"));
		data.setExpiresIn(context.integerValue("CreateBoxCodeResponse.Data.ExpiresIn"));
		data.setExpiresInUnit(context.stringValue("CreateBoxCodeResponse.Data.ExpiresInUnit"));
		createBoxCodeResponse.setData(data);

		List<ErrorMessage> errorList = new ArrayList<ErrorMessage>();
		for (int i = 0; i < context.lengthValue("CreateBoxCodeResponse.ErrorList.Length"); i++) {
			ErrorMessage errorMessage = new ErrorMessage();
			errorMessage.setErrorMessage(context.stringValue("CreateBoxCodeResponse.ErrorList["+ i +"].ErrorMessage"));

			errorList.add(errorMessage);
		}
		createBoxCodeResponse.setErrorList(errorList);
	 
	 	return createBoxCodeResponse;
	}
}