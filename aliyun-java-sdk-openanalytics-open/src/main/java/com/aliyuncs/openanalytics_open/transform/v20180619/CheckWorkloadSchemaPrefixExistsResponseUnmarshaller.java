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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import com.aliyuncs.openanalytics_open.model.v20180619.CheckWorkloadSchemaPrefixExistsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckWorkloadSchemaPrefixExistsResponseUnmarshaller {

	public static CheckWorkloadSchemaPrefixExistsResponse unmarshall(CheckWorkloadSchemaPrefixExistsResponse checkWorkloadSchemaPrefixExistsResponse, UnmarshallerContext _ctx) {
		
		checkWorkloadSchemaPrefixExistsResponse.setRequestId(_ctx.stringValue("CheckWorkloadSchemaPrefixExistsResponse.RequestId"));
		checkWorkloadSchemaPrefixExistsResponse.setData(_ctx.booleanValue("CheckWorkloadSchemaPrefixExistsResponse.Data"));
		checkWorkloadSchemaPrefixExistsResponse.setHttpStatusCode(_ctx.integerValue("CheckWorkloadSchemaPrefixExistsResponse.HttpStatusCode"));
		checkWorkloadSchemaPrefixExistsResponse.setMessage(_ctx.stringValue("CheckWorkloadSchemaPrefixExistsResponse.Message"));
		checkWorkloadSchemaPrefixExistsResponse.setCode(_ctx.stringValue("CheckWorkloadSchemaPrefixExistsResponse.Code"));
		checkWorkloadSchemaPrefixExistsResponse.setSuccess(_ctx.booleanValue("CheckWorkloadSchemaPrefixExistsResponse.Success"));
	 
	 	return checkWorkloadSchemaPrefixExistsResponse;
	}
}