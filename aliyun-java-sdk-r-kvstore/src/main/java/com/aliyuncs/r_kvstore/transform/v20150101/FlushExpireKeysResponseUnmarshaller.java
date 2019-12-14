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

package com.aliyuncs.r_kvstore.transform.v20150101;

import com.aliyuncs.r_kvstore.model.v20150101.FlushExpireKeysResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class FlushExpireKeysResponseUnmarshaller {

	public static FlushExpireKeysResponse unmarshall(FlushExpireKeysResponse flushExpireKeysResponse, UnmarshallerContext _ctx) {
		
		flushExpireKeysResponse.setRequestId(_ctx.stringValue("FlushExpireKeysResponse.RequestId"));
		flushExpireKeysResponse.setInstanceId(_ctx.stringValue("FlushExpireKeysResponse.InstanceId"));
		flushExpireKeysResponse.setTaskId(_ctx.stringValue("FlushExpireKeysResponse.TaskId"));
	 
	 	return flushExpireKeysResponse;
	}
}