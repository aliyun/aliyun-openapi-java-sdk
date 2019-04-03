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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeRestoreOrderResponse;
import com.aliyuncs.drds.model.v20190123.DescribeRestoreOrderResponse.RestoreOrderDO;
import com.aliyuncs.drds.model.v20190123.DescribeRestoreOrderResponse.RestoreOrderDO.DrdsOrderDOListItem;
import com.aliyuncs.drds.model.v20190123.DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestoreOrderResponseUnmarshaller {

	public static DescribeRestoreOrderResponse unmarshall(DescribeRestoreOrderResponse describeRestoreOrderResponse, UnmarshallerContext context) {
		
		describeRestoreOrderResponse.setRequestId(context.stringValue("DescribeRestoreOrderResponse.RequestId"));
		describeRestoreOrderResponse.setSuccess(context.booleanValue("DescribeRestoreOrderResponse.Success"));

		RestoreOrderDO restoreOrderDO = new RestoreOrderDO();

		List<DrdsOrderDOListItem> drdsOrderDOList = new ArrayList<DrdsOrderDOListItem>();
		for (int i = 0; i < context.lengthValue("DescribeRestoreOrderResponse.RestoreOrderDO.DrdsOrderDOList.Length"); i++) {
			DrdsOrderDOListItem drdsOrderDOListItem = new DrdsOrderDOListItem();
			drdsOrderDOListItem.setRegionId(context.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.DrdsOrderDOList["+ i +"].RegionId"));
			drdsOrderDOListItem.setAzoneId(context.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.DrdsOrderDOList["+ i +"].AzoneId"));
			drdsOrderDOListItem.setNetwork(context.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.DrdsOrderDOList["+ i +"].Network"));
			drdsOrderDOListItem.setVpcId(context.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.DrdsOrderDOList["+ i +"].VpcId"));
			drdsOrderDOListItem.setVSwtichId(context.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.DrdsOrderDOList["+ i +"].VSwtichId"));
			drdsOrderDOListItem.setInstSpec(context.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.DrdsOrderDOList["+ i +"].InstSpec"));

			drdsOrderDOList.add(drdsOrderDOListItem);
		}
		restoreOrderDO.setDrdsOrderDOList(drdsOrderDOList);

		List<RdsOrderDOListItem> rdsOrderDOList = new ArrayList<RdsOrderDOListItem>();
		for (int i = 0; i < context.lengthValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList.Length"); i++) {
			RdsOrderDOListItem rdsOrderDOListItem = new RdsOrderDOListItem();
			rdsOrderDOListItem.setRegionId(context.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList["+ i +"].RegionId"));
			rdsOrderDOListItem.setAzoneId(context.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList["+ i +"].AzoneId"));
			rdsOrderDOListItem.setNetwork(context.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList["+ i +"].Network"));
			rdsOrderDOListItem.setVpcId(context.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList["+ i +"].VpcId"));
			rdsOrderDOListItem.setVSwtichId(context.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList["+ i +"].VSwtichId"));
			rdsOrderDOListItem.setDbInstanceStorage(context.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList["+ i +"].DbInstanceStorage"));
			rdsOrderDOListItem.setNetwork1(context.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList["+ i +"].Network"));
			rdsOrderDOListItem.setNum(context.longValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList["+ i +"].Num"));

			rdsOrderDOList.add(rdsOrderDOListItem);
		}
		restoreOrderDO.setRdsOrderDOList(rdsOrderDOList);
		describeRestoreOrderResponse.setRestoreOrderDO(restoreOrderDO);
	 
	 	return describeRestoreOrderResponse;
	}
}