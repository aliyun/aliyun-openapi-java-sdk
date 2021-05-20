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

import com.aliyuncs.vcs.model.v20200515.DeleteTrainLabelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteTrainLabelResponseUnmarshaller {

	public static DeleteTrainLabelResponse unmarshall(DeleteTrainLabelResponse deleteTrainLabelResponse, UnmarshallerContext _ctx) {
		
		deleteTrainLabelResponse.setRequestId(_ctx.stringValue("DeleteTrainLabelResponse.RequestId"));
		deleteTrainLabelResponse.setMessage(_ctx.stringValue("DeleteTrainLabelResponse.Message"));
		deleteTrainLabelResponse.setCode(_ctx.stringValue("DeleteTrainLabelResponse.Code"));
	 
	 	return deleteTrainLabelResponse;
	}
}