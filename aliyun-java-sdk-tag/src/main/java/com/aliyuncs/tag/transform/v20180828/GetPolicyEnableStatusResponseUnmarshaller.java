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

package com.aliyuncs.tag.transform.v20180828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.tag.model.v20180828.GetPolicyEnableStatusResponse;
import com.aliyuncs.tag.model.v20180828.GetPolicyEnableStatusResponse.StatusModelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPolicyEnableStatusResponseUnmarshaller {

	public static GetPolicyEnableStatusResponse unmarshall(GetPolicyEnableStatusResponse getPolicyEnableStatusResponse, UnmarshallerContext _ctx) {
		
		getPolicyEnableStatusResponse.setRequestId(_ctx.stringValue("GetPolicyEnableStatusResponse.RequestId"));

		List<StatusModelsItem> statusModels = new ArrayList<StatusModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPolicyEnableStatusResponse.StatusModels.Length"); i++) {
			StatusModelsItem statusModelsItem = new StatusModelsItem();
			statusModelsItem.setUserType(_ctx.stringValue("GetPolicyEnableStatusResponse.StatusModels["+ i +"].UserType"));
			statusModelsItem.setStatus(_ctx.stringValue("GetPolicyEnableStatusResponse.StatusModels["+ i +"].Status"));

			statusModels.add(statusModelsItem);
		}
		getPolicyEnableStatusResponse.setStatusModels(statusModels);
	 
	 	return getPolicyEnableStatusResponse;
	}
}