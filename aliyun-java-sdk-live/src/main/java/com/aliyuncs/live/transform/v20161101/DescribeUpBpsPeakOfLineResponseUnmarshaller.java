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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeUpBpsPeakOfLineResponse;
import com.aliyuncs.live.model.v20161101.DescribeUpBpsPeakOfLineResponse.DescribeUpBpsPeakOfLine;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUpBpsPeakOfLineResponseUnmarshaller {

	public static DescribeUpBpsPeakOfLineResponse unmarshall(DescribeUpBpsPeakOfLineResponse describeUpBpsPeakOfLineResponse, UnmarshallerContext context) {
		
		describeUpBpsPeakOfLineResponse.setRequestId(context.stringValue("DescribeUpBpsPeakOfLineResponse.RequestId"));

		List<DescribeUpBpsPeakOfLine> describeUpBpsPeakOfLines = new ArrayList<DescribeUpBpsPeakOfLine>();
		for (int i = 0; i < context.lengthValue("DescribeUpBpsPeakOfLineResponse.DescribeUpBpsPeakOfLines.Length"); i++) {
			DescribeUpBpsPeakOfLine describeUpBpsPeakOfLine = new DescribeUpBpsPeakOfLine();
			describeUpBpsPeakOfLine.setBandWidth(context.floatValue("DescribeUpBpsPeakOfLineResponse.DescribeUpBpsPeakOfLines["+ i +"].BandWidth"));
			describeUpBpsPeakOfLine.setPeakTime(context.stringValue("DescribeUpBpsPeakOfLineResponse.DescribeUpBpsPeakOfLines["+ i +"].PeakTime"));
			describeUpBpsPeakOfLine.setQueryTime(context.stringValue("DescribeUpBpsPeakOfLineResponse.DescribeUpBpsPeakOfLines["+ i +"].QueryTime"));
			describeUpBpsPeakOfLine.setStatName(context.stringValue("DescribeUpBpsPeakOfLineResponse.DescribeUpBpsPeakOfLines["+ i +"].StatName"));

			describeUpBpsPeakOfLines.add(describeUpBpsPeakOfLine);
		}
		describeUpBpsPeakOfLineResponse.setDescribeUpBpsPeakOfLines(describeUpBpsPeakOfLines);
	 
	 	return describeUpBpsPeakOfLineResponse;
	}
}