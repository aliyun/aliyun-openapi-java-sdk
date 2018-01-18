/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiGroupResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiGroupResponse.DomainItem;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiGroupResponse.StageInfo;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

public class DescribeApiGroupResponseUnmarshaller {

    public static DescribeApiGroupResponse unmarshall(DescribeApiGroupResponse describeApiGroupResponse,
                                                      UnmarshallerContext context) {

        describeApiGroupResponse.setRequestId(context.stringValue("DescribeApiGroupResponse.RequestId"));
        describeApiGroupResponse.setGroupId(context.stringValue("DescribeApiGroupResponse.GroupId"));
        describeApiGroupResponse.setGroupName(context.stringValue("DescribeApiGroupResponse.GroupName"));
        describeApiGroupResponse.setSubDomain(context.stringValue("DescribeApiGroupResponse.SubDomain"));
        describeApiGroupResponse.setDescription(context.stringValue("DescribeApiGroupResponse.Description"));
        describeApiGroupResponse.setCreatedTime(context.stringValue("DescribeApiGroupResponse.CreatedTime"));
        describeApiGroupResponse.setModifiedTime(context.stringValue("DescribeApiGroupResponse.ModifiedTime"));
        describeApiGroupResponse.setRegionId(context.stringValue("DescribeApiGroupResponse.RegionId"));
        describeApiGroupResponse.setStatus(context.stringValue("DescribeApiGroupResponse.Status"));
        describeApiGroupResponse.setBillingStatus(context.stringValue("DescribeApiGroupResponse.BillingStatus"));
        describeApiGroupResponse.setIllegalStatus(context.stringValue("DescribeApiGroupResponse.IllegalStatus"));
        describeApiGroupResponse.setTrafficLimit(context.integerValue("DescribeApiGroupResponse.TrafficLimit"));

        List<DomainItem> customDomains = new ArrayList<DomainItem>();
        for (int i = 0; i < context.lengthValue("DescribeApiGroupResponse.CustomDomains.Length"); i++) {
            DomainItem domainItem = new DomainItem();
            domainItem.setDomainName(context
                    .stringValue("DescribeApiGroupResponse.CustomDomains[" + i + "].DomainName"));
            domainItem.setCertificateId(context.stringValue("DescribeApiGroupResponse.CustomDomains[" + i
                    + "].CertificateId"));
            domainItem.setCertificateName(context.stringValue("DescribeApiGroupResponse.CustomDomains[" + i
                    + "].CertificateName"));
            domainItem.setDomainCNAMEStatus(context.stringValue("DescribeApiGroupResponse.CustomDomains[" + i
                    + "].DomainCNAMEStatus"));
            domainItem.setDomainBindingStatus(context.stringValue("DescribeApiGroupResponse.CustomDomains[" + i
                    + "].DomainBindingStatus"));
			domainItem.setDomainLegalStatus(context.stringValue("DescribeApiGroupResponse.CustomDomains[" + i
					+ "].DomainLegalStatus"));
			domainItem.setDomainRemark(context.stringValue("DescribeApiGroupResponse.CustomDomains[" + i
					+ "].DomainRemark"));
            customDomains.add(domainItem);
        }
        describeApiGroupResponse.setCustomDomains(customDomains);

        List<StageInfo> stageItems = new ArrayList<StageInfo>();
        for (int i = 0; i < context.lengthValue("DescribeApiGroupResponse.StageItems.Length"); i++) {
            StageInfo stageInfo = new StageInfo();
            stageInfo.setStageId(context.stringValue("DescribeApiGroupResponse.StageItems[" + i + "].StageId"));
            stageInfo.setStageName(context.stringValue("DescribeApiGroupResponse.StageItems[" + i + "].StageName"));
            stageInfo.setDescription(context.stringValue("DescribeApiGroupResponse.StageItems[" + i + "].Description"));

            stageItems.add(stageInfo);
        }
        describeApiGroupResponse.setStageItems(stageItems);

        return describeApiGroupResponse;
    }
}
