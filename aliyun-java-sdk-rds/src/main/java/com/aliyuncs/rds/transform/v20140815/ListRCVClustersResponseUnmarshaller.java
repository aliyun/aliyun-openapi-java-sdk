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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.ListRCVClustersResponse;
import com.aliyuncs.rds.model.v20140815.ListRCVClustersResponse.VCluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRCVClustersResponseUnmarshaller {

	public static ListRCVClustersResponse unmarshall(ListRCVClustersResponse listRCVClustersResponse, UnmarshallerContext _ctx) {
		
		listRCVClustersResponse.setRequestId(_ctx.stringValue("ListRCVClustersResponse.RequestId"));

		List<VCluster> vClusters = new ArrayList<VCluster>();
		for (int i = 0; i < _ctx.lengthValue("ListRCVClustersResponse.VClusters.Length"); i++) {
			VCluster vCluster = new VCluster();
			vCluster.setInstanceCount(_ctx.longValue("ListRCVClustersResponse.VClusters["+ i +"].InstanceCount"));
			vCluster.setVpcId(_ctx.stringValue("ListRCVClustersResponse.VClusters["+ i +"].VpcId"));
			vCluster.setClusterId(_ctx.stringValue("ListRCVClustersResponse.VClusters["+ i +"].ClusterId"));
			vCluster.setRegionId(_ctx.stringValue("ListRCVClustersResponse.VClusters["+ i +"].RegionId"));

			List<String> supportDiskPerformanceLevel = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRCVClustersResponse.VClusters["+ i +"].SupportDiskPerformanceLevel.Length"); j++) {
				supportDiskPerformanceLevel.add(_ctx.stringValue("ListRCVClustersResponse.VClusters["+ i +"].SupportDiskPerformanceLevel["+ j +"]"));
			}
			vCluster.setSupportDiskPerformanceLevel(supportDiskPerformanceLevel);

			vClusters.add(vCluster);
		}
		listRCVClustersResponse.setVClusters(vClusters);
	 
	 	return listRCVClustersResponse;
	}
}