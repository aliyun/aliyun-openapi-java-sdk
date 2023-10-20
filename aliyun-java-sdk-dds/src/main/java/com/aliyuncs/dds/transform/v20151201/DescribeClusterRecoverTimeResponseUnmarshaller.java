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

import com.aliyuncs.dds.model.v20151201.DescribeClusterRecoverTimeResponse;
import com.aliyuncs.dds.model.v20151201.DescribeClusterRecoverTimeResponse.AvailableRestoreTime;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterRecoverTimeResponseUnmarshaller {

	public static DescribeClusterRecoverTimeResponse unmarshall(DescribeClusterRecoverTimeResponse describeClusterRecoverTimeResponse, UnmarshallerContext _ctx) {
		
		describeClusterRecoverTimeResponse.setRequestId(_ctx.stringValue("DescribeClusterRecoverTimeResponse.RequestId"));

		List<AvailableRestoreTime> restoreRanges = new ArrayList<AvailableRestoreTime>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterRecoverTimeResponse.RestoreRanges.Length"); i++) {
			AvailableRestoreTime availableRestoreTime = new AvailableRestoreTime();
			availableRestoreTime.setRestoreBeginTime(_ctx.stringValue("DescribeClusterRecoverTimeResponse.RestoreRanges["+ i +"].RestoreBeginTime"));
			availableRestoreTime.setRestoreEndTime(_ctx.stringValue("DescribeClusterRecoverTimeResponse.RestoreRanges["+ i +"].RestoreEndTime"));
			availableRestoreTime.setRestoreType(_ctx.stringValue("DescribeClusterRecoverTimeResponse.RestoreRanges["+ i +"].RestoreType"));

			restoreRanges.add(availableRestoreTime);
		}
		describeClusterRecoverTimeResponse.setRestoreRanges(restoreRanges);
	 
	 	return describeClusterRecoverTimeResponse;
	}
}