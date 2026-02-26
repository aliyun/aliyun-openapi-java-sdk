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

import com.aliyuncs.dms_enterprise.model.v20181101.CreateDataArchiveOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataArchiveOrderResponseUnmarshaller {

	public static CreateDataArchiveOrderResponse unmarshall(CreateDataArchiveOrderResponse createDataArchiveOrderResponse, UnmarshallerContext _ctx) {
		
		createDataArchiveOrderResponse.setRequestId(_ctx.stringValue("CreateDataArchiveOrderResponse.RequestId"));
		createDataArchiveOrderResponse.setSuccess(_ctx.booleanValue("CreateDataArchiveOrderResponse.Success"));
		createDataArchiveOrderResponse.setErrorMessage(_ctx.stringValue("CreateDataArchiveOrderResponse.ErrorMessage"));
		createDataArchiveOrderResponse.setErrorCode(_ctx.stringValue("CreateDataArchiveOrderResponse.ErrorCode"));

		List<Long> createOrderResult = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateDataArchiveOrderResponse.CreateOrderResult.Length"); i++) {
			createOrderResult.add(_ctx.longValue("CreateDataArchiveOrderResponse.CreateOrderResult["+ i +"]"));
		}
		createDataArchiveOrderResponse.setCreateOrderResult(createOrderResult);
	 
	 	return createDataArchiveOrderResponse;
	}
}