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

package com.aliyuncs.ecs.transform.v20160314;

import com.aliyuncs.ecs.model.v20160314.DescribeReservationDemandCommittedAmountResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeReservationDemandCommittedAmountResponse.CommittedAmountInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReservationDemandCommittedAmountResponseUnmarshaller {

	public static DescribeReservationDemandCommittedAmountResponse unmarshall(DescribeReservationDemandCommittedAmountResponse describeReservationDemandCommittedAmountResponse, UnmarshallerContext _ctx) {
		
		describeReservationDemandCommittedAmountResponse.setRequestId(_ctx.stringValue("DescribeReservationDemandCommittedAmountResponse.RequestId"));

		CommittedAmountInfo committedAmountInfo = new CommittedAmountInfo();
		committedAmountInfo.setCommittedAmount(_ctx.floatValue("DescribeReservationDemandCommittedAmountResponse.CommittedAmountInfo.CommittedAmount"));
		committedAmountInfo.setCurrency(_ctx.stringValue("DescribeReservationDemandCommittedAmountResponse.CommittedAmountInfo.Currency"));
		describeReservationDemandCommittedAmountResponse.setCommittedAmountInfo(committedAmountInfo);
	 
	 	return describeReservationDemandCommittedAmountResponse;
	}
}