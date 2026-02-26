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

import com.aliyuncs.mns.model.v20210319.LoggingConfigResponse;
import com.aliyuncs.mns.model.v20210319.LoggingConfigResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class LoggingConfigResponseUnmarshaller {

	public static LoggingConfigResponse unmarshall(LoggingConfigResponse loggingConfigResponse, UnmarshallerContext _ctx) {
		
		loggingConfigResponse.setRequestId(_ctx.stringValue("LoggingConfigResponse.RequestId"));
		loggingConfigResponse.setCode(_ctx.longValue("LoggingConfigResponse.Code"));
		loggingConfigResponse.setStatus(_ctx.stringValue("LoggingConfigResponse.Status"));
		loggingConfigResponse.setMessage(_ctx.stringValue("LoggingConfigResponse.Message"));
		loggingConfigResponse.setSuccess(_ctx.booleanValue("LoggingConfigResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("LoggingConfigResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRegionId(_ctx.stringValue("LoggingConfigResponse.Data["+ i +"].RegionId"));
			dataItem.setRegionName(_ctx.stringValue("LoggingConfigResponse.Data["+ i +"].RegionName"));
			dataItem.setBucketName(_ctx.stringValue("LoggingConfigResponse.Data["+ i +"].BucketName"));

			data.add(dataItem);
		}
		loggingConfigResponse.setData(data);
	 
	 	return loggingConfigResponse;
	}
}