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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.CreateTimerJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTimerJobResponseUnmarshaller {

	public static CreateTimerJobResponse unmarshall(CreateTimerJobResponse createTimerJobResponse, UnmarshallerContext _ctx) {
		
		createTimerJobResponse.setRequestId(_ctx.stringValue("CreateTimerJobResponse.RequestId"));
		createTimerJobResponse.setSourceId(_ctx.stringValue("CreateTimerJobResponse.SourceId"));
		createTimerJobResponse.setEventType(_ctx.stringValue("CreateTimerJobResponse.EventType"));
		createTimerJobResponse.setExtraInfo(_ctx.stringValue("CreateTimerJobResponse.ExtraInfo"));

		List<String> cronExpression = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateTimerJobResponse.CronExpression.Length"); i++) {
			cronExpression.add(_ctx.stringValue("CreateTimerJobResponse.CronExpression["+ i +"]"));
		}
		createTimerJobResponse.setCronExpression(cronExpression);
	 
	 	return createTimerJobResponse;
	}
}