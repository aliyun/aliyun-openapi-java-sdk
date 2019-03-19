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

import com.aliyuncs.cloudwf.model.v20170328.ListApPositionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApPositionResponseUnmarshaller {

	public static ListApPositionResponse unmarshall(ListApPositionResponse listApPositionResponse, UnmarshallerContext context) {
		
		listApPositionResponse.setRequestId(context.stringValue("ListApPositionResponse.RequestId"));
		listApPositionResponse.setSuccess(context.booleanValue("ListApPositionResponse.Success"));
		listApPositionResponse.setMessage(context.stringValue("ListApPositionResponse.Message"));
		listApPositionResponse.setData(context.stringValue("ListApPositionResponse.Data"));
		listApPositionResponse.setErrorCode(context.integerValue("ListApPositionResponse.ErrorCode"));
		listApPositionResponse.setErrorMsg(context.stringValue("ListApPositionResponse.ErrorMsg"));
	 
	 	return listApPositionResponse;
	}
}