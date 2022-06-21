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

import com.aliyuncs.swas.model.v20170810.GetMemDatasResponse;
import com.aliyuncs.swas.model.v20170810.GetMemDatasResponse.MonitorData;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMemDatasResponseUnmarshaller {

	public static GetMemDatasResponse unmarshall(GetMemDatasResponse getMemDatasResponse, UnmarshallerContext _ctx) {
		
		getMemDatasResponse.setRequestId(_ctx.stringValue("GetMemDatasResponse.RequestId"));
		getMemDatasResponse.setIsSuccess(_ctx.booleanValue("GetMemDatasResponse.IsSuccess"));
		getMemDatasResponse.setCode(_ctx.stringValue("GetMemDatasResponse.Code"));

		List<MonitorData> datas = new ArrayList<MonitorData>();
		for (int i = 0; i < _ctx.lengthValue("GetMemDatasResponse.datas.Length"); i++) {
			MonitorData monitorData = new MonitorData();
			monitorData.setValue(_ctx.stringValue("GetMemDatasResponse.datas["+ i +"].Value"));
			monitorData.setTimestamp(_ctx.stringValue("GetMemDatasResponse.datas["+ i +"].Timestamp"));

			datas.add(monitorData);
		}
		getMemDatasResponse.setDatas(datas);
	 
	 	return getMemDatasResponse;
	}
}