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
import com.aliyuncs.emr.model.v20160408.DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeWhiteUser;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEmrMainVersionResponseUnmarshaller {

	public static DescribeEmrMainVersionResponse unmarshall(DescribeEmrMainVersionResponse describeEmrMainVersionResponse, UnmarshallerContext _ctx) {
		
		describeEmrMainVersionResponse.setRequestId(_ctx.stringValue("DescribeEmrMainVersionResponse.RequestId"));

		EmrMainVersion emrMainVersion = new EmrMainVersion();
		emrMainVersion.setRegionId(_ctx.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.RegionId"));
		emrMainVersion.setEmrVersion(_ctx.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.EmrVersion"));
		emrMainVersion.setEcmVersion(_ctx.booleanValue("DescribeEmrMainVersionResponse.EmrMainVersion.EcmVersion"));
		emrMainVersion.setImageId(_ctx.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.ImageId"));
		emrMainVersion.setDisplay(_ctx.booleanValue("DescribeEmrMainVersionResponse.EmrMainVersion.Display"));
		emrMainVersion.setStackName(_ctx.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.StackName"));
		emrMainVersion.setStackVersion(_ctx.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.StackVersion"));
		emrMainVersion.setPublishType(_ctx.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.PublishType"));

		List<String> whiteUserList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEmrMainVersionResponse.EmrMainVersion.WhiteUserList.Length"); i++) {
			whiteUserList.add(_ctx.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.WhiteUserList["+ i +"]"));
		}
		emrMainVersion.setWhiteUserList(whiteUserList);

		List<ClusterTypeInfo> clusterTypeInfoList = new ArrayList<ClusterTypeInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList.Length"); i++) {
			ClusterTypeInfo clusterTypeInfo = new ClusterTypeInfo();
			clusterTypeInfo.setClusterType(_ctx.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList["+ i +"].ClusterType"));

			List<ServiceInfo> serviceInfoList = new ArrayList<ServiceInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList["+ i +"].ServiceInfoList.Length"); j++) {
				ServiceInfo serviceInfo = new ServiceInfo();
				serviceInfo.setServiceName(_ctx.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList["+ i +"].ServiceInfoList["+ j +"].ServiceName"));
				serviceInfo.setServiceDisplayName(_ctx.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList["+ i +"].ServiceInfoList["+ j +"].ServiceDisplayName"));
				serviceInfo.setServiceVersion(_ctx.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList["+ i +"].ServiceInfoList["+ j +"].ServiceVersion"));
				serviceInfo.setServiceDisplayVersion(_ctx.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList["+ i +"].ServiceInfoList["+ j +"].ServiceDisplayVersion"));
				serviceInfo.setMandatory(_ctx.booleanValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList["+ i +"].ServiceInfoList["+ j +"].Mandatory"));
				serviceInfo.setDisplay(_ctx.booleanValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfoList["+ i +"].ServiceInfoList["+ j +"].Display"));

				serviceInfoList.add(serviceInfo);
			}
			clusterTypeInfo.setServiceInfoList(serviceInfoList);

			clusterTypeInfoList.add(clusterTypeInfo);
		}
		emrMainVersion.setClusterTypeInfoList(clusterTypeInfoList);

		List<ClusterTypeWhiteUser> clusterTypeWhiteUserList = new ArrayList<ClusterTypeWhiteUser>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeWhiteUserList.Length"); i++) {
			ClusterTypeWhiteUser clusterTypeWhiteUser = new ClusterTypeWhiteUser();
			clusterTypeWhiteUser.setClusterType(_ctx.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeWhiteUserList["+ i +"].ClusterType"));
			clusterTypeWhiteUser.setUserId(_ctx.stringValue("DescribeEmrMainVersionResponse.EmrMainVersion.ClusterTypeWhiteUserList["+ i +"].UserId"));

			clusterTypeWhiteUserList.add(clusterTypeWhiteUser);
		}
		emrMainVersion.setClusterTypeWhiteUserList(clusterTypeWhiteUserList);
		describeEmrMainVersionResponse.setEmrMainVersion(emrMainVersion);
	 
	 	return describeEmrMainVersionResponse;
	}
}