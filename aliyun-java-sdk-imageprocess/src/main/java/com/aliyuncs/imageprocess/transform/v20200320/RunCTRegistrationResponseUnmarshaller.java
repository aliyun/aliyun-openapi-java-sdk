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

package com.aliyuncs.imageprocess.transform.v20200320;

import com.aliyuncs.imageprocess.model.v20200320.RunCTRegistrationResponse;
import com.aliyuncs.imageprocess.model.v20200320.RunCTRegistrationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RunCTRegistrationResponseUnmarshaller {

	public static RunCTRegistrationResponse unmarshall(RunCTRegistrationResponse runCTRegistrationResponse, UnmarshallerContext _ctx) {
		
		runCTRegistrationResponse.setRequestId(_ctx.stringValue("RunCTRegistrationResponse.RequestId"));

		Data data = new Data();
		data.setDUrl(_ctx.stringValue("RunCTRegistrationResponse.Data.DUrl"));
		data.setNUrl(_ctx.stringValue("RunCTRegistrationResponse.Data.NUrl"));
		runCTRegistrationResponse.setData(data);
	 
	 	return runCTRegistrationResponse;
	}
}