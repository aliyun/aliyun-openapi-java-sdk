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

package com.aliyuncs.mns.transform.v20210319;

import com.aliyuncs.mns.model.v20210319.DeleteMessageResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMessageResponseUnmarshaller {

	public static DeleteMessageResponse unmarshall(DeleteMessageResponse deleteMessageResponse, UnmarshallerContext _ctx) {
		
		deleteMessageResponse.setRequestId(_ctx.stringValue("DeleteMessageResponse.RequestId"));
		deleteMessageResponse.setCode(_ctx.longValue("DeleteMessageResponse.Code"));
		deleteMessageResponse.setStatus(_ctx.stringValue("DeleteMessageResponse.Status"));
		deleteMessageResponse.setMessage(_ctx.stringValue("DeleteMessageResponse.Message"));
		deleteMessageResponse.setSuccess(_ctx.booleanValue("DeleteMessageResponse.Success"));
		deleteMessageResponse.setData(_ctx.mapValue("DeleteMessageResponse.Data"));
	 
	 	return deleteMessageResponse;
	}
}