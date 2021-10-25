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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.DescribeDiskOpsActivityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiskOpsActivityResponseUnmarshaller {

	public static DescribeDiskOpsActivityResponse unmarshall(DescribeDiskOpsActivityResponse describeDiskOpsActivityResponse, UnmarshallerContext _ctx) {
		
		describeDiskOpsActivityResponse.setRequestId(_ctx.stringValue("DescribeDiskOpsActivityResponse.RequestId"));
		describeDiskOpsActivityResponse.setClusterType(_ctx.stringValue("DescribeDiskOpsActivityResponse.ClusterType"));
		describeDiskOpsActivityResponse.setCurrentActivity(_ctx.stringValue("DescribeDiskOpsActivityResponse.CurrentActivity"));
		describeDiskOpsActivityResponse.setActivityState(_ctx.stringValue("DescribeDiskOpsActivityResponse.ActivityState"));
		describeDiskOpsActivityResponse.setErrorMessage(_ctx.stringValue("DescribeDiskOpsActivityResponse.ErrorMessage"));
		describeDiskOpsActivityResponse.setNeedReboot(_ctx.booleanValue("DescribeDiskOpsActivityResponse.NeedReboot"));
	 
	 	return describeDiskOpsActivityResponse;
	}
}