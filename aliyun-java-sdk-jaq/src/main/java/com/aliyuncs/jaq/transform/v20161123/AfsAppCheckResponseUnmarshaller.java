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
package com.aliyuncs.jaq.transform.v20161123;

import com.aliyuncs.jaq.model.v20161123.AfsAppCheckResponse;
import com.aliyuncs.jaq.model.v20161123.AfsAppCheckResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AfsAppCheckResponseUnmarshaller {

	public static AfsAppCheckResponse unmarshall(AfsAppCheckResponse afsAppCheckResponse, UnmarshallerContext context) {
		
		afsAppCheckResponse.setErrorCode(context.integerValue("AfsAppCheckResponse.ErrorCode"));
		afsAppCheckResponse.setErrorMsg(context.stringValue("AfsAppCheckResponse.ErrorMsg"));

		Data data = new Data();
		data.setSecondCheckResult(context.integerValue("AfsAppCheckResponse.Data.SecondCheckResult"));
		afsAppCheckResponse.setData(data);
	 
	 	return afsAppCheckResponse;
	}
}