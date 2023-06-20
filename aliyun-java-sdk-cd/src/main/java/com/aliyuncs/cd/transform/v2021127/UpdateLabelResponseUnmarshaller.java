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

package com.aliyuncs.cd.transform.v2021127;

import com.aliyuncs.cd.model.v2021127.UpdateLabelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLabelResponseUnmarshaller {

	public static UpdateLabelResponse unmarshall(UpdateLabelResponse updateLabelResponse, UnmarshallerContext _ctx) {
		
		updateLabelResponse.setRequestId(_ctx.stringValue("UpdateLabelResponse.RequestId"));
		updateLabelResponse.setSuccess(_ctx.booleanValue("UpdateLabelResponse.Success"));
		updateLabelResponse.setMessage(_ctx.stringValue("UpdateLabelResponse.Message"));
		updateLabelResponse.setCode(_ctx.stringValue("UpdateLabelResponse.Code"));
		updateLabelResponse.setHttpStatusCode(_ctx.integerValue("UpdateLabelResponse.HttpStatusCode"));
	 
	 	return updateLabelResponse;
	}
}