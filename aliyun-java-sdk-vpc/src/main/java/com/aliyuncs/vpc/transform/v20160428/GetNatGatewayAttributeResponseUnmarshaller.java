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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.GetNatGatewayAttributeResponse;
import com.aliyuncs.vpc.model.v20160428.GetNatGatewayAttributeResponse.BillingConfig;
import com.aliyuncs.vpc.model.v20160428.GetNatGatewayAttributeResponse.DeletionProtectionInfo;
import com.aliyuncs.vpc.model.v20160428.GetNatGatewayAttributeResponse.ForwardTable;
import com.aliyuncs.vpc.model.v20160428.GetNatGatewayAttributeResponse.IpListItem;
import com.aliyuncs.vpc.model.v20160428.GetNatGatewayAttributeResponse.PrivateInfo;
import com.aliyuncs.vpc.model.v20160428.GetNatGatewayAttributeResponse.SnatTable;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNatGatewayAttributeResponseUnmarshaller {

	public static GetNatGatewayAttributeResponse unmarshall(GetNatGatewayAttributeResponse getNatGatewayAttributeResponse, UnmarshallerContext _ctx) {
		
		getNatGatewayAttributeResponse.setRequestId(_ctx.stringValue("GetNatGatewayAttributeResponse.RequestId"));
		getNatGatewayAttributeResponse.setDescription(_ctx.stringValue("GetNatGatewayAttributeResponse.Description"));
		getNatGatewayAttributeResponse.setNatType(_ctx.stringValue("GetNatGatewayAttributeResponse.NatType"));
		getNatGatewayAttributeResponse.setEcsMetricEnabled(_ctx.booleanValue("GetNatGatewayAttributeResponse.EcsMetricEnabled"));
		getNatGatewayAttributeResponse.setVpcId(_ctx.stringValue("GetNatGatewayAttributeResponse.VpcId"));
		getNatGatewayAttributeResponse.setNatGatewayId(_ctx.stringValue("GetNatGatewayAttributeResponse.NatGatewayId"));
		getNatGatewayAttributeResponse.setCreationTime(_ctx.stringValue("GetNatGatewayAttributeResponse.CreationTime"));
		getNatGatewayAttributeResponse.setExpiredTime(_ctx.stringValue("GetNatGatewayAttributeResponse.ExpiredTime"));
		getNatGatewayAttributeResponse.setName(_ctx.stringValue("GetNatGatewayAttributeResponse.Name"));
		getNatGatewayAttributeResponse.setStatus(_ctx.stringValue("GetNatGatewayAttributeResponse.Status"));
		getNatGatewayAttributeResponse.setBusinessStatus(_ctx.stringValue("GetNatGatewayAttributeResponse.BusinessStatus"));
		getNatGatewayAttributeResponse.setRegionId(_ctx.stringValue("GetNatGatewayAttributeResponse.RegionId"));
		getNatGatewayAttributeResponse.setResourceGroupId(_ctx.stringValue("GetNatGatewayAttributeResponse.ResourceGroupId"));

		ForwardTable forwardTable = new ForwardTable();
		forwardTable.setForwardTableId(_ctx.stringValue("GetNatGatewayAttributeResponse.ForwardTable.ForwardTableId"));
		forwardTable.setForwardEntryCount(_ctx.integerValue("GetNatGatewayAttributeResponse.ForwardTable.ForwardEntryCount"));
		getNatGatewayAttributeResponse.setForwardTable(forwardTable);

		SnatTable snatTable = new SnatTable();
		snatTable.setSnatTableId(_ctx.stringValue("GetNatGatewayAttributeResponse.SnatTable.SnatTableId"));
		snatTable.setSnatEntryCount(_ctx.integerValue("GetNatGatewayAttributeResponse.SnatTable.SnatEntryCount"));
		getNatGatewayAttributeResponse.setSnatTable(snatTable);

		BillingConfig billingConfig = new BillingConfig();
		billingConfig.setSpec(_ctx.stringValue("GetNatGatewayAttributeResponse.BillingConfig.Spec"));
		billingConfig.setInternetChargeType(_ctx.stringValue("GetNatGatewayAttributeResponse.BillingConfig.InternetChargeType"));
		billingConfig.setInstanceChargeType(_ctx.stringValue("GetNatGatewayAttributeResponse.BillingConfig.InstanceChargeType"));
		billingConfig.setAutoPay(_ctx.stringValue("GetNatGatewayAttributeResponse.BillingConfig.AutoPay"));
		getNatGatewayAttributeResponse.setBillingConfig(billingConfig);

		PrivateInfo privateInfo = new PrivateInfo();
		privateInfo.setEniInstanceId(_ctx.stringValue("GetNatGatewayAttributeResponse.PrivateInfo.EniInstanceId"));
		privateInfo.setIzNo(_ctx.stringValue("GetNatGatewayAttributeResponse.PrivateInfo.IzNo"));
		privateInfo.setMaxBandwidth(_ctx.integerValue("GetNatGatewayAttributeResponse.PrivateInfo.MaxBandwidth"));
		privateInfo.setPrivateIpAddress(_ctx.stringValue("GetNatGatewayAttributeResponse.PrivateInfo.PrivateIpAddress"));
		privateInfo.setVswitchId(_ctx.stringValue("GetNatGatewayAttributeResponse.PrivateInfo.VswitchId"));
		getNatGatewayAttributeResponse.setPrivateInfo(privateInfo);

		DeletionProtectionInfo deletionProtectionInfo = new DeletionProtectionInfo();
		deletionProtectionInfo.setEnabled(_ctx.booleanValue("GetNatGatewayAttributeResponse.DeletionProtectionInfo.Enabled"));
		getNatGatewayAttributeResponse.setDeletionProtectionInfo(deletionProtectionInfo);

		List<IpListItem> ipList = new ArrayList<IpListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetNatGatewayAttributeResponse.IpList.Length"); i++) {
			IpListItem ipListItem = new IpListItem();
			ipListItem.setIpAddress(_ctx.stringValue("GetNatGatewayAttributeResponse.IpList["+ i +"].IpAddress"));
			ipListItem.setAllocationId(_ctx.stringValue("GetNatGatewayAttributeResponse.IpList["+ i +"].AllocationId"));
			ipListItem.setUsingStatus(_ctx.stringValue("GetNatGatewayAttributeResponse.IpList["+ i +"].UsingStatus"));

			ipList.add(ipListItem);
		}
		getNatGatewayAttributeResponse.setIpList(ipList);
	 
	 	return getNatGatewayAttributeResponse;
	}
}