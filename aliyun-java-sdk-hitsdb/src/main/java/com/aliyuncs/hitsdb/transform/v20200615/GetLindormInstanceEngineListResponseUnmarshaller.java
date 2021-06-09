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

package com.aliyuncs.hitsdb.transform.v20200615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20200615.GetLindormInstanceEngineListResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormInstanceEngineListResponse.EngineInfo;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormInstanceEngineListResponse.EngineInfo.NetInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLindormInstanceEngineListResponseUnmarshaller {

	public static GetLindormInstanceEngineListResponse unmarshall(GetLindormInstanceEngineListResponse getLindormInstanceEngineListResponse, UnmarshallerContext _ctx) {
		
		getLindormInstanceEngineListResponse.setRequestId(_ctx.stringValue("GetLindormInstanceEngineListResponse.RequestId"));
		getLindormInstanceEngineListResponse.setInstanceId(_ctx.stringValue("GetLindormInstanceEngineListResponse.InstanceId"));

		List<EngineInfo> engineList = new ArrayList<EngineInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetLindormInstanceEngineListResponse.EngineList.Length"); i++) {
			EngineInfo engineInfo = new EngineInfo();
			engineInfo.setEngineType(_ctx.stringValue("GetLindormInstanceEngineListResponse.EngineList["+ i +"].EngineType"));

			List<NetInfo> netInfoList = new ArrayList<NetInfo>();
			for (int j = 0; j < _ctx.lengthValue("GetLindormInstanceEngineListResponse.EngineList["+ i +"].NetInfoList.Length"); j++) {
				NetInfo netInfo = new NetInfo();
				netInfo.setNetType(_ctx.stringValue("GetLindormInstanceEngineListResponse.EngineList["+ i +"].NetInfoList["+ j +"].NetType"));
				netInfo.setConnectionString(_ctx.stringValue("GetLindormInstanceEngineListResponse.EngineList["+ i +"].NetInfoList["+ j +"].ConnectionString"));
				netInfo.setPort(_ctx.integerValue("GetLindormInstanceEngineListResponse.EngineList["+ i +"].NetInfoList["+ j +"].Port"));
				netInfo.setAccessType(_ctx.integerValue("GetLindormInstanceEngineListResponse.EngineList["+ i +"].NetInfoList["+ j +"].AccessType"));

				netInfoList.add(netInfo);
			}
			engineInfo.setNetInfoList(netInfoList);

			engineList.add(engineInfo);
		}
		getLindormInstanceEngineListResponse.setEngineList(engineList);
	 
	 	return getLindormInstanceEngineListResponse;
	}
}