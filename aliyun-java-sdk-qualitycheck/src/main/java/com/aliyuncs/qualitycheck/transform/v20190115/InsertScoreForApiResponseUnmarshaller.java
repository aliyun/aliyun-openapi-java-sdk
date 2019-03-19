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

import com.aliyuncs.qualitycheck.model.v20190115.InsertScoreForApiResponse;
import com.aliyuncs.qualitycheck.model.v20190115.InsertScoreForApiResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class InsertScoreForApiResponseUnmarshaller {

	public static InsertScoreForApiResponse unmarshall(InsertScoreForApiResponse insertScoreForApiResponse, UnmarshallerContext context) {
		
		insertScoreForApiResponse.setRequestId(context.stringValue("InsertScoreForApiResponse.RequestId"));
		insertScoreForApiResponse.setSuccess(context.booleanValue("InsertScoreForApiResponse.Success"));
		insertScoreForApiResponse.setCode(context.stringValue("InsertScoreForApiResponse.Code"));
		insertScoreForApiResponse.setMessage(context.stringValue("InsertScoreForApiResponse.Message"));

		Data data = new Data();
		data.setScoreId(context.longValue("InsertScoreForApiResponse.Data.ScoreId"));
		data.setScoreName(context.stringValue("InsertScoreForApiResponse.Data.ScoreName"));
		insertScoreForApiResponse.setData(data);
	 
	 	return insertScoreForApiResponse;
	}
}