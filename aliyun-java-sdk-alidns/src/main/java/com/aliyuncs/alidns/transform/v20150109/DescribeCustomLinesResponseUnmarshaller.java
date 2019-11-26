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

import com.aliyuncs.alidns.model.v20150109.DescribeCustomLinesResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeCustomLinesResponse.CustomLine;
import com.aliyuncs.alidns.model.v20150109.DescribeCustomLinesResponse.CustomLine.IpSegment;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomLinesResponseUnmarshaller {

	public static DescribeCustomLinesResponse unmarshall(DescribeCustomLinesResponse describeCustomLinesResponse, UnmarshallerContext _ctx) {
		
		describeCustomLinesResponse.setRequestId(_ctx.stringValue("DescribeCustomLinesResponse.RequestId"));
		describeCustomLinesResponse.setTotalItems(_ctx.integerValue("DescribeCustomLinesResponse.TotalItems"));
		describeCustomLinesResponse.setPageNumber(_ctx.integerValue("DescribeCustomLinesResponse.PageNumber"));
		describeCustomLinesResponse.setPageSize(_ctx.integerValue("DescribeCustomLinesResponse.PageSize"));
		describeCustomLinesResponse.setTotalPages(_ctx.integerValue("DescribeCustomLinesResponse.TotalPages"));

		List<CustomLine> customLines = new ArrayList<CustomLine>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomLinesResponse.CustomLines.Length"); i++) {
			CustomLine customLine = new CustomLine();
			customLine.setId(_ctx.longValue("DescribeCustomLinesResponse.CustomLines["+ i +"].Id"));
			customLine.setName(_ctx.stringValue("DescribeCustomLinesResponse.CustomLines["+ i +"].Name"));
			customLine.setCreateTime(_ctx.stringValue("DescribeCustomLinesResponse.CustomLines["+ i +"].CreateTime"));
			customLine.setCreateTimestamp(_ctx.longValue("DescribeCustomLinesResponse.CustomLines["+ i +"].CreateTimestamp"));
			customLine.setIpSegments(_ctx.stringValue("DescribeCustomLinesResponse.CustomLines["+ i +"].IpSegments"));
			customLine.setCode(_ctx.stringValue("DescribeCustomLinesResponse.CustomLines["+ i +"].Code"));

			List<IpSegment> ipSegmentList = new ArrayList<IpSegment>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCustomLinesResponse.CustomLines["+ i +"].IpSegmentList.Length"); j++) {
				IpSegment ipSegment = new IpSegment();
				ipSegment.setName(_ctx.stringValue("DescribeCustomLinesResponse.CustomLines["+ i +"].IpSegmentList["+ j +"].Name"));
				ipSegment.setStartIp(_ctx.stringValue("DescribeCustomLinesResponse.CustomLines["+ i +"].IpSegmentList["+ j +"].StartIp"));
				ipSegment.setEndIp(_ctx.stringValue("DescribeCustomLinesResponse.CustomLines["+ i +"].IpSegmentList["+ j +"].EndIp"));

				ipSegmentList.add(ipSegment);
			}
			customLine.setIpSegmentList(ipSegmentList);

			customLines.add(customLine);
		}
		describeCustomLinesResponse.setCustomLines(customLines);
	 
	 	return describeCustomLinesResponse;
	}
}