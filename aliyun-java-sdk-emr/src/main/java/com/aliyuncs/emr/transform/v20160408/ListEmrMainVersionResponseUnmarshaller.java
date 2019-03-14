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

import com.aliyuncs.emr.model.v20160408.ListEmrMainVersionResponse;
import com.aliyuncs.emr.model.v20160408.ListEmrMainVersionResponse.EmrMainVersion;
import com.aliyuncs.emr.model.v20160408.ListEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfo;
import com.aliyuncs.emr.model.v20160408.ListEmrMainVersionResponse.EmrMainVersion.ClusterTypeInfo.ServiceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEmrMainVersionResponseUnmarshaller {

	public static ListEmrMainVersionResponse unmarshall(ListEmrMainVersionResponse listEmrMainVersionResponse, UnmarshallerContext context) {
		
		listEmrMainVersionResponse.setRequestId(context.stringValue("ListEmrMainVersionResponse.RequestId"));
		listEmrMainVersionResponse.setTotalCount(context.integerValue("ListEmrMainVersionResponse.TotalCount"));
		listEmrMainVersionResponse.setPageNumber(context.integerValue("ListEmrMainVersionResponse.PageNumber"));
		listEmrMainVersionResponse.setPageSize(context.integerValue("ListEmrMainVersionResponse.PageSize"));

		List<EmrMainVersion> emrMainVersionList = new ArrayList<EmrMainVersion>();
		for (int i = 0; i < context.lengthValue("ListEmrMainVersionResponse.EmrMainVersionList.Length"); i++) {
			EmrMainVersion emrMainVersion = new EmrMainVersion();
			emrMainVersion.setRegionId(context.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].RegionId"));
			emrMainVersion.setEmrVersion(context.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].EmrVersion"));
			emrMainVersion.setEcmVersion(context.booleanValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].EcmVersion"));
			emrMainVersion.setImageId(context.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ImageId"));
			emrMainVersion.setDisplay(context.booleanValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].Display"));
			emrMainVersion.setStackName(context.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].StackName"));
			emrMainVersion.setStackVersion(context.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].StackVersion"));

			List<String> whiteUserList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].WhiteUserList.Length"); j++) {
				whiteUserList.add(context.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].WhiteUserList["+ j +"]"));
			}
			emrMainVersion.setWhiteUserList(whiteUserList);

			List<ClusterTypeInfo> clusterTypeInfoList = new ArrayList<ClusterTypeInfo>();
			for (int j = 0; j < context.lengthValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList.Length"); j++) {
				ClusterTypeInfo clusterTypeInfo = new ClusterTypeInfo();
				clusterTypeInfo.setClusterType(context.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ClusterType"));

				List<ServiceInfo> serviceInfoList = new ArrayList<ServiceInfo>();
				for (int k = 0; k < context.lengthValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ServiceInfoList.Length"); k++) {
					ServiceInfo serviceInfo = new ServiceInfo();
					serviceInfo.setServiceName(context.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ServiceInfoList["+ k +"].ServiceName"));
					serviceInfo.setServiceDisplayName(context.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ServiceInfoList["+ k +"].ServiceDisplayName"));
					serviceInfo.setServiceVersion(context.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ServiceInfoList["+ k +"].ServiceVersion"));
					serviceInfo.setServiceDisplayVersion(context.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ServiceInfoList["+ k +"].ServiceDisplayVersion"));
					serviceInfo.setMandatory(context.booleanValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ServiceInfoList["+ k +"].Mandatory"));
					serviceInfo.setDisplay(context.booleanValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ServiceInfoList["+ k +"].Display"));

					serviceInfoList.add(serviceInfo);
				}
				clusterTypeInfo.setServiceInfoList(serviceInfoList);

				clusterTypeInfoList.add(clusterTypeInfo);
			}
			emrMainVersion.setClusterTypeInfoList(clusterTypeInfoList);

			emrMainVersionList.add(emrMainVersion);
		}
		listEmrMainVersionResponse.setEmrMainVersionList(emrMainVersionList);
	 
	 	return listEmrMainVersionResponse;
	}
}