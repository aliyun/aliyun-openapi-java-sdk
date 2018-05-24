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

import com.aliyuncs.qualitycheck.model.v20160801.InsertSubScoreForApiResponse;
import com.aliyuncs.qualitycheck.model.v20160801.InsertSubScoreForApiResponse.ScorePo;
import com.aliyuncs.transform.UnmarshallerContext;


public class InsertSubScoreForApiResponseUnmarshaller {

	public static InsertSubScoreForApiResponse unmarshall(InsertSubScoreForApiResponse insertSubScoreForApiResponse, UnmarshallerContext context) {
		
		insertSubScoreForApiResponse.setRequestId(context.stringValue("InsertSubScoreForApiResponse.requestId"));
		insertSubScoreForApiResponse.setSuccess(context.booleanValue("InsertSubScoreForApiResponse.success"));
		insertSubScoreForApiResponse.setCode(context.stringValue("InsertSubScoreForApiResponse.code"));
		insertSubScoreForApiResponse.setMessage(context.stringValue("InsertSubScoreForApiResponse.message"));

		List<ScorePo> data = new ArrayList<ScorePo>();
		for (int i = 0; i < context.lengthValue("InsertSubScoreForApiResponse.data.Length"); i++) {
			ScorePo scorePo = new ScorePo();
			scorePo.setScoreSubId(context.longValue("InsertSubScoreForApiResponse.data["+ i +"].scoreSubId"));
			scorePo.setScoreSubName(context.stringValue("InsertSubScoreForApiResponse.data["+ i +"].scoreSubName"));

			data.add(scorePo);
		}
		insertSubScoreForApiResponse.setData(data);
	 
	 	return insertSubScoreForApiResponse;
	}
}