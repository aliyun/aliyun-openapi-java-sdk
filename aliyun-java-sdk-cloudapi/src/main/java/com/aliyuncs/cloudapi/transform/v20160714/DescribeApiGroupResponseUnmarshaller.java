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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiGroupResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiGroupResponse.DomainItem;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiGroupResponse.StageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiGroupResponseUnmarshaller {

	public static DescribeApiGroupResponse unmarshall(DescribeApiGroupResponse describeApiGroupResponse, UnmarshallerContext _ctx) {
		
		describeApiGroupResponse.setRequestId(_ctx.stringValue("DescribeApiGroupResponse.RequestId"));
		describeApiGroupResponse.setStatus(_ctx.stringValue("DescribeApiGroupResponse.Status"));
		describeApiGroupResponse.setCompatibleFlags(_ctx.stringValue("DescribeApiGroupResponse.CompatibleFlags"));
		describeApiGroupResponse.setBasePath(_ctx.stringValue("DescribeApiGroupResponse.BasePath"));
		describeApiGroupResponse.setIpv6Status(_ctx.stringValue("DescribeApiGroupResponse.Ipv6Status"));
		describeApiGroupResponse.setUserLogConfig(_ctx.stringValue("DescribeApiGroupResponse.UserLogConfig"));
		describeApiGroupResponse.setCustomerConfigs(_ctx.stringValue("DescribeApiGroupResponse.CustomerConfigs"));
		describeApiGroupResponse.setDescription(_ctx.stringValue("DescribeApiGroupResponse.Description"));
		describeApiGroupResponse.setHttpsPolicy(_ctx.stringValue("DescribeApiGroupResponse.HttpsPolicy"));
		describeApiGroupResponse.setSubDomain(_ctx.stringValue("DescribeApiGroupResponse.SubDomain"));
		describeApiGroupResponse.setCreatedTime(_ctx.stringValue("DescribeApiGroupResponse.CreatedTime"));
		describeApiGroupResponse.setRpcPattern(_ctx.stringValue("DescribeApiGroupResponse.RpcPattern"));
		describeApiGroupResponse.setDefaultDomain(_ctx.stringValue("DescribeApiGroupResponse.DefaultDomain"));
		describeApiGroupResponse.setCmsMonitorGroup(_ctx.stringValue("DescribeApiGroupResponse.CmsMonitorGroup"));
		describeApiGroupResponse.setBillingStatus(_ctx.stringValue("DescribeApiGroupResponse.BillingStatus"));
		describeApiGroupResponse.setTrafficLimit(_ctx.integerValue("DescribeApiGroupResponse.TrafficLimit"));
		describeApiGroupResponse.setPassthroughHeaders(_ctx.stringValue("DescribeApiGroupResponse.PassthroughHeaders"));
		describeApiGroupResponse.setInstanceId(_ctx.stringValue("DescribeApiGroupResponse.InstanceId"));
		describeApiGroupResponse.setVpcDomain(_ctx.stringValue("DescribeApiGroupResponse.VpcDomain"));
		describeApiGroupResponse.setInstanceType(_ctx.stringValue("DescribeApiGroupResponse.InstanceType"));
		describeApiGroupResponse.setCustomTraceConfig(_ctx.stringValue("DescribeApiGroupResponse.CustomTraceConfig"));
		describeApiGroupResponse.setRegionId(_ctx.stringValue("DescribeApiGroupResponse.RegionId"));
		describeApiGroupResponse.setModifiedTime(_ctx.stringValue("DescribeApiGroupResponse.ModifiedTime"));
		describeApiGroupResponse.setGroupId(_ctx.stringValue("DescribeApiGroupResponse.GroupId"));
		describeApiGroupResponse.setGroupName(_ctx.stringValue("DescribeApiGroupResponse.GroupName"));
		describeApiGroupResponse.setClassicVpcSubDomain(_ctx.stringValue("DescribeApiGroupResponse.ClassicVpcSubDomain"));
		describeApiGroupResponse.setIllegalStatus(_ctx.stringValue("DescribeApiGroupResponse.IllegalStatus"));
		describeApiGroupResponse.setInstanceVipList(_ctx.stringValue("DescribeApiGroupResponse.InstanceVipList"));
		describeApiGroupResponse.setVpcSlbIntranetDomain(_ctx.stringValue("DescribeApiGroupResponse.VpcSlbIntranetDomain"));
		describeApiGroupResponse.setCloudMarketCommodity(_ctx.booleanValue("DescribeApiGroupResponse.CloudMarketCommodity"));

		List<DomainItem> customDomains = new ArrayList<DomainItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiGroupResponse.CustomDomains.Length"); i++) {
			DomainItem domainItem = new DomainItem();
			domainItem.setBindStageName(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].BindStageName"));
			domainItem.setDomainLegalStatus(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].DomainLegalStatus"));
			domainItem.setCertificateName(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].CertificateName"));
			domainItem.setCustomDomainType(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].CustomDomainType"));
			domainItem.setDomainCNAMEStatus(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].DomainCNAMEStatus"));
			domainItem.setWildcardDomainPatterns(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].WildcardDomainPatterns"));
			domainItem.setDomainBindingStatus(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].DomainBindingStatus"));
			domainItem.setDomainName(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].DomainName"));
			domainItem.setDomainRemark(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].DomainRemark"));
			domainItem.setDomainWebSocketStatus(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].DomainWebSocketStatus"));
			domainItem.setCertificateId(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].CertificateId"));
			domainItem.setIsHttpRedirectToHttps(_ctx.booleanValue("DescribeApiGroupResponse.CustomDomains["+ i +"].IsHttpRedirectToHttps"));
			domainItem.setWssEnable(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].WssEnable"));

			customDomains.add(domainItem);
		}
		describeApiGroupResponse.setCustomDomains(customDomains);

		List<StageInfo> stageItems = new ArrayList<StageInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiGroupResponse.StageItems.Length"); i++) {
			StageInfo stageInfo = new StageInfo();
			stageInfo.setStageId(_ctx.stringValue("DescribeApiGroupResponse.StageItems["+ i +"].StageId"));
			stageInfo.setStageName(_ctx.stringValue("DescribeApiGroupResponse.StageItems["+ i +"].StageName"));
			stageInfo.setDescription(_ctx.stringValue("DescribeApiGroupResponse.StageItems["+ i +"].Description"));

			stageItems.add(stageInfo);
		}
		describeApiGroupResponse.setStageItems(stageItems);
	 
	 	return describeApiGroupResponse;
	}
}