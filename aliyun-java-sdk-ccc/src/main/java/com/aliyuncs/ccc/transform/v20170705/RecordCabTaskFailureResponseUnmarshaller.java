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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.RecordCabTaskFailureResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecordCabTaskFailureResponseUnmarshaller {

	public static RecordCabTaskFailureResponse unmarshall(RecordCabTaskFailureResponse recordCabTaskFailureResponse, UnmarshallerContext context) {
		
		recordCabTaskFailureResponse.setRequestId(context.stringValue("RecordCabTaskFailureResponse.RequestId"));
		recordCabTaskFailureResponse.setSuccess(context.booleanValue("RecordCabTaskFailureResponse.Success"));
		recordCabTaskFailureResponse.setCode(context.stringValue("RecordCabTaskFailureResponse.Code"));
		recordCabTaskFailureResponse.setMessage(context.stringValue("RecordCabTaskFailureResponse.Message"));
		recordCabTaskFailureResponse.setHttpStatusCode(context.integerValue("RecordCabTaskFailureResponse.HttpStatusCode"));
	 
	 	return recordCabTaskFailureResponse;
	}
}