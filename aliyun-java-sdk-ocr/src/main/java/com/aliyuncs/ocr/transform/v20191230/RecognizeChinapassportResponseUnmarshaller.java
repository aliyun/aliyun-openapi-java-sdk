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

package com.aliyuncs.ocr.transform.v20191230;

import com.aliyuncs.ocr.model.v20191230.RecognizeChinapassportResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeChinapassportResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeChinapassportResponseUnmarshaller {

	public static RecognizeChinapassportResponse unmarshall(RecognizeChinapassportResponse recognizeChinapassportResponse, UnmarshallerContext _ctx) {
		
		recognizeChinapassportResponse.setRequestId(_ctx.stringValue("RecognizeChinapassportResponse.RequestId"));

		Data data = new Data();
		data.setAuthority(_ctx.stringValue("RecognizeChinapassportResponse.Data.Authority"));
		data.setBirthDate(_ctx.stringValue("RecognizeChinapassportResponse.Data.BirthDate"));
		data.setBirthDay(_ctx.stringValue("RecognizeChinapassportResponse.Data.BirthDay"));
		data.setBirthPlace(_ctx.stringValue("RecognizeChinapassportResponse.Data.BirthPlace"));
		data.setBirthPlaceRaw(_ctx.stringValue("RecognizeChinapassportResponse.Data.BirthPlaceRaw"));
		data.setCountry(_ctx.stringValue("RecognizeChinapassportResponse.Data.Country"));
		data.setExpiryDate(_ctx.stringValue("RecognizeChinapassportResponse.Data.ExpiryDate"));
		data.setExpiryDay(_ctx.stringValue("RecognizeChinapassportResponse.Data.ExpiryDay"));
		data.setIssueDate(_ctx.stringValue("RecognizeChinapassportResponse.Data.IssueDate"));
		data.setIssuePlace(_ctx.stringValue("RecognizeChinapassportResponse.Data.IssuePlace"));
		data.setIssuePlaceRaw(_ctx.stringValue("RecognizeChinapassportResponse.Data.IssuePlaceRaw"));
		data.setLineZero(_ctx.stringValue("RecognizeChinapassportResponse.Data.LineZero"));
		data.setLineOne(_ctx.stringValue("RecognizeChinapassportResponse.Data.LineOne"));
		data.setName(_ctx.stringValue("RecognizeChinapassportResponse.Data.Name"));
		data.setNameChinese(_ctx.stringValue("RecognizeChinapassportResponse.Data.NameChinese"));
		data.setNameChineseRaw(_ctx.stringValue("RecognizeChinapassportResponse.Data.NameChineseRaw"));
		data.setPassportNo(_ctx.stringValue("RecognizeChinapassportResponse.Data.PassportNo"));
		data.setPersonId(_ctx.stringValue("RecognizeChinapassportResponse.Data.PersonId"));
		data.setSex(_ctx.stringValue("RecognizeChinapassportResponse.Data.Sex"));
		data.setSourceCountry(_ctx.stringValue("RecognizeChinapassportResponse.Data.SourceCountry"));
		data.setSuccess(_ctx.booleanValue("RecognizeChinapassportResponse.Data.Success"));
		data.setType(_ctx.stringValue("RecognizeChinapassportResponse.Data.Type"));
		recognizeChinapassportResponse.setData(data);
	 
	 	return recognizeChinapassportResponse;
	}
}