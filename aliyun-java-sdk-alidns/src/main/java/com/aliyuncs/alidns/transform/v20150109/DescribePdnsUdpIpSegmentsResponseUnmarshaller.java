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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribePdnsUdpIpSegmentsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribePdnsUdpIpSegmentsResponse.IpSegment;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePdnsUdpIpSegmentsResponseUnmarshaller {

	public static DescribePdnsUdpIpSegmentsResponse unmarshall(DescribePdnsUdpIpSegmentsResponse describePdnsUdpIpSegmentsResponse, UnmarshallerContext _ctx) {
		
		describePdnsUdpIpSegmentsResponse.setRequestId(_ctx.stringValue("DescribePdnsUdpIpSegmentsResponse.RequestId"));
		describePdnsUdpIpSegmentsResponse.setTotalCount(_ctx.longValue("DescribePdnsUdpIpSegmentsResponse.TotalCount"));
		describePdnsUdpIpSegmentsResponse.setPageSize(_ctx.longValue("DescribePdnsUdpIpSegmentsResponse.PageSize"));
		describePdnsUdpIpSegmentsResponse.setPageNumber(_ctx.longValue("DescribePdnsUdpIpSegmentsResponse.PageNumber"));

		List<IpSegment> ipSegments = new ArrayList<IpSegment>();
		for (int i = 0; i < _ctx.lengthValue("DescribePdnsUdpIpSegmentsResponse.IpSegments.Length"); i++) {
			IpSegment ipSegment = new IpSegment();
			ipSegment.setUpdateDate(_ctx.stringValue("DescribePdnsUdpIpSegmentsResponse.IpSegments["+ i +"].UpdateDate"));
			ipSegment.setState(_ctx.stringValue("DescribePdnsUdpIpSegmentsResponse.IpSegments["+ i +"].State"));
			ipSegment.setIp(_ctx.stringValue("DescribePdnsUdpIpSegmentsResponse.IpSegments["+ i +"].Ip"));
			ipSegment.setMask(_ctx.longValue("DescribePdnsUdpIpSegmentsResponse.IpSegments["+ i +"].Mask"));
			ipSegment.setCreateDate(_ctx.stringValue("DescribePdnsUdpIpSegmentsResponse.IpSegments["+ i +"].CreateDate"));
			ipSegment.setName(_ctx.stringValue("DescribePdnsUdpIpSegmentsResponse.IpSegments["+ i +"].Name"));

			ipSegments.add(ipSegment);
		}
		describePdnsUdpIpSegmentsResponse.setIpSegments(ipSegments);
	 
	 	return describePdnsUdpIpSegmentsResponse;
	}
}