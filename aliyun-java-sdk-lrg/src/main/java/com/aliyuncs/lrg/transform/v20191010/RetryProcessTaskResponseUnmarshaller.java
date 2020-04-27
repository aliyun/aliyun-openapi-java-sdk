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

package com.aliyuncs.lrg.transform.v20191010;

import com.aliyuncs.lrg.model.v20191010.RetryProcessTaskResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RetryProcessTaskResponseUnmarshaller {

	public static RetryProcessTaskResponse unmarshall(RetryProcessTaskResponse retryProcessTaskResponse, UnmarshallerContext _ctx) {
		
		retryProcessTaskResponse.setCode(_ctx.integerValue("RetryProcessTaskResponse.code"));
		retryProcessTaskResponse.setData(_ctx.mapValue("RetryProcessTaskResponse.data"));
		retryProcessTaskResponse.setMessage(_ctx.stringValue("RetryProcessTaskResponse.message"));
		retryProcessTaskResponse.setSuccess(_ctx.booleanValue("RetryProcessTaskResponse.success"));
	 
	 	return retryProcessTaskResponse;
	}
}