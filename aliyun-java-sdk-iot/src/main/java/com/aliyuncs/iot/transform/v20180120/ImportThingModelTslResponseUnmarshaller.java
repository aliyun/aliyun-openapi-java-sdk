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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.ImportThingModelTslResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportThingModelTslResponseUnmarshaller {

	public static ImportThingModelTslResponse unmarshall(ImportThingModelTslResponse importThingModelTslResponse, UnmarshallerContext _ctx) {
		
		importThingModelTslResponse.setRequestId(_ctx.stringValue("ImportThingModelTslResponse.RequestId"));
		importThingModelTslResponse.setSuccess(_ctx.booleanValue("ImportThingModelTslResponse.Success"));
		importThingModelTslResponse.setCode(_ctx.stringValue("ImportThingModelTslResponse.Code"));
		importThingModelTslResponse.setErrorMessage(_ctx.stringValue("ImportThingModelTslResponse.ErrorMessage"));
	 
	 	return importThingModelTslResponse;
	}
}