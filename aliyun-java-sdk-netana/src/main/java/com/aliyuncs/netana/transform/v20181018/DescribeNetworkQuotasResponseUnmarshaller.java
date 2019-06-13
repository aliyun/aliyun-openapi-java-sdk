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

package com.aliyuncs.netana.transform.v20181018;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.netana.model.v20181018.DescribeNetworkQuotasResponse;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkQuotasResponse.NetworkQuota;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkQuotasResponse.NetworkQuota.NetworkQuotaInfo;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkQuotasResponse.NetworkQuota.Privilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkQuotasResponseUnmarshaller {

	public static DescribeNetworkQuotasResponse unmarshall(DescribeNetworkQuotasResponse describeNetworkQuotasResponse, UnmarshallerContext context) {
		
		describeNetworkQuotasResponse.setRequestId(context.stringValue("DescribeNetworkQuotasResponse.RequestId"));
		describeNetworkQuotasResponse.setTotalCount(context.integerValue("DescribeNetworkQuotasResponse.TotalCount"));

		List<NetworkQuota> networkQuotas = new ArrayList<NetworkQuota>();
		for (int i = 0; i < context.lengthValue("DescribeNetworkQuotasResponse.NetworkQuotas.Length"); i++) {
			NetworkQuota networkQuota = new NetworkQuota();
			networkQuota.setProduct(context.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].Product"));
			networkQuota.setResourceType(context.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].ResourceType"));

			List<Privilege> privileges = new ArrayList<Privilege>();
			for (int j = 0; j < context.lengthValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].Privileges.Length"); j++) {
				Privilege privilege = new Privilege();
				privilege.setPrivilege(context.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].Privileges["+ j +"].Privilege"));
				privilege.setDescription(context.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].Privileges["+ j +"].Description"));
				privilege.setEnabled(context.booleanValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].Privileges["+ j +"].Enabled"));
				privilege.setDescriptionCn(context.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].Privileges["+ j +"].DescriptionCn"));

				privileges.add(privilege);
			}
			networkQuota.setPrivileges(privileges);

			List<NetworkQuotaInfo> networkQuotaInfos = new ArrayList<NetworkQuotaInfo>();
			for (int j = 0; j < context.lengthValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos.Length"); j++) {
				NetworkQuotaInfo networkQuotaInfo = new NetworkQuotaInfo();
				networkQuotaInfo.setQuotaName(context.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].QuotaName"));
				networkQuotaInfo.setQuotaDescription(context.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].QuotaDescription"));
				networkQuotaInfo.setQuotaQuantity(context.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].QuotaQuantity"));
				networkQuotaInfo.setInstanceQuantity(context.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].InstanceQuantity"));
				networkQuotaInfo.setCanExceptional(context.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].CanExceptional"));
				networkQuotaInfo.setQuotaDescriptionCn(context.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].QuotaDescriptionCn"));
				networkQuotaInfo.setSequence(context.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].Sequence"));

				networkQuotaInfos.add(networkQuotaInfo);
			}
			networkQuota.setNetworkQuotaInfos(networkQuotaInfos);

			networkQuotas.add(networkQuota);
		}
		describeNetworkQuotasResponse.setNetworkQuotas(networkQuotas);
	 
	 	return describeNetworkQuotasResponse;
	}
}