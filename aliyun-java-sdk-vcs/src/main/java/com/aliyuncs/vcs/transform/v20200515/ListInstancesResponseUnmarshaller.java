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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListInstancesResponse;
import com.aliyuncs.vcs.model.v20200515.ListInstancesResponse.Data;
import com.aliyuncs.vcs.model.v20200515.ListInstancesResponse.Data.ItemsItem;
import com.aliyuncs.vcs.model.v20200515.ListInstancesResponse.Data.ItemsItem.AlgorithmsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setMessage(_ctx.stringValue("ListInstancesResponse.Message"));
		listInstancesResponse.setCode(_ctx.stringValue("ListInstancesResponse.Code"));
		listInstancesResponse.setSuccess(_ctx.booleanValue("ListInstancesResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("ListInstancesResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("ListInstancesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListInstancesResponse.Data.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Data.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setStatus(_ctx.stringValue("ListInstancesResponse.Data.Items["+ i +"].Status"));
			itemsItem.setInstanceName(_ctx.stringValue("ListInstancesResponse.Data.Items["+ i +"].InstanceName"));
			itemsItem.setCreateTime(_ctx.longValue("ListInstancesResponse.Data.Items["+ i +"].CreateTime"));
			itemsItem.setDeviceNumber(_ctx.integerValue("ListInstancesResponse.Data.Items["+ i +"].DeviceNumber"));
			itemsItem.setInstanceId(_ctx.stringValue("ListInstancesResponse.Data.Items["+ i +"].InstanceId"));
			itemsItem.setAcuUsed(_ctx.integerValue("ListInstancesResponse.Data.Items["+ i +"].AcuUsed"));

			List<AlgorithmsItem> algorithms = new ArrayList<AlgorithmsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.Data.Items["+ i +"].Algorithms.Length"); j++) {
				AlgorithmsItem algorithmsItem = new AlgorithmsItem();
				algorithmsItem.setAlgorithmName(_ctx.stringValue("ListInstancesResponse.Data.Items["+ i +"].Algorithms["+ j +"].AlgorithmName"));
				algorithmsItem.setAlgorithmId(_ctx.stringValue("ListInstancesResponse.Data.Items["+ i +"].Algorithms["+ j +"].AlgorithmId"));

				algorithms.add(algorithmsItem);
			}
			itemsItem.setAlgorithms(algorithms);

			items.add(itemsItem);
		}
		data.setItems(items);
		listInstancesResponse.setData(data);
	 
	 	return listInstancesResponse;
	}
}