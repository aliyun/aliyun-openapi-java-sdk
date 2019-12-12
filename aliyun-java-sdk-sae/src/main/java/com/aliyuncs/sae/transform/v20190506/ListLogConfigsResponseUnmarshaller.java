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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.ListLogConfigsResponse;
import com.aliyuncs.sae.model.v20190506.ListLogConfigsResponse.Data;
import com.aliyuncs.sae.model.v20190506.ListLogConfigsResponse.Data.LogConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLogConfigsResponseUnmarshaller {

	public static ListLogConfigsResponse unmarshall(ListLogConfigsResponse listLogConfigsResponse, UnmarshallerContext _ctx) {
		
		listLogConfigsResponse.setRequestId(_ctx.stringValue("ListLogConfigsResponse.RequestId"));
		listLogConfigsResponse.setCode(_ctx.stringValue("ListLogConfigsResponse.Code"));
		listLogConfigsResponse.setMessage(_ctx.stringValue("ListLogConfigsResponse.Message"));
		listLogConfigsResponse.setSuccess(_ctx.booleanValue("ListLogConfigsResponse.Success"));
		listLogConfigsResponse.setErrorCode(_ctx.stringValue("ListLogConfigsResponse.ErrorCode"));
		listLogConfigsResponse.setTraceId(_ctx.stringValue("ListLogConfigsResponse.TraceId"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("ListLogConfigsResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("ListLogConfigsResponse.Data.PageSize"));
		data.setTotalSize(_ctx.integerValue("ListLogConfigsResponse.Data.TotalSize"));

		List<LogConfig> logConfigs = new ArrayList<LogConfig>();
		for (int i = 0; i < _ctx.lengthValue("ListLogConfigsResponse.Data.LogConfigs.Length"); i++) {
			LogConfig logConfig = new LogConfig();
			logConfig.setConfigName(_ctx.stringValue("ListLogConfigsResponse.Data.LogConfigs["+ i +"].ConfigName"));
			logConfig.setLogDir(_ctx.stringValue("ListLogConfigsResponse.Data.LogConfigs["+ i +"].LogDir"));
			logConfig.setSlsProject(_ctx.stringValue("ListLogConfigsResponse.Data.LogConfigs["+ i +"].SlsProject"));
			logConfig.setSlsLogStore(_ctx.stringValue("ListLogConfigsResponse.Data.LogConfigs["+ i +"].SlsLogStore"));
			logConfig.setStoreType(_ctx.stringValue("ListLogConfigsResponse.Data.LogConfigs["+ i +"].StoreType"));
			logConfig.setLogType(_ctx.stringValue("ListLogConfigsResponse.Data.LogConfigs["+ i +"].LogType"));
			logConfig.setRegionId(_ctx.stringValue("ListLogConfigsResponse.Data.LogConfigs["+ i +"].RegionId"));
			logConfig.setCreateTime(_ctx.stringValue("ListLogConfigsResponse.Data.LogConfigs["+ i +"].CreateTime"));

			logConfigs.add(logConfig);
		}
		data.setLogConfigs(logConfigs);
		listLogConfigsResponse.setData(data);
	 
	 	return listLogConfigsResponse;
	}
}