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
		
		getResultResponse.setRequestId(context.stringValue("GetResultResponse.RequestId"));
		getResultResponse.setSuccess(context.booleanValue("GetResultResponse.Success"));
		getResultResponse.setCode(context.stringValue("GetResultResponse.Code"));
		getResultResponse.setMessage(context.stringValue("GetResultResponse.Message"));
		getResultResponse.setCount(context.integerValue("GetResultResponse.Count"));

		List<ResultInfo> data = new ArrayList<ResultInfo>();
		for (int i = 0; i < context.lengthValue("GetResultResponse.Data.Length"); i++) {
			ResultInfo resultInfo = new ResultInfo();
			resultInfo.setTid(context.stringValue("GetResultResponse.Data["+ i +"].Tid"));

			List<RuleHitInfo> rules = new ArrayList<RuleHitInfo>();
			for (int j = 0; j < context.lengthValue("GetResultResponse.Data["+ i +"].Rules.Length"); j++) {
				RuleHitInfo ruleHitInfo = new RuleHitInfo();
				ruleHitInfo.setRid(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Rid"));

				List<ConditionHitInfo> hit = new ArrayList<ConditionHitInfo>();
				for (int k = 0; k < context.lengthValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Hit.Length"); k++) {
					ConditionHitInfo conditionHitInfo = new ConditionHitInfo();

					List<String> hitCids = new ArrayList<String>();
					for (int l = 0; l < context.lengthValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitCids.Length"); l++) {
						hitCids.add(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitCids["+ l +"]"));
					}
					conditionHitInfo.setHitCids(hitCids);

					Phrase phrase = new Phrase();
					phrase.setRole(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.Role"));
					phrase.setIdentity(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.Identity"));
					phrase.setWords(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.Words"));
					phrase.setBegin(context.longValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.Begin"));
					phrase.setEnd(context.longValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.End"));
					phrase.setBeginTime(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.BeginTime"));
					phrase.setHourMinSec(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.hourMinSec"));
					conditionHitInfo.setPhrase(phrase);

					List<HitKeyWord> hitKeyWords = new ArrayList<HitKeyWord>();
					for (int l = 0; l < context.lengthValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords.Length"); l++) {
						HitKeyWord hitKeyWord = new HitKeyWord();
						hitKeyWord.setVal(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].Val"));
						hitKeyWord.setPid(context.integerValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].Pid"));
						hitKeyWord.setFrom(context.integerValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].From"));
						hitKeyWord.setTo(context.integerValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].To"));
						hitKeyWord.setTid(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].Tid"));

						hitKeyWords.add(hitKeyWord);
					}
					conditionHitInfo.setHitKeyWords(hitKeyWords);

					hit.add(conditionHitInfo);
				}
				ruleHitInfo.setHit(hit);

				List<ConditionBasicInfo> conditionInfo = new ArrayList<ConditionBasicInfo>();
				for (int k = 0; k < context.lengthValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo.Length"); k++) {
					ConditionBasicInfo conditionBasicInfo = new ConditionBasicInfo();
					conditionBasicInfo.setConditionInfoCid(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].ConditionInfoCid"));
					conditionBasicInfo.setLambda(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Lambda"));

					CheckRange checkRange = new CheckRange();
					checkRange.setRole(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].CheckRange.Role"));

					Anchor anchor = new Anchor();
					anchor.setAnchorCid(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].CheckRange.Anchor.AnchorCid"));
					anchor.setLocation(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].CheckRange.Anchor.Location"));
					anchor.setHitTime(context.integerValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].CheckRange.Anchor.HitTime"));
					checkRange.setAnchor(anchor);

					Range range = new Range();
					range.setFrom(context.integerValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].CheckRange.Range.From"));
					range.setTo(context.integerValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].CheckRange.Range.To"));
					checkRange.setRange(range);
					conditionBasicInfo.setCheckRange(checkRange);

					List<OperatorBasicInfo> operators = new ArrayList<OperatorBasicInfo>();
					for (int l = 0; l < context.lengthValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators.Length"); l++) {
						OperatorBasicInfo operatorBasicInfo = new OperatorBasicInfo();
						operatorBasicInfo.setOid(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Oid"));
						operatorBasicInfo.setType(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Type"));
						operatorBasicInfo.setName(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Name"));

						Param param = new Param();
						param.setRegex(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.Regex"));
						param.setPhrase(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.Phrase"));
						param.setInterval(context.integerValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.Interval"));
						param.setThreshold(context.floatValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.Threshold"));
						param.setInSentence(context.booleanValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.InSentence"));
						param.setTarget(context.integerValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.Target"));
						param.setFromEnd(context.booleanValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.FromEnd"));
						param.setDifferentRole(context.booleanValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.DifferentRole"));
						param.setTargetRole(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.TargetRole"));

						List<String> operKeyWords = new ArrayList<String>();
						for (int m = 0; m < context.lengthValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.OperKeyWords.Length"); m++) {
							operKeyWords.add(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.OperKeyWords["+ m +"]"));
						}
						param.setOperKeyWords(operKeyWords);

						List<String> references = new ArrayList<String>();
						for (int m = 0; m < context.lengthValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.References.Length"); m++) {
							references.add(context.stringValue("GetResultResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.References["+ m +"]"));
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