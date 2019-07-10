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

import com.aliyuncs.qualitycheck.model.v20190115.TestRuleResponse;
import com.aliyuncs.qualitycheck.model.v20190115.TestRuleResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.TestRuleResponse.Data.HitRuleReviewInfo;
import com.aliyuncs.qualitycheck.model.v20190115.TestRuleResponse.Data.HitRuleReviewInfo.ConditionHitInfo;
import com.aliyuncs.qualitycheck.model.v20190115.TestRuleResponse.Data.HitRuleReviewInfo.ConditionHitInfo.KeyWord;
import com.aliyuncs.qualitycheck.model.v20190115.TestRuleResponse.Data.HitRuleReviewInfo.ConditionHitInfo.Phrase;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestRuleResponseUnmarshaller {

	public static TestRuleResponse unmarshall(TestRuleResponse testRuleResponse, UnmarshallerContext _ctx) {
		
		testRuleResponse.setRequestId(_ctx.stringValue("TestRuleResponse.RequestId"));
		testRuleResponse.setSuccess(_ctx.booleanValue("TestRuleResponse.Success"));
		testRuleResponse.setCode(_ctx.stringValue("TestRuleResponse.Code"));
		testRuleResponse.setMessage(_ctx.stringValue("TestRuleResponse.Message"));

		Data data = new Data();
		data.setPoc(_ctx.booleanValue("TestRuleResponse.Data.Poc"));

		List<HitRuleReviewInfo> hitRuleReviewInfoList = new ArrayList<HitRuleReviewInfo>();
		for (int i = 0; i < _ctx.lengthValue("TestRuleResponse.Data.HitRuleReviewInfoList.Length"); i++) {
			HitRuleReviewInfo hitRuleReviewInfo = new HitRuleReviewInfo();
			hitRuleReviewInfo.setRid(_ctx.longValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].Rid"));

			List<ConditionHitInfo> conditionHitInfoList = new ArrayList<ConditionHitInfo>();
			for (int j = 0; j < _ctx.lengthValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList.Length"); j++) {
				ConditionHitInfo conditionHitInfo = new ConditionHitInfo();

				List<String> cid = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Cid.Length"); k++) {
					cid.add(_ctx.stringValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Cid["+ k +"]"));
				}
				conditionHitInfo.setCid(cid);

				Phrase phrase = new Phrase();
				phrase.setRole(_ctx.stringValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Role"));
				phrase.setIdentity(_ctx.stringValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Identity"));
				phrase.setEmotionValue(_ctx.integerValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.EmotionValue"));
				phrase.setWords(_ctx.stringValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Words"));
				phrase.setEnd(_ctx.longValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.End"));
				phrase.setPid(_ctx.integerValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Pid"));
				phrase.setBegin(_ctx.longValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Begin"));
				conditionHitInfo.setPhrase(phrase);

				List<KeyWord> keyWords = new ArrayList<KeyWord>();
				for (int k = 0; k < _ctx.lengthValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords.Length"); k++) {
					KeyWord keyWord = new KeyWord();
					keyWord.setVal(_ctx.stringValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Val"));
					keyWord.setPid(_ctx.integerValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Pid"));
					keyWord.setFrom(_ctx.integerValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].From"));
					keyWord.setTo(_ctx.integerValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].To"));
					keyWord.setTid(_ctx.stringValue("TestRuleResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Tid"));

					keyWords.add(keyWord);
				}
				conditionHitInfo.setKeyWords(keyWords);

				conditionHitInfoList.add(conditionHitInfo);
			}
			hitRuleReviewInfo.setConditionHitInfoList(conditionHitInfoList);

			hitRuleReviewInfoList.add(hitRuleReviewInfo);
		}
		data.setHitRuleReviewInfoList(hitRuleReviewInfoList);
		testRuleResponse.setData(data);
	 
	 	return testRuleResponse;
	}
}