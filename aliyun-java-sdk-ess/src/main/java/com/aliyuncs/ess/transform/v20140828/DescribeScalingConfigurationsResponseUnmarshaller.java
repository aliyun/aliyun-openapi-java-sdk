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
package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.DataDisk;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingConfigurationsResponseUnmarshaller {

	public static DescribeScalingConfigurationsResponse unmarshall(DescribeScalingConfigurationsResponse describeScalingConfigurationsResponse, UnmarshallerContext context) {
		
		describeScalingConfigurationsResponse.setRequestId(context.stringValue("DescribeScalingConfigurationsResponse.RequestId"));
		describeScalingConfigurationsResponse.setTotalCount(context.integerValue("DescribeScalingConfigurationsResponse.TotalCount"));
		describeScalingConfigurationsResponse.setPageNumber(context.integerValue("DescribeScalingConfigurationsResponse.PageNumber"));
		describeScalingConfigurationsResponse.setPageSize(context.integerValue("DescribeScalingConfigurationsResponse.PageSize"));

		List<ScalingConfiguration> scalingConfigurations = new ArrayList<ScalingConfiguration>();
		for (int i = 0; i < context.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations.Length"); i++) {
			ScalingConfiguration scalingConfiguration = new ScalingConfiguration();
			scalingConfiguration.setScalingConfigurationId(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingConfigurationId"));
			scalingConfiguration.setScalingConfigurationName(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingConfigurationName"));
			scalingConfiguration.setScalingGroupId(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingGroupId"));
			scalingConfiguration.setImageId(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageId"));
			scalingConfiguration.setInstanceType(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceType"));
			scalingConfiguration.setInstanceGeneration(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceGeneration"));
			scalingConfiguration.setSecurityGroupId(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityGroupId"));
			scalingConfiguration.setIoOptimized(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].IoOptimized"));
			scalingConfiguration.setInternetChargeType(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InternetChargeType"));
			scalingConfiguration.setInternetMaxBandwidthIn(context.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InternetMaxBandwidthIn"));
			scalingConfiguration.setInternetMaxBandwidthOut(context.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InternetMaxBandwidthOut"));
			scalingConfiguration.setSystemDiskCategory(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskCategory"));
			scalingConfiguration.setSystemDiskSize(context.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskSize"));
			scalingConfiguration.setLifecycleState(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].LifecycleState"));
			scalingConfiguration.setCreationTime(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].CreationTime"));
			scalingConfiguration.setLoadBalancerWeight(context.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].LoadBalancerWeight"));

			List<DataDisk> dataDisks = new ArrayList<DataDisk>();
			for (int j = 0; j < context.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks.Length"); j++) {
				DataDisk dataDisk = new DataDisk();
				dataDisk.setSize(context.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Size"));
				dataDisk.setCategory(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Category"));
				dataDisk.setSnapshotId(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].SnapshotId"));
				dataDisk.setDevice(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Device"));

				dataDisks.add(dataDisk);
			}
			scalingConfiguration.setDataDisks(dataDisks);

			scalingConfigurations.add(scalingConfiguration);
		}
		describeScalingConfigurationsResponse.setScalingConfigurations(scalingConfigurations);
	 
	 	return describeScalingConfigurationsResponse;
	}
}