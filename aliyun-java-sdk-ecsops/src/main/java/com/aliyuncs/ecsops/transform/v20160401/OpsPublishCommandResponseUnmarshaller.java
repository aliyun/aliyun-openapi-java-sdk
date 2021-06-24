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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsPublishCommandResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsPublishCommandResponseUnmarshaller {

	public static OpsPublishCommandResponse unmarshall(OpsPublishCommandResponse opsPublishCommandResponse, UnmarshallerContext _ctx) {
		
		opsPublishCommandResponse.setRequestId(_ctx.stringValue("OpsPublishCommandResponse.RequestId"));
		opsPublishCommandResponse.setVersion(_ctx.stringValue("OpsPublishCommandResponse.Version"));
		opsPublishCommandResponse.setShareStatus(_ctx.stringValue("OpsPublishCommandResponse.ShareStatus"));
		opsPublishCommandResponse.setLatest(_ctx.stringValue("OpsPublishCommandResponse.Latest"));
		opsPublishCommandResponse.setCommandId(_ctx.stringValue("OpsPublishCommandResponse.CommandId"));

		List<String> modifiers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsPublishCommandResponse.Modifiers.Length"); i++) {
			modifiers.add(_ctx.stringValue("OpsPublishCommandResponse.Modifiers["+ i +"]"));
		}
		opsPublishCommandResponse.setModifiers(modifiers);
	 
	 	return opsPublishCommandResponse;
	}
}