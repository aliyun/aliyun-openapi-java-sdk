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

package com.aliyuncs.ecd.transform.v20200930;

import com.aliyuncs.ecd.model.v20200930.RenewDesktopOversoldGroupResponse;
import com.aliyuncs.ecd.model.v20200930.RenewDesktopOversoldGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenewDesktopOversoldGroupResponseUnmarshaller {

	public static RenewDesktopOversoldGroupResponse unmarshall(RenewDesktopOversoldGroupResponse renewDesktopOversoldGroupResponse, UnmarshallerContext _ctx) {
		
		renewDesktopOversoldGroupResponse.setRequestId(_ctx.stringValue("RenewDesktopOversoldGroupResponse.RequestId"));

		Data data = new Data();
		data.setOversoldGroupId(_ctx.stringValue("RenewDesktopOversoldGroupResponse.Data.OversoldGroupId"));
		data.setOrderId(_ctx.longValue("RenewDesktopOversoldGroupResponse.Data.OrderId"));
		renewDesktopOversoldGroupResponse.setData(data);
	 
	 	return renewDesktopOversoldGroupResponse;
	}
}