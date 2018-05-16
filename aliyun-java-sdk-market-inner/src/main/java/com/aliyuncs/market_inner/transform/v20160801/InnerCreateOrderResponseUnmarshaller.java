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

package com.aliyuncs.market_inner.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market_inner.model.v20160801.InnerCreateOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerCreateOrderResponseUnmarshaller {

	public static InnerCreateOrderResponse unmarshall(InnerCreateOrderResponse innerCreateOrderResponse, UnmarshallerContext context) {
		
		innerCreateOrderResponse.setRequestId(context.stringValue("InnerCreateOrderResponse.RequestId"));
		innerCreateOrderResponse.setOrderId(context.stringValue("InnerCreateOrderResponse.OrderId"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerCreateOrderResponse.InstanceIds.Length"); i++) {
			instanceIds.add(context.stringValue("InnerCreateOrderResponse.InstanceIds["+ i +"]"));
		}
		innerCreateOrderResponse.setInstanceIds(instanceIds);
	 
	 	return innerCreateOrderResponse;
	}
}