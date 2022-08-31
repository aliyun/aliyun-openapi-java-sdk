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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.UpdateDcdnSLSRealtimeLogDeliveryResponse;
import com.aliyuncs.dcdn.model.v20180115.UpdateDcdnSLSRealtimeLogDeliveryResponse.Domains;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDcdnSLSRealtimeLogDeliveryResponseUnmarshaller {

	public static UpdateDcdnSLSRealtimeLogDeliveryResponse unmarshall(UpdateDcdnSLSRealtimeLogDeliveryResponse updateDcdnSLSRealtimeLogDeliveryResponse, UnmarshallerContext _ctx) {
		
		updateDcdnSLSRealtimeLogDeliveryResponse.setRequestId(_ctx.stringValue("UpdateDcdnSLSRealtimeLogDeliveryResponse.RequestId"));

		List<Domains> content = new ArrayList<Domains>();
		for (int i = 0; i < _ctx.lengthValue("UpdateDcdnSLSRealtimeLogDeliveryResponse.Content.Length"); i++) {
			Domains domains = new Domains();
			domains.setStatus(_ctx.stringValue("UpdateDcdnSLSRealtimeLogDeliveryResponse.Content["+ i +"].Status"));
			domains.setDomainName(_ctx.stringValue("UpdateDcdnSLSRealtimeLogDeliveryResponse.Content["+ i +"].DomainName"));
			domains.setRegion(_ctx.stringValue("UpdateDcdnSLSRealtimeLogDeliveryResponse.Content["+ i +"].Region"));
			domains.setDesc(_ctx.stringValue("UpdateDcdnSLSRealtimeLogDeliveryResponse.Content["+ i +"].Desc"));

			content.add(domains);
		}
		updateDcdnSLSRealtimeLogDeliveryResponse.setContent(content);
	 
	 	return updateDcdnSLSRealtimeLogDeliveryResponse;
	}
}