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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ocr.model.v20191230.RecognizeAccountPageResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeAccountPageResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeAccountPageResponse.Data.InvalidStampArea;
import com.aliyuncs.ocr.model.v20191230.RecognizeAccountPageResponse.Data.OtherStampArea;
import com.aliyuncs.ocr.model.v20191230.RecognizeAccountPageResponse.Data.RegisterStampArea;
import com.aliyuncs.ocr.model.v20191230.RecognizeAccountPageResponse.Data.TitleArea;
import com.aliyuncs.ocr.model.v20191230.RecognizeAccountPageResponse.Data.UndertakeStampArea;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeAccountPageResponseUnmarshaller {

	public static RecognizeAccountPageResponse unmarshall(RecognizeAccountPageResponse recognizeAccountPageResponse, UnmarshallerContext _ctx) {
		
		recognizeAccountPageResponse.setRequestId(_ctx.stringValue("RecognizeAccountPageResponse.RequestId"));

		Data data = new Data();
		data.setAngle(_ctx.floatValue("RecognizeAccountPageResponse.Data.Angle"));
		data.setName(_ctx.stringValue("RecognizeAccountPageResponse.Data.Name"));
		data.setGender(_ctx.stringValue("RecognizeAccountPageResponse.Data.Gender"));
		data.setRelation(_ctx.stringValue("RecognizeAccountPageResponse.Data.Relation"));
		data.setBirthPlace(_ctx.stringValue("RecognizeAccountPageResponse.Data.BirthPlace"));
		data.setNationality(_ctx.stringValue("RecognizeAccountPageResponse.Data.Nationality"));
		data.setNativePlace(_ctx.stringValue("RecognizeAccountPageResponse.Data.NativePlace"));
		data.setBirthDate(_ctx.stringValue("RecognizeAccountPageResponse.Data.BirthDate"));
		data.setIDNumber(_ctx.stringValue("RecognizeAccountPageResponse.Data.IDNumber"));

		TitleArea titleArea = new TitleArea();
		titleArea.setLeft(_ctx.integerValue("RecognizeAccountPageResponse.Data.TitleArea.Left"));
		titleArea.setTop(_ctx.integerValue("RecognizeAccountPageResponse.Data.TitleArea.Top"));
		titleArea.setHeight(_ctx.integerValue("RecognizeAccountPageResponse.Data.TitleArea.Height"));
		titleArea.setWidth(_ctx.integerValue("RecognizeAccountPageResponse.Data.TitleArea.Width"));
		data.setTitleArea(titleArea);

		List<InvalidStampArea> invalidStampAreas = new ArrayList<InvalidStampArea>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeAccountPageResponse.Data.InvalidStampAreas.Length"); i++) {
			InvalidStampArea invalidStampArea = new InvalidStampArea();
			invalidStampArea.setLeft(_ctx.integerValue("RecognizeAccountPageResponse.Data.InvalidStampAreas["+ i +"].Left"));
			invalidStampArea.setTop(_ctx.integerValue("RecognizeAccountPageResponse.Data.InvalidStampAreas["+ i +"].Top"));
			invalidStampArea.setHeight(_ctx.integerValue("RecognizeAccountPageResponse.Data.InvalidStampAreas["+ i +"].Height"));
			invalidStampArea.setWidth(_ctx.integerValue("RecognizeAccountPageResponse.Data.InvalidStampAreas["+ i +"].Width"));

			invalidStampAreas.add(invalidStampArea);
		}
		data.setInvalidStampAreas(invalidStampAreas);

		List<UndertakeStampArea> undertakeStampAreas = new ArrayList<UndertakeStampArea>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeAccountPageResponse.Data.UndertakeStampAreas.Length"); i++) {
			UndertakeStampArea undertakeStampArea = new UndertakeStampArea();
			undertakeStampArea.setLeft(_ctx.integerValue("RecognizeAccountPageResponse.Data.UndertakeStampAreas["+ i +"].Left"));
			undertakeStampArea.setTop(_ctx.integerValue("RecognizeAccountPageResponse.Data.UndertakeStampAreas["+ i +"].Top"));
			undertakeStampArea.setHeight(_ctx.integerValue("RecognizeAccountPageResponse.Data.UndertakeStampAreas["+ i +"].Height"));
			undertakeStampArea.setWidth(_ctx.integerValue("RecognizeAccountPageResponse.Data.UndertakeStampAreas["+ i +"].Width"));

			undertakeStampAreas.add(undertakeStampArea);
		}
		data.setUndertakeStampAreas(undertakeStampAreas);

		List<RegisterStampArea> registerStampAreas = new ArrayList<RegisterStampArea>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeAccountPageResponse.Data.RegisterStampAreas.Length"); i++) {
			RegisterStampArea registerStampArea = new RegisterStampArea();
			registerStampArea.setLeft(_ctx.integerValue("RecognizeAccountPageResponse.Data.RegisterStampAreas["+ i +"].Left"));
			registerStampArea.setTop(_ctx.integerValue("RecognizeAccountPageResponse.Data.RegisterStampAreas["+ i +"].Top"));
			registerStampArea.setHeight(_ctx.integerValue("RecognizeAccountPageResponse.Data.RegisterStampAreas["+ i +"].Height"));
			registerStampArea.setWidth(_ctx.integerValue("RecognizeAccountPageResponse.Data.RegisterStampAreas["+ i +"].Width"));

			registerStampAreas.add(registerStampArea);
		}
		data.setRegisterStampAreas(registerStampAreas);

		List<OtherStampArea> otherStampAreas = new ArrayList<OtherStampArea>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeAccountPageResponse.Data.OtherStampAreas.Length"); i++) {
			OtherStampArea otherStampArea = new OtherStampArea();
			otherStampArea.setLeft(_ctx.integerValue("RecognizeAccountPageResponse.Data.OtherStampAreas["+ i +"].Left"));
			otherStampArea.setTop(_ctx.integerValue("RecognizeAccountPageResponse.Data.OtherStampAreas["+ i +"].Top"));
			otherStampArea.setHeight(_ctx.integerValue("RecognizeAccountPageResponse.Data.OtherStampAreas["+ i +"].Height"));
			otherStampArea.setWidth(_ctx.integerValue("RecognizeAccountPageResponse.Data.OtherStampAreas["+ i +"].Width"));

			otherStampAreas.add(otherStampArea);
		}
		data.setOtherStampAreas(otherStampAreas);
		recognizeAccountPageResponse.setData(data);
	 
	 	return recognizeAccountPageResponse;
	}
}