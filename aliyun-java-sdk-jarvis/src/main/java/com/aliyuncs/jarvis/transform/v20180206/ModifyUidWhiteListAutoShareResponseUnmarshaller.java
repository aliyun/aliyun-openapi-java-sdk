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

package com.aliyuncs.jarvis.transform.v20180206;

import com.aliyuncs.jarvis.model.v20180206.ModifyUidWhiteListAutoShareResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyUidWhiteListAutoShareResponseUnmarshaller {

	public static ModifyUidWhiteListAutoShareResponse unmarshall(ModifyUidWhiteListAutoShareResponse modifyUidWhiteListAutoShareResponse, UnmarshallerContext context) {
		
		modifyUidWhiteListAutoShareResponse.setRequestId(context.stringValue("ModifyUidWhiteListAutoShareResponse.RequestId"));
		modifyUidWhiteListAutoShareResponse.setModule(context.stringValue("ModifyUidWhiteListAutoShareResponse.Module"));
	 
	 	return modifyUidWhiteListAutoShareResponse;
	}
}