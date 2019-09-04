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

package com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCQualityByRuleResponse;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCQualityByRuleResponse.QualiltyList;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCQualityByRuleResponse.QualiltyList.CheckResultDetail;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCQualityByRuleResponse.QualiltyList.CheckResultDetail.QualityDetailList;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCQualityByRuleResponse.QualiltyList.CheckResultDetail.QualityDetailList.CurrentSample;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCQualityByRuleResponse.QualiltyList.CheckResultDetail.QualityDetailList.HistoricalSampleList;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCQualityByRuleResponse.QualiltyList.ReferenceValueList;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCQualityByRuleResponse.QualiltyList.SampleValueList;
import com.aliyuncs.transform.UnmarshallerContext;


public class PubGetDQCQualityByRuleResponseUnmarshaller {

	public static PubGetDQCQualityByRuleResponse unmarshall(PubGetDQCQualityByRuleResponse pubGetDQCQualityByRuleResponse, UnmarshallerContext _ctx) {
		
		pubGetDQCQualityByRuleResponse.setReturnCode(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnCode"));
		pubGetDQCQualityByRuleResponse.setCount(_ctx.integerValue("PubGetDQCQualityByRuleResponse.Count"));

		List<QualiltyList> returnValue = new ArrayList<QualiltyList>();
		for (int i = 0; i < _ctx.lengthValue("PubGetDQCQualityByRuleResponse.ReturnValue.Length"); i++) {
			QualiltyList qualiltyList = new QualiltyList();
			qualiltyList.setId(_ctx.integerValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].Id"));
			qualiltyList.setTaskId(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].TaskId"));
			qualiltyList.setEntityId(_ctx.integerValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].EntityId"));
			qualiltyList.setRuleId(_ctx.integerValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].RuleId"));
			qualiltyList.setProperty(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].Property"));
			qualiltyList.setBizdate(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].Bizdate"));
			qualiltyList.setDateType(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].DateType"));
			qualiltyList.setActualExpression(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].ActualExpression"));
			qualiltyList.setMatchExpression(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].MatchExpression"));
			qualiltyList.setBlockType(_ctx.integerValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].BlockType"));
			qualiltyList.setCheckResult(_ctx.integerValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResult"));
			qualiltyList.setCheckResultStatus(_ctx.integerValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultStatus"));
			qualiltyList.setMethodName(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].MethodName"));
			qualiltyList.setBeginTime(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].BeginTime"));
			qualiltyList.setEndTime(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].EndTime"));
			qualiltyList.setTimeConsuming(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].TimeConsuming"));
			qualiltyList.setExternalType(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].ExternalType"));
			qualiltyList.setExternalId(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].ExternalId"));
			qualiltyList.setDiscrete(_ctx.booleanValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].Discrete"));
			qualiltyList.setFixedCheck(_ctx.booleanValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].FixedCheck"));
			qualiltyList.setTrend(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].Trend"));
			qualiltyList.setExpectValue(_ctx.floatValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].ExpectValue"));
			qualiltyList.setOp(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].Op"));
			qualiltyList.setCheckerType(_ctx.integerValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckerType"));
			qualiltyList.setRuleName(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].RuleName"));
			qualiltyList.setIsPrediction(_ctx.booleanValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].IsPrediction"));
			qualiltyList.setCheckerName(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckerName"));

			CheckResultDetail checkResultDetail = new CheckResultDetail();
			checkResultDetail.setIsDiscrete(_ctx.booleanValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.IsDiscrete"));
			checkResultDetail.setWarningThreshold(_ctx.floatValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.WarningThreshold"));
			checkResultDetail.setCriticalThreshold(_ctx.floatValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.CriticalThreshold"));
			checkResultDetail.setOp(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.Op"));
			checkResultDetail.setExpectValue(_ctx.floatValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.ExpectValue"));
			checkResultDetail.setExternalId(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.ExternalId"));
			checkResultDetail.setStatus(_ctx.integerValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.Status"));
			checkResultDetail.setQualityStatus(_ctx.integerValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.QualityStatus"));

			List<QualityDetailList> detail = new ArrayList<QualityDetailList>();
			for (int j = 0; j < _ctx.lengthValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.Detail.Length"); j++) {
				QualityDetailList qualityDetailList = new QualityDetailList();

				CurrentSample currentSample = new CurrentSample();
				currentSample.setBizdate(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.Detail["+ j +"].CurrentSample.Bizdate"));
				currentSample.setProperty(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.Detail["+ j +"].CurrentSample.Property"));
				currentSample.setValue(_ctx.floatValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.Detail["+ j +"].CurrentSample.Value"));
				currentSample.setDetail(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.Detail["+ j +"].CurrentSample.Detail"));
				qualityDetailList.setCurrentSample(currentSample);

				List<HistoricalSampleList> historicalSamples = new ArrayList<HistoricalSampleList>();
				for (int k = 0; k < _ctx.lengthValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.Detail["+ j +"].HistoricalSamples.Length"); k++) {
					HistoricalSampleList historicalSampleList = new HistoricalSampleList();
					historicalSampleList.setBizdate(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.Detail["+ j +"].HistoricalSamples["+ k +"].Bizdate"));
					historicalSampleList.setValue(_ctx.floatValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.Detail["+ j +"].HistoricalSamples["+ k +"].Value"));
					historicalSampleList.setDetail(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.Detail["+ j +"].HistoricalSamples["+ k +"].Detail"));
					historicalSampleList.setFluctuatedValue(_ctx.floatValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].CheckResultDetail.Detail["+ j +"].HistoricalSamples["+ k +"].FluctuatedValue"));

					historicalSamples.add(historicalSampleList);
				}
				qualityDetailList.setHistoricalSamples(historicalSamples);

				detail.add(qualityDetailList);
			}
			checkResultDetail.setDetail(detail);
			qualiltyList.setCheckResultDetail(checkResultDetail);

			List<ReferenceValueList> referenceValue = new ArrayList<ReferenceValueList>();
			for (int j = 0; j < _ctx.lengthValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].ReferenceValue.Length"); j++) {
				ReferenceValueList referenceValueList = new ReferenceValueList();
				referenceValueList.setBizDate(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].ReferenceValue["+ j +"].BizDate"));
				referenceValueList.setDiscreteProperty(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].ReferenceValue["+ j +"].DiscreteProperty"));
				referenceValueList.setValue(_ctx.floatValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].ReferenceValue["+ j +"].Value"));
				referenceValueList.setSingleCheckResult(_ctx.integerValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].ReferenceValue["+ j +"].SingleCheckResult"));

				referenceValue.add(referenceValueList);
			}
			qualiltyList.setReferenceValue(referenceValue);

			List<SampleValueList> sampleValue = new ArrayList<SampleValueList>();
			for (int j = 0; j < _ctx.lengthValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].SampleValue.Length"); j++) {
				SampleValueList sampleValueList = new SampleValueList();
				sampleValueList.setBizDate(_ctx.stringValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].SampleValue["+ j +"].BizDate"));
				sampleValueList.setValue(_ctx.floatValue("PubGetDQCQualityByRuleResponse.ReturnValue["+ i +"].SampleValue["+ j +"].Value"));

				sampleValue.add(sampleValueList);
			}
			qualiltyList.setSampleValue(sampleValue);

			returnValue.add(qualiltyList);
		}
		pubGetDQCQualityByRuleResponse.setReturnValue(returnValue);
	 
	 	return pubGetDQCQualityByRuleResponse;
	}
}