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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetOrderAttachmentFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrderAttachmentFileResponseUnmarshaller {

	public static GetOrderAttachmentFileResponse unmarshall(GetOrderAttachmentFileResponse getOrderAttachmentFileResponse, UnmarshallerContext _ctx) {
		
		getOrderAttachmentFileResponse.setRequestId(_ctx.stringValue("GetOrderAttachmentFileResponse.RequestId"));
		getOrderAttachmentFileResponse.setSuccess(_ctx.booleanValue("GetOrderAttachmentFileResponse.Success"));
		getOrderAttachmentFileResponse.setErrorMessage(_ctx.stringValue("GetOrderAttachmentFileResponse.ErrorMessage"));
		getOrderAttachmentFileResponse.setErrorCode(_ctx.stringValue("GetOrderAttachmentFileResponse.ErrorCode"));
		getOrderAttachmentFileResponse.setFileUrl(_ctx.stringValue("GetOrderAttachmentFileResponse.FileUrl"));
	 
	 	return getOrderAttachmentFileResponse;
	}
}