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

import com.aliyuncs.qualitycheck.model.v20190115.GetPocTestReportResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetPocTestReportResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPocTestReportResponseUnmarshaller {

	public static GetPocTestReportResponse unmarshall(GetPocTestReportResponse getPocTestReportResponse, UnmarshallerContext context) {
		
		getPocTestReportResponse.setRequestId(context.stringValue("GetPocTestReportResponse.RequestId"));
		getPocTestReportResponse.setSuccess(context.booleanValue("GetPocTestReportResponse.Success"));
		getPocTestReportResponse.setCode(context.stringValue("GetPocTestReportResponse.Code"));
		getPocTestReportResponse.setMessage(context.stringValue("GetPocTestReportResponse.Message"));

		Data data = new Data();
		data.setAsrAccuracyRate(context.stringValue("GetPocTestReportResponse.Data.AsrAccuracyRate"));
		data.setLabelNum(context.integerValue("GetPocTestReportResponse.Data.LabelNum"));
		data.setPoc(context.booleanValue("GetPocTestReportResponse.Data.Poc"));
		data.setAudioBit(context.stringValue("GetPocTestReportResponse.Data.AudioBit"));
		data.setAudioNum(context.integerValue("GetPocTestReportResponse.Data.AudioNum"));
		data.setAudioSampleRate(context.stringValue("GetPocTestReportResponse.Data.AudioSampleRate"));
		data.setAudioTrack(context.stringValue("GetPocTestReportResponse.Data.AudioTrack"));
		data.setCharacterNum(context.integerValue("GetPocTestReportResponse.Data.CharacterNum"));
		data.setCheckCost(context.stringValue("GetPocTestReportResponse.Data.CheckCost"));
		data.setModelName(context.stringValue("GetPocTestReportResponse.Data.ModelName"));
		data.setPocTime(context.stringValue("GetPocTestReportResponse.Data.PocTime"));
		data.setRuleInfo(context.stringValue("GetPocTestReportResponse.Data.RuleInfo"));
		data.setRuleNum(context.integerValue("GetPocTestReportResponse.Data.RuleNum"));
		data.setRuleRealRate(context.stringValue("GetPocTestReportResponse.Data.RuleRealRate"));
		getPocTestReportResponse.setData(data);
	 
	 	return getPocTestReportResponse;
	}
}