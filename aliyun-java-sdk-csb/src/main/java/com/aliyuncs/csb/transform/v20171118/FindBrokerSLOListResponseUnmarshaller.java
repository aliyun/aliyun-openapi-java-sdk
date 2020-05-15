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

package com.aliyuncs.csb.transform.v20171118;

import com.aliyuncs.csb.model.v20171118.FindBrokerSLOListResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindBrokerSLOListResponseUnmarshaller {

	public static FindBrokerSLOListResponse unmarshall(FindBrokerSLOListResponse findBrokerSLOListResponse, UnmarshallerContext _ctx) {
		
		findBrokerSLOListResponse.setRequestId(_ctx.stringValue("FindBrokerSLOListResponse.RequestId"));
		findBrokerSLOListResponse.setCode(_ctx.integerValue("FindBrokerSLOListResponse.Code"));
		findBrokerSLOListResponse.setMessage(_ctx.stringValue("FindBrokerSLOListResponse.Message"));
		findBrokerSLOListResponse.setData(_ctx.mapValue("FindBrokerSLOListResponse.Data"));
	 
	 	return findBrokerSLOListResponse;
	}
}