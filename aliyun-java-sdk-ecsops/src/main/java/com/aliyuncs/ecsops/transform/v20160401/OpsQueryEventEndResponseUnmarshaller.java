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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryEventEndResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryEventEndResponse.InstanceEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryEventEndResponseUnmarshaller {

	public static OpsQueryEventEndResponse unmarshall(OpsQueryEventEndResponse opsQueryEventEndResponse, UnmarshallerContext _ctx) {
		
		opsQueryEventEndResponse.setRequestId(_ctx.stringValue("OpsQueryEventEndResponse.RequestId"));

		List<InstanceEvent> instanceEvents = new ArrayList<InstanceEvent>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryEventEndResponse.InstanceEvents.Length"); i++) {
			InstanceEvent instanceEvent = new InstanceEvent();
			instanceEvent.setInstanceId(_ctx.stringValue("OpsQueryEventEndResponse.InstanceEvents["+ i +"].InstanceId"));
			instanceEvent.setEventStartTime(_ctx.stringValue("OpsQueryEventEndResponse.InstanceEvents["+ i +"].EventStartTime"));
			instanceEvent.setNcIp(_ctx.stringValue("OpsQueryEventEndResponse.InstanceEvents["+ i +"].NcIp"));
			instanceEvent.setExceptionName(_ctx.stringValue("OpsQueryEventEndResponse.InstanceEvents["+ i +"].ExceptionName"));
			instanceEvent.setEventEndTime(_ctx.stringValue("OpsQueryEventEndResponse.InstanceEvents["+ i +"].EventEndTime"));
			instanceEvent.setAliUid(_ctx.stringValue("OpsQueryEventEndResponse.InstanceEvents["+ i +"].AliUid"));
			instanceEvent.setCluster(_ctx.stringValue("OpsQueryEventEndResponse.InstanceEvents["+ i +"].Cluster"));
			instanceEvent.setReason(_ctx.stringValue("OpsQueryEventEndResponse.InstanceEvents["+ i +"].Reason"));
			instanceEvent.setExtraData(_ctx.stringValue("OpsQueryEventEndResponse.InstanceEvents["+ i +"].ExtraData"));

			instanceEvents.add(instanceEvent);
		}
		opsQueryEventEndResponse.setInstanceEvents(instanceEvents);
	 
	 	return opsQueryEventEndResponse;
	}
}