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

import com.aliyuncs.digitalstore.model.v20200107.GetProduceOrderByTagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProduceOrderByTagResponseUnmarshaller {

	public static GetProduceOrderByTagResponse unmarshall(GetProduceOrderByTagResponse getProduceOrderByTagResponse, UnmarshallerContext _ctx) {
		
		getProduceOrderByTagResponse.setRequestId(_ctx.stringValue("GetProduceOrderByTagResponse.RequestId"));
		getProduceOrderByTagResponse.setSuccess(_ctx.booleanValue("GetProduceOrderByTagResponse.Success"));
		getProduceOrderByTagResponse.setOrderId(_ctx.stringValue("GetProduceOrderByTagResponse.OrderId"));
		getProduceOrderByTagResponse.setOrderCode(_ctx.stringValue("GetProduceOrderByTagResponse.OrderCode"));
		getProduceOrderByTagResponse.setSourceOrderCode(_ctx.stringValue("GetProduceOrderByTagResponse.SourceOrderCode"));
		getProduceOrderByTagResponse.setCaseId(_ctx.stringValue("GetProduceOrderByTagResponse.CaseId"));
		getProduceOrderByTagResponse.setCaseCode(_ctx.stringValue("GetProduceOrderByTagResponse.CaseCode"));
		getProduceOrderByTagResponse.setTag(_ctx.stringValue("GetProduceOrderByTagResponse.Tag"));
		getProduceOrderByTagResponse.setBarcode(_ctx.stringValue("GetProduceOrderByTagResponse.Barcode"));
	 
	 	return getProduceOrderByTagResponse;
	}
}