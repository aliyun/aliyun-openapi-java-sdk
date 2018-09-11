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

import com.aliyuncs.rds.model.v20140815.DescribeAbnormalDBInstancesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeAbnormalDBInstancesResponse.InstanceResult;
import com.aliyuncs.rds.model.v20140815.DescribeAbnormalDBInstancesResponse.InstanceResult.AbnormalItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAbnormalDBInstancesResponseUnmarshaller {

	public static DescribeAbnormalDBInstancesResponse unmarshall(DescribeAbnormalDBInstancesResponse describeAbnormalDBInstancesResponse, UnmarshallerContext context) {
		
		describeAbnormalDBInstancesResponse.setRequestId(context.stringValue("DescribeAbnormalDBInstancesResponse.RequestId"));
		describeAbnormalDBInstancesResponse.setTotalRecordCount(context.integerValue("DescribeAbnormalDBInstancesResponse.TotalRecordCount"));
		describeAbnormalDBInstancesResponse.setPageNumber(context.integerValue("DescribeAbnormalDBInstancesResponse.PageNumber"));
		describeAbnormalDBInstancesResponse.setPageRecordCount(context.integerValue("DescribeAbnormalDBInstancesResponse.PageRecordCount"));

		List<InstanceResult> items = new ArrayList<InstanceResult>();
		for (int i = 0; i < context.lengthValue("DescribeAbnormalDBInstancesResponse.Items.Length"); i++) {
			InstanceResult instanceResult = new InstanceResult();
			instanceResult.setDBInstanceDescription(context.stringValue("DescribeAbnormalDBInstancesResponse.Items["+ i +"].DBInstanceDescription"));
			instanceResult.setDBInstanceId(context.stringValue("DescribeAbnormalDBInstancesResponse.Items["+ i +"].DBInstanceId"));

			List<AbnormalItem> abnormalItems = new ArrayList<AbnormalItem>();
			for (int j = 0; j < context.lengthValue("DescribeAbnormalDBInstancesResponse.Items["+ i +"].AbnormalItems.Length"); j++) {
				AbnormalItem abnormalItem = new AbnormalItem();
				abnormalItem.setCheckTime(context.stringValue("DescribeAbnormalDBInstancesResponse.Items["+ i +"].AbnormalItems["+ j +"].CheckTime"));
				abnormalItem.setCheckItem(context.stringValue("DescribeAbnormalDBInstancesResponse.Items["+ i +"].AbnormalItems["+ j +"].CheckItem"));
				abnormalItem.setAbnormalReason(context.stringValue("DescribeAbnormalDBInstancesResponse.Items["+ i +"].AbnormalItems["+ j +"].AbnormalReason"));
				abnormalItem.setAbnormalValue(context.stringValue("DescribeAbnormalDBInstancesResponse.Items["+ i +"].AbnormalItems["+ j +"].AbnormalValue"));
				abnormalItem.setAbnormalDetail(context.stringValue("DescribeAbnormalDBInstancesResponse.Items["+ i +"].AbnormalItems["+ j +"].AbnormalDetail"));
				abnormalItem.setAdviceKey(context.stringValue("DescribeAbnormalDBInstancesResponse.Items["+ i +"].AbnormalItems["+ j +"].AdviceKey"));

				List<String> adviseValue = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeAbnormalDBInstancesResponse.Items["+ i +"].AbnormalItems["+ j +"].AdviseValue.Length"); k++) {
					adviseValue.add(context.stringValue("DescribeAbnormalDBInstancesResponse.Items["+ i +"].AbnormalItems["+ j +"].AdviseValue["+ k +"]"));
				}
				abnormalItem.setAdviseValue(adviseValue);

				abnormalItems.add(abnormalItem);
			}
			instanceResult.setAbnormalItems(abnormalItems);

			items.add(instanceResult);
		}
		describeAbnormalDBInstancesResponse.setItems(items);
	 
	 	return describeAbnormalDBInstancesResponse;
	}
}