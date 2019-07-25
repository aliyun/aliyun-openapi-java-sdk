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

	public static GetPocTestReportResponse unmarshall(GetPocTestReportResponse getPocTestReportResponse, UnmarshallerContext _ctx) {
		
		getPocTestReportResponse.setRequestId(_ctx.stringValue("GetPocTestReportResponse.RequestId"));
		getPocTestReportResponse.setSuccess(_ctx.booleanValue("GetPocTestReportResponse.Success"));
		getPocTestReportResponse.setCode(_ctx.stringValue("GetPocTestReportResponse.Code"));
		getPocTestReportResponse.setMessage(_ctx.stringValue("GetPocTestReportResponse.Message"));

		Data data = new Data();
		data.setAsrAccuracyRate(_ctx.stringValue("GetPocTestReportResponse.Data.AsrAccuracyRate"));
		data.setLabelNum(_ctx.integerValue("GetPocTestReportResponse.Data.LabelNum"));
		data.setPoc(_ctx.booleanValue("GetPocTestReportResponse.Data.Poc"));
		data.setAudioBit(_ctx.stringValue("GetPocTestReportResponse.Data.AudioBit"));
		data.setAudioNum(_ctx.integerValue("GetPocTestReportResponse.Data.AudioNum"));
		data.setAudioSampleRate(_ctx.stringValue("GetPocTestReportResponse.Data.AudioSampleRate"));
		data.setAudioTrack(_ctx.stringValue("GetPocTestReportResponse.Data.AudioTrack"));
		data.setCharacterNum(_ctx.integerValue("GetPocTestReportResponse.Data.CharacterNum"));
		data.setCheckCost(_ctx.stringValue("GetPocTestReportResponse.Data.CheckCost"));
		data.setModelName(_ctx.stringValue("GetPocTestReportResponse.Data.ModelName"));
		data.setPocTime(_ctx.stringValue("GetPocTestReportResponse.Data.PocTime"));
		data.setRuleInfo(_ctx.stringValue("GetPocTestReportResponse.Data.RuleInfo"));
		data.setRuleNum(_ctx.integerValue("GetPocTestReportResponse.Data.RuleNum"));
		data.setRuleRealRate(_ctx.stringValue("GetPocTestReportResponse.Data.RuleRealRate"));
		getPocTestReportResponse.setData(data);
	 
	 	return getPocTestReportResponse;
	}
}