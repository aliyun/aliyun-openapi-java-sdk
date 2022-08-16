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
import com.aliyuncs.drds.model.v20190123.DescribeRestoreOrderResponse.RestoreOrderDO.PolarOrderDOListItem;
import com.aliyuncs.drds.model.v20190123.DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestoreOrderResponseUnmarshaller {

	public static DescribeRestoreOrderResponse unmarshall(DescribeRestoreOrderResponse describeRestoreOrderResponse, UnmarshallerContext _ctx) {
		
		describeRestoreOrderResponse.setRequestId(_ctx.stringValue("DescribeRestoreOrderResponse.RequestId"));
		describeRestoreOrderResponse.setSuccess(_ctx.booleanValue("DescribeRestoreOrderResponse.Success"));

		RestoreOrderDO restoreOrderDO = new RestoreOrderDO();

		List<DrdsOrderDOListItem> drdsOrderDOList = new ArrayList<DrdsOrderDOListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreOrderResponse.RestoreOrderDO.DrdsOrderDOList.Length"); i++) {
			DrdsOrderDOListItem drdsOrderDOListItem = new DrdsOrderDOListItem();
			drdsOrderDOListItem.setVpcId(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.DrdsOrderDOList["+ i +"].VpcId"));
			drdsOrderDOListItem.setNetwork(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.DrdsOrderDOList["+ i +"].Network"));
			drdsOrderDOListItem.setVSwtichId(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.DrdsOrderDOList["+ i +"].VSwtichId"));
			drdsOrderDOListItem.setInstSpec(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.DrdsOrderDOList["+ i +"].InstSpec"));
			drdsOrderDOListItem.setAzoneId(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.DrdsOrderDOList["+ i +"].AzoneId"));
			drdsOrderDOListItem.setRegionId(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.DrdsOrderDOList["+ i +"].RegionId"));

			drdsOrderDOList.add(drdsOrderDOListItem);
		}
		restoreOrderDO.setDrdsOrderDOList(drdsOrderDOList);

		List<RdsOrderDOListItem> rdsOrderDOList = new ArrayList<RdsOrderDOListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList.Length"); i++) {
			RdsOrderDOListItem rdsOrderDOListItem = new RdsOrderDOListItem();
			rdsOrderDOListItem.setNetwork(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList["+ i +"].Network"));
			rdsOrderDOListItem.setVersion(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList["+ i +"].Version"));
			rdsOrderDOListItem.setInstanceClass(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList["+ i +"].InstanceClass"));
			rdsOrderDOListItem.setDbInstanceStorage(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList["+ i +"].DbInstanceStorage"));
			rdsOrderDOListItem.setNum(_ctx.longValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList["+ i +"].Num"));
			rdsOrderDOListItem.setEngine(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList["+ i +"].Engine"));
			rdsOrderDOListItem.setAzoneId(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList["+ i +"].AzoneId"));
			rdsOrderDOListItem.setRegionId(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.RdsOrderDOList["+ i +"].RegionId"));

			rdsOrderDOList.add(rdsOrderDOListItem);
		}
		restoreOrderDO.setRdsOrderDOList(rdsOrderDOList);

		List<PolarOrderDOListItem> polarOrderDOList = new ArrayList<PolarOrderDOListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreOrderResponse.RestoreOrderDO.PolarOrderDOList.Length"); i++) {
			PolarOrderDOListItem polarOrderDOListItem = new PolarOrderDOListItem();
			polarOrderDOListItem.setNetwork(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.PolarOrderDOList["+ i +"].Network"));
			polarOrderDOListItem.setVersion(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.PolarOrderDOList["+ i +"].Version"));
			polarOrderDOListItem.setInstanceClass(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.PolarOrderDOList["+ i +"].InstanceClass"));
			polarOrderDOListItem.setDbInstanceStorage(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.PolarOrderDOList["+ i +"].DbInstanceStorage"));
			polarOrderDOListItem.setNum(_ctx.longValue("DescribeRestoreOrderResponse.RestoreOrderDO.PolarOrderDOList["+ i +"].Num"));
			polarOrderDOListItem.setEngine(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.PolarOrderDOList["+ i +"].Engine"));
			polarOrderDOListItem.setAzoneId(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.PolarOrderDOList["+ i +"].AzoneId"));
			polarOrderDOListItem.setRegionId(_ctx.stringValue("DescribeRestoreOrderResponse.RestoreOrderDO.PolarOrderDOList["+ i +"].RegionId"));

			polarOrderDOList.add(polarOrderDOListItem);
		}
		restoreOrderDO.setPolarOrderDOList(polarOrderDOList);
		describeRestoreOrderResponse.setRestoreOrderDO(restoreOrderDO);
	 
	 	return describeRestoreOrderResponse;
	}
}