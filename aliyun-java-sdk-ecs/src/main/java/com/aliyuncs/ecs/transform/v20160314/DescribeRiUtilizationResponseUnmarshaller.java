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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeRiUtilizationResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeRiUtilizationResponse.Utilization;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRiUtilizationResponseUnmarshaller {

	public static DescribeRiUtilizationResponse unmarshall(DescribeRiUtilizationResponse describeRiUtilizationResponse, UnmarshallerContext _ctx) {
		
		describeRiUtilizationResponse.setRequestId(_ctx.stringValue("DescribeRiUtilizationResponse.RequestId"));

		List<Utilization> utilizations = new ArrayList<Utilization>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRiUtilizationResponse.Utilizations.Length"); i++) {
			Utilization utilization = new Utilization();
			utilization.setReservedInstanceId(_ctx.stringValue("DescribeRiUtilizationResponse.Utilizations["+ i +"].ReservedInstanceId"));
			utilization.setUtilization(_ctx.stringValue("DescribeRiUtilizationResponse.Utilizations["+ i +"].Utilization"));

			utilizations.add(utilization);
		}
		describeRiUtilizationResponse.setUtilizations(utilizations);
	 
	 	return describeRiUtilizationResponse;
	}
}