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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.DescribeJMeterSamplingLogsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJMeterSamplingLogsResponseUnmarshaller {

	public static DescribeJMeterSamplingLogsResponse unmarshall(DescribeJMeterSamplingLogsResponse describeJMeterSamplingLogsResponse, UnmarshallerContext _ctx) {
		
		describeJMeterSamplingLogsResponse.setRequestId(_ctx.stringValue("DescribeJMeterSamplingLogsResponse.RequestId"));
		describeJMeterSamplingLogsResponse.setCode(_ctx.stringValue("DescribeJMeterSamplingLogsResponse.Code"));
		describeJMeterSamplingLogsResponse.setHttpStatusCode(_ctx.integerValue("DescribeJMeterSamplingLogsResponse.HttpStatusCode"));
		describeJMeterSamplingLogsResponse.setMessage(_ctx.stringValue("DescribeJMeterSamplingLogsResponse.Message"));
		describeJMeterSamplingLogsResponse.setSuccess(_ctx.booleanValue("DescribeJMeterSamplingLogsResponse.Success"));
		describeJMeterSamplingLogsResponse.setPageNumber(_ctx.integerValue("DescribeJMeterSamplingLogsResponse.PageNumber"));
		describeJMeterSamplingLogsResponse.setPageSize(_ctx.integerValue("DescribeJMeterSamplingLogsResponse.PageSize"));
		describeJMeterSamplingLogsResponse.setTotalCount(_ctx.longValue("DescribeJMeterSamplingLogsResponse.TotalCount"));

		List<String> sampleResults = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJMeterSamplingLogsResponse.SampleResults.Length"); i++) {
			sampleResults.add(_ctx.stringValue("DescribeJMeterSamplingLogsResponse.SampleResults["+ i +"]"));
		}
		describeJMeterSamplingLogsResponse.setSampleResults(sampleResults);
	 
	 	return describeJMeterSamplingLogsResponse;
	}
}