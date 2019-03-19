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

package com.aliyuncs.cloudwf.transform.v20170328;

import com.aliyuncs.cloudwf.model.v20170328.ListGroupApBriefConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupApBriefConfigResponseUnmarshaller {

	public static ListGroupApBriefConfigResponse unmarshall(ListGroupApBriefConfigResponse listGroupApBriefConfigResponse, UnmarshallerContext context) {
		
		listGroupApBriefConfigResponse.setRequestId(context.stringValue("ListGroupApBriefConfigResponse.RequestId"));
		listGroupApBriefConfigResponse.setSuccess(context.booleanValue("ListGroupApBriefConfigResponse.Success"));
		listGroupApBriefConfigResponse.setMessage(context.stringValue("ListGroupApBriefConfigResponse.Message"));
		listGroupApBriefConfigResponse.setData(context.stringValue("ListGroupApBriefConfigResponse.Data"));
		listGroupApBriefConfigResponse.setErrorCode(context.integerValue("ListGroupApBriefConfigResponse.ErrorCode"));
		listGroupApBriefConfigResponse.setErrorMsg(context.stringValue("ListGroupApBriefConfigResponse.ErrorMsg"));
	 
	 	return listGroupApBriefConfigResponse;
	}
}