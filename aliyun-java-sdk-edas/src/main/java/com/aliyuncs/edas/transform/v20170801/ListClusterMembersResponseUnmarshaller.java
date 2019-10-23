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

	public static ListClusterMembersResponse unmarshall(ListClusterMembersResponse listClusterMembersResponse, UnmarshallerContext _ctx) {
		
		listClusterMembersResponse.setRequestId(_ctx.stringValue("ListClusterMembersResponse.RequestId"));
		listClusterMembersResponse.setCode(_ctx.integerValue("ListClusterMembersResponse.Code"));
		listClusterMembersResponse.setMessage(_ctx.stringValue("ListClusterMembersResponse.Message"));

		ClusterMemberPage clusterMemberPage = new ClusterMemberPage();
		clusterMemberPage.setCurrentPage(_ctx.integerValue("ListClusterMembersResponse.ClusterMemberPage.CurrentPage"));
		clusterMemberPage.setPageSize(_ctx.integerValue("ListClusterMembersResponse.ClusterMemberPage.PageSize"));
		clusterMemberPage.setTotalSize(_ctx.integerValue("ListClusterMembersResponse.ClusterMemberPage.TotalSize"));

		List<ClusterMember> clusterMemberList = new ArrayList<ClusterMember>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterMembersResponse.ClusterMemberPage.ClusterMemberList.Length"); i++) {
			ClusterMember clusterMember = new ClusterMember();
			clusterMember.setClusterMemberId(_ctx.stringValue("ListClusterMembersResponse.ClusterMemberPage.ClusterMemberList["+ i +"].ClusterMemberId"));
			clusterMember.setClusterId(_ctx.stringValue("ListClusterMembersResponse.ClusterMemberPage.ClusterMemberList["+ i +"].ClusterId"));
			clusterMember.setEcuId(_ctx.stringValue("ListClusterMembersResponse.ClusterMemberPage.ClusterMemberList["+ i +"].EcuId"));
			clusterMember.setEcsId(_ctx.stringValue("ListClusterMembersResponse.ClusterMemberPage.ClusterMemberList["+ i +"].EcsId"));
			clusterMember.setStatus(_ctx.integerValue("ListClusterMembersResponse.ClusterMemberPage.ClusterMemberList["+ i +"].Status"));
			clusterMember.setCreateTime(_ctx.longValue("ListClusterMembersResponse.ClusterMemberPage.ClusterMemberList["+ i +"].CreateTime"));
			clusterMember.setUpdateTime(_ctx.longValue("ListClusterMembersResponse.ClusterMemberPage.ClusterMemberList["+ i +"].UpdateTime"));

			clusterMemberList.add(clusterMember);
		}
		clusterMemberPage.setClusterMemberList(clusterMemberList);
		listClusterMembersResponse.setClusterMemberPage(clusterMemberPage);
	 
	 	return listClusterMembersResponse;
	}
}