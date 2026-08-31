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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListComputeClustersResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListComputeClustersResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListComputeClustersResponse.PageResult.ClusterListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListComputeClustersResponseUnmarshaller {

	public static ListComputeClustersResponse unmarshall(ListComputeClustersResponse listComputeClustersResponse, UnmarshallerContext _ctx) {
		
		listComputeClustersResponse.setRequestId(_ctx.stringValue("ListComputeClustersResponse.RequestId"));
		listComputeClustersResponse.setMessage(_ctx.stringValue("ListComputeClustersResponse.Message"));
		listComputeClustersResponse.setNextToken(_ctx.stringValue("ListComputeClustersResponse.NextToken"));
		listComputeClustersResponse.setMaxResults(_ctx.integerValue("ListComputeClustersResponse.MaxResults"));
		listComputeClustersResponse.setHttpStatusCode(_ctx.integerValue("ListComputeClustersResponse.HttpStatusCode"));
		listComputeClustersResponse.setCode(_ctx.stringValue("ListComputeClustersResponse.Code"));
		listComputeClustersResponse.setSuccess(_ctx.booleanValue("ListComputeClustersResponse.Success"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListComputeClustersResponse.PageResult.TotalCount"));

		List<ClusterListItem> clusterList = new ArrayList<ClusterListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListComputeClustersResponse.PageResult.ClusterList.Length"); i++) {
			ClusterListItem clusterListItem = new ClusterListItem();
			clusterListItem.setModifyTime(_ctx.stringValue("ListComputeClustersResponse.PageResult.ClusterList["+ i +"].ModifyTime"));
			clusterListItem.setDes(_ctx.stringValue("ListComputeClustersResponse.PageResult.ClusterList["+ i +"].Des"));
			clusterListItem.setModifierName(_ctx.stringValue("ListComputeClustersResponse.PageResult.ClusterList["+ i +"].ModifierName"));
			clusterListItem.setCreateTime(_ctx.stringValue("ListComputeClustersResponse.PageResult.ClusterList["+ i +"].CreateTime"));
			clusterListItem.setTypeVersion(_ctx.stringValue("ListComputeClustersResponse.PageResult.ClusterList["+ i +"].TypeVersion"));
			clusterListItem.setId(_ctx.longValue("ListComputeClustersResponse.PageResult.ClusterList["+ i +"].Id"));
			clusterListItem.setCreator(_ctx.stringValue("ListComputeClustersResponse.PageResult.ClusterList["+ i +"].Creator"));
			clusterListItem.setModifier(_ctx.stringValue("ListComputeClustersResponse.PageResult.ClusterList["+ i +"].Modifier"));
			clusterListItem.setCreatorName(_ctx.stringValue("ListComputeClustersResponse.PageResult.ClusterList["+ i +"].CreatorName"));
			clusterListItem.setName(_ctx.stringValue("ListComputeClustersResponse.PageResult.ClusterList["+ i +"].Name"));

			clusterList.add(clusterListItem);
		}
		pageResult.setClusterList(clusterList);
		listComputeClustersResponse.setPageResult(pageResult);
	 
	 	return listComputeClustersResponse;
	}
}