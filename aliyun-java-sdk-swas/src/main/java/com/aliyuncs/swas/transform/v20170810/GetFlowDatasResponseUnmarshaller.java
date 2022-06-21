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

import com.aliyuncs.swas.model.v20170810.GetFlowDatasResponse;
import com.aliyuncs.swas.model.v20170810.GetFlowDatasResponse.MonitorData;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFlowDatasResponseUnmarshaller {

	public static GetFlowDatasResponse unmarshall(GetFlowDatasResponse getFlowDatasResponse, UnmarshallerContext _ctx) {
		
		getFlowDatasResponse.setRequestId(_ctx.stringValue("GetFlowDatasResponse.RequestId"));
		getFlowDatasResponse.setUnitFlow(_ctx.stringValue("GetFlowDatasResponse.UnitFlow"));
		getFlowDatasResponse.setIsSuccess(_ctx.booleanValue("GetFlowDatasResponse.IsSuccess"));
		getFlowDatasResponse.setCode(_ctx.stringValue("GetFlowDatasResponse.Code"));

		List<MonitorData> datas = new ArrayList<MonitorData>();
		for (int i = 0; i < _ctx.lengthValue("GetFlowDatasResponse.datas.Length"); i++) {
			MonitorData monitorData = new MonitorData();
			monitorData.setInValue(_ctx.stringValue("GetFlowDatasResponse.datas["+ i +"].InValue"));
			monitorData.setOutValue(_ctx.stringValue("GetFlowDatasResponse.datas["+ i +"].OutValue"));
			monitorData.setTimestamp(_ctx.stringValue("GetFlowDatasResponse.datas["+ i +"].Timestamp"));

			datas.add(monitorData);
		}
		getFlowDatasResponse.setDatas(datas);
	 
	 	return getFlowDatasResponse;
	}
}