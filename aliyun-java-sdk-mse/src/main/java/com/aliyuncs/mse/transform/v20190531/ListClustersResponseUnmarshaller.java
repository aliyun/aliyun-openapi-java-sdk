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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListClustersResponse;
import com.aliyuncs.mse.model.v20190531.ListClustersResponse.ClusterForListModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClustersResponseUnmarshaller {

	public static ListClustersResponse unmarshall(ListClustersResponse listClustersResponse, UnmarshallerContext _ctx) {
		
		listClustersResponse.setRequestId(_ctx.stringValue("ListClustersResponse.RequestId"));
		listClustersResponse.setSuccess(_ctx.booleanValue("ListClustersResponse.Success"));
		listClustersResponse.setMessage(_ctx.stringValue("ListClustersResponse.Message"));
		listClustersResponse.setErrorCode(_ctx.stringValue("ListClustersResponse.ErrorCode"));
		listClustersResponse.setPageNumber(_ctx.integerValue("ListClustersResponse.PageNumber"));
		listClustersResponse.setPageSize(_ctx.integerValue("ListClustersResponse.PageSize"));
		listClustersResponse.setTotalCount(_ctx.integerValue("ListClustersResponse.TotalCount"));
		listClustersResponse.setHttpCode(_ctx.stringValue("ListClustersResponse.HttpCode"));

		List<ClusterForListModel> data = new ArrayList<ClusterForListModel>();
		for (int i = 0; i < _ctx.lengthValue("ListClustersResponse.Data.Length"); i++) {
			ClusterForListModel clusterForListModel = new ClusterForListModel();
			clusterForListModel.setClusterId(_ctx.stringValue("ListClustersResponse.Data["+ i +"].ClusterId"));
			clusterForListModel.setClusterAliasName(_ctx.stringValue("ListClustersResponse.Data["+ i +"].ClusterAliasName"));
			clusterForListModel.setInitStatus(_ctx.stringValue("ListClustersResponse.Data["+ i +"].InitStatus"));
			clusterForListModel.setIntranetDomain(_ctx.stringValue("ListClustersResponse.Data["+ i +"].IntranetDomain"));
			clusterForListModel.setCreateTime(_ctx.stringValue("ListClustersResponse.Data["+ i +"].CreateTime"));
			clusterForListModel.setInternetAddress(_ctx.stringValue("ListClustersResponse.Data["+ i +"].InternetAddress"));
			clusterForListModel.setIntranetAddress(_ctx.stringValue("ListClustersResponse.Data["+ i +"].IntranetAddress"));
			clusterForListModel.setInternetDomain(_ctx.stringValue("ListClustersResponse.Data["+ i +"].InternetDomain"));
			clusterForListModel.setClusterType(_ctx.stringValue("ListClustersResponse.Data["+ i +"].ClusterType"));
			clusterForListModel.setChargeType(_ctx.stringValue("ListClustersResponse.Data["+ i +"].ChargeType"));
			clusterForListModel.setEndDate(_ctx.stringValue("ListClustersResponse.Data["+ i +"].EndDate"));
			clusterForListModel.setInstanceId(_ctx.stringValue("ListClustersResponse.Data["+ i +"].InstanceId"));

			data.add(clusterForListModel);
		}
		listClustersResponse.setData(data);
	 
	 	return listClustersResponse;
	}
}