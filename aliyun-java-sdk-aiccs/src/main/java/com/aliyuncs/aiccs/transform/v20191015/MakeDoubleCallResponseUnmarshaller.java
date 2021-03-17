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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.MakeDoubleCallResponse;
import com.aliyuncs.aiccs.model.v20191015.MakeDoubleCallResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class MakeDoubleCallResponseUnmarshaller {

	public static MakeDoubleCallResponse unmarshall(MakeDoubleCallResponse makeDoubleCallResponse, UnmarshallerContext _ctx) {
		
		makeDoubleCallResponse.setRequestId(_ctx.stringValue("MakeDoubleCallResponse.RequestId"));
		makeDoubleCallResponse.setMessage(_ctx.stringValue("MakeDoubleCallResponse.Message"));
		makeDoubleCallResponse.setCode(_ctx.stringValue("MakeDoubleCallResponse.Code"));
		makeDoubleCallResponse.setSuccess(_ctx.booleanValue("MakeDoubleCallResponse.Success"));

		Data data = new Data();
		data.setAcid(_ctx.stringValue("MakeDoubleCallResponse.Data.Acid"));
		makeDoubleCallResponse.setData(data);
	 
	 	return makeDoubleCallResponse;
	}
}