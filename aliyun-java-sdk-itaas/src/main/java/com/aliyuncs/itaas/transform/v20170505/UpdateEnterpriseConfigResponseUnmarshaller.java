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

import com.aliyuncs.itaas.model.v20170505.UpdateEnterpriseConfigResponse;
import com.aliyuncs.itaas.model.v20170505.UpdateEnterpriseConfigResponse.ErrorMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateEnterpriseConfigResponseUnmarshaller {

	public static UpdateEnterpriseConfigResponse unmarshall(UpdateEnterpriseConfigResponse updateEnterpriseConfigResponse, UnmarshallerContext context) {
		
		updateEnterpriseConfigResponse.setRequestId(context.stringValue("UpdateEnterpriseConfigResponse.RequestId"));
		updateEnterpriseConfigResponse.setErrorCode(context.integerValue("UpdateEnterpriseConfigResponse.ErrorCode"));
		updateEnterpriseConfigResponse.setErrorMsg(context.stringValue("UpdateEnterpriseConfigResponse.ErrorMsg"));
		updateEnterpriseConfigResponse.setSuccess(context.booleanValue("UpdateEnterpriseConfigResponse.Success"));

		List<ErrorMessage> errorListList = new ArrayList<ErrorMessage>();
		for (int i = 0; i < context.lengthValue("UpdateEnterpriseConfigResponse.ErrorList.Length"); i++) {
			ErrorMessage errorMessage = new ErrorMessage();
			errorMessage.setErrorMessage(context.stringValue("UpdateEnterpriseConfigResponse.ErrorList["+ i +"].ErrorMessage"));

			errorListList.add(errorMessage);
		}
		updateEnterpriseConfigResponse.setErrorList(errorListList);
	 
	 	return updateEnterpriseConfigResponse;
	}
}