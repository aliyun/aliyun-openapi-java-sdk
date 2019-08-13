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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.PlanComponentTopoResponse;
import com.aliyuncs.emr.model.v20160408.PlanComponentTopoResponse.HostComponent;
import com.aliyuncs.transform.UnmarshallerContext;


public class PlanComponentTopoResponseUnmarshaller {

	public static PlanComponentTopoResponse unmarshall(PlanComponentTopoResponse planComponentTopoResponse, UnmarshallerContext _ctx) {
		
		planComponentTopoResponse.setRequestId(_ctx.stringValue("PlanComponentTopoResponse.RequestId"));

		List<HostComponent> hostComponentList = new ArrayList<HostComponent>();
		for (int i = 0; i < _ctx.lengthValue("PlanComponentTopoResponse.HostComponentList.Length"); i++) {
			HostComponent hostComponent = new HostComponent();
			hostComponent.setComponentName(_ctx.stringValue("PlanComponentTopoResponse.HostComponentList["+ i +"].ComponentName"));
			hostComponent.setServiceName(_ctx.stringValue("PlanComponentTopoResponse.HostComponentList["+ i +"].ServiceName"));
			hostComponent.setServiceVersion(_ctx.stringValue("PlanComponentTopoResponse.HostComponentList["+ i +"].ServiceVersion"));
			hostComponent.setServiceEcmVersion(_ctx.stringValue("PlanComponentTopoResponse.HostComponentList["+ i +"].ServiceEcmVersion"));
			hostComponent.setReadOnly(_ctx.booleanValue("PlanComponentTopoResponse.HostComponentList["+ i +"].ReadOnly"));
			hostComponent.setDisplay(_ctx.booleanValue("PlanComponentTopoResponse.HostComponentList["+ i +"].Display"));

			List<String> hostNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PlanComponentTopoResponse.HostComponentList["+ i +"].HostNameList.Length"); j++) {
				hostNameList.add(_ctx.stringValue("PlanComponentTopoResponse.HostComponentList["+ i +"].HostNameList["+ j +"]"));
			}
			hostComponent.setHostNameList(hostNameList);

			hostComponentList.add(hostComponent);
		}
		planComponentTopoResponse.setHostComponentList(hostComponentList);
	 
	 	return planComponentTopoResponse;
	}
}