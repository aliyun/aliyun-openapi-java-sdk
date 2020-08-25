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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.SaveClriskSubscriberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveClriskSubscriberResponseUnmarshaller {

	public static SaveClriskSubscriberResponse unmarshall(SaveClriskSubscriberResponse saveClriskSubscriberResponse, UnmarshallerContext _ctx) {
		
		saveClriskSubscriberResponse.setRequestId(_ctx.stringValue("SaveClriskSubscriberResponse.RequestId"));
		saveClriskSubscriberResponse.setResultCode(_ctx.stringValue("SaveClriskSubscriberResponse.ResultCode"));
		saveClriskSubscriberResponse.setResultMessage(_ctx.stringValue("SaveClriskSubscriberResponse.ResultMessage"));
	 
	 	return saveClriskSubscriberResponse;
	}
}