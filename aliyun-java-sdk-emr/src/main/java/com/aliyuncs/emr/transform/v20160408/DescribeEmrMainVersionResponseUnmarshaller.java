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

import com.aliyuncs.emr.model.v20160408.DescribeEmrMainVersionResponse;
import com.aliyuncs.emr.model.v20160408.DescribeEmrMainVersionResponse.EmrMainVersion;
import com.aliyuncs.emr.model.v20160408.DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfo;
import com.aliyuncs.emr.model.v20160408.DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfo.ServiceInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEmrMainVersionResponseUnmarshaller {

	public static DescribeEmrMainVersionResponse unmarshall(DescribeEmrMainVersionResponse describeEmrMainVersionResponse, UnmarshallerContext context) {
		
		describeEmrMainVersionResponse.setRequestId(context.stringValue("DescribeEmrMainVersionResponse.RequestId"));

		EmrMainVersion emrMainVersion = new EmrMainVersion();
		emrMainVersion.setRegionId(context.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.RegionId"));
		emrMainVersion.setEmrVersion(context.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.EmrVersion"));
		emrMainVersion.setEcmVersion(context.booleanValue("DescribeEmrMainVersionResponse.EmrMainVersion.EcmVersion"));
		emrMainVersion.setImageId(context.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.ImageId"));
		emrMainVersion.setDisplay(context.booleanValue("DescribeEmrMainVersionResponse.EmrMainVersion.Display"));
		emrMainVersion.setStackName(context.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.StackName"));
		emrMainVersion.setStackVersion(context.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.StackVersion"));

		List<String> whiteUserList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeEmrMainVersionResponse.EmrMainVersion.WhiteUserList.Length"); i++) {
			whiteUserList.add(context.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.WhiteUserList["+ i +"]"));
		}
		emrMainVersion.setWhiteUserList(whiteUserList);

		List<ClusterTypeInfo> clusterTypeInfoList = new ArrayList<ClusterTypeInfo>();
		for (int i = 0; i < context.lengthValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList.Length"); i++) {
			ClusterTypeInfo clusterTypeInfo = new ClusterTypeInfo();
			clusterTypeInfo.setClusterType(context.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList["+ i +"].ClusterType"));

			List<ServiceInfo> serviceInfoList = new ArrayList<ServiceInfo>();
			for (int j = 0; j < context.lengthValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList["+ i +"].ServiceInfoList.Length"); j++) {
				ServiceInfo serviceInfo = new ServiceInfo();
				serviceInfo.setServiceName(context.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList["+ i +"].ServiceInfoList["+ j +"].ServiceName"));
				serviceInfo.setServiceDisplayName(context.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList["+ i +"].ServiceInfoList["+ j +"].ServiceDisplayName"));
				serviceInfo.setServiceVersion(context.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList["+ i +"].ServiceInfoList["+ j +"].ServiceVersion"));
				serviceInfo.setServiceDisplayVersion(context.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList["+ i +"].ServiceInfoList["+ j +"].ServiceDisplayVersion"));
				serviceInfo.setMandatory(context.booleanValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList["+ i +"].ServiceInfoList["+ j +"].Mandatory"));
				serviceInfo.setDisplay(context.booleanValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList["+ i +"].ServiceInfoList["+ j +"].Display"));

				serviceInfoList.add(serviceInfo);
			}
			clusterTypeInfo.setServiceInfoList(serviceInfoList);

			clusterTypeInfoList.add(clusterTypeInfo);
		}
		emrMainVersion.setClusterTypeInfoList(clusterTypeInfoList);
		describeEmrMainVersionResponse.setEmrMainVersion(emrMainVersion);
	 
	 	return describeEmrMainVersionResponse;
	}
}