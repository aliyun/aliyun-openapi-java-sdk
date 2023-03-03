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

import com.aliyuncs.cloud_siem.model.v20220616.BatchJobCheckResponse;
import com.aliyuncs.cloud_siem.model.v20220616.BatchJobCheckResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.BatchJobCheckResponse.Data.ErrTaskListItem;
import com.aliyuncs.cloud_siem.model.v20220616.BatchJobCheckResponse.Data.ErrTaskListItem.ProductListItem;
import com.aliyuncs.cloud_siem.model.v20220616.BatchJobCheckResponse.Data.ErrTaskListItem.ProductListItem.LogListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchJobCheckResponseUnmarshaller {

	public static BatchJobCheckResponse unmarshall(BatchJobCheckResponse batchJobCheckResponse, UnmarshallerContext _ctx) {
		
		batchJobCheckResponse.setRequestId(_ctx.stringValue("BatchJobCheckResponse.RequestId"));
		batchJobCheckResponse.setSuccess(_ctx.booleanValue("BatchJobCheckResponse.Success"));
		batchJobCheckResponse.setCode(_ctx.integerValue("BatchJobCheckResponse.Code"));
		batchJobCheckResponse.setMessage(_ctx.stringValue("BatchJobCheckResponse.Message"));
		batchJobCheckResponse.setErrCode(_ctx.stringValue("BatchJobCheckResponse.ErrCode"));

		Data data = new Data();
		data.setTaskCount(_ctx.integerValue("BatchJobCheckResponse.Data.TaskCount"));
		data.setFinishCount(_ctx.integerValue("BatchJobCheckResponse.Data.FinishCount"));
		data.setFailedCount(_ctx.integerValue("BatchJobCheckResponse.Data.FailedCount"));
		data.setTaskStatus(_ctx.stringValue("BatchJobCheckResponse.Data.TaskStatus"));
		data.setConfigId(_ctx.stringValue("BatchJobCheckResponse.Data.ConfigId"));
		data.setFolderId(_ctx.stringValue("BatchJobCheckResponse.Data.FolderId"));

		List<ErrTaskListItem> errTaskList = new ArrayList<ErrTaskListItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchJobCheckResponse.Data.ErrTaskList.Length"); i++) {
			ErrTaskListItem errTaskListItem = new ErrTaskListItem();
			errTaskListItem.setUserId(_ctx.longValue("BatchJobCheckResponse.Data.ErrTaskList["+ i +"].UserId"));

			List<ProductListItem> productList = new ArrayList<ProductListItem>();
			for (int j = 0; j < _ctx.lengthValue("BatchJobCheckResponse.Data.ErrTaskList["+ i +"].ProductList.Length"); j++) {
				ProductListItem productListItem = new ProductListItem();
				productListItem.setProductCode(_ctx.stringValue("BatchJobCheckResponse.Data.ErrTaskList["+ i +"].ProductList["+ j +"].ProductCode"));

				List<LogListItem> logList = new ArrayList<LogListItem>();
				for (int k = 0; k < _ctx.lengthValue("BatchJobCheckResponse.Data.ErrTaskList["+ i +"].ProductList["+ j +"].LogList.Length"); k++) {
					LogListItem logListItem = new LogListItem();
					logListItem.setProductCode(_ctx.stringValue("BatchJobCheckResponse.Data.ErrTaskList["+ i +"].ProductList["+ j +"].LogList["+ k +"].ProductCode"));
					logListItem.setLogCode(_ctx.stringValue("BatchJobCheckResponse.Data.ErrTaskList["+ i +"].ProductList["+ j +"].LogList["+ k +"].LogCode"));
					logListItem.setRegionCode(_ctx.stringValue("BatchJobCheckResponse.Data.ErrTaskList["+ i +"].ProductList["+ j +"].LogList["+ k +"].RegionCode"));
					logListItem.setProjectNamePattern(_ctx.stringValue("BatchJobCheckResponse.Data.ErrTaskList["+ i +"].ProductList["+ j +"].LogList["+ k +"].ProjectNamePattern"));
					logListItem.setLogStoreNamePattern(_ctx.stringValue("BatchJobCheckResponse.Data.ErrTaskList["+ i +"].ProductList["+ j +"].LogList["+ k +"].LogStoreNamePattern"));
					logListItem.setErrorCode(_ctx.stringValue("BatchJobCheckResponse.Data.ErrTaskList["+ i +"].ProductList["+ j +"].LogList["+ k +"].ErrorCode"));

					logList.add(logListItem);
				}
				productListItem.setLogList(logList);

				productList.add(productListItem);
			}
			errTaskListItem.setProductList(productList);

			errTaskList.add(errTaskListItem);
		}
		data.setErrTaskList(errTaskList);
		batchJobCheckResponse.setData(data);
	 
	 	return batchJobCheckResponse;
	}
}