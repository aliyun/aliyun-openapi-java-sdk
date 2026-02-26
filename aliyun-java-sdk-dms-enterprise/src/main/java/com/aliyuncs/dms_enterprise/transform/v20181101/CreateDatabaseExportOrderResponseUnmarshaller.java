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

import com.aliyuncs.dms_enterprise.model.v20181101.CreateDatabaseExportOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDatabaseExportOrderResponseUnmarshaller {

	public static CreateDatabaseExportOrderResponse unmarshall(CreateDatabaseExportOrderResponse createDatabaseExportOrderResponse, UnmarshallerContext _ctx) {
		
		createDatabaseExportOrderResponse.setRequestId(_ctx.stringValue("CreateDatabaseExportOrderResponse.RequestId"));
		createDatabaseExportOrderResponse.setErrorCode(_ctx.stringValue("CreateDatabaseExportOrderResponse.ErrorCode"));
		createDatabaseExportOrderResponse.setErrorMessage(_ctx.stringValue("CreateDatabaseExportOrderResponse.ErrorMessage"));
		createDatabaseExportOrderResponse.setSuccess(_ctx.booleanValue("CreateDatabaseExportOrderResponse.Success"));

		List<Long> createOrderResult = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateDatabaseExportOrderResponse.CreateOrderResult.Length"); i++) {
			createOrderResult.add(_ctx.longValue("CreateDatabaseExportOrderResponse.CreateOrderResult["+ i +"]"));
		}
		createDatabaseExportOrderResponse.setCreateOrderResult(createOrderResult);
	 
	 	return createDatabaseExportOrderResponse;
	}
}