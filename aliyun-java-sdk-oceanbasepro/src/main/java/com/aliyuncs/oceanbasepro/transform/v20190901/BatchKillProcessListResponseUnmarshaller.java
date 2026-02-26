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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.BatchKillProcessListResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.BatchKillProcessListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchKillProcessListResponseUnmarshaller {

	public static BatchKillProcessListResponse unmarshall(BatchKillProcessListResponse batchKillProcessListResponse, UnmarshallerContext _ctx) {
		
		batchKillProcessListResponse.setRequestId(_ctx.stringValue("BatchKillProcessListResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchKillProcessListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSuccess(_ctx.booleanValue("BatchKillProcessListResponse.Data["+ i +"].Success"));

			data.add(dataItem);
		}
		batchKillProcessListResponse.setData(data);
	 
	 	return batchKillProcessListResponse;
	}
}