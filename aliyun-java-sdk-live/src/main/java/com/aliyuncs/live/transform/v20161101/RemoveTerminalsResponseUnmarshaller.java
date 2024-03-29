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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.RemoveTerminalsResponse;
import com.aliyuncs.live.model.v20161101.RemoveTerminalsResponse.Terminal;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveTerminalsResponseUnmarshaller {

	public static RemoveTerminalsResponse unmarshall(RemoveTerminalsResponse removeTerminalsResponse, UnmarshallerContext _ctx) {
		
		removeTerminalsResponse.setRequestId(_ctx.stringValue("RemoveTerminalsResponse.RequestId"));

		List<Terminal> terminals = new ArrayList<Terminal>();
		for (int i = 0; i < _ctx.lengthValue("RemoveTerminalsResponse.Terminals.Length"); i++) {
			Terminal terminal = new Terminal();
			terminal.setCode(_ctx.integerValue("RemoveTerminalsResponse.Terminals["+ i +"].Code"));
			terminal.setMessage(_ctx.stringValue("RemoveTerminalsResponse.Terminals["+ i +"].Message"));
			terminal.setId(_ctx.stringValue("RemoveTerminalsResponse.Terminals["+ i +"].Id"));

			terminals.add(terminal);
		}
		removeTerminalsResponse.setTerminals(terminals);
	 
	 	return removeTerminalsResponse;
	}
}