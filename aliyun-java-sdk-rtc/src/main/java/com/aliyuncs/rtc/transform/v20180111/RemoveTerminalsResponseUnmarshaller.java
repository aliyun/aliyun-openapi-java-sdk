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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.RemoveTerminalsResponse;
import com.aliyuncs.rtc.model.v20180111.RemoveTerminalsResponse.Terminal;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveTerminalsResponseUnmarshaller {

	public static RemoveTerminalsResponse unmarshall(RemoveTerminalsResponse removeTerminalsResponse, UnmarshallerContext context) {
		
		removeTerminalsResponse.setRequestId(context.stringValue("RemoveTerminalsResponse.RequestId"));

		List<Terminal> terminals = new ArrayList<Terminal>();
		for (int i = 0; i < context.lengthValue("RemoveTerminalsResponse.Terminals.Length"); i++) {
			Terminal terminal = new Terminal();
			terminal.setId(context.stringValue("RemoveTerminalsResponse.Terminals["+ i +"].Id"));
			terminal.setCode(context.integerValue("RemoveTerminalsResponse.Terminals["+ i +"].Code"));
			terminal.setMessage(context.stringValue("RemoveTerminalsResponse.Terminals["+ i +"].Message"));

			terminals.add(terminal);
		}
		removeTerminalsResponse.setTerminals(terminals);
	 
	 	return removeTerminalsResponse;
	}
}