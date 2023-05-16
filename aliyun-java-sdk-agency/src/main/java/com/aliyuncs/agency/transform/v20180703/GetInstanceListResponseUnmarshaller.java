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

package com.aliyuncs.agency.transform.v20180703;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20180703.GetInstanceListResponse;
import com.aliyuncs.agency.model.v20180703.GetInstanceListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceListResponseUnmarshaller {

	public static GetInstanceListResponse unmarshall(GetInstanceListResponse getInstanceListResponse, UnmarshallerContext _ctx) {
		
		getInstanceListResponse.setCode(_ctx.stringValue("GetInstanceListResponse.Code"));
		getInstanceListResponse.setMessage(_ctx.stringValue("GetInstanceListResponse.Message"));
		getInstanceListResponse.setSuccess(_ctx.booleanValue("GetInstanceListResponse.Success"));

		List<Data> dataList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceListResponse.DataList.Length"); i++) {
			Data data = new Data();
			data.setStatus(_ctx.stringValue("GetInstanceListResponse.DataList["+ i +"].Status"));
			data.setAliyunPk(_ctx.stringValue("GetInstanceListResponse.DataList["+ i +"].AliyunPk"));
			data.setLocalName(_ctx.stringValue("GetInstanceListResponse.DataList["+ i +"].LocalName"));
			data.setInstanceId(_ctx.stringValue("GetInstanceListResponse.DataList["+ i +"].InstanceId"));
			data.setPublicIpAddress(_ctx.stringValue("GetInstanceListResponse.DataList["+ i +"].PublicIpAddress"));
			data.setRegionId(_ctx.stringValue("GetInstanceListResponse.DataList["+ i +"].RegionId"));

			dataList.add(data);
		}
		getInstanceListResponse.setDataList(dataList);
	 
	 	return getInstanceListResponse;
	}
}