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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeEipSegmentResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeEipSegmentResponse.EipSegment;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEipSegmentResponseUnmarshaller {

	public static DescribeEipSegmentResponse unmarshall(DescribeEipSegmentResponse describeEipSegmentResponse, UnmarshallerContext _ctx) {
		
		describeEipSegmentResponse.setRequestId(_ctx.stringValue("DescribeEipSegmentResponse.RequestId"));
		describeEipSegmentResponse.setTotalCount(_ctx.integerValue("DescribeEipSegmentResponse.TotalCount"));
		describeEipSegmentResponse.setPageNumber(_ctx.integerValue("DescribeEipSegmentResponse.PageNumber"));
		describeEipSegmentResponse.setPageSize(_ctx.integerValue("DescribeEipSegmentResponse.PageSize"));

		List<EipSegment> eipSegments = new ArrayList<EipSegment>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEipSegmentResponse.EipSegments.Length"); i++) {
			EipSegment eipSegment = new EipSegment();
			eipSegment.setInstanceId(_ctx.stringValue("DescribeEipSegmentResponse.EipSegments["+ i +"].InstanceId"));
			eipSegment.setSegment(_ctx.stringValue("DescribeEipSegmentResponse.EipSegments["+ i +"].Segment"));
			eipSegment.setStatus(_ctx.stringValue("DescribeEipSegmentResponse.EipSegments["+ i +"].Status"));
			eipSegment.setRegionId(_ctx.stringValue("DescribeEipSegmentResponse.EipSegments["+ i +"].RegionId"));
			eipSegment.setIpCount(_ctx.stringValue("DescribeEipSegmentResponse.EipSegments["+ i +"].IpCount"));
			eipSegment.setName(_ctx.stringValue("DescribeEipSegmentResponse.EipSegments["+ i +"].Name"));
			eipSegment.setDescritpion(_ctx.stringValue("DescribeEipSegmentResponse.EipSegments["+ i +"].Descritpion"));
			eipSegment.setCreationTime(_ctx.stringValue("DescribeEipSegmentResponse.EipSegments["+ i +"].CreationTime"));

			eipSegments.add(eipSegment);
		}
		describeEipSegmentResponse.setEipSegments(eipSegments);
	 
	 	return describeEipSegmentResponse;
	}
}