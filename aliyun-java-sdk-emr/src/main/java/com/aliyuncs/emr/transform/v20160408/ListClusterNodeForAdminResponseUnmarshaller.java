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

import com.aliyuncs.emr.model.v20160408.ListClusterNodeForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterNodeForAdminResponse.ClusterNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterNodeForAdminResponseUnmarshaller {

	public static ListClusterNodeForAdminResponse unmarshall(ListClusterNodeForAdminResponse listClusterNodeForAdminResponse, UnmarshallerContext context) {
		
		listClusterNodeForAdminResponse.setRequestId(context.stringValue("ListClusterNodeForAdminResponse.RequestId"));

		List<ClusterNode> clusterNodeList = new ArrayList<ClusterNode>();
		for (int i = 0; i < context.lengthValue("ListClusterNodeForAdminResponse.ClusterNodeList.Length"); i++) {
			ClusterNode clusterNode = new ClusterNode();
			clusterNode.setClusterId(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].ClusterId"));
			clusterNode.setCpuCore(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].CpuCore"));
			clusterNode.setDaemons(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].Daemons"));
			clusterNode.setDiskDevices(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].DiskDevices"));
			clusterNode.setDiskInfo(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].DiskInfo"));
			clusterNode.setDiskType(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].DiskType"));
			clusterNode.setGmtCreate(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].GmtCreate"));
			clusterNode.setGmtModified(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].GmtModified"));
			clusterNode.setHostName(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].HostName"));
			clusterNode.setId(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].Id"));
			clusterNode.setImageId(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].ImageId"));
			clusterNode.setInnerIpAddress(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].InnerIpAddress"));
			clusterNode.setInstanceId(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].InstanceId"));
			clusterNode.setInstanceType(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].InstanceType"));
			clusterNode.setIsMaster(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].IsMaster"));
			clusterNode.setMemCapacity(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].MemCapacity"));
			clusterNode.setPayment(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].Payment"));
			clusterNode.setPublicIpAddress(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].PublicIpAddress"));
			clusterNode.setRegionId(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].RegionId"));
			clusterNode.setSecurityGroupId(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].SecurityGroupId"));
			clusterNode.setSerialNumber(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].SerialNumber"));
			clusterNode.setStatus(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].Status"));
			clusterNode.setUserId(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].UserId"));
			clusterNode.setZoneId(context.stringValue("ListClusterNodeForAdminResponse.ClusterNodeList["+ i +"].ZoneId"));

			clusterNodeList.add(clusterNode);
		}
		listClusterNodeForAdminResponse.setClusterNodeList(clusterNodeList);
	 
	 	return listClusterNodeForAdminResponse;
	}
}