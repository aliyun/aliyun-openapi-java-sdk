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

package com.aliyuncs.commondriver.transform.v20160712;

import com.aliyuncs.commondriver.model.v20160712.GetSpecificationsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSpecificationsResponseUnmarshaller {

	public static GetSpecificationsResponse unmarshall(GetSpecificationsResponse getSpecificationsResponse, UnmarshallerContext _ctx) {
		
		getSpecificationsResponse.setRequestId(_ctx.stringValue("GetSpecificationsResponse.RequestId"));
		getSpecificationsResponse.setCode(_ctx.stringValue("GetSpecificationsResponse.Code"));
		getSpecificationsResponse.setMessage(_ctx.stringValue("GetSpecificationsResponse.Message"));
		getSpecificationsResponse.setData(_ctx.stringValue("GetSpecificationsResponse.Data"));
		getSpecificationsResponse.setSuccess(_ctx.booleanValue("GetSpecificationsResponse.Success"));
	 
	 	return getSpecificationsResponse;
	}
}