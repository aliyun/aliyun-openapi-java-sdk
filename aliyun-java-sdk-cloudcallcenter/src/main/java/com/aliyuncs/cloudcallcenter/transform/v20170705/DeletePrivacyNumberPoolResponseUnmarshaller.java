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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.DeletePrivacyNumberPoolResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeletePrivacyNumberPoolResponseUnmarshaller {

	public static DeletePrivacyNumberPoolResponse unmarshall(DeletePrivacyNumberPoolResponse deletePrivacyNumberPoolResponse, UnmarshallerContext context) {
		
		deletePrivacyNumberPoolResponse.setRequestId(context.stringValue("DeletePrivacyNumberPoolResponse.RequestId"));
		deletePrivacyNumberPoolResponse.setSuccess(context.booleanValue("DeletePrivacyNumberPoolResponse.Success"));
		deletePrivacyNumberPoolResponse.setCode(context.stringValue("DeletePrivacyNumberPoolResponse.Code"));
		deletePrivacyNumberPoolResponse.setMessage(context.stringValue("DeletePrivacyNumberPoolResponse.Message"));
		deletePrivacyNumberPoolResponse.setHttpStatusCode(context.integerValue("DeletePrivacyNumberPoolResponse.HttpStatusCode"));
	 
	 	return deletePrivacyNumberPoolResponse;
	}
}