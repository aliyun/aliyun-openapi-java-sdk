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

package com.aliyuncs.rsimganalys.transform.v20190801;

import com.aliyuncs.rsimganalys.model.v20190801.DeleteImageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteImageResponseUnmarshaller {

	public static DeleteImageResponse unmarshall(DeleteImageResponse deleteImageResponse, UnmarshallerContext _ctx) {
		
		deleteImageResponse.setRequestId(_ctx.stringValue("DeleteImageResponse.RequestId"));
		deleteImageResponse.setResultCode(_ctx.integerValue("DeleteImageResponse.ResultCode"));
		deleteImageResponse.setData(_ctx.booleanValue("DeleteImageResponse.Data"));
		deleteImageResponse.setResultMessage(_ctx.stringValue("DeleteImageResponse.ResultMessage"));
	 
	 	return deleteImageResponse;
	}
}