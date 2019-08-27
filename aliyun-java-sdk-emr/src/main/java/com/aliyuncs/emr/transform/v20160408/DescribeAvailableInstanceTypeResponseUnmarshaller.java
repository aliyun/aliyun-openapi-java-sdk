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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeAvailableInstanceTypeResponse;
import com.aliyuncs.emr.model.v20160408.DescribeAvailableInstanceTypeResponse.EmrSupportInstanceType;
import com.aliyuncs.emr.model.v20160408.DescribeAvailableInstanceTypeResponse.EmrSupportInstanceType.ClusterNodeTypeSupportInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableInstanceTypeResponseUnmarshaller {

	public static DescribeAvailableInstanceTypeResponse unmarshall(DescribeAvailableInstanceTypeResponse describeAvailableInstanceTypeResponse, UnmarshallerContext _ctx) {
		
		describeAvailableInstanceTypeResponse.setRequestId(_ctx.stringValue("DescribeAvailableInstanceTypeResponse.RequestId"));

		List<EmrSupportInstanceType> emrSupportedInstanceTypeList = new ArrayList<EmrSupportInstanceType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableInstanceTypeResponse.EmrSupportedInstanceTypeList.Length"); i++) {
			EmrSupportInstanceType emrSupportInstanceType = new EmrSupportInstanceType();
			emrSupportInstanceType.setClusterType(_ctx.stringValue("DescribeAvailableInstanceTypeResponse.EmrSupportedInstanceTypeList["+ i +"].ClusterType"));

			List<ClusterNodeTypeSupportInfo> nodeTypeSupportInfoList = new ArrayList<ClusterNodeTypeSupportInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableInstanceTypeResponse.EmrSupportedInstanceTypeList["+ i +"].NodeTypeSupportInfoList.Length"); j++) {
				ClusterNodeTypeSupportInfo clusterNodeTypeSupportInfo = new ClusterNodeTypeSupportInfo();
				clusterNodeTypeSupportInfo.setClusterNodeType(_ctx.stringValue("DescribeAvailableInstanceTypeResponse.EmrSupportedInstanceTypeList["+ i +"].NodeTypeSupportInfoList["+ j +"].ClusterNodeType"));

				List<String> supportInstanceTypeList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAvailableInstanceTypeResponse.EmrSupportedInstanceTypeList["+ i +"].NodeTypeSupportInfoList["+ j +"].SupportInstanceTypeList.Length"); k++) {
					supportInstanceTypeList.add(_ctx.stringValue("DescribeAvailableInstanceTypeResponse.EmrSupportedInstanceTypeList["+ i +"].NodeTypeSupportInfoList["+ j +"].SupportInstanceTypeList["+ k +"]"));
				}
				clusterNodeTypeSupportInfo.setSupportInstanceTypeList(supportInstanceTypeList);

				nodeTypeSupportInfoList.add(clusterNodeTypeSupportInfo);
			}
			emrSupportInstanceType.setNodeTypeSupportInfoList(nodeTypeSupportInfoList);

			emrSupportedInstanceTypeList.add(emrSupportInstanceType);
		}
		describeAvailableInstanceTypeResponse.setEmrSupportedInstanceTypeList(emrSupportedInstanceTypeList);
	 
	 	return describeAvailableInstanceTypeResponse;
	}
}