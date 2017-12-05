/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.qualitycheck.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20160801.GetResultResponse;
import com.aliyuncs.qualitycheck.model.v20160801.GetResultResponse.ResultInfo;
import com.aliyuncs.qualitycheck.model.v20160801.GetResultResponse.ResultInfo.RuleHitInfo;
import com.aliyuncs.qualitycheck.model.v20160801.GetResultResponse.ResultInfo.RuleHitInfo.ConditionBasicInfo;
import com.aliyuncs.qualitycheck.model.v20160801.GetResultResponse.ResultInfo.RuleHitInfo.ConditionBasicInfo.CheckRange;
import com.aliyuncs.qualitycheck.model.v20160801.GetResultResponse.ResultInfo.RuleHitInfo.ConditionBasicInfo.CheckRange.Anchor;
import com.aliyuncs.qualitycheck.model.v20160801.GetResultResponse.ResultInfo.RuleHitInfo.ConditionBasicInfo.CheckRange.Range;
import com.aliyuncs.qualitycheck.model.v20160801.GetResultResponse.ResultInfo.RuleHitInfo.ConditionBasicInfo.OperatorBasicInfo;
import com.aliyuncs.qualitycheck.model.v20160801.GetResultResponse.ResultInfo.RuleHitInfo.ConditionBasicInfo.OperatorBasicInfo.Param;
import com.aliyuncs.qualitycheck.model.v20160801.GetResultResponse.ResultInfo.RuleHitInfo.ConditionHitInfo;
import com.aliyuncs.qualitycheck.model.v20160801.GetResultResponse.ResultInfo.RuleHitInfo.ConditionHitInfo.HitKeyWord;
import com.aliyuncs.qualitycheck.model.v20160801.GetResultResponse.ResultInfo.RuleHitInfo.ConditionHitInfo.Phrase;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResultResponseUnmarshaller {

	public static GetResultResponse unmarshall(GetResultResponse getResultResponse, UnmarshallerContext context) {
		
		getResultResponse.setRequestId(context.stringValue("GetResultResponse.requestId"));
		getResultResponse.setSuccess(context.booleanValue("GetResultResponse.success"));
		getResultResponse.setCode(context.stringValue("GetResultResponse.code"));
		getResultResponse.setMessage(context.stringValue("GetResultResponse.message"));
		getResultResponse.setCount(context.integerValue("GetResultResponse.count"));

		List<ResultInfo> data = new ArrayList<ResultInfo>();
		for (int i = 0; i < context.lengthValue("GetResultResponse.data.Length"); i++) {
			ResultInfo resultInfo = new ResultInfo();
			resultInfo.setTid(context.stringValue("GetResultResponse.data["+ i +"].tid"));
			resultInfo.setScore(context.integerValue("GetResultResponse.data["+ i +"].score"));
			resultInfo.setReviewStatus(context.integerValue("GetResultResponse.data["+ i +"].reviewStatus"));
			resultInfo.setHitId(context.stringValue("GetResultResponse.data["+ i +"].hitId"));

			List<String> handScoreIdList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetResultResponse.data["+ i +"].handScoreIdList.Length"); j++) {
				handScoreIdList.add(context.stringValue("GetResultResponse.data["+ i +"].handScoreIdList["+ j +"]"));
			}
			resultInfo.setHandScoreIdList(handScoreIdList);

			List<RuleHitInfo> rules = new ArrayList<RuleHitInfo>();
			for (int j = 0; j < context.lengthValue("GetResultResponse.data["+ i +"].rules.Length"); j++) {
				RuleHitInfo ruleHitInfo = new RuleHitInfo();
				ruleHitInfo.setHitStatus(context.integerValue("GetResultResponse.data["+ i +"].rules["+ j +"].hitStatus"));
				ruleHitInfo.setRid(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].rid"));

				List<ConditionHitInfo> hit = new ArrayList<ConditionHitInfo>();
				for (int k = 0; k < context.lengthValue("GetResultResponse.data["+ i +"].rules["+ j +"].hit.Length"); k++) {
					ConditionHitInfo conditionHitInfo = new ConditionHitInfo();

					List<String> hitCids = new ArrayList<String>();
					for (int l = 0; l < context.lengthValue("GetResultResponse.data["+ i +"].rules["+ j +"].hit["+ k +"].hitCids.Length"); l++) {
						hitCids.add(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].hit["+ k +"].hitCids["+ l +"]"));
					}
					conditionHitInfo.setHitCids(hitCids);

					Phrase phrase = new Phrase();
					phrase.setRole(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].hit["+ k +"].phrase.role"));
					phrase.setIdentity(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].hit["+ k +"].phrase.identity"));
					phrase.setWords(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].hit["+ k +"].phrase.words"));
					phrase.setBegin(context.longValue("GetResultResponse.data["+ i +"].rules["+ j +"].hit["+ k +"].phrase.begin"));
					phrase.setEnd(context.longValue("GetResultResponse.data["+ i +"].rules["+ j +"].hit["+ k +"].phrase.end"));
					phrase.setBeginTime(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].hit["+ k +"].phrase.beginTime"));
					phrase.setHourMinSec(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].hit["+ k +"].phrase.hourMinSec"));
					conditionHitInfo.setPhrase(phrase);

					List<HitKeyWord> hitKeyWords = new ArrayList<HitKeyWord>();
					for (int l = 0; l < context.lengthValue("GetResultResponse.data["+ i +"].rules["+ j +"].hit["+ k +"].hitKeyWords.Length"); l++) {
						HitKeyWord hitKeyWord = new HitKeyWord();
						hitKeyWord.setVal(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].hit["+ k +"].hitKeyWords["+ l +"].val"));
						hitKeyWord.setPid(context.integerValue("GetResultResponse.data["+ i +"].rules["+ j +"].hit["+ k +"].hitKeyWords["+ l +"].pid"));
						hitKeyWord.setFrom(context.integerValue("GetResultResponse.data["+ i +"].rules["+ j +"].hit["+ k +"].hitKeyWords["+ l +"].from"));
						hitKeyWord.setTo(context.integerValue("GetResultResponse.data["+ i +"].rules["+ j +"].hit["+ k +"].hitKeyWords["+ l +"].to"));
						hitKeyWord.setTid(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].hit["+ k +"].hitKeyWords["+ l +"].tid"));

						hitKeyWords.add(hitKeyWord);
					}
					conditionHitInfo.setHitKeyWords(hitKeyWords);

					hit.add(conditionHitInfo);
				}
				ruleHitInfo.setHit(hit);

				List<ConditionBasicInfo> conditionInfo = new ArrayList<ConditionBasicInfo>();
				for (int k = 0; k < context.lengthValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo.Length"); k++) {
					ConditionBasicInfo conditionBasicInfo = new ConditionBasicInfo();
					conditionBasicInfo.setConditionInfoCid(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].conditionInfoCid"));
					conditionBasicInfo.setLambda(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].lambda"));

					CheckRange checkRange = new CheckRange();
					checkRange.setRole(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].checkRange.role"));

					Anchor anchor = new Anchor();
					anchor.setAnchorCid(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].checkRange.anchor.anchorCid"));
					anchor.setLocation(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].checkRange.anchor.location"));
					anchor.setHitTime(context.integerValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].checkRange.anchor.hitTime"));
					checkRange.setAnchor(anchor);

					Range range = new Range();
					range.setFrom(context.integerValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].checkRange.range.from"));
					range.setTo(context.integerValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].checkRange.range.to"));
					checkRange.setRange(range);
					conditionBasicInfo.setCheckRange(checkRange);

					List<OperatorBasicInfo> operators = new ArrayList<OperatorBasicInfo>();
					for (int l = 0; l < context.lengthValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators.Length"); l++) {
						OperatorBasicInfo operatorBasicInfo = new OperatorBasicInfo();
						operatorBasicInfo.setOid(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators["+ l +"].oid"));
						operatorBasicInfo.setType(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators["+ l +"].type"));
						operatorBasicInfo.setName(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators["+ l +"].name"));

						Param param = new Param();
						param.setRegex(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators["+ l +"].param.regex"));
						param.setPhrase(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators["+ l +"].param.phrase"));
						param.setInterval(context.integerValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators["+ l +"].param.interval"));
						param.setThreshold(context.floatValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators["+ l +"].param.threshold"));
						param.setInSentence(context.booleanValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators["+ l +"].param.inSentence"));
						param.setTarget(context.integerValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators["+ l +"].param.target"));
						param.setFromEnd(context.booleanValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators["+ l +"].param.fromEnd"));
						param.setDifferentRole(context.booleanValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators["+ l +"].param.differentRole"));
						param.setTargetRole(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators["+ l +"].param.targetRole"));

						List<String> operKeyWords = new ArrayList<String>();
						for (int m = 0; m < context.lengthValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators["+ l +"].param.operKeyWords.Length"); m++) {
							operKeyWords.add(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators["+ l +"].param.operKeyWords["+ m +"]"));
						}
						param.setOperKeyWords(operKeyWords);

						List<String> references = new ArrayList<String>();
						for (int m = 0; m < context.lengthValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators["+ l +"].param.references.Length"); m++) {
							references.add(context.stringValue("GetResultResponse.data["+ i +"].rules["+ j +"].conditionInfo["+ k +"].operators["+ l +"].param.references["+ m +"]"));
						}
						param.setReferences(references);
						operatorBasicInfo.setParam(param);

						operators.add(operatorBasicInfo);
					}
					conditionBasicInfo.setOperators(operators);

					conditionInfo.add(conditionBasicInfo);
				}
				ruleHitInfo.setConditionInfo(conditionInfo);

				rules.add(ruleHitInfo);
			}
			resultInfo.setRules(rules);

			data.add(resultInfo);
		}
		getResultResponse.setData(data);
	 
	 	return getResultResponse;
	}
}