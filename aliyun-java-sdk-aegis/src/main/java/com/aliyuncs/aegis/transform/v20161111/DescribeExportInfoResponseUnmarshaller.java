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

package com.aliyuncs.aegis.transform.v20161111;

import com.aliyuncs.aegis.model.v20161111.DescribeExportInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExportInfoResponseUnmarshaller {

	public static DescribeExportInfoResponse unmarshall(DescribeExportInfoResponse describeExportInfoResponse, UnmarshallerContext context) {
		
		describeExportInfoResponse.setRequestId(context.stringValue("DescribeExportInfoResponse.RequestId"));
		describeExportInfoResponse.setFileName(context.stringValue("DescribeExportInfoResponse.FileName"));
		describeExportInfoResponse.setCurrentCount(context.integerValue("DescribeExportInfoResponse.CurrentCount"));
		describeExportInfoResponse.setLink(context.stringValue("DescribeExportInfoResponse.Link"));
		describeExportInfoResponse.setProgress(context.integerValue("DescribeExportInfoResponse.Progress"));
		describeExportInfoResponse.setId(context.integerValue("DescribeExportInfoResponse.Id"));
		describeExportInfoResponse.setMessage(context.stringValue("DescribeExportInfoResponse.Message"));
		describeExportInfoResponse.setTotalCount(context.integerValue("DescribeExportInfoResponse.TotalCount"));
		describeExportInfoResponse.setGmtCreate(context.longValue("DescribeExportInfoResponse.GmtCreate"));
		describeExportInfoResponse.setResultStatus(context.stringValue("DescribeExportInfoResponse.ResultStatus"));
	 
	 	return describeExportInfoResponse;
	}
}