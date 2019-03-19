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

import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo.RuleHitInfo;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo.RuleHitInfo.ConditionBasicInfo;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo.RuleHitInfo.ConditionBasicInfo.CheckRange;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo.RuleHitInfo.ConditionBasicInfo.CheckRange.Anchor;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo.RuleHitInfo.ConditionBasicInfo.CheckRange.Range;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo.RuleHitInfo.ConditionBasicInfo.OperatorBasicInfo;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo.RuleHitInfo.ConditionBasicInfo.OperatorBasicInfo.Param;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo.RuleHitInfo.ConditionHitInfo;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo.RuleHitInfo.ConditionHitInfo.HitKeyWord;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo.RuleHitInfo.ConditionHitInfo.Phrase;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadDataSyncResponseUnmarshaller {

	public static UploadDataSyncResponse unmarshall(UploadDataSyncResponse uploadDataSyncResponse, UnmarshallerContext context) {
		
		uploadDataSyncResponse.setRequestId(context.stringValue("UploadDataSyncResponse.RequestId"));
		uploadDataSyncResponse.setSuccess(context.booleanValue("UploadDataSyncResponse.Success"));
		uploadDataSyncResponse.setCode(context.stringValue("UploadDataSyncResponse.Code"));
		uploadDataSyncResponse.setMessage(context.stringValue("UploadDataSyncResponse.Message"));
		uploadDataSyncResponse.setCount(context.integerValue("UploadDataSyncResponse.Count"));

		List<ResultInfo> data = new ArrayList<ResultInfo>();
		for (int i = 0; i < context.lengthValue("UploadDataSyncResponse.Data.Length"); i++) {
			ResultInfo resultInfo = new ResultInfo();
			resultInfo.setTid(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Tid"));
			resultInfo.setAsrMsg(context.stringValue("UploadDataSyncResponse.Data["+ i +"].AsrMsg"));
			resultInfo.setScore(context.integerValue("UploadDataSyncResponse.Data["+ i +"].Score"));
			resultInfo.setReviewStatus(context.integerValue("UploadDataSyncResponse.Data["+ i +"].ReviewStatus"));
			resultInfo.setHitId(context.stringValue("UploadDataSyncResponse.Data["+ i +"].HitId"));
			resultInfo.setTaskId(context.stringValue("UploadDataSyncResponse.Data["+ i +"].TaskId"));

			List<String> handScoreIdList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("UploadDataSyncResponse.Data["+ i +"].HandScoreIdList.Length"); j++) {
				handScoreIdList.add(context.stringValue("UploadDataSyncResponse.Data["+ i +"].HandScoreIdList["+ j +"]"));
			}
			resultInfo.setHandScoreIdList(handScoreIdList);

			List<RuleHitInfo> rules = new ArrayList<RuleHitInfo>();
			for (int j = 0; j < context.lengthValue("UploadDataSyncResponse.Data["+ i +"].Rules.Length"); j++) {
				RuleHitInfo ruleHitInfo = new RuleHitInfo();
				ruleHitInfo.setHitStatus(context.integerValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].HitStatus"));
				ruleHitInfo.setRid(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Rid"));

				List<ConditionHitInfo> hit = new ArrayList<ConditionHitInfo>();
				for (int k = 0; k < context.lengthValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit.Length"); k++) {
					ConditionHitInfo conditionHitInfo = new ConditionHitInfo();

					List<String> hitCids = new ArrayList<String>();
					for (int l = 0; l < context.lengthValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitCids.Length"); l++) {
						hitCids.add(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitCids["+ l +"]"));
					}
					conditionHitInfo.setHitCids(hitCids);

					Phrase phrase = new Phrase();
					phrase.setRole(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.Role"));
					phrase.setIdentity(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.Identity"));
					phrase.setWords(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.Words"));
					phrase.setBegin(context.longValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.Begin"));
					phrase.setEnd(context.longValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.End"));
					phrase.setBeginTime(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.BeginTime"));
					phrase.setHourMinSec(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.HourMinSec"));
					conditionHitInfo.setPhrase(phrase);

					List<HitKeyWord> hitKeyWords = new ArrayList<HitKeyWord>();
					for (int l = 0; l < context.lengthValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords.Length"); l++) {
						HitKeyWord hitKeyWord = new HitKeyWord();
						hitKeyWord.setVal(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].Val"));
						hitKeyWord.setPid(context.integerValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].Pid"));
						hitKeyWord.setFrom(context.integerValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].From"));
						hitKeyWord.setTo(context.integerValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].To"));
						hitKeyWord.setTid(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].Tid"));

						hitKeyWords.add(hitKeyWord);
					}
					conditionHitInfo.setHitKeyWords(hitKeyWords);

					hit.add(conditionHitInfo);
				}
				ruleHitInfo.setHit(hit);

				List<ConditionBasicInfo> conditionInfo = new ArrayList<ConditionBasicInfo>();
				for (int k = 0; k < context.lengthValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo.Length"); k++) {
					ConditionBasicInfo conditionBasicInfo = new ConditionBasicInfo();
					conditionBasicInfo.setConditionInfoCid(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].ConditionInfoCid"));
					conditionBasicInfo.setLambda(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Lambda"));

					CheckRange checkRange = new CheckRange();
					checkRange.setRole(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].CheckRange.Role"));

					Anchor anchor = new Anchor();
					anchor.setAnchorCid(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].CheckRange.Anchor.AnchorCid"));
					anchor.setLocation(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].CheckRange.Anchor.Location"));
					anchor.setHitTime(context.integerValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].CheckRange.Anchor.HitTime"));
					checkRange.setAnchor(anchor);

					Range range = new Range();
					range.setFrom(context.integerValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].CheckRange.Range.From"));
					range.setTo(context.integerValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].CheckRange.Range.To"));
					checkRange.setRange(range);
					conditionBasicInfo.setCheckRange(checkRange);

					List<OperatorBasicInfo> operators = new ArrayList<OperatorBasicInfo>();
					for (int l = 0; l < context.lengthValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators.Length"); l++) {
						OperatorBasicInfo operatorBasicInfo = new OperatorBasicInfo();
						operatorBasicInfo.setOid(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Oid"));
						operatorBasicInfo.setType(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Type"));
						operatorBasicInfo.setName(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Name"));

						Param param = new Param();
						param.setRegex(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.Regex"));
						param.setPhrase(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.Phrase"));
						param.setInterval(context.integerValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.Interval"));
						param.setThreshold(context.floatValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.Threshold"));
						param.setInSentence(context.booleanValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.InSentence"));
						param.setTarget(context.integerValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.Target"));
						param.setFromEnd(context.booleanValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.FromEnd"));
						param.setDifferentRole(context.booleanValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.DifferentRole"));
						param.setTargetRole(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.TargetRole"));

						List<String> operKeyWords = new ArrayList<String>();
						for (int m = 0; m < context.lengthValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.OperKeyWords.Length"); m++) {
							operKeyWords.add(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.OperKeyWords["+ m +"]"));
						}
						param.setOperKeyWords(operKeyWords);

						List<String> references = new ArrayList<String>();
						for (int m = 0; m < context.lengthValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.References.Length"); m++) {
							references.add(context.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].Operators["+ l +"].Param.References["+ m +"]"));
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
		uploadDataSyncResponse.setData(data);
	 
	 	return uploadDataSyncResponse;
	}
}