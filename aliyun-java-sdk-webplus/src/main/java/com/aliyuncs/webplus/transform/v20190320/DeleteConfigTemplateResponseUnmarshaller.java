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

package com.aliyuncs.webplus.transform.v20190320;

import com.aliyuncs.webplus.model.v20190320.DeleteConfigTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteConfigTemplateResponseUnmarshaller {

	public static DeleteConfigTemplateResponse unmarshall(DeleteConfigTemplateResponse deleteConfigTemplateResponse, UnmarshallerContext _ctx) {
		
		deleteConfigTemplateResponse.setRequestId(_ctx.stringValue("DeleteConfigTemplateResponse.RequestId"));
		deleteConfigTemplateResponse.setCode(_ctx.stringValue("DeleteConfigTemplateResponse.Code"));
		deleteConfigTemplateResponse.setMessage(_ctx.stringValue("DeleteConfigTemplateResponse.Message"));
	 
	 	return deleteConfigTemplateResponse;
	}
}