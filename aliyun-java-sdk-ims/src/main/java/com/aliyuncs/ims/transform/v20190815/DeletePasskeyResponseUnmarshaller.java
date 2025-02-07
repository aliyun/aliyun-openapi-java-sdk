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

package com.aliyuncs.ims.transform.v20190815;

import com.aliyuncs.ims.model.v20190815.DeletePasskeyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeletePasskeyResponseUnmarshaller {

	public static DeletePasskeyResponse unmarshall(DeletePasskeyResponse deletePasskeyResponse, UnmarshallerContext _ctx) {
		
		deletePasskeyResponse.setRequestId(_ctx.stringValue("DeletePasskeyResponse.RequestId"));
	 
	 	return deletePasskeyResponse;
	}
}