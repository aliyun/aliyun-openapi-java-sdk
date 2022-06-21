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

package com.aliyuncs.live.transform.v20161101;

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainRealtimeLogDeliveryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainRealtimeLogDeliveryResponseUnmarshaller {

	public static DescribeLiveDomainRealtimeLogDeliveryResponse unmarshall(DescribeLiveDomainRealtimeLogDeliveryResponse describeLiveDomainRealtimeLogDeliveryResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainRealtimeLogDeliveryResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainRealtimeLogDeliveryResponse.RequestId"));
		describeLiveDomainRealtimeLogDeliveryResponse.setProject(_ctx.stringValue("DescribeLiveDomainRealtimeLogDeliveryResponse.Project"));
		describeLiveDomainRealtimeLogDeliveryResponse.setRegion(_ctx.stringValue("DescribeLiveDomainRealtimeLogDeliveryResponse.Region"));
		describeLiveDomainRealtimeLogDeliveryResponse.setLogstore(_ctx.stringValue("DescribeLiveDomainRealtimeLogDeliveryResponse.Logstore"));
		describeLiveDomainRealtimeLogDeliveryResponse.setStatus(_ctx.stringValue("DescribeLiveDomainRealtimeLogDeliveryResponse.Status"));
	 
	 	return describeLiveDomainRealtimeLogDeliveryResponse;
	}
}