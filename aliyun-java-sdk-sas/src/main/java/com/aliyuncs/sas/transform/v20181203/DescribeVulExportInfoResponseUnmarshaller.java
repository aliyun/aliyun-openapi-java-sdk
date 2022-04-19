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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribeVulExportInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulExportInfoResponseUnmarshaller {

	public static DescribeVulExportInfoResponse unmarshall(DescribeVulExportInfoResponse describeVulExportInfoResponse, UnmarshallerContext _ctx) {
		
		describeVulExportInfoResponse.setRequestId(_ctx.stringValue("DescribeVulExportInfoResponse.RequestId"));
		describeVulExportInfoResponse.setLink(_ctx.stringValue("DescribeVulExportInfoResponse.Link"));
		describeVulExportInfoResponse.setProgress(_ctx.integerValue("DescribeVulExportInfoResponse.Progress"));
		describeVulExportInfoResponse.setCurrentCount(_ctx.integerValue("DescribeVulExportInfoResponse.CurrentCount"));
		describeVulExportInfoResponse.setMessage(_ctx.stringValue("DescribeVulExportInfoResponse.Message"));
		describeVulExportInfoResponse.setFileName(_ctx.stringValue("DescribeVulExportInfoResponse.FileName"));
		describeVulExportInfoResponse.setTotalCount(_ctx.integerValue("DescribeVulExportInfoResponse.TotalCount"));
		describeVulExportInfoResponse.setExportStatus(_ctx.stringValue("DescribeVulExportInfoResponse.ExportStatus"));
		describeVulExportInfoResponse.setId(_ctx.longValue("DescribeVulExportInfoResponse.Id"));
	 
	 	return describeVulExportInfoResponse;
	}
}