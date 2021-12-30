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

import com.aliyuncs.ccc.model.v20170705.PublishSurveyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PublishSurveyResponseUnmarshaller {

	public static PublishSurveyResponse unmarshall(PublishSurveyResponse publishSurveyResponse, UnmarshallerContext _ctx) {
		
		publishSurveyResponse.setRequestId(_ctx.stringValue("PublishSurveyResponse.RequestId"));
		publishSurveyResponse.setSuccess(_ctx.booleanValue("PublishSurveyResponse.Success"));
		publishSurveyResponse.setCode(_ctx.stringValue("PublishSurveyResponse.Code"));
		publishSurveyResponse.setMessage(_ctx.stringValue("PublishSurveyResponse.Message"));
		publishSurveyResponse.setHttpStatusCode(_ctx.integerValue("PublishSurveyResponse.HttpStatusCode"));
	 
	 	return publishSurveyResponse;
	}
}