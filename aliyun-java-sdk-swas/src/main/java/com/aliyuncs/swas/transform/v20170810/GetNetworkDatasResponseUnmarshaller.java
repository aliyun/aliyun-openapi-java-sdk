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

import com.aliyuncs.swas.model.v20170810.GetNetworkDatasResponse;
import com.aliyuncs.swas.model.v20170810.GetNetworkDatasResponse.MonitorData;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNetworkDatasResponseUnmarshaller {

	public static GetNetworkDatasResponse unmarshall(GetNetworkDatasResponse getNetworkDatasResponse, UnmarshallerContext _ctx) {
		
		getNetworkDatasResponse.setRequestId(_ctx.stringValue("GetNetworkDatasResponse.RequestId"));
		getNetworkDatasResponse.setIsSuccess(_ctx.booleanValue("GetNetworkDatasResponse.IsSuccess"));
		getNetworkDatasResponse.setCode(_ctx.stringValue("GetNetworkDatasResponse.Code"));

		List<MonitorData> datas = new ArrayList<MonitorData>();
		for (int i = 0; i < _ctx.lengthValue("GetNetworkDatasResponse.datas.Length"); i++) {
			MonitorData monitorData = new MonitorData();
			monitorData.setInValue(_ctx.stringValue("GetNetworkDatasResponse.datas["+ i +"].InValue"));
			monitorData.setOutValue(_ctx.stringValue("GetNetworkDatasResponse.datas["+ i +"].OutValue"));
			monitorData.setTimestamp(_ctx.stringValue("GetNetworkDatasResponse.datas["+ i +"].Timestamp"));

			datas.add(monitorData);
		}
		getNetworkDatasResponse.setDatas(datas);
	 
	 	return getNetworkDatasResponse;
	}
}