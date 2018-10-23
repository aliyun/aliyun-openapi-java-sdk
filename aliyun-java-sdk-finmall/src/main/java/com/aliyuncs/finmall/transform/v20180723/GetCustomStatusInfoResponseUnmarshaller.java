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

package com.aliyuncs.finmall.transform.v20180723;

import com.aliyuncs.finmall.model.v20180723.GetCustomStatusInfoResponse;
import com.aliyuncs.finmall.model.v20180723.GetCustomStatusInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCustomStatusInfoResponseUnmarshaller {

	public static GetCustomStatusInfoResponse unmarshall(GetCustomStatusInfoResponse getCustomStatusInfoResponse, UnmarshallerContext context) {
		
		getCustomStatusInfoResponse.setRequestId(context.stringValue("GetCustomStatusInfoResponse.RequestId"));
		getCustomStatusInfoResponse.setCode(context.stringValue("GetCustomStatusInfoResponse.Code"));
		getCustomStatusInfoResponse.setMessage(context.stringValue("GetCustomStatusInfoResponse.Message"));

		Data data = new Data();
		data.setUserState(context.stringValue("GetCustomStatusInfoResponse.Data.UserState"));
		data.setValidateState(context.stringValue("GetCustomStatusInfoResponse.Data.ValidateState"));
		data.setValidateTime(context.stringValue("GetCustomStatusInfoResponse.Data.ValidateTime"));
		getCustomStatusInfoResponse.setData(data);
	 
	 	return getCustomStatusInfoResponse;
	}
}