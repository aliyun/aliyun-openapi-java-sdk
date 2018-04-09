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

import com.aliyuncs.cms.model.v20180308.DeleteNotifyPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteNotifyPolicyResponseUnmarshaller {

	public static DeleteNotifyPolicyResponse unmarshall(DeleteNotifyPolicyResponse deleteNotifyPolicyResponse, UnmarshallerContext context) {
		
		deleteNotifyPolicyResponse.setCode(context.stringValue("DeleteNotifyPolicyResponse.code"));
		deleteNotifyPolicyResponse.setMessage(context.stringValue("DeleteNotifyPolicyResponse.message"));
		deleteNotifyPolicyResponse.setSuccess(context.stringValue("DeleteNotifyPolicyResponse.success"));
		deleteNotifyPolicyResponse.setTraceId(context.stringValue("DeleteNotifyPolicyResponse.traceId"));
		deleteNotifyPolicyResponse.setResult(context.integerValue("DeleteNotifyPolicyResponse.result"));
	 
	 	return deleteNotifyPolicyResponse;
	}
}