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

package com.aliyuncs.ebs.transform.v20210730;

import com.aliyuncs.ebs.model.v20210730.StopDiskMonitorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopDiskMonitorResponseUnmarshaller {

	public static StopDiskMonitorResponse unmarshall(StopDiskMonitorResponse stopDiskMonitorResponse, UnmarshallerContext _ctx) {
		
		stopDiskMonitorResponse.setRequestId(_ctx.stringValue("StopDiskMonitorResponse.RequestId"));
	 
	 	return stopDiskMonitorResponse;
	}
}