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

import com.aliyuncs.ecd.model.v20200930.ModifyDesktopsPolicyGroupResponse;
import com.aliyuncs.ecd.model.v20200930.ModifyDesktopsPolicyGroupResponse.ModifyResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDesktopsPolicyGroupResponseUnmarshaller {

	public static ModifyDesktopsPolicyGroupResponse unmarshall(ModifyDesktopsPolicyGroupResponse modifyDesktopsPolicyGroupResponse, UnmarshallerContext _ctx) {
		
		modifyDesktopsPolicyGroupResponse.setRequestId(_ctx.stringValue("ModifyDesktopsPolicyGroupResponse.RequestId"));

		List<ModifyResult> modifyResults = new ArrayList<ModifyResult>();
		for (int i = 0; i < _ctx.lengthValue("ModifyDesktopsPolicyGroupResponse.ModifyResults.Length"); i++) {
			ModifyResult modifyResult = new ModifyResult();
			modifyResult.setDesktopId(_ctx.stringValue("ModifyDesktopsPolicyGroupResponse.ModifyResults["+ i +"].DesktopId"));
			modifyResult.setCode(_ctx.stringValue("ModifyDesktopsPolicyGroupResponse.ModifyResults["+ i +"].Code"));
			modifyResult.setMessage(_ctx.stringValue("ModifyDesktopsPolicyGroupResponse.ModifyResults["+ i +"].Message"));

			modifyResults.add(modifyResult);
		}
		modifyDesktopsPolicyGroupResponse.setModifyResults(modifyResults);
	 
	 	return modifyDesktopsPolicyGroupResponse;
	}
}