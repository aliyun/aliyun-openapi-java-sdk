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

package com.aliyuncs.umeng_finplus.transform.v20220913;

import com.aliyuncs.umeng_finplus.model.v20220913.CreateDataSet2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataSet2ResponseUnmarshaller {

	public static CreateDataSet2Response unmarshall(CreateDataSet2Response createDataSet2Response, UnmarshallerContext _ctx) {
		
		createDataSet2Response.setRequestId(_ctx.stringValue("CreateDataSet2Response.RequestId"));
		createDataSet2Response.setMsg(_ctx.stringValue("CreateDataSet2Response.Msg"));
		createDataSet2Response.setCode(_ctx.stringValue("CreateDataSet2Response.Code"));
		createDataSet2Response.setSuccess(_ctx.booleanValue("CreateDataSet2Response.Success"));
		createDataSet2Response.setData(_ctx.longValue("CreateDataSet2Response.Data"));
	 
	 	return createDataSet2Response;
	}
}