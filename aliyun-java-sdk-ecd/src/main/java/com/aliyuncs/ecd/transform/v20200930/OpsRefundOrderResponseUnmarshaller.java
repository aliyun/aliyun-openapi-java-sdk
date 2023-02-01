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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.OpsRefundOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsRefundOrderResponseUnmarshaller {

	public static OpsRefundOrderResponse unmarshall(OpsRefundOrderResponse opsRefundOrderResponse, UnmarshallerContext _ctx) {
		
		opsRefundOrderResponse.setRequestId(_ctx.stringValue("OpsRefundOrderResponse.RequestId"));
		opsRefundOrderResponse.setOrderId(_ctx.stringValue("OpsRefundOrderResponse.OrderId"));

		List<String> desktopId = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsRefundOrderResponse.DesktopId.Length"); i++) {
			desktopId.add(_ctx.stringValue("OpsRefundOrderResponse.DesktopId["+ i +"]"));
		}
		opsRefundOrderResponse.setDesktopId(desktopId);
	 
	 	return opsRefundOrderResponse;
	}
}