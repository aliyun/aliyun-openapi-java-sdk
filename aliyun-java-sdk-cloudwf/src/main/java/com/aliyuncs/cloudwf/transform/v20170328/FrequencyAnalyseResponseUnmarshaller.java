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

package com.aliyuncs.cloudwf.transform.v20170328;

import com.aliyuncs.cloudwf.model.v20170328.FrequencyAnalyseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class FrequencyAnalyseResponseUnmarshaller {

	public static FrequencyAnalyseResponse unmarshall(FrequencyAnalyseResponse frequencyAnalyseResponse, UnmarshallerContext context) {
		
		frequencyAnalyseResponse.setSuccess(context.booleanValue("FrequencyAnalyseResponse.Success"));
		frequencyAnalyseResponse.setData(context.stringValue("FrequencyAnalyseResponse.Data"));
		frequencyAnalyseResponse.setErrorCode(context.integerValue("FrequencyAnalyseResponse.ErrorCode"));
		frequencyAnalyseResponse.setErrorMsg(context.stringValue("FrequencyAnalyseResponse.ErrorMsg"));
	 
	 	return frequencyAnalyseResponse;
	}
}