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

package com.aliyuncs.mns.transform.v20210319;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mns.model.v20210319.ListLoggingConfigResponse;
import com.aliyuncs.mns.model.v20210319.ListLoggingConfigResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLoggingConfigResponseUnmarshaller {

	public static ListLoggingConfigResponse unmarshall(ListLoggingConfigResponse listLoggingConfigResponse, UnmarshallerContext _ctx) {
		
		listLoggingConfigResponse.setRequestId(_ctx.stringValue("ListLoggingConfigResponse.RequestId"));
		listLoggingConfigResponse.setCode(_ctx.longValue("ListLoggingConfigResponse.Code"));
		listLoggingConfigResponse.setStatus(_ctx.stringValue("ListLoggingConfigResponse.Status"));
		listLoggingConfigResponse.setMessage(_ctx.stringValue("ListLoggingConfigResponse.Message"));
		listLoggingConfigResponse.setSuccess(_ctx.booleanValue("ListLoggingConfigResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLoggingConfigResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRegionId(_ctx.stringValue("ListLoggingConfigResponse.Data["+ i +"].RegionId"));
			dataItem.setRegionName(_ctx.stringValue("ListLoggingConfigResponse.Data["+ i +"].RegionName"));
			dataItem.setBucketName(_ctx.stringValue("ListLoggingConfigResponse.Data["+ i +"].BucketName"));

			data.add(dataItem);
		}
		listLoggingConfigResponse.setData(data);
	 
	 	return listLoggingConfigResponse;
	}
}