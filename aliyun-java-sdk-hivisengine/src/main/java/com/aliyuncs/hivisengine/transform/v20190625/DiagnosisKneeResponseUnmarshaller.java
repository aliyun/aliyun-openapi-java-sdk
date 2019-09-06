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

package com.aliyuncs.hivisengine.transform.v20190625;

import com.aliyuncs.hivisengine.model.v20190625.DiagnosisKneeResponse;
import com.aliyuncs.hivisengine.model.v20190625.DiagnosisKneeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DiagnosisKneeResponseUnmarshaller {

	public static DiagnosisKneeResponse unmarshall(DiagnosisKneeResponse diagnosisKneeResponse, UnmarshallerContext _ctx) {
		
		diagnosisKneeResponse.setRequestId(_ctx.stringValue("DiagnosisKneeResponse.RequestId"));
		diagnosisKneeResponse.setCode(_ctx.stringValue("DiagnosisKneeResponse.Code"));
		diagnosisKneeResponse.setMessage(_ctx.stringValue("DiagnosisKneeResponse.Message"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("DiagnosisKneeResponse.Data.TaskId"));
		diagnosisKneeResponse.setData(data);
	 
	 	return diagnosisKneeResponse;
	}
}