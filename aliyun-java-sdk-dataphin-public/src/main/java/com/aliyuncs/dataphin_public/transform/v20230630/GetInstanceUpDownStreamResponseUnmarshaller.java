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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetInstanceUpDownStreamResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetInstanceUpDownStreamResponse.InstanceDagInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetInstanceUpDownStreamResponse.InstanceDagInfo.InstanceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceUpDownStreamResponseUnmarshaller {

	public static GetInstanceUpDownStreamResponse unmarshall(GetInstanceUpDownStreamResponse getInstanceUpDownStreamResponse, UnmarshallerContext _ctx) {
		
		getInstanceUpDownStreamResponse.setRequestId(_ctx.stringValue("GetInstanceUpDownStreamResponse.RequestId"));
		getInstanceUpDownStreamResponse.setSuccess(_ctx.booleanValue("GetInstanceUpDownStreamResponse.Success"));
		getInstanceUpDownStreamResponse.setHttpStatusCode(_ctx.integerValue("GetInstanceUpDownStreamResponse.HttpStatusCode"));
		getInstanceUpDownStreamResponse.setCode(_ctx.stringValue("GetInstanceUpDownStreamResponse.Code"));
		getInstanceUpDownStreamResponse.setMessage(_ctx.stringValue("GetInstanceUpDownStreamResponse.Message"));

		InstanceDagInfo instanceDagInfo = new InstanceDagInfo();

		List<InstanceInfo> startInstanceList = new ArrayList<InstanceInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.StartInstanceList.Length"); i++) {
			InstanceInfo instanceInfo = new InstanceInfo();
			instanceInfo.setId(_ctx.stringValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.StartInstanceList["+ i +"].Id"));
			instanceInfo.setName(_ctx.stringValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.StartInstanceList["+ i +"].Name"));
			instanceInfo.setNodeId(_ctx.stringValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.StartInstanceList["+ i +"].NodeId"));
			instanceInfo.setNodeType(_ctx.stringValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.StartInstanceList["+ i +"].NodeType"));

			List<String> fieldInstanceIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.StartInstanceList["+ i +"].FieldInstanceIdList.Length"); j++) {
				fieldInstanceIdList.add(_ctx.stringValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.StartInstanceList["+ i +"].FieldInstanceIdList["+ j +"]"));
			}
			instanceInfo.setFieldInstanceIdList(fieldInstanceIdList);

			startInstanceList.add(instanceInfo);
		}
		instanceDagInfo.setStartInstanceList(startInstanceList);

		List<InstanceInfo> upInstanceList = new ArrayList<InstanceInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.UpInstanceList.Length"); i++) {
			InstanceInfo instanceInfo1 = new InstanceInfo();
			instanceInfo1.setId(_ctx.stringValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.UpInstanceList["+ i +"].Id"));
			instanceInfo1.setName(_ctx.stringValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.UpInstanceList["+ i +"].Name"));
			instanceInfo1.setNodeId(_ctx.stringValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.UpInstanceList["+ i +"].NodeId"));
			instanceInfo1.setNodeType(_ctx.stringValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.UpInstanceList["+ i +"].NodeType"));

			List<String> fieldInstanceIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.UpInstanceList["+ i +"].FieldInstanceIdList.Length"); j++) {
				fieldInstanceIdList.add(_ctx.stringValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.UpInstanceList["+ i +"].FieldInstanceIdList["+ j +"]"));
			}
			instanceInfo1.setFieldInstanceIdList(fieldInstanceIdList);

			upInstanceList.add(instanceInfo1);
		}
		instanceDagInfo.setUpInstanceList(upInstanceList);

		List<InstanceInfo> downInstanceList = new ArrayList<InstanceInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.DownInstanceList.Length"); i++) {
			InstanceInfo instanceInfo2 = new InstanceInfo();
			instanceInfo2.setId(_ctx.stringValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.DownInstanceList["+ i +"].Id"));
			instanceInfo2.setName(_ctx.stringValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.DownInstanceList["+ i +"].Name"));
			instanceInfo2.setNodeId(_ctx.stringValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.DownInstanceList["+ i +"].NodeId"));
			instanceInfo2.setNodeType(_ctx.stringValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.DownInstanceList["+ i +"].NodeType"));

			List<String> fieldInstanceIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.DownInstanceList["+ i +"].FieldInstanceIdList.Length"); j++) {
				fieldInstanceIdList.add(_ctx.stringValue("GetInstanceUpDownStreamResponse.InstanceDagInfo.DownInstanceList["+ i +"].FieldInstanceIdList["+ j +"]"));
			}
			instanceInfo2.setFieldInstanceIdList(fieldInstanceIdList);

			downInstanceList.add(instanceInfo2);
		}
		instanceDagInfo.setDownInstanceList(downInstanceList);
		getInstanceUpDownStreamResponse.setInstanceDagInfo(instanceDagInfo);
	 
	 	return getInstanceUpDownStreamResponse;
	}
}