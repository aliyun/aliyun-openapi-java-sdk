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

	public static ListEmrMainVersionResponse unmarshall(ListEmrMainVersionResponse listEmrMainVersionResponse, UnmarshallerContext _ctx) {
		
		listEmrMainVersionResponse.setRequestId(_ctx.stringValue("ListEmrMainVersionResponse.RequestId"));
		listEmrMainVersionResponse.setTotalCount(_ctx.integerValue("ListEmrMainVersionResponse.TotalCount"));
		listEmrMainVersionResponse.setPageNumber(_ctx.integerValue("ListEmrMainVersionResponse.PageNumber"));
		listEmrMainVersionResponse.setPageSize(_ctx.integerValue("ListEmrMainVersionResponse.PageSize"));

		List<EmrMainVersion> emrMainVersionList = new ArrayList<EmrMainVersion>();
		for (int i = 0; i < _ctx.lengthValue("ListEmrMainVersionResponse.EmrMainVersionList.Length"); i++) {
			EmrMainVersion emrMainVersion = new EmrMainVersion();
			emrMainVersion.setRegionId(_ctx.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].RegionId"));
			emrMainVersion.setEmrVersion(_ctx.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].EmrVersion"));
			emrMainVersion.setEcmVersion(_ctx.booleanValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].EcmVersion"));
			emrMainVersion.setImageId(_ctx.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ImageId"));
			emrMainVersion.setDisplay(_ctx.booleanValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].Display"));
			emrMainVersion.setStackName(_ctx.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].StackName"));
			emrMainVersion.setStackVersion(_ctx.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].StackVersion"));

			List<String> whiteUserList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].WhiteUserList.Length"); j++) {
				whiteUserList.add(_ctx.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].WhiteUserList["+ j +"]"));
			}
			emrMainVersion.setWhiteUserList(whiteUserList);

			List<ClusterTypeInfo> clusterTypeInfoList = new ArrayList<ClusterTypeInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList.Length"); j++) {
				ClusterTypeInfo clusterTypeInfo = new ClusterTypeInfo();
				clusterTypeInfo.setClusterType(_ctx.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ClusterType"));

				List<ServiceInfo> serviceInfoList = new ArrayList<ServiceInfo>();
				for (int k = 0; k < _ctx.lengthValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ServiceInfoList.Length"); k++) {
					ServiceInfo serviceInfo = new ServiceInfo();
					serviceInfo.setServiceName(_ctx.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ServiceInfoList["+ k +"].ServiceName"));
					serviceInfo.setServiceDisplayName(_ctx.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ServiceInfoList["+ k +"].ServiceDisplayName"));
					serviceInfo.setServiceVersion(_ctx.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ServiceInfoList["+ k +"].ServiceVersion"));
					serviceInfo.setServiceDisplayVersion(_ctx.stringValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ServiceInfoList["+ k +"].ServiceDisplayVersion"));
					serviceInfo.setMandatory(_ctx.booleanValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ServiceInfoList["+ k +"].Mandatory"));
					serviceInfo.setDisplay(_ctx.booleanValue("ListEmrMainVersionResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ServiceInfoList["+ k +"].Display"));

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