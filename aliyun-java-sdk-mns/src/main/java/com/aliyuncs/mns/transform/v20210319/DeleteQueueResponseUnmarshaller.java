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

import com.aliyuncs.mns.model.v20210319.DeleteQueueResponse;
import com.aliyuncs.mns.model.v20210319.DeleteQueueResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteQueueResponseUnmarshaller {

	public static DeleteQueueResponse unmarshall(DeleteQueueResponse deleteQueueResponse, UnmarshallerContext _ctx) {
		
		deleteQueueResponse.setRequestId(_ctx.stringValue("DeleteQueueResponse.RequestId"));
		deleteQueueResponse.setCode(_ctx.longValue("DeleteQueueResponse.Code"));
		deleteQueueResponse.setStatus(_ctx.stringValue("DeleteQueueResponse.Status"));
		deleteQueueResponse.setMessage(_ctx.stringValue("DeleteQueueResponse.Message"));
		deleteQueueResponse.setSuccess(_ctx.booleanValue("DeleteQueueResponse.Success"));

		Data data = new Data();
		data.setCode(_ctx.longValue("DeleteQueueResponse.Data.Code"));
		data.setMessage(_ctx.stringValue("DeleteQueueResponse.Data.Message"));
		data.setSuccess(_ctx.booleanValue("DeleteQueueResponse.Data.Success"));
		deleteQueueResponse.setData(data);
	 
	 	return deleteQueueResponse;
	}
}