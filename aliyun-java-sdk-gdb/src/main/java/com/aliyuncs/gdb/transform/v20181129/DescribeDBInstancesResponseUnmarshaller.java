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

package com.aliyuncs.gdb.transform.v20181129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gdb.model.v20181129.DescribeDBInstancesResponse;
import com.aliyuncs.gdb.model.v20181129.DescribeDBInstancesResponse.Data;
import com.aliyuncs.gdb.model.v20181129.DescribeDBInstancesResponse.Data.DBInstanceVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesResponseUnmarshaller {

	public static DescribeDBInstancesResponse unmarshall(DescribeDBInstancesResponse describeDBInstancesResponse, UnmarshallerContext context) {
		
		describeDBInstancesResponse.setRequestId(context.stringValue("DescribeDBInstancesResponse.RequestId"));
		describeDBInstancesResponse.setCode(context.stringValue("DescribeDBInstancesResponse.Code"));
		describeDBInstancesResponse.setMessage(context.stringValue("DescribeDBInstancesResponse.Message"));
		describeDBInstancesResponse.setSuccess(context.stringValue("DescribeDBInstancesResponse.Success"));

		Data data = new Data();
		data.setPageNumber(context.integerValue("DescribeDBInstancesResponse.Data.PageNumber"));
		data.setTotalRecordCount(context.integerValue("DescribeDBInstancesResponse.Data.TotalRecordCount"));
		data.setPageRecordCount(context.integerValue("DescribeDBInstancesResponse.Data.PageRecordCount"));

		List<DBInstanceVO> items = new ArrayList<DBInstanceVO>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstancesResponse.Data.Items.Length"); i++) {
			DBInstanceVO dBInstanceVO = new DBInstanceVO();
			dBInstanceVO.setDbInstanceId(context.stringValue("DescribeDBInstancesResponse.Data.Items["+ i +"].DbInstanceId"));
			dBInstanceVO.setInstanceDescription(context.stringValue("DescribeDBInstancesResponse.Data.Items["+ i +"].InstanceDescription"));
			dBInstanceVO.setPayType(context.stringValue("DescribeDBInstancesResponse.Data.Items["+ i +"].PayType"));
			dBInstanceVO.setInstanceStatus(context.stringValue("DescribeDBInstancesResponse.Data.Items["+ i +"].InstanceStatus"));
			dBInstanceVO.setRegionId(context.stringValue("DescribeDBInstancesResponse.Data.Items["+ i +"].RegionId"));
			dBInstanceVO.setZoneId(context.stringValue("DescribeDBInstancesResponse.Data.Items["+ i +"].ZoneId"));
			dBInstanceVO.setVpcId(context.stringValue("DescribeDBInstancesResponse.Data.Items["+ i +"].VpcId"));
			dBInstanceVO.setVSwitchId(context.stringValue("DescribeDBInstancesResponse.Data.Items["+ i +"].VSwitchId"));
			dBInstanceVO.setInstanceType(context.stringValue("DescribeDBInstancesResponse.Data.Items["+ i +"].InstanceType"));
			dBInstanceVO.setStorageType(context.stringValue("DescribeDBInstancesResponse.Data.Items["+ i +"].StorageType"));

			items.add(dBInstanceVO);
		}
		data.setItems(items);
		describeDBInstancesResponse.setData(data);
	 
	 	return describeDBInstancesResponse;
	}
}