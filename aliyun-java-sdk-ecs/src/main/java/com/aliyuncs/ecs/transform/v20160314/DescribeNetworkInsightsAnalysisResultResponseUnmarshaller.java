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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeNetworkInsightsAnalysisResultResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponent;
import com.aliyuncs.ecs.model.v20160314.DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponent.DiagnoseCategory;
import com.aliyuncs.ecs.model.v20160314.DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponent.DiagnoseCategory.CategoryItem;
import com.aliyuncs.ecs.model.v20160314.DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponent.DiagnoseCategory.CategoryItem.Explanations;
import com.aliyuncs.ecs.model.v20160314.DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponent.DiagnoseCategory.CategoryItem.Explanations.NetworkAclEntry3;
import com.aliyuncs.ecs.model.v20160314.DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponent.DiagnoseCategory.CategoryItem.Explanations.SecurityGroupAcl2;
import com.aliyuncs.ecs.model.v20160314.DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponent.MetricResult;
import com.aliyuncs.ecs.model.v20160314.DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponent.MetricResult.Issue;
import com.aliyuncs.ecs.model.v20160314.DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponent.NetworkAclEntry;
import com.aliyuncs.ecs.model.v20160314.DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponent.SecurityGroupAcl;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkInsightsAnalysisResultResponseUnmarshaller {

	public static DescribeNetworkInsightsAnalysisResultResponse unmarshall(DescribeNetworkInsightsAnalysisResultResponse describeNetworkInsightsAnalysisResultResponse, UnmarshallerContext _ctx) {
		
		describeNetworkInsightsAnalysisResultResponse.setRequestId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.RequestId"));
		describeNetworkInsightsAnalysisResultResponse.setNetworkInsightsPathId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsPathId"));
		describeNetworkInsightsAnalysisResultResponse.setNetworkInsightsAnalysisId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisId"));
		describeNetworkInsightsAnalysisResultResponse.setNetworkPathFound(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkPathFound"));
		describeNetworkInsightsAnalysisResultResponse.setStatus(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.Status"));
		describeNetworkInsightsAnalysisResultResponse.setCreationTime(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.CreationTime"));
		describeNetworkInsightsAnalysisResultResponse.setSource(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.Source"));
		describeNetworkInsightsAnalysisResultResponse.setSourceType(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.SourceType"));
		describeNetworkInsightsAnalysisResultResponse.setSourceIp(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.SourceIp"));
		describeNetworkInsightsAnalysisResultResponse.setDestination(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.Destination"));
		describeNetworkInsightsAnalysisResultResponse.setDestinationType(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.DestinationType"));
		describeNetworkInsightsAnalysisResultResponse.setDestinationIp(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.DestinationIp"));
		describeNetworkInsightsAnalysisResultResponse.setDestinationPort(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.DestinationPort"));
		describeNetworkInsightsAnalysisResultResponse.setBizProtocol(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.Protocol"));
		describeNetworkInsightsAnalysisResultResponse.setSeverity(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.Severity"));
		describeNetworkInsightsAnalysisResultResponse.setAPIVersion(_ctx.integerValue("DescribeNetworkInsightsAnalysisResultResponse.APIVersion"));

		List<NetworkInsightsAnalysisComponent> networkInsightsAnalysisComponents = new ArrayList<NetworkInsightsAnalysisComponent>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents.Length"); i++) {
			NetworkInsightsAnalysisComponent networkInsightsAnalysisComponent = new NetworkInsightsAnalysisComponent();
			networkInsightsAnalysisComponent.setResourceId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].ResourceId"));
			networkInsightsAnalysisComponent.setResourceType(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].ResourceType"));
			networkInsightsAnalysisComponent.setReachable(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].Reachable"));
			networkInsightsAnalysisComponent.setCode(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].Code"));
			networkInsightsAnalysisComponent.setMessage(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].Message"));
			networkInsightsAnalysisComponent.setSequence(_ctx.integerValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].Sequence"));
			networkInsightsAnalysisComponent.setSeverity(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].Severity"));

			List<String> relativeGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].RelativeGroupIds.Length"); j++) {
				relativeGroupIds.add(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].RelativeGroupIds["+ j +"]"));
			}
			networkInsightsAnalysisComponent.setRelativeGroupIds(relativeGroupIds);

			NetworkAclEntry networkAclEntry = new NetworkAclEntry();
			networkAclEntry.setCreationTime(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].NetworkAclEntry.CreationTime"));
			networkAclEntry.setNetworkAclId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].NetworkAclEntry.NetworkAclId"));
			networkAclEntry.setNetworkAclName(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].NetworkAclEntry.NetworkAclName"));
			networkAclEntry.setNetworkAclEntryId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].NetworkAclEntry.NetworkAclEntryId"));
			networkAclEntry.setNetworkAclEntryName(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].NetworkAclEntry.NetworkAclEntryName"));
			networkAclEntry.setVpcId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].NetworkAclEntry.VpcId"));
			networkAclEntry.setDirection(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].NetworkAclEntry.Direction"));
			networkAclEntry.setPolicy(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].NetworkAclEntry.Policy"));
			networkAclEntry.setPort(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].NetworkAclEntry.Port"));
			networkAclEntry.setBizProtocol(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].NetworkAclEntry.Protocol"));
			networkAclEntry.setDestinationCidrIp(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].NetworkAclEntry.DestinationCidrIp"));
			networkAclEntry.setSourceCidrIp(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].NetworkAclEntry.SourceCidrIp"));
			networkInsightsAnalysisComponent.setNetworkAclEntry(networkAclEntry);

			SecurityGroupAcl securityGroupAcl = new SecurityGroupAcl();
			securityGroupAcl.setSecurityGroupId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.SecurityGroupId"));
			securityGroupAcl.setDescription(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.Description"));
			securityGroupAcl.setInnerAccessPolicy(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.InnerAccessPolicy"));
			securityGroupAcl.setCreateTime(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.CreateTime"));
			securityGroupAcl.setPermissionDescription(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.PermissionDescription"));
			securityGroupAcl.setPriority(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.Priority"));
			securityGroupAcl.setSourceCidrIp(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.SourceCidrIp"));
			securityGroupAcl.setSourceGroupId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.SourceGroupId"));
			securityGroupAcl.setSourceGroupName(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.SourceGroupName"));
			securityGroupAcl.setSourcePortRange(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.SourcePortRange"));
			securityGroupAcl.setPolicy(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.Policy"));
			securityGroupAcl.setNicType(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.NicType"));
			securityGroupAcl.setDirection(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.Direction"));
			securityGroupAcl.setIpProtocol(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.IpProtocol"));
			securityGroupAcl.setDestCidrIp(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.DestCidrIp"));
			securityGroupAcl.setDestGroupId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.DestGroupId"));
			securityGroupAcl.setDestGroupName(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.DestGroupName"));
			securityGroupAcl.setIpv6DestCidrIp(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.Ipv6DestCidrIp"));
			securityGroupAcl.setIpv6SourceCidrIp(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.Ipv6SourceCidrIp"));
			securityGroupAcl.setDestPortRange(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].SecurityGroupAcl.DestPortRange"));
			networkInsightsAnalysisComponent.setSecurityGroupAcl(securityGroupAcl);

			List<DiagnoseCategory> diagnoseCategories = new ArrayList<DiagnoseCategory>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories.Length"); j++) {
				DiagnoseCategory diagnoseCategory = new DiagnoseCategory();
				diagnoseCategory.setCategoryName(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryName"));
				diagnoseCategory.setReachable(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].Reachable"));

				List<CategoryItem> categoryItems = new ArrayList<CategoryItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems.Length"); k++) {
					CategoryItem categoryItem = new CategoryItem();
					categoryItem.setItemName(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].ItemName"));
					categoryItem.setReachable(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Reachable"));
					categoryItem.setCode(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Code"));

					Explanations explanations = new Explanations();
					explanations.setMissingFiles(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.MissingFiles"));
					explanations.setActualPort(_ctx.longValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.ActualPort"));
					explanations.setExpectPort(_ctx.longValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.ExpectPort"));
					explanations.setNetworkInterfaceName(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.NetworkInterfaceName"));
					explanations.setNetmask(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.Netmask"));
					explanations.setExpectIP(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.ExpectIP"));
					explanations.setActualIP(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.ActualIP"));
					explanations.setIp(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.Ip"));
					explanations.setHeader(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.Header"));
					explanations.setRule(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.Rule"));
					explanations.setUsePercent(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.UsePercent"));
					explanations.setPort(_ctx.longValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.Port"));
					explanations.setExpireDate(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.ExpireDate"));
					explanations.setProcessName(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.ProcessName"));
					explanations.setGroupId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.GroupId"));

					List<String> topProcesses = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.TopProcesses.Length"); l++) {
						topProcesses.add(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.TopProcesses["+ l +"]"));
					}
					explanations.setTopProcesses(topProcesses);

					List<String> relativeGroupIds1 = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.RelativeGroupIds.Length"); l++) {
						relativeGroupIds1.add(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.RelativeGroupIds["+ l +"]"));
					}
					explanations.setRelativeGroupIds1(relativeGroupIds1);

					SecurityGroupAcl2 securityGroupAcl2 = new SecurityGroupAcl2();
					securityGroupAcl2.setPolicy(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.SecurityGroupAcl.Policy"));
					securityGroupAcl2.setDescription(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.SecurityGroupAcl.Description"));
					securityGroupAcl2.setSourcePortRange(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.SecurityGroupAcl.SourcePortRange"));
					securityGroupAcl2.setCreateTime(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.SecurityGroupAcl.CreateTime"));
					securityGroupAcl2.setSourceCidrIp(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.SecurityGroupAcl.SourceCidrIp"));
					securityGroupAcl2.setDestCidrIp(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.SecurityGroupAcl.DestCidrIp"));
					securityGroupAcl2.setInnerAccessPolicy(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.SecurityGroupAcl.InnerAccessPolicy"));
					securityGroupAcl2.setNicType(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.SecurityGroupAcl.NicType"));
					securityGroupAcl2.setDestPortRange(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.SecurityGroupAcl.DestPortRange"));
					securityGroupAcl2.setDestGroupId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.SecurityGroupAcl.DestGroupId"));
					explanations.setSecurityGroupAcl2(securityGroupAcl2);

					NetworkAclEntry3 networkAclEntry3 = new NetworkAclEntry3();
					networkAclEntry3.setPolicy(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.NetworkAclEntry.Policy"));
					networkAclEntry3.setNetworkAclId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.NetworkAclEntry.NetworkAclId"));
					networkAclEntry3.setVpcId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.NetworkAclEntry.VpcId"));
					networkAclEntry3.setPort(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.NetworkAclEntry.Port"));
					networkAclEntry3.setSourceCidrIp(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.NetworkAclEntry.SourceCidrIp"));
					networkAclEntry3.setNetworkAclName(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.NetworkAclEntry.NetworkAclName"));
					networkAclEntry3.setBizProtocol(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.NetworkAclEntry.Protocol"));
					networkAclEntry3.setNetworkAclEntryId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.NetworkAclEntry.NetworkAclEntryId"));
					networkAclEntry3.setDirection(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].DiagnoseCategories["+ j +"].CategoryItems["+ k +"].Explanations.NetworkAclEntry.Direction"));
					explanations.setNetworkAclEntry3(networkAclEntry3);
					categoryItem.setExplanations(explanations);

					categoryItems.add(categoryItem);
				}
				diagnoseCategory.setCategoryItems(categoryItems);

				diagnoseCategories.add(diagnoseCategory);
			}
			networkInsightsAnalysisComponent.setDiagnoseCategories(diagnoseCategories);

			List<MetricResult> metricResults = new ArrayList<MetricResult>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].MetricResults.Length"); j++) {
				MetricResult metricResult = new MetricResult();
				metricResult.setMetricId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].MetricResults["+ j +"].MetricId"));
				metricResult.setMetricCategory(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].MetricResults["+ j +"].MetricCategory"));
				metricResult.setSeverity(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].MetricResults["+ j +"].Severity"));
				metricResult.setStatus(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].MetricResults["+ j +"].Status"));

				List<Issue> issues = new ArrayList<Issue>();
				for (int k = 0; k < _ctx.lengthValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].MetricResults["+ j +"].Issues.Length"); k++) {
					Issue issue = new Issue();
					issue.setIssueId(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].MetricResults["+ j +"].Issues["+ k +"].IssueId"));
					issue.setSeverity(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].MetricResults["+ j +"].Issues["+ k +"].Severity"));
					issue.setAdditional(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].MetricResults["+ j +"].Issues["+ k +"].Additional"));
					issue.setOccurrenceTime(_ctx.stringValue("DescribeNetworkInsightsAnalysisResultResponse.NetworkInsightsAnalysisComponents["+ i +"].MetricResults["+ j +"].Issues["+ k +"].OccurrenceTime"));

					issues.add(issue);
				}
				metricResult.setIssues(issues);

				metricResults.add(metricResult);
			}
			networkInsightsAnalysisComponent.setMetricResults(metricResults);

			networkInsightsAnalysisComponents.add(networkInsightsAnalysisComponent);
		}
		describeNetworkInsightsAnalysisResultResponse.setNetworkInsightsAnalysisComponents(networkInsightsAnalysisComponents);
	 
	 	return describeNetworkInsightsAnalysisResultResponse;
	}
}