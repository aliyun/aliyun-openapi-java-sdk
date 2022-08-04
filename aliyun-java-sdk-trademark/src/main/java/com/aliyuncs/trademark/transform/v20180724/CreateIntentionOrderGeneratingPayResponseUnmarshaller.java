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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.CreateIntentionOrderGeneratingPayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateIntentionOrderGeneratingPayResponseUnmarshaller {

	public static CreateIntentionOrderGeneratingPayResponse unmarshall(CreateIntentionOrderGeneratingPayResponse createIntentionOrderGeneratingPayResponse, UnmarshallerContext _ctx) {
		
		createIntentionOrderGeneratingPayResponse.setRequestId(_ctx.stringValue("CreateIntentionOrderGeneratingPayResponse.RequestId"));
		createIntentionOrderGeneratingPayResponse.setErrorMsg(_ctx.stringValue("CreateIntentionOrderGeneratingPayResponse.ErrorMsg"));
		createIntentionOrderGeneratingPayResponse.setPayUrl(_ctx.stringValue("CreateIntentionOrderGeneratingPayResponse.PayUrl"));
		createIntentionOrderGeneratingPayResponse.setSuccess(_ctx.booleanValue("CreateIntentionOrderGeneratingPayResponse.Success"));

		List<Long> orderIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateIntentionOrderGeneratingPayResponse.OrderIds.Length"); i++) {
			orderIds.add(_ctx.longValue("CreateIntentionOrderGeneratingPayResponse.OrderIds["+ i +"]"));
		}
		createIntentionOrderGeneratingPayResponse.setOrderIds(orderIds);
	 
	 	return createIntentionOrderGeneratingPayResponse;
	}
}