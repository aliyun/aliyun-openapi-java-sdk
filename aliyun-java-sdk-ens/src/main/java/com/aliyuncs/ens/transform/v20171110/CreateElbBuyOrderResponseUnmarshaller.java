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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.CreateElbBuyOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateElbBuyOrderResponseUnmarshaller {

	public static CreateElbBuyOrderResponse unmarshall(CreateElbBuyOrderResponse createElbBuyOrderResponse, UnmarshallerContext _ctx) {
		
		createElbBuyOrderResponse.setRequestId(_ctx.stringValue("CreateElbBuyOrderResponse.RequestId"));

		List<String> loadBalancerIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateElbBuyOrderResponse.LoadBalancerIds.Length"); i++) {
			loadBalancerIds.add(_ctx.stringValue("CreateElbBuyOrderResponse.LoadBalancerIds["+ i +"]"));
		}
		createElbBuyOrderResponse.setLoadBalancerIds(loadBalancerIds);
	 
	 	return createElbBuyOrderResponse;
	}
}