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
import com.aliyuncs.netana.model.v20181018.DescribeNetworkQuotasResponse.NetworkQuota.NetworkQuotaInfo.QuotaDetail;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkQuotasResponse.NetworkQuota.Privilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkQuotasResponseUnmarshaller {

	public static DescribeNetworkQuotasResponse unmarshall(DescribeNetworkQuotasResponse describeNetworkQuotasResponse, UnmarshallerContext _ctx) {
		
		describeNetworkQuotasResponse.setRequestId(_ctx.stringValue("DescribeNetworkQuotasResponse.RequestId"));
		describeNetworkQuotasResponse.setTotalCount(_ctx.integerValue("DescribeNetworkQuotasResponse.TotalCount"));

		List<NetworkQuota> networkQuotas = new ArrayList<NetworkQuota>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkQuotasResponse.NetworkQuotas.Length"); i++) {
			NetworkQuota networkQuota = new NetworkQuota();
			networkQuota.setResourceType(_ctx.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].ResourceType"));
			networkQuota.setProduct(_ctx.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].Product"));

			List<Privilege> privileges = new ArrayList<Privilege>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].Privileges.Length"); j++) {
				Privilege privilege = new Privilege();
				privilege.setPrivilege(_ctx.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].Privileges["+ j +"].Privilege"));
				privilege.setDescription(_ctx.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].Privileges["+ j +"].Description"));
				privilege.setDescriptionCn(_ctx.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].Privileges["+ j +"].DescriptionCn"));
				privilege.setEnabled(_ctx.booleanValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].Privileges["+ j +"].Enabled"));

				privileges.add(privilege);
			}
			networkQuota.setPrivileges(privileges);

			List<NetworkQuotaInfo> networkQuotaInfos = new ArrayList<NetworkQuotaInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos.Length"); j++) {
				NetworkQuotaInfo networkQuotaInfo = new NetworkQuotaInfo();
				networkQuotaInfo.setCanExceptional(_ctx.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].CanExceptional"));
				networkQuotaInfo.setSequence(_ctx.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].Sequence"));
				networkQuotaInfo.setQuotaName(_ctx.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].QuotaName"));
				networkQuotaInfo.setQuotaQuantity(_ctx.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].QuotaQuantity"));
				networkQuotaInfo.setQuotaDescription(_ctx.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].QuotaDescription"));
				networkQuotaInfo.setInstanceQuantity(_ctx.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].InstanceQuantity"));
				networkQuotaInfo.setQuotaDescriptionCn(_ctx.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].QuotaDescriptionCn"));

				List<QuotaDetail> quotaDetails = new ArrayList<QuotaDetail>();
				for (int k = 0; k < _ctx.lengthValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].QuotaDetails.Length"); k++) {
					QuotaDetail quotaDetail = new QuotaDetail();
					quotaDetail.setTop(_ctx.integerValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].QuotaDetails["+ k +"].Top"));
					quotaDetail.setChildResourceType(_ctx.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].QuotaDetails["+ k +"].ChildResourceType"));
					quotaDetail.setInstanceId(_ctx.stringValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].QuotaDetails["+ k +"].InstanceId"));
					quotaDetail.setQuotaQuantity(_ctx.integerValue("DescribeNetworkQuotasResponse.NetworkQuotas["+ i +"].NetworkQuotaInfos["+ j +"].QuotaDetails["+ k +"].QuotaQuantity"));

					quotaDetails.add(quotaDetail);
				}
				networkQuotaInfo.setQuotaDetails(quotaDetails);

				networkQuotaInfos.add(networkQuotaInfo);
			}
			networkQuota.setNetworkQuotaInfos(networkQuotaInfos);

			networkQuotas.add(networkQuota);
		}
		describeNetworkQuotasResponse.setNetworkQuotas(networkQuotas);
	 
	 	return describeNetworkQuotasResponse;
	}
}