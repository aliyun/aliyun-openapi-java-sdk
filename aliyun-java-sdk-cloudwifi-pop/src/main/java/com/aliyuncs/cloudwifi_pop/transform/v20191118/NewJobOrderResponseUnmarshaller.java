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

package com.aliyuncs.cloudwifi_pop.transform.v20191118;

import com.aliyuncs.cloudwifi_pop.model.v20191118.NewJobOrderResponse;
import com.aliyuncs.cloudwifi_pop.model.v20191118.NewJobOrderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class NewJobOrderResponseUnmarshaller {

	public static NewJobOrderResponse unmarshall(NewJobOrderResponse newJobOrderResponse, UnmarshallerContext _ctx) {
		
		newJobOrderResponse.setRequestId(_ctx.stringValue("NewJobOrderResponse.RequestId"));
		newJobOrderResponse.setIsSuccess(_ctx.booleanValue("NewJobOrderResponse.IsSuccess"));
		newJobOrderResponse.setErrorCode(_ctx.integerValue("NewJobOrderResponse.ErrorCode"));
		newJobOrderResponse.setErrorMessage(_ctx.stringValue("NewJobOrderResponse.ErrorMessage"));

		Data data = new Data();
		data.setOrderId(_ctx.longValue("NewJobOrderResponse.Data.OrderId"));
		newJobOrderResponse.setData(data);
	 
	 	return newJobOrderResponse;
	}
}