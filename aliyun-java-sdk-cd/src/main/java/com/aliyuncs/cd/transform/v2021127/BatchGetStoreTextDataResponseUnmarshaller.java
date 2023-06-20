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

package com.aliyuncs.cd.transform.v2021127;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cd.model.v2021127.BatchGetStoreTextDataResponse;
import com.aliyuncs.cd.model.v2021127.BatchGetStoreTextDataResponse.DataItem;
import com.aliyuncs.cd.model.v2021127.BatchGetStoreTextDataResponse.DataItem.Container;
import com.aliyuncs.cd.model.v2021127.BatchGetStoreTextDataResponse.DataItem.Container.ContainerDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetStoreTextDataResponseUnmarshaller {

	public static BatchGetStoreTextDataResponse unmarshall(BatchGetStoreTextDataResponse batchGetStoreTextDataResponse, UnmarshallerContext _ctx) {
		
		batchGetStoreTextDataResponse.setRequestId(_ctx.stringValue("BatchGetStoreTextDataResponse.RequestId"));
		batchGetStoreTextDataResponse.setSuccess(_ctx.booleanValue("BatchGetStoreTextDataResponse.Success"));
		batchGetStoreTextDataResponse.setMessage(_ctx.stringValue("BatchGetStoreTextDataResponse.Message"));
		batchGetStoreTextDataResponse.setCode(_ctx.stringValue("BatchGetStoreTextDataResponse.Code"));
		batchGetStoreTextDataResponse.setHttpStatusCode(_ctx.integerValue("BatchGetStoreTextDataResponse.HttpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetStoreTextDataResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStoreId(_ctx.stringValue("BatchGetStoreTextDataResponse.Data["+ i +"].StoreId"));

			List<Container> containers = new ArrayList<Container>();
			for (int j = 0; j < _ctx.lengthValue("BatchGetStoreTextDataResponse.Data["+ i +"].Containers.Length"); j++) {
				Container container = new Container();
				container.setType(_ctx.stringValue("BatchGetStoreTextDataResponse.Data["+ i +"].Containers["+ j +"].Type"));
				container.setTitle(_ctx.stringValue("BatchGetStoreTextDataResponse.Data["+ i +"].Containers["+ j +"].Title"));
				container.setVisible(_ctx.integerValue("BatchGetStoreTextDataResponse.Data["+ i +"].Containers["+ j +"].Visible"));

				List<ContainerDataItem> containerData = new ArrayList<ContainerDataItem>();
				for (int k = 0; k < _ctx.lengthValue("BatchGetStoreTextDataResponse.Data["+ i +"].Containers["+ j +"].ContainerData.Length"); k++) {
					ContainerDataItem containerDataItem = new ContainerDataItem();
					containerDataItem.setMark(_ctx.stringValue("BatchGetStoreTextDataResponse.Data["+ i +"].Containers["+ j +"].ContainerData["+ k +"].Mark"));
					containerDataItem.setText(_ctx.stringValue("BatchGetStoreTextDataResponse.Data["+ i +"].Containers["+ j +"].ContainerData["+ k +"].Text"));
					containerDataItem.setSubText(_ctx.stringValue("BatchGetStoreTextDataResponse.Data["+ i +"].Containers["+ j +"].ContainerData["+ k +"].SubText"));
					containerDataItem.setColor(_ctx.stringValue("BatchGetStoreTextDataResponse.Data["+ i +"].Containers["+ j +"].ContainerData["+ k +"].Color"));
					containerDataItem.setBold(_ctx.integerValue("BatchGetStoreTextDataResponse.Data["+ i +"].Containers["+ j +"].ContainerData["+ k +"].Bold"));

					containerData.add(containerDataItem);
				}
				container.setContainerData(containerData);

				containers.add(container);
			}
			dataItem.setContainers(containers);

			data.add(dataItem);
		}
		batchGetStoreTextDataResponse.setData(data);
	 
	 	return batchGetStoreTextDataResponse;
	}
}