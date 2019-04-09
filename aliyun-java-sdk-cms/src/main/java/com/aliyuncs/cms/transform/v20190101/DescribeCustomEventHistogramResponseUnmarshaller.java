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

	public static DescribeCustomEventHistogramResponse unmarshall(DescribeCustomEventHistogramResponse describeCustomEventHistogramResponse, UnmarshallerContext context) {
		
		describeCustomEventHistogramResponse.setRequestId(context.stringValue("DescribeCustomEventHistogramResponse.RequestId"));
		describeCustomEventHistogramResponse.setCode(context.stringValue("DescribeCustomEventHistogramResponse.Code"));
		describeCustomEventHistogramResponse.setMessage(context.stringValue("DescribeCustomEventHistogramResponse.Message"));
		describeCustomEventHistogramResponse.setSuccess(context.stringValue("DescribeCustomEventHistogramResponse.Success"));

		List<EventHistogram> eventHistograms = new ArrayList<EventHistogram>();
		for (int i = 0; i < context.lengthValue("DescribeCustomEventHistogramResponse.EventHistograms.Length"); i++) {
			EventHistogram eventHistogram = new EventHistogram();
			eventHistogram.setCount(context.longValue("DescribeCustomEventHistogramResponse.EventHistograms["+ i +"].Count"));
			eventHistogram.setStartTime(context.longValue("DescribeCustomEventHistogramResponse.EventHistograms["+ i +"].StartTime"));
			eventHistogram.setEndTime(context.longValue("DescribeCustomEventHistogramResponse.EventHistograms["+ i +"].EndTime"));

			eventHistograms.add(eventHistogram);
		}
		describeCustomEventHistogramResponse.setEventHistograms(eventHistograms);
	 
	 	return describeCustomEventHistogramResponse;
	}
}