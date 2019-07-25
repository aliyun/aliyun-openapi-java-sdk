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

import com.aliyuncs.qualitycheck.model.v20190115.InsertSubScoreForApiResponse;
import com.aliyuncs.qualitycheck.model.v20190115.InsertSubScoreForApiResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class InsertSubScoreForApiResponseUnmarshaller {

	public static InsertSubScoreForApiResponse unmarshall(InsertSubScoreForApiResponse insertSubScoreForApiResponse, UnmarshallerContext _ctx) {
		
		insertSubScoreForApiResponse.setRequestId(_ctx.stringValue("InsertSubScoreForApiResponse.RequestId"));
		insertSubScoreForApiResponse.setSuccess(_ctx.booleanValue("InsertSubScoreForApiResponse.Success"));
		insertSubScoreForApiResponse.setCode(_ctx.stringValue("InsertSubScoreForApiResponse.Code"));
		insertSubScoreForApiResponse.setMessage(_ctx.stringValue("InsertSubScoreForApiResponse.Message"));

		Data data = new Data();
		data.setScoreSubId(_ctx.longValue("InsertSubScoreForApiResponse.Data.ScoreSubId"));
		data.setScoreSubName(_ctx.stringValue("InsertSubScoreForApiResponse.Data.ScoreSubName"));
		insertSubScoreForApiResponse.setData(data);
	 
	 	return insertSubScoreForApiResponse;
	}
}