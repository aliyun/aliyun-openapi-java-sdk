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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeInstanceRecoverTimeResponse;
import com.aliyuncs.dds.model.v20151201.DescribeInstanceRecoverTimeResponse.AvailableRestoreTime;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceRecoverTimeResponseUnmarshaller {

	public static DescribeInstanceRecoverTimeResponse unmarshall(DescribeInstanceRecoverTimeResponse describeInstanceRecoverTimeResponse, UnmarshallerContext _ctx) {
		
		describeInstanceRecoverTimeResponse.setRequestId(_ctx.stringValue("DescribeInstanceRecoverTimeResponse.RequestId"));

		List<AvailableRestoreTime> restoreRanges = new ArrayList<AvailableRestoreTime>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceRecoverTimeResponse.RestoreRanges.Length"); i++) {
			AvailableRestoreTime availableRestoreTime = new AvailableRestoreTime();
			availableRestoreTime.setRestoreBeginTime(_ctx.stringValue("DescribeInstanceRecoverTimeResponse.RestoreRanges["+ i +"].RestoreBeginTime"));
			availableRestoreTime.setRestoreEndTime(_ctx.stringValue("DescribeInstanceRecoverTimeResponse.RestoreRanges["+ i +"].RestoreEndTime"));
			availableRestoreTime.setRestoreType(_ctx.stringValue("DescribeInstanceRecoverTimeResponse.RestoreRanges["+ i +"].RestoreType"));

			restoreRanges.add(availableRestoreTime);
		}
		describeInstanceRecoverTimeResponse.setRestoreRanges(restoreRanges);
	 
	 	return describeInstanceRecoverTimeResponse;
	}
}