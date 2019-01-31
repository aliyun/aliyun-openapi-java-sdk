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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListClusterMembersResponse;
import com.aliyuncs.edas.model.v20170801.ListClusterMembersResponse.ClusterMemberPage;
import com.aliyuncs.edas.model.v20170801.ListClusterMembersResponse.ClusterMemberPage.ClusterMember;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterMembersResponseUnmarshaller {

	public static ListClusterMembersResponse unmarshall(ListClusterMembersResponse listClusterMembersResponse, UnmarshallerContext context) {
		
		listClusterMembersResponse.setRequestId(context.stringValue("ListClusterMembersResponse.RequestId"));
		listClusterMembersResponse.setCode(context.integerValue("ListClusterMembersResponse.Code"));
		listClusterMembersResponse.setMessage(context.stringValue("ListClusterMembersResponse.Message"));

		ClusterMemberPage clusterMemberPage = new ClusterMemberPage();
		clusterMemberPage.setCurrentPage(context.integerValue("ListClusterMembersResponse.ClusterMemberPage.CurrentPage"));
		clusterMemberPage.setPageSize(context.integerValue("ListClusterMembersResponse.ClusterMemberPage.PageSize"));
		clusterMemberPage.setTotalSize(context.integerValue("ListClusterMembersResponse.ClusterMemberPage.TotalSize"));

		List<ClusterMember> clusterMemberList = new ArrayList<ClusterMember>();
		for (int i = 0; i < context.lengthValue("ListClusterMembersResponse.ClusterMemberPage.ClusterMemberList.Length"); i++) {
			ClusterMember clusterMember = new ClusterMember();
			clusterMember.setClusterMemberId(context.stringValue("ListClusterMembersResponse.ClusterMemberPage.ClusterMemberList["+ i +"].ClusterMemberId"));
			clusterMember.setClusterId(context.stringValue("ListClusterMembersResponse.ClusterMemberPage.ClusterMemberList["+ i +"].ClusterId"));
			clusterMember.setEcuId(context.stringValue("ListClusterMembersResponse.ClusterMemberPage.ClusterMemberList["+ i +"].EcuId"));
			clusterMember.setEcsId(context.stringValue("ListClusterMembersResponse.ClusterMemberPage.ClusterMemberList["+ i +"].EcsId"));
			clusterMember.setStatus(context.integerValue("ListClusterMembersResponse.ClusterMemberPage.ClusterMemberList["+ i +"].Status"));
			clusterMember.setCreateTime(context.integerValue("ListClusterMembersResponse.ClusterMemberPage.ClusterMemberList["+ i +"].CreateTime"));
			clusterMember.setUpdateTime(context.integerValue("ListClusterMembersResponse.ClusterMemberPage.ClusterMemberList["+ i +"].UpdateTime"));

			clusterMemberList.add(clusterMember);
		}
		clusterMemberPage.setClusterMemberList(clusterMemberList);
		listClusterMembersResponse.setClusterMemberPage(clusterMemberPage);
	 
	 	return listClusterMembersResponse;
	}
}