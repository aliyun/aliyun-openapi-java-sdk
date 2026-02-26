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

import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.Agent;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.AsrResultItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.ConditionsItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.ConditionsItem.Check_range;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.ConditionsItem.Check_range.Anchor;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.ConditionsItem.Check_range.Range;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.ConditionsItem.Check_range.TimeRange;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.ConditionsItem.Operator;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.ConditionsItem.Operator.Param;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.ConditionsItem.Operator.Param.FlowNodePrerequisiteParam;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.ConditionsItem.Operator.Param.IntentModelCheckParm;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.ConditionsItem.Operator.Param.IntentModelCheckParm.Intent;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.Hit;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.Hit.KeyWord;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.Hit.Phrase;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitScoreItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.Recording;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.ReviewHistory;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.ReviewHistory.ReviewRightRuleItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.ReviewTypeIdListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResultResponseUnmarshaller {

	public static GetResultResponse unmarshall(GetResultResponse getResultResponse, UnmarshallerContext _ctx) {
		
		getResultResponse.setRequestId(_ctx.stringValue("GetResultResponse.RequestId"));
		getResultResponse.setSuccess(_ctx.booleanValue("GetResultResponse.Success"));
		getResultResponse.setResultCountId(_ctx.stringValue("GetResultResponse.ResultCountId"));
		getResultResponse.setCode(_ctx.stringValue("GetResultResponse.Code"));
		getResultResponse.setMessage(_ctx.stringValue("GetResultResponse.Message"));
		getResultResponse.setPageNumber(_ctx.integerValue("GetResultResponse.PageNumber"));
		getResultResponse.setPageSize(_ctx.integerValue("GetResultResponse.PageSize"));
		getResultResponse.setCount(_ctx.integerValue("GetResultResponse.Count"));

		List<ResultInfo> data = new ArrayList<ResultInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetResultResponse.Data.Length"); i++) {
			ResultInfo resultInfo = new ResultInfo();
			resultInfo.setStatus(_ctx.integerValue("GetResultResponse.Data["+ i +"].Status"));
			resultInfo.setAssignmentTime(_ctx.stringValue("GetResultResponse.Data["+ i +"].AssignmentTime"));
			resultInfo.setLastDataId(_ctx.stringValue("GetResultResponse.Data["+ i +"].LastDataId"));
			resultInfo.setErrorMessage(_ctx.stringValue("GetResultResponse.Data["+ i +"].ErrorMessage"));
			resultInfo.setReviewer(_ctx.stringValue("GetResultResponse.Data["+ i +"].Reviewer"));
			resultInfo.setCreateTime(_ctx.stringValue("GetResultResponse.Data["+ i +"].CreateTime"));
			resultInfo.setReviewStatus(_ctx.integerValue("GetResultResponse.Data["+ i +"].ReviewStatus"));
			resultInfo.setReviewTimeLong(_ctx.stringValue("GetResultResponse.Data["+ i +"].ReviewTimeLong"));
			resultInfo.setTaskName(_ctx.stringValue("GetResultResponse.Data["+ i +"].TaskName"));
			resultInfo.setReviewResult(_ctx.integerValue("GetResultResponse.Data["+ i +"].ReviewResult"));
			resultInfo.setScore(_ctx.integerValue("GetResultResponse.Data["+ i +"].Score"));
			resultInfo.setCreateTimeLong(_ctx.stringValue("GetResultResponse.Data["+ i +"].CreateTimeLong"));
			resultInfo.setReviewTime(_ctx.stringValue("GetResultResponse.Data["+ i +"].ReviewTime"));
			resultInfo.setComments(_ctx.stringValue("GetResultResponse.Data["+ i +"].Comments"));
			resultInfo.setTaskId(_ctx.stringValue("GetResultResponse.Data["+ i +"].TaskId"));
			resultInfo.setReviewType(_ctx.integerValue("GetResultResponse.Data["+ i +"].ReviewType"));
			resultInfo.setResolver(_ctx.stringValue("GetResultResponse.Data["+ i +"].Resolver"));
			resultInfo.setVid(_ctx.stringValue("GetResultResponse.Data["+ i +"].Vid"));

			List<Long> schemeIdList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetResultResponse.Data["+ i +"].SchemeIdList.Length"); j++) {
				schemeIdList.add(_ctx.longValue("GetResultResponse.Data["+ i +"].SchemeIdList["+ j +"]"));
			}
			resultInfo.setSchemeIdList(schemeIdList);

			List<String> schemeNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetResultResponse.Data["+ i +"].SchemeNameList.Length"); j++) {
				schemeNameList.add(_ctx.stringValue("GetResultResponse.Data["+ i +"].SchemeNameList["+ j +"]"));
			}
			resultInfo.setSchemeNameList(schemeNameList);

			Recording recording = new Recording();
			recording.setRemark13(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark13"));
			recording.setCallee(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Callee"));
			recording.setDialogueSize(_ctx.integerValue("GetResultResponse.Data["+ i +"].Recording.DialogueSize"));
			recording.setPrimaryId(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.PrimaryId"));
			recording.setRemark12(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark12"));
			recording.setRemark1(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark1"));
			recording.setRemark7(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark7"));
			recording.setRemark8(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark8"));
			recording.setRemark2(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark2"));
			recording.setCallId(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.CallId"));
			recording.setRemark9(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark9"));
			recording.setName(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Name"));
			recording.setRemark6(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark6"));
			recording.setRemark10(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark10"));
			recording.setBusiness(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Business"));
			recording.setRemark3(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark3"));
			recording.setUrl(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Url"));
			recording.setRemark11(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark11"));
			recording.setRemark4(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark4"));
			recording.setCallType(_ctx.integerValue("GetResultResponse.Data["+ i +"].Recording.CallType"));
			recording.setCaller(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Caller"));
			recording.setDataSetName(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.DataSetName"));
			recording.setDuration(_ctx.longValue("GetResultResponse.Data["+ i +"].Recording.Duration"));
			recording.setRemark5(_ctx.longValue("GetResultResponse.Data["+ i +"].Recording.Remark5"));
			recording.setId(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Id"));
			recording.setCallTime(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.CallTime"));
			recording.setTaskConfigId(_ctx.longValue("GetResultResponse.Data["+ i +"].Recording.TaskConfigId"));
			recording.setTaskConfigName(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.TaskConfigName"));
			recording.setCustomerName(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.CustomerName"));
			resultInfo.setRecording(recording);

			Agent agent = new Agent();
			agent.setName(_ctx.stringValue("GetResultResponse.Data["+ i +"].Agent.Name"));
			agent.setSkillGroup(_ctx.stringValue("GetResultResponse.Data["+ i +"].Agent.SkillGroup"));
			agent.setId(_ctx.stringValue("GetResultResponse.Data["+ i +"].Agent.Id"));
			resultInfo.setAgent(agent);

			List<AsrResultItem> asrResult = new ArrayList<AsrResultItem>();
			for (int j = 0; j < _ctx.lengthValue("GetResultResponse.Data["+ i +"].AsrResult.Length"); j++) {
				AsrResultItem asrResultItem = new AsrResultItem();
				asrResultItem.setWords(_ctx.stringValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].Words"));
				asrResultItem.setBegin(_ctx.longValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].Begin"));
				asrResultItem.setEmotionValue(_ctx.integerValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].EmotionValue"));
				asrResultItem.setEnd(_ctx.longValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].End"));
				asrResultItem.setSpeechRate(_ctx.integerValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].SpeechRate"));
				asrResultItem.setRole(_ctx.stringValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].Role"));
				asrResultItem.setIdentity(_ctx.stringValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].Identity"));

				asrResult.add(asrResultItem);
			}
			resultInfo.setAsrResult(asrResult);

			List<HitResultItem> hitResult = new ArrayList<HitResultItem>();
			for (int j = 0; j < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult.Length"); j++) {
				HitResultItem hitResultItem = new HitResultItem();
				hitResultItem.setType(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Type"));
				hitResultItem.setReviewResult(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].ReviewResult"));
				hitResultItem.setName(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Name"));
				hitResultItem.setRid(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Rid"));
				hitResultItem.setSchemeId(_ctx.longValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].SchemeId"));
				hitResultItem.setSchemeVersion(_ctx.longValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].SchemeVersion"));
				hitResultItem.setScore(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Score"));

				List<Hit> hits = new ArrayList<Hit>();
				for (int k = 0; k < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits.Length"); k++) {
					Hit hit = new Hit();

					List<String> cid = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Cid.Length"); l++) {
						cid.add(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Cid["+ l +"]"));
					}
					hit.setCid(cid);

					Phrase phrase = new Phrase();
					phrase.setEmotionValue(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.EmotionValue"));
					phrase.setEnd(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.End"));
					phrase.setWords(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.Words"));
					phrase.setRole(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.Role"));
					phrase.setBegin(_ctx.longValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.Begin"));
					hit.setPhrase(phrase);

					List<KeyWord> keyWords = new ArrayList<KeyWord>();
					for (int l = 0; l < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords.Length"); l++) {
						KeyWord keyWord = new KeyWord();
						keyWord.setFrom(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].From"));
						keyWord.setTo(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].To"));
						keyWord.setVal(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].Val"));
						keyWord.setCid(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].Cid"));

						keyWords.add(keyWord);
					}
					hit.setKeyWords(keyWords);

					hits.add(hit);
				}
				hitResultItem.setHits(hits);

				List<ConditionsItem> conditions = new ArrayList<ConditionsItem>();
				for (int k = 0; k < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions.Length"); k++) {
					ConditionsItem conditionsItem = new ConditionsItem();
					conditionsItem.setCid(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Cid"));
					conditionsItem.setId(_ctx.longValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Id"));
					conditionsItem.setRid(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Rid"));
					conditionsItem.setLambda(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Lambda"));
					conditionsItem.setExclusion(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Exclusion"));

					Check_range check_range = new Check_range();
					check_range.setRoleId(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Check_range.RoleId"));
					check_range.setRole(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Check_range.Role"));
					check_range.setAbsolute(_ctx.booleanValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Check_range.Absolute"));
					check_range.setAllSentencesSatisfy(_ctx.booleanValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Check_range.AllSentencesSatisfy"));

					Anchor anchor = new Anchor();
					anchor.setCid(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Check_range.Anchor.Cid"));
					anchor.setLocation(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Check_range.Anchor.Location"));
					anchor.setHit_time(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Check_range.Anchor.Hit_time"));
					check_range.setAnchor(anchor);

					Range range = new Range();
					range.setFrom(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Check_range.Range.From"));
					range.setTo(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Check_range.Range.To"));
					check_range.setRange(range);

					TimeRange timeRange = new TimeRange();
					timeRange.setFrom(_ctx.longValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Check_range.TimeRange.From"));
					timeRange.setTo(_ctx.longValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Check_range.TimeRange.To"));
					check_range.setTimeRange(timeRange);
					conditionsItem.setCheck_range(check_range);

					List<Operator> operators = new ArrayList<Operator>();
					for (int l = 0; l < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators.Length"); l++) {
						Operator operator = new Operator();
						operator.setOid(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Oid"));
						operator.setId(_ctx.longValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Id"));
						operator.setType(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Type"));
						operator.setName(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Name"));

						Param param = new Param();
						param.setRegex(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.Regex"));
						param.setNotRegex(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.NotRegex"));
						param.setPhrase(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.Phrase"));
						param.setInterval(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.Interval"));
						param.setIntervalEnd(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.IntervalEnd"));
						param.setThreshold(_ctx.floatValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.Threshold"));
						param.setIn_sentence(_ctx.booleanValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.In_sentence"));
						param.setTarget(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.Target"));
						param.setFrom_end(_ctx.booleanValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.From_end"));
						param.setKeywordExtension(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.KeywordExtension"));
						param.setCase_sensitive(_ctx.booleanValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.Case_sensitive"));
						param.setNear_dialogue(_ctx.booleanValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.Near_dialogue"));
						param.setMinWordSize(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.MinWordSize"));
						param.setHit_time(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.Hit_time"));
						param.setFrom(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.From"));
						param.setCheckFirstSentence(_ctx.booleanValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.CheckFirstSentence"));
						param.setAverage(_ctx.booleanValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.Average"));
						param.setBeginType(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.BeginType"));
						param.setEndType(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.EndType"));
						param.setCompareOperator(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.CompareOperator"));
						param.setContextChatMatch(_ctx.booleanValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.ContextChatMatch"));
						param.setKeywordMatchSize(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.KeywordMatchSize"));
						param.setMaxEmotionChangeValue(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.MaxEmotionChangeValue"));
						param.setCheckType(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.CheckType"));
						param.setDelayTime(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.DelayTime"));

						List<String> keywords = new ArrayList<String>();
						for (int m = 0; m < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.Keywords.Length"); m++) {
							keywords.add(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.Keywords["+ m +"]"));
						}
						param.setKeywords(keywords);

						List<String> excludes = new ArrayList<String>();
						for (int m = 0; m < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.Excludes.Length"); m++) {
							excludes.add(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.Excludes["+ m +"]"));
						}
						param.setExcludes(excludes);

						FlowNodePrerequisiteParam flowNodePrerequisiteParam = new FlowNodePrerequisiteParam();
						flowNodePrerequisiteParam.setNodeId(_ctx.longValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.FlowNodePrerequisiteParam.NodeId"));
						flowNodePrerequisiteParam.setNodeName(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.FlowNodePrerequisiteParam.NodeName"));
						flowNodePrerequisiteParam.setNodeMatchStatus(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.FlowNodePrerequisiteParam.NodeMatchStatus"));
						param.setFlowNodePrerequisiteParam(flowNodePrerequisiteParam);

						IntentModelCheckParm intentModelCheckParm = new IntentModelCheckParm();
						intentModelCheckParm.setModelScene(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.IntentModelCheckParm.ModelScene"));

						List<Intent> intents = new ArrayList<Intent>();
						for (int m = 0; m < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.IntentModelCheckParm.Intents.Length"); m++) {
							Intent intent = new Intent();
							intent.setId(_ctx.longValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.IntentModelCheckParm.Intents["+ m +"].Id"));
							intent.setName(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Conditions["+ k +"].Operators["+ l +"].Param.IntentModelCheckParm.Intents["+ m +"].Name"));

							intents.add(intent);
						}
						intentModelCheckParm.setIntents(intents);
						param.setIntentModelCheckParm(intentModelCheckParm);
						operator.setParam(param);

						operators.add(operator);
					}
					conditionsItem.setOperators(operators);

					conditions.add(conditionsItem);
				}
				hitResultItem.setConditions(conditions);

				hitResult.add(hitResultItem);
			}
			resultInfo.setHitResult(hitResult);

			List<HitScoreItem> hitScore = new ArrayList<HitScoreItem>();
			for (int j = 0; j < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitScore.Length"); j++) {
				HitScoreItem hitScoreItem = new HitScoreItem();
				hitScoreItem.setScoreName(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitScore["+ j +"].ScoreName"));
				hitScoreItem.setScoreNumber(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitScore["+ j +"].ScoreNumber"));
				hitScoreItem.setScoreId(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitScore["+ j +"].ScoreId"));
				hitScoreItem.setRuleId(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitScore["+ j +"].RuleId"));

				hitScore.add(hitScoreItem);
			}
			resultInfo.setHitScore(hitScore);

			List<ReviewHistory> reviewHistoryList = new ArrayList<ReviewHistory>();
			for (int j = 0; j < _ctx.lengthValue("GetResultResponse.Data["+ i +"].ReviewHistoryList.Length"); j++) {
				ReviewHistory reviewHistory = new ReviewHistory();
				reviewHistory.setType(_ctx.integerValue("GetResultResponse.Data["+ i +"].ReviewHistoryList["+ j +"].Type"));
				reviewHistory.setOperatorName(_ctx.stringValue("GetResultResponse.Data["+ i +"].ReviewHistoryList["+ j +"].OperatorName"));
				reviewHistory.setTimeStr(_ctx.stringValue("GetResultResponse.Data["+ i +"].ReviewHistoryList["+ j +"].TimeStr"));
				reviewHistory.setScore(_ctx.integerValue("GetResultResponse.Data["+ i +"].ReviewHistoryList["+ j +"].Score"));
				reviewHistory.setReviewResult(_ctx.integerValue("GetResultResponse.Data["+ i +"].ReviewHistoryList["+ j +"].ReviewResult"));
				reviewHistory.setComplainResult(_ctx.integerValue("GetResultResponse.Data["+ i +"].ReviewHistoryList["+ j +"].ComplainResult"));
				reviewHistory.setOldScore(_ctx.integerValue("GetResultResponse.Data["+ i +"].ReviewHistoryList["+ j +"].OldScore"));
				reviewHistory.setReviewManagerType(_ctx.stringValue("GetResultResponse.Data["+ i +"].ReviewHistoryList["+ j +"].ReviewManagerType"));
				reviewHistory.setTime(_ctx.longValue("GetResultResponse.Data["+ i +"].ReviewHistoryList["+ j +"].Time"));
				reviewHistory.setComments(_ctx.stringValue("GetResultResponse.Data["+ i +"].ReviewHistoryList["+ j +"].Comments"));
				reviewHistory.setOperator(_ctx.longValue("GetResultResponse.Data["+ i +"].ReviewHistoryList["+ j +"].Operator"));

				List<ReviewRightRuleItem> reviewRightRule = new ArrayList<ReviewRightRuleItem>();
				for (int k = 0; k < _ctx.lengthValue("GetResultResponse.Data["+ i +"].ReviewHistoryList["+ j +"].ReviewRightRule.Length"); k++) {
					ReviewRightRuleItem reviewRightRuleItem = new ReviewRightRuleItem();
					reviewRightRuleItem.setRuleName(_ctx.stringValue("GetResultResponse.Data["+ i +"].ReviewHistoryList["+ j +"].ReviewRightRule["+ k +"].ruleName"));
					reviewRightRuleItem.setRid(_ctx.longValue("GetResultResponse.Data["+ i +"].ReviewHistoryList["+ j +"].ReviewRightRule["+ k +"].rid"));

					reviewRightRule.add(reviewRightRuleItem);
				}
				reviewHistory.setReviewRightRule(reviewRightRule);

				reviewHistoryList.add(reviewHistory);
			}
			resultInfo.setReviewHistoryList(reviewHistoryList);

			List<ReviewTypeIdListItem> reviewTypeIdList = new ArrayList<ReviewTypeIdListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetResultResponse.Data["+ i +"].ReviewTypeIdList.Length"); j++) {
				ReviewTypeIdListItem reviewTypeIdListItem = new ReviewTypeIdListItem();
				reviewTypeIdListItem.setReviewTypeId(_ctx.longValue("GetResultResponse.Data["+ i +"].ReviewTypeIdList["+ j +"].ReviewTypeId"));

				List<Long> reviewKeyIdList = new ArrayList<Long>();
				for (int k = 0; k < _ctx.lengthValue("GetResultResponse.Data["+ i +"].ReviewTypeIdList["+ j +"].ReviewKeyIdList.Length"); k++) {
					reviewKeyIdList.add(_ctx.longValue("GetResultResponse.Data["+ i +"].ReviewTypeIdList["+ j +"].ReviewKeyIdList["+ k +"]"));
				}
				reviewTypeIdListItem.setReviewKeyIdList(reviewKeyIdList);

				reviewTypeIdList.add(reviewTypeIdListItem);
			}
			resultInfo.setReviewTypeIdList(reviewTypeIdList);

			data.add(resultInfo);
		}
		getResultResponse.setData(data);
	 
	 	return getResultResponse;
	}
}