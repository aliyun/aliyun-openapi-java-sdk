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

import com.aliyuncs.sas.model.v20181203.DescribeHcExportInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHcExportInfoResponseUnmarshaller {

	public static DescribeHcExportInfoResponse unmarshall(DescribeHcExportInfoResponse describeHcExportInfoResponse, UnmarshallerContext _ctx) {
		
		describeHcExportInfoResponse.setRequestId(_ctx.stringValue("DescribeHcExportInfoResponse.RequestId"));
		describeHcExportInfoResponse.setFileName(_ctx.stringValue("DescribeHcExportInfoResponse.FileName"));
		describeHcExportInfoResponse.setCurrentCount(_ctx.integerValue("DescribeHcExportInfoResponse.CurrentCount"));
		describeHcExportInfoResponse.setLink(_ctx.stringValue("DescribeHcExportInfoResponse.Link"));
		describeHcExportInfoResponse.setProgress(_ctx.integerValue("DescribeHcExportInfoResponse.Progress"));
		describeHcExportInfoResponse.setId(_ctx.longValue("DescribeHcExportInfoResponse.Id"));
		describeHcExportInfoResponse.setTotalCount(_ctx.integerValue("DescribeHcExportInfoResponse.TotalCount"));
		describeHcExportInfoResponse.setGmtCreate(_ctx.longValue("DescribeHcExportInfoResponse.GmtCreate"));
		describeHcExportInfoResponse.setResultStatus(_ctx.stringValue("DescribeHcExportInfoResponse.ResultStatus"));
	 
	 	return describeHcExportInfoResponse;
	}
}