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
		listClustersResponse.setHttpCode(_ctx.stringValue("ListClustersResponse.HttpCode"));
		listClustersResponse.setTotalCount(_ctx.integerValue("ListClustersResponse.TotalCount"));
		listClustersResponse.setMessage(_ctx.stringValue("ListClustersResponse.Message"));
		listClustersResponse.setPageSize(_ctx.integerValue("ListClustersResponse.PageSize"));
		listClustersResponse.setPageNumber(_ctx.integerValue("ListClustersResponse.PageNumber"));
		listClustersResponse.setErrorCode(_ctx.stringValue("ListClustersResponse.ErrorCode"));
		listClustersResponse.setSuccess(_ctx.booleanValue("ListClustersResponse.Success"));

		List<ClusterForListModel> data = new ArrayList<ClusterForListModel>();
		for (int i = 0; i < _ctx.lengthValue("ListClustersResponse.Data.Length"); i++) {
			ClusterForListModel clusterForListModel = new ClusterForListModel();
			clusterForListModel.setEndDate(_ctx.stringValue("ListClustersResponse.Data["+ i +"].EndDate"));
			clusterForListModel.setIntranetDomain(_ctx.stringValue("ListClustersResponse.Data["+ i +"].IntranetDomain"));
			clusterForListModel.setInternetDomain(_ctx.stringValue("ListClustersResponse.Data["+ i +"].InternetDomain"));
			clusterForListModel.setCreateTime(_ctx.stringValue("ListClustersResponse.Data["+ i +"].CreateTime"));
			clusterForListModel.setChargeType(_ctx.stringValue("ListClustersResponse.Data["+ i +"].ChargeType"));
			clusterForListModel.setIntranetAddress(_ctx.stringValue("ListClustersResponse.Data["+ i +"].IntranetAddress"));
			clusterForListModel.setInstanceId(_ctx.stringValue("ListClustersResponse.Data["+ i +"].InstanceId"));
			clusterForListModel.setInternetAddress(_ctx.stringValue("ListClustersResponse.Data["+ i +"].InternetAddress"));
			clusterForListModel.setClusterAliasName(_ctx.stringValue("ListClustersResponse.Data["+ i +"].ClusterAliasName"));
			clusterForListModel.setClusterType(_ctx.stringValue("ListClustersResponse.Data["+ i +"].ClusterType"));
			clusterForListModel.setInitStatus(_ctx.stringValue("ListClustersResponse.Data["+ i +"].InitStatus"));
			clusterForListModel.setAppVersion(_ctx.stringValue("ListClustersResponse.Data["+ i +"].AppVersion"));
			clusterForListModel.setClusterId(_ctx.stringValue("ListClustersResponse.Data["+ i +"].ClusterId"));
			clusterForListModel.setCanUpdate(_ctx.booleanValue("ListClustersResponse.Data["+ i +"].CanUpdate"));
			clusterForListModel.setVersionCode(_ctx.stringValue("ListClustersResponse.Data["+ i +"].VersionCode"));
			clusterForListModel.setInstanceCount(_ctx.longValue("ListClustersResponse.Data["+ i +"].InstanceCount"));

			data.add(clusterForListModel);
		}
		listClustersResponse.setData(data);
	 
	 	return listClustersResponse;
	}
}