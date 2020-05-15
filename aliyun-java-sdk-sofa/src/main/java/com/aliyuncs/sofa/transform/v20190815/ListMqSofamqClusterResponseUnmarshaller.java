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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListMqSofamqClusterResponse;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqClusterResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMqSofamqClusterResponseUnmarshaller {

	public static ListMqSofamqClusterResponse unmarshall(ListMqSofamqClusterResponse listMqSofamqClusterResponse, UnmarshallerContext _ctx) {
		
		listMqSofamqClusterResponse.setRequestId(_ctx.stringValue("ListMqSofamqClusterResponse.RequestId"));
		listMqSofamqClusterResponse.setResultCode(_ctx.stringValue("ListMqSofamqClusterResponse.ResultCode"));
		listMqSofamqClusterResponse.setResultMessage(_ctx.stringValue("ListMqSofamqClusterResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMqSofamqClusterResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAppkey(_ctx.stringValue("ListMqSofamqClusterResponse.Data["+ i +"].Appkey"));
			dataItem.setCluster(_ctx.stringValue("ListMqSofamqClusterResponse.Data["+ i +"].Cluster"));
			dataItem.setClusterType(_ctx.stringValue("ListMqSofamqClusterResponse.Data["+ i +"].ClusterType"));
			dataItem.setDeployMode(_ctx.stringValue("ListMqSofamqClusterResponse.Data["+ i +"].DeployMode"));
			dataItem.setGmtCreate(_ctx.stringValue("ListMqSofamqClusterResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListMqSofamqClusterResponse.Data["+ i +"].GmtModified"));
			dataItem.setId(_ctx.longValue("ListMqSofamqClusterResponse.Data["+ i +"].Id"));
			dataItem.setLdcMode(_ctx.stringValue("ListMqSofamqClusterResponse.Data["+ i +"].LdcMode"));
			dataItem.setRemark(_ctx.stringValue("ListMqSofamqClusterResponse.Data["+ i +"].Remark"));

			data.add(dataItem);
		}
		listMqSofamqClusterResponse.setData(data);
	 
	 	return listMqSofamqClusterResponse;
	}
}