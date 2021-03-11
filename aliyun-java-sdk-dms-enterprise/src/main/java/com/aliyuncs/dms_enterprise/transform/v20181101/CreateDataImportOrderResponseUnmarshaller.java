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

import com.aliyuncs.dms_enterprise.model.v20181101.CreateDataImportOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataImportOrderResponseUnmarshaller {

	public static CreateDataImportOrderResponse unmarshall(CreateDataImportOrderResponse createDataImportOrderResponse, UnmarshallerContext _ctx) {
		
		createDataImportOrderResponse.setRequestId(_ctx.stringValue("CreateDataImportOrderResponse.RequestId"));
		createDataImportOrderResponse.setErrorCode(_ctx.stringValue("CreateDataImportOrderResponse.ErrorCode"));
		createDataImportOrderResponse.setErrorMessage(_ctx.stringValue("CreateDataImportOrderResponse.ErrorMessage"));
		createDataImportOrderResponse.setSuccess(_ctx.booleanValue("CreateDataImportOrderResponse.Success"));

		List<Long> createOrderResult = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateDataImportOrderResponse.CreateOrderResult.Length"); i++) {
			createOrderResult.add(_ctx.longValue("CreateDataImportOrderResponse.CreateOrderResult["+ i +"]"));
		}
		createDataImportOrderResponse.setCreateOrderResult(createOrderResult);
	 
	 	return createDataImportOrderResponse;
	}
}