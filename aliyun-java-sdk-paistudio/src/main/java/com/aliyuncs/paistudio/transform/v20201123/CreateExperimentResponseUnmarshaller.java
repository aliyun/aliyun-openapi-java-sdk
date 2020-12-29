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

package com.aliyuncs.paistudio.transform.v20201123;

import com.aliyuncs.paistudio.model.v20201123.CreateExperimentResponse;
import com.aliyuncs.paistudio.model.v20201123.CreateExperimentResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateExperimentResponseUnmarshaller {

	public static CreateExperimentResponse unmarshall(CreateExperimentResponse createExperimentResponse, UnmarshallerContext _ctx) {
		
		createExperimentResponse.setRequestId(_ctx.stringValue("CreateExperimentResponse.RequestId"));
		createExperimentResponse.setCode(_ctx.stringValue("CreateExperimentResponse.Code"));
		createExperimentResponse.setMessage(_ctx.stringValue("CreateExperimentResponse.Message"));

		Data data = new Data();
		data.setExperimentId(_ctx.stringValue("CreateExperimentResponse.Data.ExperimentId"));
		createExperimentResponse.setData(data);
	 
	 	return createExperimentResponse;
	}
}