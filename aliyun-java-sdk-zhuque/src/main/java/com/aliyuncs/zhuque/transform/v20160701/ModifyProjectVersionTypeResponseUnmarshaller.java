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

package com.aliyuncs.zhuque.transform.v20160701;

import com.aliyuncs.zhuque.model.v20160701.ModifyProjectVersionTypeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyProjectVersionTypeResponseUnmarshaller {

	public static ModifyProjectVersionTypeResponse unmarshall(ModifyProjectVersionTypeResponse modifyProjectVersionTypeResponse, UnmarshallerContext context) {
		
		modifyProjectVersionTypeResponse.setRequestId(context.stringValue("ModifyProjectVersionTypeResponse.RequestId"));
		modifyProjectVersionTypeResponse.setResult(context.stringValue("ModifyProjectVersionTypeResponse.Result"));
		modifyProjectVersionTypeResponse.setMessage(context.stringValue("ModifyProjectVersionTypeResponse.Message"));
	 
	 	return modifyProjectVersionTypeResponse;
	}
}