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

import com.aliyuncs.dms_enterprise.model.v20181101.CreateDataTrackOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataTrackOrderResponseUnmarshaller {

	public static CreateDataTrackOrderResponse unmarshall(CreateDataTrackOrderResponse createDataTrackOrderResponse, UnmarshallerContext _ctx) {
		
		createDataTrackOrderResponse.setRequestId(_ctx.stringValue("CreateDataTrackOrderResponse.RequestId"));
		createDataTrackOrderResponse.setSuccess(_ctx.booleanValue("CreateDataTrackOrderResponse.Success"));
		createDataTrackOrderResponse.setErrorMessage(_ctx.stringValue("CreateDataTrackOrderResponse.ErrorMessage"));
		createDataTrackOrderResponse.setErrorCode(_ctx.stringValue("CreateDataTrackOrderResponse.ErrorCode"));

		List<Long> createOrderResult = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateDataTrackOrderResponse.CreateOrderResult.Length"); i++) {
			createOrderResult.add(_ctx.longValue("CreateDataTrackOrderResponse.CreateOrderResult["+ i +"]"));
		}
		createDataTrackOrderResponse.setCreateOrderResult(createOrderResult);
	 
	 	return createDataTrackOrderResponse;
	}
}