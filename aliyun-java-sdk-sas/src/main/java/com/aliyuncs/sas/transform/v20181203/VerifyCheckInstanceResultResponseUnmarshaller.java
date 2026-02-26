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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.VerifyCheckInstanceResultResponse;
import com.aliyuncs.sas.model.v20181203.VerifyCheckInstanceResultResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyCheckInstanceResultResponseUnmarshaller {

	public static VerifyCheckInstanceResultResponse unmarshall(VerifyCheckInstanceResultResponse verifyCheckInstanceResultResponse, UnmarshallerContext _ctx) {
		
		verifyCheckInstanceResultResponse.setRequestId(_ctx.stringValue("VerifyCheckInstanceResultResponse.RequestId"));

		Data data = new Data();
		data.setOperateCode(_ctx.stringValue("VerifyCheckInstanceResultResponse.Data.OperateCode"));

		List<String> failInstances = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("VerifyCheckInstanceResultResponse.Data.FailInstances.Length"); i++) {
			failInstances.add(_ctx.stringValue("VerifyCheckInstanceResultResponse.Data.FailInstances["+ i +"]"));
		}
		data.setFailInstances(failInstances);
		verifyCheckInstanceResultResponse.setData(data);
	 
	 	return verifyCheckInstanceResultResponse;
	}
}