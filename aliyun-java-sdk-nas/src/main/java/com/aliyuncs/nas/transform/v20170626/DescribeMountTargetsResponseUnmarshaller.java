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
package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeMountTargetsResponse;
import com.aliyuncs.nas.model.v20170626.DescribeMountTargetsResponse.MountTarget;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMountTargetsResponseUnmarshaller {

	public static DescribeMountTargetsResponse unmarshall(DescribeMountTargetsResponse describeMountTargetsResponse, UnmarshallerContext context) {
		
		describeMountTargetsResponse.setRequestId(context.stringValue("DescribeMountTargetsResponse.RequestId"));
		describeMountTargetsResponse.setTotalCount(context.integerValue("DescribeMountTargetsResponse.TotalCount"));
		describeMountTargetsResponse.setPageSize(context.integerValue("DescribeMountTargetsResponse.PageSize"));
		describeMountTargetsResponse.setPageNumber(context.integerValue("DescribeMountTargetsResponse.PageNumber"));

		List<MountTarget> mountTargets = new ArrayList<MountTarget>();
		for (int i = 0; i < context.lengthValue("DescribeMountTargetsResponse.MountTargets.Length"); i++) {
			MountTarget mountTarget = new MountTarget();
			mountTarget.setMountTargetDomain(context.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].MountTargetDomain"));
			mountTarget.setNetworkType(context.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].NetworkType"));
			mountTarget.setVpcId(context.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].VpcId"));
			mountTarget.setVswId(context.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].VswId"));
			mountTarget.setAccessGroup(context.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].AccessGroup"));
			mountTarget.setStatus(context.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].Status"));

			mountTargets.add(mountTarget);
		}
		describeMountTargetsResponse.setMountTargets(mountTargets);
	 
	 	return describeMountTargetsResponse;
	}
}