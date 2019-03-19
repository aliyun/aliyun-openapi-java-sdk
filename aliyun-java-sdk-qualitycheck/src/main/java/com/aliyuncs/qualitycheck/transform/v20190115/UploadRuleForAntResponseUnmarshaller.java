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

import com.aliyuncs.qualitycheck.model.v20190115.UploadRuleForAntResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadRuleForAntResponseUnmarshaller {

	public static UploadRuleForAntResponse unmarshall(UploadRuleForAntResponse uploadRuleForAntResponse, UnmarshallerContext context) {
		
		uploadRuleForAntResponse.setRequestId(context.stringValue("UploadRuleForAntResponse.RequestId"));
		uploadRuleForAntResponse.setSuccess(context.booleanValue("UploadRuleForAntResponse.Success"));
		uploadRuleForAntResponse.setCode(context.stringValue("UploadRuleForAntResponse.Code"));
		uploadRuleForAntResponse.setMessage(context.stringValue("UploadRuleForAntResponse.Message"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("UploadRuleForAntResponse.Data.Length"); i++) {
			data.add(context.stringValue("UploadRuleForAntResponse.Data["+ i +"]"));
		}
		uploadRuleForAntResponse.setData(data);
	 
	 	return uploadRuleForAntResponse;
	}
}