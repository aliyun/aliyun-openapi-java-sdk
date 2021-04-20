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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.UpdateTrainLabelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTrainLabelResponseUnmarshaller {

	public static UpdateTrainLabelResponse unmarshall(UpdateTrainLabelResponse updateTrainLabelResponse, UnmarshallerContext _ctx) {
		
		updateTrainLabelResponse.setRequestId(_ctx.stringValue("UpdateTrainLabelResponse.RequestId"));
		updateTrainLabelResponse.setMessage(_ctx.stringValue("UpdateTrainLabelResponse.Message"));
		updateTrainLabelResponse.setCode(_ctx.stringValue("UpdateTrainLabelResponse.Code"));
	 
	 	return updateTrainLabelResponse;
	}
}