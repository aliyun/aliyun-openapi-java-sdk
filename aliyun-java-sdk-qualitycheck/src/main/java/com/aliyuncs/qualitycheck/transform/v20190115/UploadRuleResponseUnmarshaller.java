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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.UploadRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadRuleResponseUnmarshaller {

	public static UploadRuleResponse unmarshall(UploadRuleResponse uploadRuleResponse, UnmarshallerContext _ctx) {
		
		uploadRuleResponse.setRequestId(_ctx.stringValue("UploadRuleResponse.RequestId"));
		uploadRuleResponse.setSuccess(_ctx.booleanValue("UploadRuleResponse.Success"));
		uploadRuleResponse.setCode(_ctx.stringValue("UploadRuleResponse.Code"));
		uploadRuleResponse.setMessage(_ctx.stringValue("UploadRuleResponse.Message"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UploadRuleResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("UploadRuleResponse.Data["+ i +"]"));
		}
		uploadRuleResponse.setData(data);
	 
	 	return uploadRuleResponse;
	}
}