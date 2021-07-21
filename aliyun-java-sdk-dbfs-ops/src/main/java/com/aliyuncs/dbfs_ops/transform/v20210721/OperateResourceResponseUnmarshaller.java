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

package com.aliyuncs.dbfs_ops.transform.v20210721;

import com.aliyuncs.dbfs_ops.model.v20210721.OperateResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OperateResourceResponseUnmarshaller {

	public static OperateResourceResponse unmarshall(OperateResourceResponse operateResourceResponse, UnmarshallerContext _ctx) {
		
		operateResourceResponse.setRequestId(_ctx.stringValue("OperateResourceResponse.RequestId"));
		operateResourceResponse.setResult(_ctx.stringValue("OperateResourceResponse.Result"));
	 
	 	return operateResourceResponse;
	}
}