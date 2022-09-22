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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.ListApplicationMonitorResponse;
import com.aliyuncs.ga.model.v20191120.ListApplicationMonitorResponse.ApplicationMonitor;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationMonitorResponseUnmarshaller {

	public static ListApplicationMonitorResponse unmarshall(ListApplicationMonitorResponse listApplicationMonitorResponse, UnmarshallerContext _ctx) {
		
		listApplicationMonitorResponse.setRequestId(_ctx.stringValue("ListApplicationMonitorResponse.RequestId"));
		listApplicationMonitorResponse.setTotalCount(_ctx.integerValue("ListApplicationMonitorResponse.TotalCount"));
		listApplicationMonitorResponse.setPageSize(_ctx.integerValue("ListApplicationMonitorResponse.PageSize"));
		listApplicationMonitorResponse.setPageNumber(_ctx.integerValue("ListApplicationMonitorResponse.PageNumber"));

		List<ApplicationMonitor> applicationMonitors = new ArrayList<ApplicationMonitor>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationMonitorResponse.ApplicationMonitors.Length"); i++) {
			ApplicationMonitor applicationMonitor = new ApplicationMonitor();
			applicationMonitor.setAcceleratorId(_ctx.stringValue("ListApplicationMonitorResponse.ApplicationMonitors["+ i +"].AcceleratorId"));
			applicationMonitor.setListenerId(_ctx.stringValue("ListApplicationMonitorResponse.ApplicationMonitors["+ i +"].ListenerId"));
			applicationMonitor.setTaskId(_ctx.stringValue("ListApplicationMonitorResponse.ApplicationMonitors["+ i +"].TaskId"));
			applicationMonitor.setTaskName(_ctx.stringValue("ListApplicationMonitorResponse.ApplicationMonitors["+ i +"].TaskName"));
			applicationMonitor.setAddress(_ctx.stringValue("ListApplicationMonitorResponse.ApplicationMonitors["+ i +"].Address"));
			applicationMonitor.setOptionsJson(_ctx.stringValue("ListApplicationMonitorResponse.ApplicationMonitors["+ i +"].OptionsJson"));
			applicationMonitor.setDetectEnable(_ctx.booleanValue("ListApplicationMonitorResponse.ApplicationMonitors["+ i +"].DetectEnable"));
			applicationMonitor.setDetectThreshold(_ctx.integerValue("ListApplicationMonitorResponse.ApplicationMonitors["+ i +"].DetectThreshold"));
			applicationMonitor.setDetectTimes(_ctx.integerValue("ListApplicationMonitorResponse.ApplicationMonitors["+ i +"].DetectTimes"));
			applicationMonitor.setSilenceTime(_ctx.integerValue("ListApplicationMonitorResponse.ApplicationMonitors["+ i +"].SilenceTime"));
			applicationMonitor.setState(_ctx.stringValue("ListApplicationMonitorResponse.ApplicationMonitors["+ i +"].State"));

			applicationMonitors.add(applicationMonitor);
		}
		listApplicationMonitorResponse.setApplicationMonitors(applicationMonitors);
	 
	 	return listApplicationMonitorResponse;
	}
}