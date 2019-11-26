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

import com.aliyuncs.alidns.model.v20150109.DescribeCustomLineResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeCustomLineResponse.IpSegment;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomLineResponseUnmarshaller {

	public static DescribeCustomLineResponse unmarshall(DescribeCustomLineResponse describeCustomLineResponse, UnmarshallerContext _ctx) {
		
		describeCustomLineResponse.setRequestId(_ctx.stringValue("DescribeCustomLineResponse.RequestId"));
		describeCustomLineResponse.setId(_ctx.longValue("DescribeCustomLineResponse.Id"));
		describeCustomLineResponse.setName(_ctx.stringValue("DescribeCustomLineResponse.Name"));
		describeCustomLineResponse.setDomainName(_ctx.stringValue("DescribeCustomLineResponse.DomainName"));
		describeCustomLineResponse.setCreateTime(_ctx.stringValue("DescribeCustomLineResponse.CreateTime"));
		describeCustomLineResponse.setCreateTimestamp(_ctx.longValue("DescribeCustomLineResponse.CreateTimestamp"));
		describeCustomLineResponse.setIpSegments(_ctx.stringValue("DescribeCustomLineResponse.IpSegments"));
		describeCustomLineResponse.setCode(_ctx.stringValue("DescribeCustomLineResponse.Code"));

		List<IpSegment> ipSegmentList = new ArrayList<IpSegment>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomLineResponse.IpSegmentList.Length"); i++) {
			IpSegment ipSegment = new IpSegment();
			ipSegment.setName(_ctx.stringValue("DescribeCustomLineResponse.IpSegmentList["+ i +"].Name"));
			ipSegment.setStartIp(_ctx.stringValue("DescribeCustomLineResponse.IpSegmentList["+ i +"].StartIp"));
			ipSegment.setEndIp(_ctx.stringValue("DescribeCustomLineResponse.IpSegmentList["+ i +"].EndIp"));

			ipSegmentList.add(ipSegment);
		}
		describeCustomLineResponse.setIpSegmentList(ipSegmentList);
	 
	 	return describeCustomLineResponse;
	}
}