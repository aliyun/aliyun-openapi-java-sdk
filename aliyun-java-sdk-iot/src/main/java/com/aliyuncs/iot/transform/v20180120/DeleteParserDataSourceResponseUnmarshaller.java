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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.DeleteParserDataSourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteParserDataSourceResponseUnmarshaller {

	public static DeleteParserDataSourceResponse unmarshall(DeleteParserDataSourceResponse deleteParserDataSourceResponse, UnmarshallerContext _ctx) {
		
		deleteParserDataSourceResponse.setRequestId(_ctx.stringValue("DeleteParserDataSourceResponse.RequestId"));
		deleteParserDataSourceResponse.setSuccess(_ctx.booleanValue("DeleteParserDataSourceResponse.Success"));
		deleteParserDataSourceResponse.setCode(_ctx.stringValue("DeleteParserDataSourceResponse.Code"));
		deleteParserDataSourceResponse.setErrorMessage(_ctx.stringValue("DeleteParserDataSourceResponse.ErrorMessage"));
	 
	 	return deleteParserDataSourceResponse;
	}
}