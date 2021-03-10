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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.CreateDataCorrectOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataCorrectOrderResponseUnmarshaller {

	public static CreateDataCorrectOrderResponse unmarshall(CreateDataCorrectOrderResponse createDataCorrectOrderResponse, UnmarshallerContext _ctx) {
		
		createDataCorrectOrderResponse.setRequestId(_ctx.stringValue("CreateDataCorrectOrderResponse.RequestId"));
		createDataCorrectOrderResponse.setErrorCode(_ctx.stringValue("CreateDataCorrectOrderResponse.ErrorCode"));
		createDataCorrectOrderResponse.setErrorMessage(_ctx.stringValue("CreateDataCorrectOrderResponse.ErrorMessage"));
		createDataCorrectOrderResponse.setSuccess(_ctx.booleanValue("CreateDataCorrectOrderResponse.Success"));

		List<Long> createOrderResult = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateDataCorrectOrderResponse.CreateOrderResult.Length"); i++) {
			createOrderResult.add(_ctx.longValue("CreateDataCorrectOrderResponse.CreateOrderResult["+ i +"]"));
		}
		createDataCorrectOrderResponse.setCreateOrderResult(createOrderResult);
	 
	 	return createDataCorrectOrderResponse;
	}
}