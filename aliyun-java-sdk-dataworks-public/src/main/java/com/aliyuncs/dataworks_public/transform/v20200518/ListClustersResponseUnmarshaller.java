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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListClustersResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListClustersResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListClustersResponse.Data.ClustersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClustersResponseUnmarshaller {

	public static ListClustersResponse unmarshall(ListClustersResponse listClustersResponse, UnmarshallerContext _ctx) {
		
		listClustersResponse.setRequestId(_ctx.stringValue("ListClustersResponse.RequestId"));
		listClustersResponse.setSuccess(_ctx.booleanValue("ListClustersResponse.Success"));
		listClustersResponse.setErrorCode(_ctx.stringValue("ListClustersResponse.ErrorCode"));
		listClustersResponse.setErrorMessage(_ctx.stringValue("ListClustersResponse.ErrorMessage"));
		listClustersResponse.setHttpStatusCode(_ctx.integerValue("ListClustersResponse.HttpStatusCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListClustersResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListClustersResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListClustersResponse.Data.TotalCount"));

		List<ClustersItem> clusters = new ArrayList<ClustersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClustersResponse.Data.Clusters.Length"); i++) {
			ClustersItem clustersItem = new ClustersItem();
			clustersItem.setClusterId(_ctx.longValue("ListClustersResponse.Data.Clusters["+ i +"].ClusterId"));
			clustersItem.setClusterBizId(_ctx.stringValue("ListClustersResponse.Data.Clusters["+ i +"].ClusterBizId"));

			clusters.add(clustersItem);
		}
		data.setClusters(clusters);
		listClustersResponse.setData(data);
	 
	 	return listClustersResponse;
	}
}