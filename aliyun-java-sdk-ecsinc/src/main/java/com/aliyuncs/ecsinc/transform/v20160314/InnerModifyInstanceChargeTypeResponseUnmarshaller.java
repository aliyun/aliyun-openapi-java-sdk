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

package com.aliyuncs.ecsinc.transform.v20160314;

import com.aliyuncs.ecsinc.model.v20160314.InnerModifyInstanceChargeTypeResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerModifyInstanceChargeTypeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerModifyInstanceChargeTypeResponseUnmarshaller {

	public static InnerModifyInstanceChargeTypeResponse unmarshall(InnerModifyInstanceChargeTypeResponse innerModifyInstanceChargeTypeResponse, UnmarshallerContext context) {
		
		innerModifyInstanceChargeTypeResponse.setRequestId(context.stringValue("InnerModifyInstanceChargeTypeResponse.RequestId"));

		Data data = new Data();
		data.setOrderId(context.longValue("InnerModifyInstanceChargeTypeResponse.data.orderId"));
		innerModifyInstanceChargeTypeResponse.setData(data);
	 
	 	return innerModifyInstanceChargeTypeResponse;
	}
}