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

import com.aliyuncs.swas.model.v20170810.GetIOPSDatasResponse;
import com.aliyuncs.swas.model.v20170810.GetIOPSDatasResponse.MonitorData;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIOPSDatasResponseUnmarshaller {

	public static GetIOPSDatasResponse unmarshall(GetIOPSDatasResponse getIOPSDatasResponse, UnmarshallerContext _ctx) {
		
		getIOPSDatasResponse.setRequestId(_ctx.stringValue("GetIOPSDatasResponse.RequestId"));
		getIOPSDatasResponse.setIsSuccess(_ctx.booleanValue("GetIOPSDatasResponse.IsSuccess"));
		getIOPSDatasResponse.setCode(_ctx.stringValue("GetIOPSDatasResponse.Code"));

		List<MonitorData> datas = new ArrayList<MonitorData>();
		for (int i = 0; i < _ctx.lengthValue("GetIOPSDatasResponse.datas.Length"); i++) {
			MonitorData monitorData = new MonitorData();
			monitorData.setWriteValue(_ctx.stringValue("GetIOPSDatasResponse.datas["+ i +"].WriteValue"));
			monitorData.setReadValue(_ctx.stringValue("GetIOPSDatasResponse.datas["+ i +"].ReadValue"));
			monitorData.setTimestamp(_ctx.stringValue("GetIOPSDatasResponse.datas["+ i +"].Timestamp"));

			datas.add(monitorData);
		}
		getIOPSDatasResponse.setDatas(datas);
	 
	 	return getIOPSDatasResponse;
	}
}