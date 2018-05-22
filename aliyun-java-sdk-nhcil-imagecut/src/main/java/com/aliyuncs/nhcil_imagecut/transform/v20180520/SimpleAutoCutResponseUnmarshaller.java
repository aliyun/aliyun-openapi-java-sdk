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

package com.aliyuncs.nhcil_imagecut.transform.v20180520;

import com.aliyuncs.nhcil_imagecut.model.v20180520.SimpleAutoCutResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SimpleAutoCutResponseUnmarshaller {

	public static SimpleAutoCutResponse unmarshall(SimpleAutoCutResponse simpleAutoCutResponse, UnmarshallerContext context) {
		
		simpleAutoCutResponse.setRequestId(context.stringValue("SimpleAutoCutResponse.RequestId"));
		simpleAutoCutResponse.setCode(context.integerValue("SimpleAutoCutResponse.Code"));
		simpleAutoCutResponse.setData(context.stringValue("SimpleAutoCutResponse.Data"));
		simpleAutoCutResponse.setSuccess(context.booleanValue("SimpleAutoCutResponse.Success"));
		simpleAutoCutResponse.setErrmsg(context.stringValue("SimpleAutoCutResponse.Errmsg"));
	 
	 	return simpleAutoCutResponse;
	}
}