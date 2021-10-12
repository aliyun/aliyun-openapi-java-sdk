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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.CountJobByConditionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CountJobByConditionResponseUnmarshaller {

	public static CountJobByConditionResponse unmarshall(CountJobByConditionResponse countJobByConditionResponse, UnmarshallerContext _ctx) {
		
		countJobByConditionResponse.setRequestId(_ctx.stringValue("CountJobByConditionResponse.RequestId"));
		countJobByConditionResponse.setHttpStatusCode(_ctx.integerValue("CountJobByConditionResponse.HttpStatusCode"));
		countJobByConditionResponse.setErrCode(_ctx.stringValue("CountJobByConditionResponse.ErrCode"));
		countJobByConditionResponse.setSuccess(_ctx.booleanValue("CountJobByConditionResponse.Success"));
		countJobByConditionResponse.setErrMessage(_ctx.stringValue("CountJobByConditionResponse.ErrMessage"));
		countJobByConditionResponse.setDynamicMessage(_ctx.stringValue("CountJobByConditionResponse.DynamicMessage"));
		countJobByConditionResponse.setDynamicCode(_ctx.stringValue("CountJobByConditionResponse.DynamicCode"));
		countJobByConditionResponse.setTotalRecordCount(_ctx.longValue("CountJobByConditionResponse.TotalRecordCount"));
	 
	 	return countJobByConditionResponse;
	}
}