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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.BatchJobSubmitResponse;
import com.aliyuncs.cloud_siem.model.v20220616.BatchJobSubmitResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.BatchJobSubmitResponse.Data.ConfigListItem;
import com.aliyuncs.cloud_siem.model.v20220616.BatchJobSubmitResponse.Data.ConfigListItem.ProductListItem;
import com.aliyuncs.cloud_siem.model.v20220616.BatchJobSubmitResponse.Data.ConfigListItem.ProductListItem.LogListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchJobSubmitResponseUnmarshaller {

	public static BatchJobSubmitResponse unmarshall(BatchJobSubmitResponse batchJobSubmitResponse, UnmarshallerContext _ctx) {
		
		batchJobSubmitResponse.setRequestId(_ctx.stringValue("BatchJobSubmitResponse.RequestId"));
		batchJobSubmitResponse.setSuccess(_ctx.booleanValue("BatchJobSubmitResponse.Success"));
		batchJobSubmitResponse.setCode(_ctx.integerValue("BatchJobSubmitResponse.Code"));
		batchJobSubmitResponse.setMessage(_ctx.stringValue("BatchJobSubmitResponse.Message"));
		batchJobSubmitResponse.setErrCode(_ctx.stringValue("BatchJobSubmitResponse.ErrCode"));

		Data data = new Data();
		data.setSubmitId(_ctx.stringValue("BatchJobSubmitResponse.Data.SubmitId"));
		data.setTaskCount(_ctx.integerValue("BatchJobSubmitResponse.Data.TaskCount"));
		data.setConfigId(_ctx.stringValue("BatchJobSubmitResponse.Data.ConfigId"));

		List<ConfigListItem> configList = new ArrayList<ConfigListItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchJobSubmitResponse.Data.ConfigList.Length"); i++) {
			ConfigListItem configListItem = new ConfigListItem();
			configListItem.setUserId(_ctx.longValue("BatchJobSubmitResponse.Data.ConfigList["+ i +"].UserId"));

			List<ProductListItem> productList = new ArrayList<ProductListItem>();
			for (int j = 0; j < _ctx.lengthValue("BatchJobSubmitResponse.Data.ConfigList["+ i +"].ProductList.Length"); j++) {
				ProductListItem productListItem = new ProductListItem();
				productListItem.setProductCode(_ctx.stringValue("BatchJobSubmitResponse.Data.ConfigList["+ i +"].ProductList["+ j +"].ProductCode"));

				List<LogListItem> logList = new ArrayList<LogListItem>();
				for (int k = 0; k < _ctx.lengthValue("BatchJobSubmitResponse.Data.ConfigList["+ i +"].ProductList["+ j +"].LogList.Length"); k++) {
					LogListItem logListItem = new LogListItem();
					logListItem.setProductCode(_ctx.stringValue("BatchJobSubmitResponse.Data.ConfigList["+ i +"].ProductList["+ j +"].LogList["+ k +"].ProductCode"));
					logListItem.setLogCode(_ctx.stringValue("BatchJobSubmitResponse.Data.ConfigList["+ i +"].ProductList["+ j +"].LogList["+ k +"].LogCode"));
					logListItem.setRegionCode(_ctx.stringValue("BatchJobSubmitResponse.Data.ConfigList["+ i +"].ProductList["+ j +"].LogList["+ k +"].RegionCode"));
					logListItem.setProjectNamePattern(_ctx.stringValue("BatchJobSubmitResponse.Data.ConfigList["+ i +"].ProductList["+ j +"].LogList["+ k +"].ProjectNamePattern"));
					logListItem.setLogStoreNamePattern(_ctx.stringValue("BatchJobSubmitResponse.Data.ConfigList["+ i +"].ProductList["+ j +"].LogList["+ k +"].LogStoreNamePattern"));
					logListItem.setErrorCode(_ctx.stringValue("BatchJobSubmitResponse.Data.ConfigList["+ i +"].ProductList["+ j +"].LogList["+ k +"].ErrorCode"));

					logList.add(logListItem);
				}
				productListItem.setLogList(logList);

				productList.add(productListItem);
			}
			configListItem.setProductList(productList);

			configList.add(configListItem);
		}
		data.setConfigList(configList);
		batchJobSubmitResponse.setData(data);
	 
	 	return batchJobSubmitResponse;
	}
}