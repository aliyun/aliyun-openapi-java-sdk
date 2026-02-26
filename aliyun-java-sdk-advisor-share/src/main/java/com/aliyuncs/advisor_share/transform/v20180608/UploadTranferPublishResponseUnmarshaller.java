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

package com.aliyuncs.advisor_share.transform.v20180608;

import com.aliyuncs.advisor_share.model.v20180608.UploadTranferPublishResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadTranferPublishResponseUnmarshaller {

	public static UploadTranferPublishResponse unmarshall(UploadTranferPublishResponse uploadTranferPublishResponse, UnmarshallerContext _ctx) {
		
		uploadTranferPublishResponse.setRequestId(_ctx.stringValue("UploadTranferPublishResponse.RequestId"));
		uploadTranferPublishResponse.setMessage(_ctx.stringValue("UploadTranferPublishResponse.Message"));
		uploadTranferPublishResponse.setData(_ctx.booleanValue("UploadTranferPublishResponse.Data"));
		uploadTranferPublishResponse.setSuccess(_ctx.booleanValue("UploadTranferPublishResponse.Success"));
	 
	 	return uploadTranferPublishResponse;
	}
}