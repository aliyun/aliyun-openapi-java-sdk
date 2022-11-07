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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.GetActivityTaskResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.GetActivityTaskResponse.HostsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetActivityTaskResponseUnmarshaller {

	public static GetActivityTaskResponse unmarshall(GetActivityTaskResponse getActivityTaskResponse, UnmarshallerContext _ctx) {
		
		getActivityTaskResponse.setRequestId(_ctx.stringValue("GetActivityTaskResponse.RequestId"));
		getActivityTaskResponse.setPhase(_ctx.stringValue("GetActivityTaskResponse.Phase"));
		getActivityTaskResponse.setEndTime(_ctx.longValue("GetActivityTaskResponse.EndTime"));
		getActivityTaskResponse.setActivityName(_ctx.stringValue("GetActivityTaskResponse.ActivityName"));
		getActivityTaskResponse.setState(_ctx.stringValue("GetActivityTaskResponse.State"));
		getActivityTaskResponse.setActivityId(_ctx.stringValue("GetActivityTaskResponse.ActivityId"));
		getActivityTaskResponse.setExperimentTaskId(_ctx.stringValue("GetActivityTaskResponse.ExperimentTaskId"));
		getActivityTaskResponse.setHttpStatusCode(_ctx.integerValue("GetActivityTaskResponse.HttpStatusCode"));
		getActivityTaskResponse.setStartTime(_ctx.longValue("GetActivityTaskResponse.StartTime"));
		getActivityTaskResponse.setRunResult(_ctx.stringValue("GetActivityTaskResponse.RunResult"));
		getActivityTaskResponse.setSuccess(_ctx.booleanValue("GetActivityTaskResponse.Success"));

		List<HostsItem> hosts = new ArrayList<HostsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetActivityTaskResponse.Hosts.Length"); i++) {
			HostsItem hostsItem = new HostsItem();
			hostsItem.setHostIp(_ctx.stringValue("GetActivityTaskResponse.Hosts["+ i +"].HostIp"));
			hostsItem.setEndTime(_ctx.longValue("GetActivityTaskResponse.Hosts["+ i +"].EndTime"));
			hostsItem.setStartTime(_ctx.longValue("GetActivityTaskResponse.Hosts["+ i +"].StartTime"));
			hostsItem.setData(_ctx.stringValue("GetActivityTaskResponse.Hosts["+ i +"].Data"));
			hostsItem.setErrorMessage(_ctx.stringValue("GetActivityTaskResponse.Hosts["+ i +"].ErrorMessage"));
			hostsItem.setExpId(_ctx.stringValue("GetActivityTaskResponse.Hosts["+ i +"].ExpId"));
			hostsItem.setResult(_ctx.stringValue("GetActivityTaskResponse.Hosts["+ i +"].Result"));
			hostsItem.setState(_ctx.stringValue("GetActivityTaskResponse.Hosts["+ i +"].State"));
			hostsItem.setTaskId(_ctx.stringValue("GetActivityTaskResponse.Hosts["+ i +"].TaskId"));

			hosts.add(hostsItem);
		}
		getActivityTaskResponse.setHosts(hosts);
	 
	 	return getActivityTaskResponse;
	}
}