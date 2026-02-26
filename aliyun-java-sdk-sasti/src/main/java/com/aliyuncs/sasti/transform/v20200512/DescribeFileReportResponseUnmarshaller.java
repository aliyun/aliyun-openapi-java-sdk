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

package com.aliyuncs.sasti.transform.v20200512;

import com.aliyuncs.sasti.model.v20200512.DescribeFileReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFileReportResponseUnmarshaller {

	public static DescribeFileReportResponse unmarshall(DescribeFileReportResponse describeFileReportResponse, UnmarshallerContext _ctx) {
		
		describeFileReportResponse.setRequestId(_ctx.stringValue("DescribeFileReportResponse.RequestId"));
		describeFileReportResponse.setIntelligences(_ctx.stringValue("DescribeFileReportResponse.Intelligences"));
		describeFileReportResponse.setFileHash(_ctx.stringValue("DescribeFileReportResponse.FileHash"));
		describeFileReportResponse.setThreatTypes(_ctx.stringValue("DescribeFileReportResponse.ThreatTypes"));
		describeFileReportResponse.setBasic(_ctx.stringValue("DescribeFileReportResponse.Basic"));
		describeFileReportResponse.setThreatLevel(_ctx.stringValue("DescribeFileReportResponse.ThreatLevel"));
		describeFileReportResponse.setSandbox(_ctx.stringValue("DescribeFileReportResponse.Sandbox"));
	 
	 	return describeFileReportResponse;
	}
}