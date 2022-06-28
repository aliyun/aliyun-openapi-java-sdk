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

package com.aliyuncs.dytnsapi.transform.v20200217;

import com.aliyuncs.dytnsapi.model.v20200217.ThreeElementsVerificationResponse;
import com.aliyuncs.dytnsapi.model.v20200217.ThreeElementsVerificationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ThreeElementsVerificationResponseUnmarshaller {

	public static ThreeElementsVerificationResponse unmarshall(ThreeElementsVerificationResponse threeElementsVerificationResponse, UnmarshallerContext _ctx) {
		
		threeElementsVerificationResponse.setRequestId(_ctx.stringValue("ThreeElementsVerificationResponse.RequestId"));
		threeElementsVerificationResponse.setCode(_ctx.stringValue("ThreeElementsVerificationResponse.Code"));
		threeElementsVerificationResponse.setMessage(_ctx.stringValue("ThreeElementsVerificationResponse.Message"));

		Data data = new Data();
		data.setBasicCarrier(_ctx.stringValue("ThreeElementsVerificationResponse.Data.BasicCarrier"));
		data.setIsConsistent(_ctx.integerValue("ThreeElementsVerificationResponse.Data.IsConsistent"));
		threeElementsVerificationResponse.setData(data);
	 
	 	return threeElementsVerificationResponse;
	}
}