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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDDosEventSrcIpResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDDosEventSrcIpResponse.EventSrcIp;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDDosEventSrcIpResponseUnmarshaller {

	public static DescribeDDosEventSrcIpResponse unmarshall(DescribeDDosEventSrcIpResponse describeDDosEventSrcIpResponse, UnmarshallerContext _ctx) {
		
		describeDDosEventSrcIpResponse.setRequestId(_ctx.stringValue("DescribeDDosEventSrcIpResponse.RequestId"));

		List<EventSrcIp> ips = new ArrayList<EventSrcIp>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDDosEventSrcIpResponse.Ips.Length"); i++) {
			EventSrcIp eventSrcIp = new EventSrcIp();
			eventSrcIp.setSrcIp(_ctx.stringValue("DescribeDDosEventSrcIpResponse.Ips["+ i +"].SrcIp"));
			eventSrcIp.setAreaId(_ctx.stringValue("DescribeDDosEventSrcIpResponse.Ips["+ i +"].AreaId"));
			eventSrcIp.setIsp(_ctx.stringValue("DescribeDDosEventSrcIpResponse.Ips["+ i +"].Isp"));

			ips.add(eventSrcIp);
		}
		describeDDosEventSrcIpResponse.setIps(ips);
	 
	 	return describeDDosEventSrcIpResponse;
	}
}