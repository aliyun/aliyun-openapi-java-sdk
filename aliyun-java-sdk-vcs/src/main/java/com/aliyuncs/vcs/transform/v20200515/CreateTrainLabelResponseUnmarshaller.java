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

import com.aliyuncs.vcs.model.v20200515.CreateTrainLabelResponse;
import com.aliyuncs.vcs.model.v20200515.CreateTrainLabelResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTrainLabelResponseUnmarshaller {

	public static CreateTrainLabelResponse unmarshall(CreateTrainLabelResponse createTrainLabelResponse, UnmarshallerContext _ctx) {
		
		createTrainLabelResponse.setRequestId(_ctx.stringValue("CreateTrainLabelResponse.RequestId"));
		createTrainLabelResponse.setMessage(_ctx.stringValue("CreateTrainLabelResponse.Message"));
		createTrainLabelResponse.setCode(_ctx.stringValue("CreateTrainLabelResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.stringValue("CreateTrainLabelResponse.Data.Id"));
		createTrainLabelResponse.setData(data);
	 
	 	return createTrainLabelResponse;
	}
}