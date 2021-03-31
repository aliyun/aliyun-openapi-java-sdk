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

package com.aliyuncs.openanalytics_open.transform.v20200928;

import com.aliyuncs.openanalytics_open.model.v20200928.AlterTableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AlterTableResponseUnmarshaller {

	public static AlterTableResponse unmarshall(AlterTableResponse alterTableResponse, UnmarshallerContext _ctx) {
		
		alterTableResponse.setRequestId(_ctx.stringValue("AlterTableResponse.RequestId"));
		alterTableResponse.setMessage(_ctx.stringValue("AlterTableResponse.Message"));
		alterTableResponse.setData(_ctx.booleanValue("AlterTableResponse.Data"));
		alterTableResponse.setCode(_ctx.stringValue("AlterTableResponse.Code"));
		alterTableResponse.setSuccess(_ctx.booleanValue("AlterTableResponse.Success"));
	 
	 	return alterTableResponse;
	}
}