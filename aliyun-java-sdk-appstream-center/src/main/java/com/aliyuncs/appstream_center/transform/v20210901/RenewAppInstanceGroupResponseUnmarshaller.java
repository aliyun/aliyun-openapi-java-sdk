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

package com.aliyuncs.appstream_center.transform.v20210901;

import com.aliyuncs.appstream_center.model.v20210901.RenewAppInstanceGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenewAppInstanceGroupResponseUnmarshaller {

	public static RenewAppInstanceGroupResponse unmarshall(RenewAppInstanceGroupResponse renewAppInstanceGroupResponse, UnmarshallerContext _ctx) {
		
		renewAppInstanceGroupResponse.setRequestId(_ctx.stringValue("RenewAppInstanceGroupResponse.RequestId"));
		renewAppInstanceGroupResponse.setCode(_ctx.stringValue("RenewAppInstanceGroupResponse.Code"));
		renewAppInstanceGroupResponse.setOrderId(_ctx.stringValue("RenewAppInstanceGroupResponse.OrderId"));
		renewAppInstanceGroupResponse.setMessage(_ctx.stringValue("RenewAppInstanceGroupResponse.Message"));
	 
	 	return renewAppInstanceGroupResponse;
	}
}