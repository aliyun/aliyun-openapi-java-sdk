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

import com.aliyuncs.dms_enterprise.model.v20181101.CreateDataExportOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataExportOrderResponseUnmarshaller {

	public static CreateDataExportOrderResponse unmarshall(CreateDataExportOrderResponse createDataExportOrderResponse, UnmarshallerContext _ctx) {
		
		createDataExportOrderResponse.setRequestId(_ctx.stringValue("CreateDataExportOrderResponse.RequestId"));
		createDataExportOrderResponse.setErrorCode(_ctx.stringValue("CreateDataExportOrderResponse.ErrorCode"));
		createDataExportOrderResponse.setErrorMessage(_ctx.stringValue("CreateDataExportOrderResponse.ErrorMessage"));
		createDataExportOrderResponse.setSuccess(_ctx.booleanValue("CreateDataExportOrderResponse.Success"));

		List<Long> createOrderResult = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateDataExportOrderResponse.CreateOrderResult.Length"); i++) {
			createOrderResult.add(_ctx.longValue("CreateDataExportOrderResponse.CreateOrderResult["+ i +"]"));
		}
		createDataExportOrderResponse.setCreateOrderResult(createOrderResult);
	 
	 	return createDataExportOrderResponse;
	}
}