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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeLatestScanTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLatestScanTaskResponseUnmarshaller {

	public static DescribeLatestScanTaskResponse unmarshall(DescribeLatestScanTaskResponse describeLatestScanTaskResponse, UnmarshallerContext _ctx) {
		
		describeLatestScanTaskResponse.setRequestId(_ctx.stringValue("DescribeLatestScanTaskResponse.RequestId"));
		describeLatestScanTaskResponse.setTargetInfo(_ctx.stringValue("DescribeLatestScanTaskResponse.TargetInfo"));
		describeLatestScanTaskResponse.setLastCheckTime(_ctx.longValue("DescribeLatestScanTaskResponse.LastCheckTime"));
		describeLatestScanTaskResponse.setRiskNum(_ctx.integerValue("DescribeLatestScanTaskResponse.RiskNum"));

		List<String> uuids = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLatestScanTaskResponse.Uuids.Length"); i++) {
			uuids.add(_ctx.stringValue("DescribeLatestScanTaskResponse.Uuids["+ i +"]"));
		}
		describeLatestScanTaskResponse.setUuids(uuids);
	 
	 	return describeLatestScanTaskResponse;
	}
}