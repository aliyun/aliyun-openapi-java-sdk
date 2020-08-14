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

package com.aliyuncs.idrsservice.transform.v20200630;

import com.aliyuncs.idrsservice.model.v20200630.CreateLiveDetectionResponse;
import com.aliyuncs.idrsservice.model.v20200630.CreateLiveDetectionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLiveDetectionResponseUnmarshaller {

	public static CreateLiveDetectionResponse unmarshall(CreateLiveDetectionResponse createLiveDetectionResponse, UnmarshallerContext _ctx) {
		
		createLiveDetectionResponse.setRequestId(_ctx.stringValue("CreateLiveDetectionResponse.RequestId"));
		createLiveDetectionResponse.setCode(_ctx.stringValue("CreateLiveDetectionResponse.Code"));
		createLiveDetectionResponse.setMessage(_ctx.stringValue("CreateLiveDetectionResponse.Message"));

		Data data = new Data();
		data.setId(_ctx.stringValue("CreateLiveDetectionResponse.Data.Id"));
		createLiveDetectionResponse.setData(data);
	 
	 	return createLiveDetectionResponse;
	}
}