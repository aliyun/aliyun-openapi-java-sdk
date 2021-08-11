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

import com.aliyuncs.dms_enterprise.model.v20181101.CreateSQLReviewOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSQLReviewOrderResponseUnmarshaller {

	public static CreateSQLReviewOrderResponse unmarshall(CreateSQLReviewOrderResponse createSQLReviewOrderResponse, UnmarshallerContext _ctx) {
		
		createSQLReviewOrderResponse.setRequestId(_ctx.stringValue("CreateSQLReviewOrderResponse.RequestId"));
		createSQLReviewOrderResponse.setSuccess(_ctx.booleanValue("CreateSQLReviewOrderResponse.Success"));
		createSQLReviewOrderResponse.setErrorMessage(_ctx.stringValue("CreateSQLReviewOrderResponse.ErrorMessage"));
		createSQLReviewOrderResponse.setErrorCode(_ctx.stringValue("CreateSQLReviewOrderResponse.ErrorCode"));

		List<Long> createOrderResult = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateSQLReviewOrderResponse.CreateOrderResult.Length"); i++) {
			createOrderResult.add(_ctx.longValue("CreateSQLReviewOrderResponse.CreateOrderResult["+ i +"]"));
		}
		createSQLReviewOrderResponse.setCreateOrderResult(createOrderResult);
	 
	 	return createSQLReviewOrderResponse;
	}
}