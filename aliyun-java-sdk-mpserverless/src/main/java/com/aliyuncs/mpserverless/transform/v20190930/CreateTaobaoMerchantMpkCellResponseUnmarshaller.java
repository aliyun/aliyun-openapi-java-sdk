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

package com.aliyuncs.mpserverless.transform.v20190930;

import com.aliyuncs.mpserverless.model.v20190930.CreateTaobaoMerchantMpkCellResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTaobaoMerchantMpkCellResponseUnmarshaller {

	public static CreateTaobaoMerchantMpkCellResponse unmarshall(CreateTaobaoMerchantMpkCellResponse createTaobaoMerchantMpkCellResponse, UnmarshallerContext _ctx) {
		
		createTaobaoMerchantMpkCellResponse.setRequestId(_ctx.stringValue("CreateTaobaoMerchantMpkCellResponse.RequestId"));
		createTaobaoMerchantMpkCellResponse.setHttpStatusCode(_ctx.stringValue("CreateTaobaoMerchantMpkCellResponse.HttpStatusCode"));
		createTaobaoMerchantMpkCellResponse.setSuccess(_ctx.booleanValue("CreateTaobaoMerchantMpkCellResponse.Success"));
		createTaobaoMerchantMpkCellResponse.setCode(_ctx.stringValue("CreateTaobaoMerchantMpkCellResponse.Code"));
		createTaobaoMerchantMpkCellResponse.setMessage(_ctx.stringValue("CreateTaobaoMerchantMpkCellResponse.Message"));
		createTaobaoMerchantMpkCellResponse.setCellId(_ctx.stringValue("CreateTaobaoMerchantMpkCellResponse.CellId"));
	 
	 	return createTaobaoMerchantMpkCellResponse;
	}
}