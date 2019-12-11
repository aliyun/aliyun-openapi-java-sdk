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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeCustomEventHistogramResponse;
import com.aliyuncs.cms.model.v20190101.DescribeCustomEventHistogramResponse.EventHistogram;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomEventHistogramResponseUnmarshaller {

	public static DescribeCustomEventHistogramResponse unmarshall(DescribeCustomEventHistogramResponse describeCustomEventHistogramResponse, UnmarshallerContext _ctx) {
		
		describeCustomEventHistogramResponse.setRequestId(_ctx.stringValue("DescribeCustomEventHistogramResponse.RequestId"));
		describeCustomEventHistogramResponse.setCode(_ctx.stringValue("DescribeCustomEventHistogramResponse.Code"));
		describeCustomEventHistogramResponse.setMessage(_ctx.stringValue("DescribeCustomEventHistogramResponse.Message"));
		describeCustomEventHistogramResponse.setSuccess(_ctx.stringValue("DescribeCustomEventHistogramResponse.Success"));

		List<EventHistogram> eventHistograms = new ArrayList<EventHistogram>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomEventHistogramResponse.EventHistograms.Length"); i++) {
			EventHistogram eventHistogram = new EventHistogram();
			eventHistogram.setCount(_ctx.longValue("DescribeCustomEventHistogramResponse.EventHistograms["+ i +"].Count"));
			eventHistogram.setStartTime(_ctx.longValue("DescribeCustomEventHistogramResponse.EventHistograms["+ i +"].StartTime"));
			eventHistogram.setEndTime(_ctx.longValue("DescribeCustomEventHistogramResponse.EventHistograms["+ i +"].EndTime"));

			eventHistograms.add(eventHistogram);
		}
		describeCustomEventHistogramResponse.setEventHistograms(eventHistograms);
	 
	 	return describeCustomEventHistogramResponse;
	}
}