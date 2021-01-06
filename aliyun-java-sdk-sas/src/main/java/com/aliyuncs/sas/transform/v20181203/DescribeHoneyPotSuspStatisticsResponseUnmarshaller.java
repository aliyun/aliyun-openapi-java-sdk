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

import com.aliyuncs.sas.model.v20181203.DescribeHoneyPotSuspStatisticsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeHoneyPotSuspStatisticsResponse.SuspHoneyPotStatisticsResponseItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHoneyPotSuspStatisticsResponseUnmarshaller {

	public static DescribeHoneyPotSuspStatisticsResponse unmarshall(DescribeHoneyPotSuspStatisticsResponse describeHoneyPotSuspStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeHoneyPotSuspStatisticsResponse.setRequestId(_ctx.stringValue("DescribeHoneyPotSuspStatisticsResponse.RequestId"));

		List<SuspHoneyPotStatisticsResponseItem> suspHoneyPotStatisticsResponse = new ArrayList<SuspHoneyPotStatisticsResponseItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHoneyPotSuspStatisticsResponse.SuspHoneyPotStatisticsResponse.Length"); i++) {
			SuspHoneyPotStatisticsResponseItem suspHoneyPotStatisticsResponseItem = new SuspHoneyPotStatisticsResponseItem();
			suspHoneyPotStatisticsResponseItem.setCount(_ctx.integerValue("DescribeHoneyPotSuspStatisticsResponse.SuspHoneyPotStatisticsResponse["+ i +"].Count"));
			suspHoneyPotStatisticsResponseItem.setName(_ctx.stringValue("DescribeHoneyPotSuspStatisticsResponse.SuspHoneyPotStatisticsResponse["+ i +"].Name"));
			suspHoneyPotStatisticsResponseItem.setType(_ctx.stringValue("DescribeHoneyPotSuspStatisticsResponse.SuspHoneyPotStatisticsResponse["+ i +"].Type"));
			suspHoneyPotStatisticsResponseItem.setInstanceId(_ctx.stringValue("DescribeHoneyPotSuspStatisticsResponse.SuspHoneyPotStatisticsResponse["+ i +"].InstanceId"));
			suspHoneyPotStatisticsResponseItem.setInstanceName(_ctx.stringValue("DescribeHoneyPotSuspStatisticsResponse.SuspHoneyPotStatisticsResponse["+ i +"].InstanceName"));
			suspHoneyPotStatisticsResponseItem.setVpcId(_ctx.stringValue("DescribeHoneyPotSuspStatisticsResponse.SuspHoneyPotStatisticsResponse["+ i +"].VpcId"));
			suspHoneyPotStatisticsResponseItem.setVpcName(_ctx.stringValue("DescribeHoneyPotSuspStatisticsResponse.SuspHoneyPotStatisticsResponse["+ i +"].VpcName"));

			suspHoneyPotStatisticsResponse.add(suspHoneyPotStatisticsResponseItem);
		}
		describeHoneyPotSuspStatisticsResponse.setSuspHoneyPotStatisticsResponse(suspHoneyPotStatisticsResponse);
	 
	 	return describeHoneyPotSuspStatisticsResponse;
	}
}