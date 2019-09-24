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

import com.aliyuncs.hdr.model.v20170925.DescribeRecoveryPointsResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeRecoveryPointsResponse.RecoveryPoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecoveryPointsResponseUnmarshaller {

	public static DescribeRecoveryPointsResponse unmarshall(DescribeRecoveryPointsResponse describeRecoveryPointsResponse, UnmarshallerContext _ctx) {
		
		describeRecoveryPointsResponse.setRequestId(_ctx.stringValue("DescribeRecoveryPointsResponse.RequestId"));
		describeRecoveryPointsResponse.setSuccess(_ctx.booleanValue("DescribeRecoveryPointsResponse.Success"));
		describeRecoveryPointsResponse.setCode(_ctx.stringValue("DescribeRecoveryPointsResponse.Code"));
		describeRecoveryPointsResponse.setMessage(_ctx.stringValue("DescribeRecoveryPointsResponse.Message"));
		describeRecoveryPointsResponse.setTotalCount(_ctx.integerValue("DescribeRecoveryPointsResponse.TotalCount"));

		List<RecoveryPoint> recoveryPoints = new ArrayList<RecoveryPoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecoveryPointsResponse.RecoveryPoints.Length"); i++) {
			RecoveryPoint recoveryPoint = new RecoveryPoint();
			recoveryPoint.setRecoveryPointTime(_ctx.longValue("DescribeRecoveryPointsResponse.RecoveryPoints["+ i +"].RecoveryPointTime"));
			recoveryPoint.setRecoveryPointId(_ctx.stringValue("DescribeRecoveryPointsResponse.RecoveryPoints["+ i +"].RecoveryPointId"));
			recoveryPoint.setApplicationConsistent(_ctx.booleanValue("DescribeRecoveryPointsResponse.RecoveryPoints["+ i +"].ApplicationConsistent"));
			recoveryPoint.setUsed(_ctx.booleanValue("DescribeRecoveryPointsResponse.RecoveryPoints["+ i +"].Used"));

			recoveryPoints.add(recoveryPoint);
		}
		describeRecoveryPointsResponse.setRecoveryPoints(recoveryPoints);
	 
	 	return describeRecoveryPointsResponse;
	}
}