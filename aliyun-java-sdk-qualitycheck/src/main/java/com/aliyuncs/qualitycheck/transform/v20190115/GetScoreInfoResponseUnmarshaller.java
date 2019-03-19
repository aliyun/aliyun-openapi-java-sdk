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

import com.aliyuncs.qualitycheck.model.v20190115.GetScoreInfoResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetScoreInfoResponse.ScorePo;
import com.aliyuncs.qualitycheck.model.v20190115.GetScoreInfoResponse.ScorePo.ScoreParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetScoreInfoResponseUnmarshaller {

	public static GetScoreInfoResponse unmarshall(GetScoreInfoResponse getScoreInfoResponse, UnmarshallerContext context) {
		
		getScoreInfoResponse.setRequestId(context.stringValue("GetScoreInfoResponse.RequestId"));
		getScoreInfoResponse.setSuccess(context.booleanValue("GetScoreInfoResponse.Success"));
		getScoreInfoResponse.setCode(context.stringValue("GetScoreInfoResponse.Code"));
		getScoreInfoResponse.setMessage(context.stringValue("GetScoreInfoResponse.Message"));

		List<ScorePo> data = new ArrayList<ScorePo>();
		for (int i = 0; i < context.lengthValue("GetScoreInfoResponse.Data.Length"); i++) {
			ScorePo scorePo = new ScorePo();
			scorePo.setScoreId(context.integerValue("GetScoreInfoResponse.Data["+ i +"].ScoreId"));
			scorePo.setScoreName(context.stringValue("GetScoreInfoResponse.Data["+ i +"].ScoreName"));

			List<ScoreParam> scoreInfos = new ArrayList<ScoreParam>();
			for (int j = 0; j < context.lengthValue("GetScoreInfoResponse.Data["+ i +"].ScoreInfos.Length"); j++) {
				ScoreParam scoreParam = new ScoreParam();
				scoreParam.setScoreNum(context.integerValue("GetScoreInfoResponse.Data["+ i +"].ScoreInfos["+ j +"].ScoreNum"));
				scoreParam.setScoreSubId(context.integerValue("GetScoreInfoResponse.Data["+ i +"].ScoreInfos["+ j +"].ScoreSubId"));
				scoreParam.setScoreSubName(context.stringValue("GetScoreInfoResponse.Data["+ i +"].ScoreInfos["+ j +"].ScoreSubName"));
				scoreParam.setScoreType(context.integerValue("GetScoreInfoResponse.Data["+ i +"].ScoreInfos["+ j +"].ScoreType"));

				scoreInfos.add(scoreParam);
			}
			scorePo.setScoreInfos(scoreInfos);

			data.add(scorePo);
		}
		getScoreInfoResponse.setData(data);
	 
	 	return getScoreInfoResponse;
	}
}