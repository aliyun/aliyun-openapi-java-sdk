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

package com.aliyuncs.adb.transform.v20190315;

import com.aliyuncs.adb.model.v20190315.ModifyAccountDescriptionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyAccountDescriptionResponseUnmarshaller {

	public static ModifyAccountDescriptionResponse unmarshall(ModifyAccountDescriptionResponse modifyAccountDescriptionResponse, UnmarshallerContext _ctx) {
		
		modifyAccountDescriptionResponse.setRequestId(_ctx.stringValue("ModifyAccountDescriptionResponse.RequestId"));
	 
	 	return modifyAccountDescriptionResponse;
	}
}