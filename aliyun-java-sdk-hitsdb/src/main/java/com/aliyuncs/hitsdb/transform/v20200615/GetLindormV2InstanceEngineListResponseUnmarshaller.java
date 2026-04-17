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

import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceEngineListResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceEngineListResponse.EngineInfo;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceEngineListResponse.EngineInfo.NetInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLindormV2InstanceEngineListResponseUnmarshaller {

	public static GetLindormV2InstanceEngineListResponse unmarshall(GetLindormV2InstanceEngineListResponse getLindormV2InstanceEngineListResponse, UnmarshallerContext _ctx) {
		
		getLindormV2InstanceEngineListResponse.setRequestId(_ctx.stringValue("GetLindormV2InstanceEngineListResponse.RequestId"));
		getLindormV2InstanceEngineListResponse.setInstanceId(_ctx.stringValue("GetLindormV2InstanceEngineListResponse.InstanceId"));
		getLindormV2InstanceEngineListResponse.setAccessDeniedDetail(_ctx.stringValue("GetLindormV2InstanceEngineListResponse.AccessDeniedDetail"));

		List<EngineInfo> engineList = new ArrayList<EngineInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetLindormV2InstanceEngineListResponse.EngineList.Length"); i++) {
			EngineInfo engineInfo = new EngineInfo();
			engineInfo.setEngineType(_ctx.stringValue("GetLindormV2InstanceEngineListResponse.EngineList["+ i +"].EngineType"));

			List<NetInfo> netInfoList = new ArrayList<NetInfo>();
			for (int j = 0; j < _ctx.lengthValue("GetLindormV2InstanceEngineListResponse.EngineList["+ i +"].NetInfoList.Length"); j++) {
				NetInfo netInfo = new NetInfo();
				netInfo.setAccessType(_ctx.integerValue("GetLindormV2InstanceEngineListResponse.EngineList["+ i +"].NetInfoList["+ j +"].AccessType"));
				netInfo.setPort(_ctx.integerValue("GetLindormV2InstanceEngineListResponse.EngineList["+ i +"].NetInfoList["+ j +"].Port"));
				netInfo.setConnectionString(_ctx.stringValue("GetLindormV2InstanceEngineListResponse.EngineList["+ i +"].NetInfoList["+ j +"].ConnectionString"));
				netInfo.setNetType(_ctx.stringValue("GetLindormV2InstanceEngineListResponse.EngineList["+ i +"].NetInfoList["+ j +"].NetType"));

				netInfoList.add(netInfo);
			}
			engineInfo.setNetInfoList(netInfoList);

			engineList.add(engineInfo);
		}
		getLindormV2InstanceEngineListResponse.setEngineList(engineList);
	 
	 	return getLindormV2InstanceEngineListResponse;
	}
}