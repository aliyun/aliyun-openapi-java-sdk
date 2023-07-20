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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.ListServiceContainersResponse;
import com.aliyuncs.eas.model.v20210701.ListServiceContainersResponse.Container;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceContainersResponseUnmarshaller {

	public static ListServiceContainersResponse unmarshall(ListServiceContainersResponse listServiceContainersResponse, UnmarshallerContext _ctx) {
		
		listServiceContainersResponse.setRequestId(_ctx.stringValue("ListServiceContainersResponse.RequestId"));
		listServiceContainersResponse.setServiceName(_ctx.stringValue("ListServiceContainersResponse.ServiceName"));

		List<Container> containers = new ArrayList<Container>();
		for (int i = 0; i < _ctx.lengthValue("ListServiceContainersResponse.Containers.Length"); i++) {
			Container container = new Container();
			container.setName(_ctx.stringValue("ListServiceContainersResponse.Containers["+ i +"].Name"));
			container.setImage(_ctx.stringValue("ListServiceContainersResponse.Containers["+ i +"].Image"));
			container.setPort(_ctx.integerValue("ListServiceContainersResponse.Containers["+ i +"].Port"));
			container.setRestartCount(_ctx.integerValue("ListServiceContainersResponse.Containers["+ i +"].RestartCount"));
			container.setReady(_ctx.booleanValue("ListServiceContainersResponse.Containers["+ i +"].Ready"));
			container.setCurrentStatus(_ctx.stringValue("ListServiceContainersResponse.Containers["+ i +"].CurrentStatus"));
			container.setCurrentReaon(_ctx.stringValue("ListServiceContainersResponse.Containers["+ i +"].CurrentReaon"));
			container.setCurrentTimestamp(_ctx.stringValue("ListServiceContainersResponse.Containers["+ i +"].CurrentTimestamp"));
			container.setLastStatus(_ctx.stringValue("ListServiceContainersResponse.Containers["+ i +"].LastStatus"));
			container.setLastReason(_ctx.stringValue("ListServiceContainersResponse.Containers["+ i +"].LastReason"));
			container.setLastTimestamp(_ctx.stringValue("ListServiceContainersResponse.Containers["+ i +"].LastTimestamp"));

			containers.add(container);
		}
		listServiceContainersResponse.setContainers(containers);
	 
	 	return listServiceContainersResponse;
	}
}