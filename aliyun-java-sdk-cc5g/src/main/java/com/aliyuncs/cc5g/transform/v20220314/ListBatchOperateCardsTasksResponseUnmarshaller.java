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

package com.aliyuncs.cc5g.transform.v20220314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cc5g.model.v20220314.ListBatchOperateCardsTasksResponse;
import com.aliyuncs.cc5g.model.v20220314.ListBatchOperateCardsTasksResponse.BatchOperateCardsTask;
import com.aliyuncs.cc5g.model.v20220314.ListBatchOperateCardsTasksResponse.BatchOperateCardsTask.WirelessCloudConnector;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBatchOperateCardsTasksResponseUnmarshaller {

	public static ListBatchOperateCardsTasksResponse unmarshall(ListBatchOperateCardsTasksResponse listBatchOperateCardsTasksResponse, UnmarshallerContext _ctx) {
		
		listBatchOperateCardsTasksResponse.setRequestId(_ctx.stringValue("ListBatchOperateCardsTasksResponse.RequestId"));
		listBatchOperateCardsTasksResponse.setNextToken(_ctx.stringValue("ListBatchOperateCardsTasksResponse.NextToken"));
		listBatchOperateCardsTasksResponse.setMaxResults(_ctx.stringValue("ListBatchOperateCardsTasksResponse.MaxResults"));
		listBatchOperateCardsTasksResponse.setTotalCount(_ctx.stringValue("ListBatchOperateCardsTasksResponse.TotalCount"));

		List<BatchOperateCardsTask> batchOperateCardsTasks = new ArrayList<BatchOperateCardsTask>();
		for (int i = 0; i < _ctx.lengthValue("ListBatchOperateCardsTasksResponse.BatchOperateCardsTasks.Length"); i++) {
			BatchOperateCardsTask batchOperateCardsTask = new BatchOperateCardsTask();
			batchOperateCardsTask.setBatchOperateCardsTaskId(_ctx.stringValue("ListBatchOperateCardsTasksResponse.BatchOperateCardsTasks["+ i +"].BatchOperateCardsTaskId"));
			batchOperateCardsTask.setStatus(_ctx.stringValue("ListBatchOperateCardsTasksResponse.BatchOperateCardsTasks["+ i +"].Status"));
			batchOperateCardsTask.setOperateType(_ctx.stringValue("ListBatchOperateCardsTasksResponse.BatchOperateCardsTasks["+ i +"].OperateType"));
			batchOperateCardsTask.setThreshold(_ctx.stringValue("ListBatchOperateCardsTasksResponse.BatchOperateCardsTasks["+ i +"].Threshold"));
			batchOperateCardsTask.setEffectType(_ctx.stringValue("ListBatchOperateCardsTasksResponse.BatchOperateCardsTasks["+ i +"].EffectType"));
			batchOperateCardsTask.setIccidsOssFilePath(_ctx.stringValue("ListBatchOperateCardsTasksResponse.BatchOperateCardsTasks["+ i +"].IccidsOssFilePath"));
			batchOperateCardsTask.setOperateResultOssFilePath(_ctx.booleanValue("ListBatchOperateCardsTasksResponse.BatchOperateCardsTasks["+ i +"].OperateResultOssFilePath"));
			batchOperateCardsTask.setDescription(_ctx.stringValue("ListBatchOperateCardsTasksResponse.BatchOperateCardsTasks["+ i +"].Description"));
			batchOperateCardsTask.setName(_ctx.stringValue("ListBatchOperateCardsTasksResponse.BatchOperateCardsTasks["+ i +"].Name"));
			batchOperateCardsTask.setCreateTime(_ctx.stringValue("ListBatchOperateCardsTasksResponse.BatchOperateCardsTasks["+ i +"].CreateTime"));

			List<WirelessCloudConnector> wirelessCloudConnectors = new ArrayList<WirelessCloudConnector>();
			for (int j = 0; j < _ctx.lengthValue("ListBatchOperateCardsTasksResponse.BatchOperateCardsTasks["+ i +"].WirelessCloudConnectors.Length"); j++) {
				WirelessCloudConnector wirelessCloudConnector = new WirelessCloudConnector();
				wirelessCloudConnector.setWirelessCloudConnectorId(_ctx.stringValue("ListBatchOperateCardsTasksResponse.BatchOperateCardsTasks["+ i +"].WirelessCloudConnectors["+ j +"].WirelessCloudConnectorId"));
				wirelessCloudConnector.setStatus(_ctx.stringValue("ListBatchOperateCardsTasksResponse.BatchOperateCardsTasks["+ i +"].WirelessCloudConnectors["+ j +"].Status"));

				wirelessCloudConnectors.add(wirelessCloudConnector);
			}
			batchOperateCardsTask.setWirelessCloudConnectors(wirelessCloudConnectors);

			batchOperateCardsTasks.add(batchOperateCardsTask);
		}
		listBatchOperateCardsTasksResponse.setBatchOperateCardsTasks(batchOperateCardsTasks);
	 
	 	return listBatchOperateCardsTasksResponse;
	}
}