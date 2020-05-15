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

package com.aliyuncs.digitalstore.transform.v20200107;

import com.aliyuncs.digitalstore.model.v20200107.ImportOutBoundOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportOutBoundOrderResponseUnmarshaller {

	public static ImportOutBoundOrderResponse unmarshall(ImportOutBoundOrderResponse importOutBoundOrderResponse, UnmarshallerContext _ctx) {
		
		importOutBoundOrderResponse.setRequestId(_ctx.stringValue("ImportOutBoundOrderResponse.RequestId"));
		importOutBoundOrderResponse.setSuccess(_ctx.booleanValue("ImportOutBoundOrderResponse.Success"));
		importOutBoundOrderResponse.setOrderId(_ctx.stringValue("ImportOutBoundOrderResponse.OrderId"));
	 
	 	return importOutBoundOrderResponse;
	}
}