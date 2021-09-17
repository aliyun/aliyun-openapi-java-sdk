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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.GetInstanceInspectionsResponse;
import com.aliyuncs.das.model.v20200116.GetInstanceInspectionsResponse.Data;
import com.aliyuncs.das.model.v20200116.GetInstanceInspectionsResponse.Data.BaseInspection;
import com.aliyuncs.das.model.v20200116.GetInstanceInspectionsResponse.Data.BaseInspection.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceInspectionsResponseUnmarshaller {

	public static GetInstanceInspectionsResponse unmarshall(GetInstanceInspectionsResponse getInstanceInspectionsResponse, UnmarshallerContext _ctx) {
		
		getInstanceInspectionsResponse.setRequestId(_ctx.stringValue("GetInstanceInspectionsResponse.RequestId"));
		getInstanceInspectionsResponse.setMessage(_ctx.stringValue("GetInstanceInspectionsResponse.Message"));
		getInstanceInspectionsResponse.setCode(_ctx.stringValue("GetInstanceInspectionsResponse.Code"));
		getInstanceInspectionsResponse.setSuccess(_ctx.stringValue("GetInstanceInspectionsResponse.Success"));

		Data data = new Data();
		data.setPageNo(_ctx.longValue("GetInstanceInspectionsResponse.Data.PageNo"));
		data.setPageSize(_ctx.longValue("GetInstanceInspectionsResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("GetInstanceInspectionsResponse.Data.Total"));

		List<BaseInspection> list = new ArrayList<BaseInspection>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceInspectionsResponse.Data.List.Length"); i++) {
			BaseInspection baseInspection = new BaseInspection();
			baseInspection.setEndTime(_ctx.longValue("GetInstanceInspectionsResponse.Data.List["+ i +"].EndTime"));
			baseInspection.setStartTime(_ctx.longValue("GetInstanceInspectionsResponse.Data.List["+ i +"].StartTime"));
			baseInspection.setData(_ctx.stringValue("GetInstanceInspectionsResponse.Data.List["+ i +"].Data"));
			baseInspection.setScoreMap(_ctx.stringValue("GetInstanceInspectionsResponse.Data.List["+ i +"].ScoreMap"));
			baseInspection.setGmtCreate(_ctx.longValue("GetInstanceInspectionsResponse.Data.List["+ i +"].GmtCreate"));
			baseInspection.setScore(_ctx.integerValue("GetInstanceInspectionsResponse.Data.List["+ i +"].Score"));

			Instance instance = new Instance();
			instance.setVpcId(_ctx.stringValue("GetInstanceInspectionsResponse.Data.List["+ i +"].Instance.VpcId"));
			instance.setUuid(_ctx.stringValue("GetInstanceInspectionsResponse.Data.List["+ i +"].Instance.Uuid"));
			instance.setInstanceArea(_ctx.stringValue("GetInstanceInspectionsResponse.Data.List["+ i +"].Instance.InstanceArea"));
			instance.setInstanceClass(_ctx.stringValue("GetInstanceInspectionsResponse.Data.List["+ i +"].Instance.InstanceClass"));
			instance.setRegion(_ctx.stringValue("GetInstanceInspectionsResponse.Data.List["+ i +"].Instance.Region"));
			instance.setAccountId(_ctx.stringValue("GetInstanceInspectionsResponse.Data.List["+ i +"].Instance.AccountId"));
			instance.setNetworkType(_ctx.stringValue("GetInstanceInspectionsResponse.Data.List["+ i +"].Instance.NetworkType"));
			instance.setEngine(_ctx.stringValue("GetInstanceInspectionsResponse.Data.List["+ i +"].Instance.Engine"));
			instance.setInstanceId(_ctx.stringValue("GetInstanceInspectionsResponse.Data.List["+ i +"].Instance.InstanceId"));
			instance.setNodeId(_ctx.stringValue("GetInstanceInspectionsResponse.Data.List["+ i +"].Instance.NodeId"));
			instance.setEngineVersion(_ctx.stringValue("GetInstanceInspectionsResponse.Data.List["+ i +"].Instance.EngineVersion"));
			baseInspection.setInstance(instance);

			list.add(baseInspection);
		}
		data.setList(list);
		getInstanceInspectionsResponse.setData(data);
	 
	 	return getInstanceInspectionsResponse;
	}
}