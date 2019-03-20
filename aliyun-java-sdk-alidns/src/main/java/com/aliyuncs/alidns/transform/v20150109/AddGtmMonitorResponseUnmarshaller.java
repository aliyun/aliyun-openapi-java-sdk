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

package com.aliyuncs.alidns.transform.v20150109;

import com.aliyuncs.alidns.model.v20150109.AddGtmMonitorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddGtmMonitorResponseUnmarshaller {

	public static AddGtmMonitorResponse unmarshall(AddGtmMonitorResponse addGtmMonitorResponse, UnmarshallerContext context) {
		
		addGtmMonitorResponse.setRequestId(context.stringValue("AddGtmMonitorResponse.RequestId"));
		addGtmMonitorResponse.setMonitorConfigId(context.stringValue("AddGtmMonitorResponse.MonitorConfigId"));
	 
	 	return addGtmMonitorResponse;
	}
}