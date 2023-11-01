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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeJobStatusResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeJobStatusResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeJobStatusResponse.Data.ErrTaskListItem;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeJobStatusResponse.Data.ErrTaskListItem.ProductListItem;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeJobStatusResponse.Data.ErrTaskListItem.ProductListItem.LogListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobStatusResponseUnmarshaller {

	public static DescribeJobStatusResponse unmarshall(DescribeJobStatusResponse describeJobStatusResponse, UnmarshallerContext _ctx) {
		
		describeJobStatusResponse.setRequestId(_ctx.stringValue("DescribeJobStatusResponse.RequestId"));
		describeJobStatusResponse.setSuccess(_ctx.booleanValue("DescribeJobStatusResponse.Success"));
		describeJobStatusResponse.setCode(_ctx.integerValue("DescribeJobStatusResponse.Code"));
		describeJobStatusResponse.setMessage(_ctx.stringValue("DescribeJobStatusResponse.Message"));
		describeJobStatusResponse.setErrCode(_ctx.stringValue("DescribeJobStatusResponse.ErrCode"));

		Data data = new Data();
		data.setTaskCount(_ctx.integerValue("DescribeJobStatusResponse.Data.TaskCount"));
		data.setFinishCount(_ctx.integerValue("DescribeJobStatusResponse.Data.FinishCount"));
		data.setFailedCount(_ctx.integerValue("DescribeJobStatusResponse.Data.FailedCount"));
		data.setTaskStatus(_ctx.stringValue("DescribeJobStatusResponse.Data.TaskStatus"));
		data.setConfigId(_ctx.stringValue("DescribeJobStatusResponse.Data.ConfigId"));
		data.setFolderId(_ctx.stringValue("DescribeJobStatusResponse.Data.FolderId"));

		List<ErrTaskListItem> errTaskList = new ArrayList<ErrTaskListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobStatusResponse.Data.ErrTaskList.Length"); i++) {
			ErrTaskListItem errTaskListItem = new ErrTaskListItem();
			errTaskListItem.setUserId(_ctx.longValue("DescribeJobStatusResponse.Data.ErrTaskList["+ i +"].UserId"));

			List<ProductListItem> productList = new ArrayList<ProductListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeJobStatusResponse.Data.ErrTaskList["+ i +"].ProductList.Length"); j++) {
				ProductListItem productListItem = new ProductListItem();
				productListItem.setProductCode(_ctx.stringValue("DescribeJobStatusResponse.Data.ErrTaskList["+ i +"].ProductList["+ j +"].ProductCode"));

				List<LogListItem> logList = new ArrayList<LogListItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeJobStatusResponse.Data.ErrTaskList["+ i +"].ProductList["+ j +"].LogList.Length"); k++) {
					LogListItem logListItem = new LogListItem();
					logListItem.setProductCode(_ctx.stringValue("DescribeJobStatusResponse.Data.ErrTaskList["+ i +"].ProductList["+ j +"].LogList["+ k +"].ProductCode"));
					logListItem.setLogCode(_ctx.stringValue("DescribeJobStatusResponse.Data.ErrTaskList["+ i +"].ProductList["+ j +"].LogList["+ k +"].LogCode"));
					logListItem.setRegionCode(_ctx.stringValue("DescribeJobStatusResponse.Data.ErrTaskList["+ i +"].ProductList["+ j +"].LogList["+ k +"].RegionCode"));
					logListItem.setProjectNamePattern(_ctx.stringValue("DescribeJobStatusResponse.Data.ErrTaskList["+ i +"].ProductList["+ j +"].LogList["+ k +"].ProjectNamePattern"));
					logListItem.setLogStoreNamePattern(_ctx.stringValue("DescribeJobStatusResponse.Data.ErrTaskList["+ i +"].ProductList["+ j +"].LogList["+ k +"].LogStoreNamePattern"));
					logListItem.setErrorCode(_ctx.stringValue("DescribeJobStatusResponse.Data.ErrTaskList["+ i +"].ProductList["+ j +"].LogList["+ k +"].ErrorCode"));

					logList.add(logListItem);
				}
				productListItem.setLogList(logList);

				productList.add(productListItem);
			}
			errTaskListItem.setProductList(productList);

			errTaskList.add(errTaskListItem);
		}
		data.setErrTaskList(errTaskList);
		describeJobStatusResponse.setData(data);
	 
	 	return describeJobStatusResponse;
	}
}