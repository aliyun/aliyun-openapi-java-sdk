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

import com.aliyuncs.qualitycheck.model.v20160801.GetScoreInfoResponse;
import com.aliyuncs.qualitycheck.model.v20160801.GetScoreInfoResponse.ScorePo;
import com.aliyuncs.qualitycheck.model.v20160801.GetScoreInfoResponse.ScorePo.ScoreParam;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetScoreInfoResponseUnmarshaller {

	public static GetScoreInfoResponse unmarshall(GetScoreInfoResponse getScoreInfoResponse, UnmarshallerContext context) {
		
		getScoreInfoResponse.setRequestId(context.stringValue("GetScoreInfoResponse.requestId"));
		getScoreInfoResponse.setSuccess(context.booleanValue("GetScoreInfoResponse.success"));
		getScoreInfoResponse.setCode(context.stringValue("GetScoreInfoResponse.code"));
		getScoreInfoResponse.setMessage(context.stringValue("GetScoreInfoResponse.message"));

		List<ScorePo> data = new ArrayList<ScorePo>();
		for (int i = 0; i < context.lengthValue("GetScoreInfoResponse.data.Length"); i++) {
			ScorePo scorePo = new ScorePo();
			scorePo.setScoreId(context.integerValue("GetScoreInfoResponse.data["+ i +"].scoreId"));
			scorePo.setScoreName(context.stringValue("GetScoreInfoResponse.data["+ i +"].scoreName"));

			List<ScoreParam> scoreInfos = new ArrayList<ScoreParam>();
			for (int j = 0; j < context.lengthValue("GetScoreInfoResponse.data["+ i +"].scoreInfos.Length"); j++) {
				ScoreParam scoreParam = new ScoreParam();
				scoreParam.setScoreNum(context.integerValue("GetScoreInfoResponse.data["+ i +"].scoreInfos["+ j +"].scoreNum"));
				scoreParam.setScoreSubId(context.integerValue("GetScoreInfoResponse.data["+ i +"].scoreInfos["+ j +"].scoreSubId"));
				scoreParam.setScoreSubName(context.stringValue("GetScoreInfoResponse.data["+ i +"].scoreInfos["+ j +"].scoreSubName"));
				scoreParam.setScoreType(context.integerValue("GetScoreInfoResponse.data["+ i +"].scoreInfos["+ j +"].scoreType"));

				scoreInfos.add(scoreParam);
			}
			scorePo.setScoreInfos(scoreInfos);

			data.add(scorePo);
		}
		getScoreInfoResponse.setData(data);
	 
	 	return getScoreInfoResponse;
	}
}