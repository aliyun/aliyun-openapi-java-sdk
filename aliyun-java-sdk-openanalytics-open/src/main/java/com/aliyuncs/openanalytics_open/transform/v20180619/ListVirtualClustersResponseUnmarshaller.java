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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openanalytics_open.model.v20180619.ListVirtualClustersResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.ListVirtualClustersResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVirtualClustersResponseUnmarshaller {

	public static ListVirtualClustersResponse unmarshall(ListVirtualClustersResponse listVirtualClustersResponse, UnmarshallerContext _ctx) {
		
		listVirtualClustersResponse.setRequestId(_ctx.stringValue("ListVirtualClustersResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVirtualClustersResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreateTime(_ctx.stringValue("ListVirtualClustersResponse.Data["+ i +"].CreateTime"));
			dataItem.setCreatorId(_ctx.stringValue("ListVirtualClustersResponse.Data["+ i +"].CreatorId"));
			dataItem.setName(_ctx.stringValue("ListVirtualClustersResponse.Data["+ i +"].Name"));
			dataItem.setStatus(_ctx.stringValue("ListVirtualClustersResponse.Data["+ i +"].Status"));
			dataItem.setType(_ctx.stringValue("ListVirtualClustersResponse.Data["+ i +"].Type"));
			dataItem.setInstanceId(_ctx.stringValue("ListVirtualClustersResponse.Data["+ i +"].InstanceId"));
			dataItem.setMinCpu(_ctx.stringValue("ListVirtualClustersResponse.Data["+ i +"].MinCpu"));
			dataItem.setMaxCpu(_ctx.stringValue("ListVirtualClustersResponse.Data["+ i +"].MaxCpu"));
			dataItem.setChargeType(_ctx.stringValue("ListVirtualClustersResponse.Data["+ i +"].ChargeType"));

			data.add(dataItem);
		}
		listVirtualClustersResponse.setData(data);
	 
	 	return listVirtualClustersResponse;
	}
}