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

import com.aliyuncs.sas.model.v20181203.DescribeExportInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExportInfoResponseUnmarshaller {

	public static DescribeExportInfoResponse unmarshall(DescribeExportInfoResponse describeExportInfoResponse, UnmarshallerContext _ctx) {
		
		describeExportInfoResponse.setRequestId(_ctx.stringValue("DescribeExportInfoResponse.RequestId"));
		describeExportInfoResponse.setLink(_ctx.stringValue("DescribeExportInfoResponse.Link"));
		describeExportInfoResponse.setProgress(_ctx.integerValue("DescribeExportInfoResponse.Progress"));
		describeExportInfoResponse.setCurrentCount(_ctx.integerValue("DescribeExportInfoResponse.CurrentCount"));
		describeExportInfoResponse.setMessage(_ctx.stringValue("DescribeExportInfoResponse.Message"));
		describeExportInfoResponse.setFileName(_ctx.stringValue("DescribeExportInfoResponse.FileName"));
		describeExportInfoResponse.setTotalCount(_ctx.integerValue("DescribeExportInfoResponse.TotalCount"));
		describeExportInfoResponse.setExportStatus(_ctx.stringValue("DescribeExportInfoResponse.ExportStatus"));
		describeExportInfoResponse.setId(_ctx.longValue("DescribeExportInfoResponse.Id"));
	 
	 	return describeExportInfoResponse;
	}
}