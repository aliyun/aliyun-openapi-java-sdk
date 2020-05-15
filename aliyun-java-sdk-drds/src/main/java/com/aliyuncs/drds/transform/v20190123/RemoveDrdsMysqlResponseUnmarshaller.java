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

package com.aliyuncs.drds.transform.v20190123;

import com.aliyuncs.drds.model.v20190123.RemoveDrdsMysqlResponse;
import com.aliyuncs.drds.model.v20190123.RemoveDrdsMysqlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveDrdsMysqlResponseUnmarshaller {

	public static RemoveDrdsMysqlResponse unmarshall(RemoveDrdsMysqlResponse removeDrdsMysqlResponse, UnmarshallerContext _ctx) {
		
		removeDrdsMysqlResponse.setRequestId(_ctx.stringValue("RemoveDrdsMysqlResponse.RequestId"));
		removeDrdsMysqlResponse.setSuccess(_ctx.booleanValue("RemoveDrdsMysqlResponse.Success"));

		Data data = new Data();
		data.setResult(_ctx.booleanValue("RemoveDrdsMysqlResponse.Data.Result"));
		data.setMessage(_ctx.stringValue("RemoveDrdsMysqlResponse.Data.Message"));
		removeDrdsMysqlResponse.setData(data);
	 
	 	return removeDrdsMysqlResponse;
	}
}