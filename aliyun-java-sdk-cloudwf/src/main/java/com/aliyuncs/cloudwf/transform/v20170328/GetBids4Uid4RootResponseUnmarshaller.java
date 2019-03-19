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

import com.aliyuncs.cloudwf.model.v20170328.GetBids4Uid4RootResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBids4Uid4RootResponseUnmarshaller {

	public static GetBids4Uid4RootResponse unmarshall(GetBids4Uid4RootResponse getBids4Uid4RootResponse, UnmarshallerContext context) {
		
		getBids4Uid4RootResponse.setRequestId(context.stringValue("GetBids4Uid4RootResponse.RequestId"));
		getBids4Uid4RootResponse.setSuccess(context.booleanValue("GetBids4Uid4RootResponse.Success"));
		getBids4Uid4RootResponse.setMessage(context.stringValue("GetBids4Uid4RootResponse.Message"));
		getBids4Uid4RootResponse.setData(context.stringValue("GetBids4Uid4RootResponse.Data"));
		getBids4Uid4RootResponse.setErrorCode(context.integerValue("GetBids4Uid4RootResponse.ErrorCode"));
		getBids4Uid4RootResponse.setErrorMsg(context.stringValue("GetBids4Uid4RootResponse.ErrorMsg"));
	 
	 	return getBids4Uid4RootResponse;
	}
}