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

package com.aliyuncs.cms.transform.v20180308;

import com.aliyuncs.cms.model.v20180308.UpdateMyGroupAlertResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMyGroupAlertResponseUnmarshaller {

	public static UpdateMyGroupAlertResponse unmarshall(UpdateMyGroupAlertResponse updateMyGroupAlertResponse, UnmarshallerContext context) {
		
		updateMyGroupAlertResponse.setRequestId(context.stringValue("UpdateMyGroupAlertResponse.RequestId"));
		updateMyGroupAlertResponse.setSuccess(context.booleanValue("UpdateMyGroupAlertResponse.Success"));
		updateMyGroupAlertResponse.setErrorCode(context.integerValue("UpdateMyGroupAlertResponse.ErrorCode"));
		updateMyGroupAlertResponse.setErrorMessage(context.stringValue("UpdateMyGroupAlertResponse.ErrorMessage"));
	 
	 	return updateMyGroupAlertResponse;
	}
}