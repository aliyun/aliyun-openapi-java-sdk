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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.BatchCreateQualityProjectsResponse;
import com.aliyuncs.aiccs.model.v20191015.BatchCreateQualityProjectsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCreateQualityProjectsResponseUnmarshaller {

	public static BatchCreateQualityProjectsResponse unmarshall(BatchCreateQualityProjectsResponse batchCreateQualityProjectsResponse, UnmarshallerContext _ctx) {
		
		batchCreateQualityProjectsResponse.setRequestId(_ctx.stringValue("BatchCreateQualityProjectsResponse.RequestId"));
		batchCreateQualityProjectsResponse.setMessage(_ctx.stringValue("BatchCreateQualityProjectsResponse.Message"));
		batchCreateQualityProjectsResponse.setCode(_ctx.stringValue("BatchCreateQualityProjectsResponse.Code"));
		batchCreateQualityProjectsResponse.setSuccess(_ctx.booleanValue("BatchCreateQualityProjectsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchCreateQualityProjectsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setInstanceId(_ctx.stringValue("BatchCreateQualityProjectsResponse.Data["+ i +"].InstanceId"));
			dataItem.setVersion(_ctx.integerValue("BatchCreateQualityProjectsResponse.Data["+ i +"].Version"));
			dataItem.setProjectId(_ctx.longValue("BatchCreateQualityProjectsResponse.Data["+ i +"].ProjectId"));

			data.add(dataItem);
		}
		batchCreateQualityProjectsResponse.setData(data);
	 
	 	return batchCreateQualityProjectsResponse;
	}
}