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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeCurrentModifyOrderResponse;
import com.aliyuncs.rds.model.v20140815.DescribeCurrentModifyOrderResponse.ModifyOrderItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCurrentModifyOrderResponseUnmarshaller {

	public static DescribeCurrentModifyOrderResponse unmarshall(DescribeCurrentModifyOrderResponse describeCurrentModifyOrderResponse, UnmarshallerContext _ctx) {
		
		describeCurrentModifyOrderResponse.setRequestId(_ctx.stringValue("DescribeCurrentModifyOrderResponse.RequestId"));

		List<ModifyOrderItem> modifyOrder = new ArrayList<ModifyOrderItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCurrentModifyOrderResponse.ModifyOrder.Length"); i++) {
			ModifyOrderItem modifyOrderItem = new ModifyOrderItem();
			modifyOrderItem.setDbInstanceId(_ctx.stringValue("DescribeCurrentModifyOrderResponse.ModifyOrder["+ i +"].DbInstanceId"));
			modifyOrderItem.setTargetDBInstanceClass(_ctx.stringValue("DescribeCurrentModifyOrderResponse.ModifyOrder["+ i +"].TargetDBInstanceClass"));
			modifyOrderItem.setStorage(_ctx.stringValue("DescribeCurrentModifyOrderResponse.ModifyOrder["+ i +"].Storage"));
			modifyOrderItem.setMemoryClass(_ctx.stringValue("DescribeCurrentModifyOrderResponse.ModifyOrder["+ i +"].MemoryClass"));
			modifyOrderItem.setCpu(_ctx.stringValue("DescribeCurrentModifyOrderResponse.ModifyOrder["+ i +"].Cpu"));
			modifyOrderItem.setClassGroup(_ctx.stringValue("DescribeCurrentModifyOrderResponse.ModifyOrder["+ i +"].ClassGroup"));
			modifyOrderItem.setEffectiveTime(_ctx.stringValue("DescribeCurrentModifyOrderResponse.ModifyOrder["+ i +"].EffectiveTime"));
			modifyOrderItem.setStatus(_ctx.stringValue("DescribeCurrentModifyOrderResponse.ModifyOrder["+ i +"].Status"));
			modifyOrderItem.setMark(_ctx.stringValue("DescribeCurrentModifyOrderResponse.ModifyOrder["+ i +"].Mark"));

			modifyOrder.add(modifyOrderItem);
		}
		describeCurrentModifyOrderResponse.setModifyOrder(modifyOrder);
	 
	 	return describeCurrentModifyOrderResponse;
	}
}