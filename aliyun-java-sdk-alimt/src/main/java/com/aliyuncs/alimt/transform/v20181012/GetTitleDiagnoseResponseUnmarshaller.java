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

package com.aliyuncs.alimt.transform.v20181012;

import com.aliyuncs.alimt.model.v20181012.GetTitleDiagnoseResponse;
import com.aliyuncs.alimt.model.v20181012.GetTitleDiagnoseResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTitleDiagnoseResponseUnmarshaller {

	public static GetTitleDiagnoseResponse unmarshall(GetTitleDiagnoseResponse getTitleDiagnoseResponse, UnmarshallerContext _ctx) {
		
		getTitleDiagnoseResponse.setRequestId(_ctx.stringValue("GetTitleDiagnoseResponse.RequestId"));
		getTitleDiagnoseResponse.setCode(_ctx.integerValue("GetTitleDiagnoseResponse.Code"));
		getTitleDiagnoseResponse.setMessage(_ctx.stringValue("GetTitleDiagnoseResponse.Message"));

		Data data = new Data();
		data.setDuplicateWords(_ctx.stringValue("GetTitleDiagnoseResponse.Data.DuplicateWords"));
		data.setContainCoreClasses(_ctx.stringValue("GetTitleDiagnoseResponse.Data.ContainCoreClasses"));
		data.setWordCount(_ctx.stringValue("GetTitleDiagnoseResponse.Data.WordCount"));
		data.setLanguageQualityScore(_ctx.stringValue("GetTitleDiagnoseResponse.Data.LanguageQualityScore"));
		data.setAllUppercaseWords(_ctx.stringValue("GetTitleDiagnoseResponse.Data.AllUppercaseWords"));
		data.setOverLengthLimit(_ctx.stringValue("GetTitleDiagnoseResponse.Data.OverLengthLimit"));
		data.setDisableWords(_ctx.stringValue("GetTitleDiagnoseResponse.Data.DisableWords"));
		data.setNoFirstUppercaseList(_ctx.stringValue("GetTitleDiagnoseResponse.Data.NoFirstUppercaseList"));
		data.setTotalScore(_ctx.stringValue("GetTitleDiagnoseResponse.Data.TotalScore"));
		data.setWordSpelledCorrectError(_ctx.stringValue("GetTitleDiagnoseResponse.Data.WordSpelledCorrectError"));
		getTitleDiagnoseResponse.setData(data);
	 
	 	return getTitleDiagnoseResponse;
	}
}