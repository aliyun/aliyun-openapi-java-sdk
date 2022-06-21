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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetCpuDatasResponse;
import com.aliyuncs.swas.model.v20170810.GetCpuDatasResponse.MonitorData;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCpuDatasResponseUnmarshaller {

	public static GetCpuDatasResponse unmarshall(GetCpuDatasResponse getCpuDatasResponse, UnmarshallerContext _ctx) {
		
		getCpuDatasResponse.setRequestId(_ctx.stringValue("GetCpuDatasResponse.RequestId"));
		getCpuDatasResponse.setIsSuccess(_ctx.booleanValue("GetCpuDatasResponse.IsSuccess"));
		getCpuDatasResponse.setCode(_ctx.stringValue("GetCpuDatasResponse.Code"));

		List<MonitorData> datas = new ArrayList<MonitorData>();
		for (int i = 0; i < _ctx.lengthValue("GetCpuDatasResponse.datas.Length"); i++) {
			MonitorData monitorData = new MonitorData();
			monitorData.setValue(_ctx.stringValue("GetCpuDatasResponse.datas["+ i +"].Value"));
			monitorData.setTimestamp(_ctx.stringValue("GetCpuDatasResponse.datas["+ i +"].Timestamp"));

			datas.add(monitorData);
		}
		getCpuDatasResponse.setDatas(datas);
	 
	 	return getCpuDatasResponse;
	}
}