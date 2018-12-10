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

package com.aliyuncs.qualitycheck.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20160801.UploadRuleForAntResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadRuleForAntResponseUnmarshaller {

	public static UploadRuleForAntResponse unmarshall(UploadRuleForAntResponse uploadRuleForAntResponse, UnmarshallerContext context) {
		
		uploadRuleForAntResponse.setRequestId(context.stringValue("UploadRuleForAntResponse.requestId"));
		uploadRuleForAntResponse.setSuccess(context.booleanValue("UploadRuleForAntResponse.success"));
		uploadRuleForAntResponse.setCode(context.stringValue("UploadRuleForAntResponse.code"));
		uploadRuleForAntResponse.setMessage(context.stringValue("UploadRuleForAntResponse.message"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("UploadRuleForAntResponse.data.Length"); i++) {
			data.add(context.stringValue("UploadRuleForAntResponse.data["+ i +"]"));
		}
		uploadRuleForAntResponse.setData(data);
	 
	 	return uploadRuleForAntResponse;
	}
}