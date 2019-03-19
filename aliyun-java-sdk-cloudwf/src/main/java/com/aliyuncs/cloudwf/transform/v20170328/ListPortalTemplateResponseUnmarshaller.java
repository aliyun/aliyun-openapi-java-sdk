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

package com.aliyuncs.cloudwf.transform.v20170328;

import com.aliyuncs.cloudwf.model.v20170328.ListPortalTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPortalTemplateResponseUnmarshaller {

	public static ListPortalTemplateResponse unmarshall(ListPortalTemplateResponse listPortalTemplateResponse, UnmarshallerContext context) {
		
		listPortalTemplateResponse.setRequestId(context.stringValue("ListPortalTemplateResponse.RequestId"));
		listPortalTemplateResponse.setSuccess(context.booleanValue("ListPortalTemplateResponse.Success"));
		listPortalTemplateResponse.setMessage(context.stringValue("ListPortalTemplateResponse.Message"));
		listPortalTemplateResponse.setData(context.stringValue("ListPortalTemplateResponse.Data"));
		listPortalTemplateResponse.setErrorCode(context.integerValue("ListPortalTemplateResponse.ErrorCode"));
		listPortalTemplateResponse.setErrorMsg(context.stringValue("ListPortalTemplateResponse.ErrorMsg"));
	 
	 	return listPortalTemplateResponse;
	}
}