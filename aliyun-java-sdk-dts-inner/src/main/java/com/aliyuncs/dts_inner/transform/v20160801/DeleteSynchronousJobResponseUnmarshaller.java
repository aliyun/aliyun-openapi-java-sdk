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

package com.aliyuncs.dts_inner.transform.v20160801;

import com.aliyuncs.dts_inner.model.v20160801.DeleteSynchronousJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSynchronousJobResponseUnmarshaller {

	public static DeleteSynchronousJobResponse unmarshall(DeleteSynchronousJobResponse deleteSynchronousJobResponse, UnmarshallerContext _ctx) {
		
		deleteSynchronousJobResponse.setRequestId(_ctx.stringValue("DeleteSynchronousJobResponse.requestId"));
		deleteSynchronousJobResponse.setData(_ctx.stringValue("DeleteSynchronousJobResponse.data"));
		deleteSynchronousJobResponse.setSuccess(_ctx.booleanValue("DeleteSynchronousJobResponse.success"));
		deleteSynchronousJobResponse.setCode(_ctx.stringValue("DeleteSynchronousJobResponse.code"));
		deleteSynchronousJobResponse.setMessage(_ctx.stringValue("DeleteSynchronousJobResponse.message"));
	 
	 	return deleteSynchronousJobResponse;
	}
}