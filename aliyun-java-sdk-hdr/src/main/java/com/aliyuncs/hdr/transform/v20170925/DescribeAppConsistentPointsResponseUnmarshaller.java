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

package com.aliyuncs.hdr.transform.v20170925;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hdr.model.v20170925.DescribeAppConsistentPointsResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeAppConsistentPointsResponse.AppConsistentPoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppConsistentPointsResponseUnmarshaller {

	public static DescribeAppConsistentPointsResponse unmarshall(DescribeAppConsistentPointsResponse describeAppConsistentPointsResponse, UnmarshallerContext _ctx) {
		
		describeAppConsistentPointsResponse.setRequestId(_ctx.stringValue("DescribeAppConsistentPointsResponse.RequestId"));
		describeAppConsistentPointsResponse.setSuccess(_ctx.booleanValue("DescribeAppConsistentPointsResponse.Success"));
		describeAppConsistentPointsResponse.setCode(_ctx.stringValue("DescribeAppConsistentPointsResponse.Code"));
		describeAppConsistentPointsResponse.setMessage(_ctx.stringValue("DescribeAppConsistentPointsResponse.Message"));
		describeAppConsistentPointsResponse.setTotalCount(_ctx.integerValue("DescribeAppConsistentPointsResponse.TotalCount"));

		List<AppConsistentPoint> appConsistentPoints = new ArrayList<AppConsistentPoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppConsistentPointsResponse.AppConsistentPoints.Length"); i++) {
			AppConsistentPoint appConsistentPoint = new AppConsistentPoint();
			appConsistentPoint.setSnapshotTime(_ctx.longValue("DescribeAppConsistentPointsResponse.AppConsistentPoints["+ i +"].SnapshotTime"));
			appConsistentPoint.setSnapshotId(_ctx.stringValue("DescribeAppConsistentPointsResponse.AppConsistentPoints["+ i +"].SnapshotId"));

			appConsistentPoints.add(appConsistentPoint);
		}
		describeAppConsistentPointsResponse.setAppConsistentPoints(appConsistentPoints);
	 
	 	return describeAppConsistentPointsResponse;
	}
}