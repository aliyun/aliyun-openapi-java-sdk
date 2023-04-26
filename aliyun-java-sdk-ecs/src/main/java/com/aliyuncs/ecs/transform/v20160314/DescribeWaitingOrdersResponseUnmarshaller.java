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

import com.aliyuncs.ecs.model.v20160314.DescribeWaitingOrdersResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeWaitingOrdersResponse.WaitingOrder;
import com.aliyuncs.ecs.model.v20160314.DescribeWaitingOrdersResponse.WaitingOrder.InstanceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWaitingOrdersResponseUnmarshaller {

	public static DescribeWaitingOrdersResponse unmarshall(DescribeWaitingOrdersResponse describeWaitingOrdersResponse, UnmarshallerContext _ctx) {
		
		describeWaitingOrdersResponse.setRequestId(_ctx.stringValue("DescribeWaitingOrdersResponse.RequestId"));
		describeWaitingOrdersResponse.setTotalCount(_ctx.longValue("DescribeWaitingOrdersResponse.TotalCount"));
		describeWaitingOrdersResponse.setNextToken(_ctx.stringValue("DescribeWaitingOrdersResponse.NextToken"));

		List<WaitingOrder> data = new ArrayList<WaitingOrder>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWaitingOrdersResponse.Data.Length"); i++) {
			WaitingOrder waitingOrder = new WaitingOrder();
			waitingOrder.setWaitingOrderId(_ctx.stringValue("DescribeWaitingOrdersResponse.Data["+ i +"].WaitingOrderId"));
			waitingOrder.setExpireTime(_ctx.stringValue("DescribeWaitingOrdersResponse.Data["+ i +"].ExpireTime"));
			waitingOrder.setCreateTime(_ctx.stringValue("DescribeWaitingOrdersResponse.Data["+ i +"].CreateTime"));
			waitingOrder.setStatus(_ctx.stringValue("DescribeWaitingOrdersResponse.Data["+ i +"].Status"));
			waitingOrder.setInstanceAmount(_ctx.longValue("DescribeWaitingOrdersResponse.Data["+ i +"].InstanceAmount"));
			waitingOrder.setRegionId(_ctx.stringValue("DescribeWaitingOrdersResponse.Data["+ i +"].RegionId"));
			waitingOrder.setZoneId(_ctx.stringValue("DescribeWaitingOrdersResponse.Data["+ i +"].ZoneId"));
			waitingOrder.setChargeType(_ctx.stringValue("DescribeWaitingOrdersResponse.Data["+ i +"].ChargeType"));
			waitingOrder.setInstanceType(_ctx.stringValue("DescribeWaitingOrdersResponse.Data["+ i +"].InstanceType"));
			waitingOrder.setSuccessAmount(_ctx.longValue("DescribeWaitingOrdersResponse.Data["+ i +"].SuccessAmount"));
			waitingOrder.setFailedMessage(_ctx.stringValue("DescribeWaitingOrdersResponse.Data["+ i +"].FailedMessage"));
			waitingOrder.setLxCreateParam(_ctx.stringValue("DescribeWaitingOrdersResponse.Data["+ i +"].LxCreateParam"));

			List<InstanceInfo> instanceInfos = new ArrayList<InstanceInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWaitingOrdersResponse.Data["+ i +"].InstanceInfos.Length"); j++) {
				InstanceInfo instanceInfo = new InstanceInfo();
				instanceInfo.setInstanceId(_ctx.stringValue("DescribeWaitingOrdersResponse.Data["+ i +"].InstanceInfos["+ j +"].InstanceId"));
				instanceInfo.setResultCode(_ctx.stringValue("DescribeWaitingOrdersResponse.Data["+ i +"].InstanceInfos["+ j +"].ResultCode"));

				instanceInfos.add(instanceInfo);
			}
			waitingOrder.setInstanceInfos(instanceInfos);

			data.add(waitingOrder);
		}
		describeWaitingOrdersResponse.setData(data);
	 
	 	return describeWaitingOrdersResponse;
	}
}