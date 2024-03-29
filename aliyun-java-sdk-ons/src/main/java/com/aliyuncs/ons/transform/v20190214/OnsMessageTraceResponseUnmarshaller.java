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

package com.aliyuncs.ons.transform.v20190214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20190214.OnsMessageTraceResponse;
import com.aliyuncs.ons.model.v20190214.OnsMessageTraceResponse.MessageTrack;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsMessageTraceResponseUnmarshaller {

	public static OnsMessageTraceResponse unmarshall(OnsMessageTraceResponse onsMessageTraceResponse, UnmarshallerContext _ctx) {
		
		onsMessageTraceResponse.setRequestId(_ctx.stringValue("OnsMessageTraceResponse.RequestId"));
		onsMessageTraceResponse.setHelpUrl(_ctx.stringValue("OnsMessageTraceResponse.HelpUrl"));

		List<MessageTrack> data = new ArrayList<MessageTrack>();
		for (int i = 0; i < _ctx.lengthValue("OnsMessageTraceResponse.Data.Length"); i++) {
			MessageTrack messageTrack = new MessageTrack();
			messageTrack.setExceptionDesc(_ctx.stringValue("OnsMessageTraceResponse.Data["+ i +"].ExceptionDesc"));
			messageTrack.setTrackType(_ctx.stringValue("OnsMessageTraceResponse.Data["+ i +"].TrackType"));
			messageTrack.setConsumerGroup(_ctx.stringValue("OnsMessageTraceResponse.Data["+ i +"].ConsumerGroup"));
			messageTrack.setInstanceId(_ctx.stringValue("OnsMessageTraceResponse.Data["+ i +"].InstanceId"));

			data.add(messageTrack);
		}
		onsMessageTraceResponse.setData(data);
	 
	 	return onsMessageTraceResponse;
	}
}