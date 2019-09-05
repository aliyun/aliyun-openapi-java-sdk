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
		describeApiGroupResponse.setGroupId(_ctx.stringValue("DescribeApiGroupResponse.GroupId"));
		describeApiGroupResponse.setGroupName(_ctx.stringValue("DescribeApiGroupResponse.GroupName"));
		describeApiGroupResponse.setSubDomain(_ctx.stringValue("DescribeApiGroupResponse.SubDomain"));
		describeApiGroupResponse.setDescription(_ctx.stringValue("DescribeApiGroupResponse.Description"));
		describeApiGroupResponse.setCreatedTime(_ctx.stringValue("DescribeApiGroupResponse.CreatedTime"));
		describeApiGroupResponse.setModifiedTime(_ctx.stringValue("DescribeApiGroupResponse.ModifiedTime"));
		describeApiGroupResponse.setRegionId(_ctx.stringValue("DescribeApiGroupResponse.RegionId"));
		describeApiGroupResponse.setStatus(_ctx.stringValue("DescribeApiGroupResponse.Status"));
		describeApiGroupResponse.setBillingStatus(_ctx.stringValue("DescribeApiGroupResponse.BillingStatus"));
		describeApiGroupResponse.setIllegalStatus(_ctx.stringValue("DescribeApiGroupResponse.IllegalStatus"));
		describeApiGroupResponse.setTrafficLimit(_ctx.integerValue("DescribeApiGroupResponse.TrafficLimit"));
		describeApiGroupResponse.setVpcDomain(_ctx.stringValue("DescribeApiGroupResponse.VpcDomain"));
		describeApiGroupResponse.setInstanceType(_ctx.stringValue("DescribeApiGroupResponse.InstanceType"));
		describeApiGroupResponse.setInstanceId(_ctx.stringValue("DescribeApiGroupResponse.InstanceId"));
		describeApiGroupResponse.setHttpsPolicy(_ctx.stringValue("DescribeApiGroupResponse.HttpsPolicy"));

		List<DomainItem> customDomains = new ArrayList<DomainItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiGroupResponse.CustomDomains.Length"); i++) {
			DomainItem domainItem = new DomainItem();
			domainItem.setDomainName(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].DomainName"));
			domainItem.setCertificateId(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].CertificateId"));
			domainItem.setCertificateName(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].CertificateName"));
			domainItem.setDomainCNAMEStatus(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].DomainCNAMEStatus"));
			domainItem.setDomainBindingStatus(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].DomainBindingStatus"));
			domainItem.setDomainLegalStatus(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].DomainLegalStatus"));
			domainItem.setDomainWebSocketStatus(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].DomainWebSocketStatus"));
			domainItem.setDomainRemark(_ctx.stringValue("DescribeApiGroupResponse.CustomDomains["+ i +"].DomainRemark"));

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