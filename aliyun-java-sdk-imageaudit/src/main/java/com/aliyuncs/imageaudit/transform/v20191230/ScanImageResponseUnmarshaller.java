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

package com.aliyuncs.imageaudit.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imageaudit.model.v20191230.ScanImageResponse;
import com.aliyuncs.imageaudit.model.v20191230.ScanImageResponse.Data;
import com.aliyuncs.imageaudit.model.v20191230.ScanImageResponse.Data.Result;
import com.aliyuncs.imageaudit.model.v20191230.ScanImageResponse.Data.Result.SubResult;
import com.aliyuncs.imageaudit.model.v20191230.ScanImageResponse.Data.Result.SubResult.Frame;
import com.aliyuncs.imageaudit.model.v20191230.ScanImageResponse.Data.Result.SubResult.HintWordsInfo;
import com.aliyuncs.imageaudit.model.v20191230.ScanImageResponse.Data.Result.SubResult.LogoData;
import com.aliyuncs.imageaudit.model.v20191230.ScanImageResponse.Data.Result.SubResult.ProgramCodeData;
import com.aliyuncs.imageaudit.model.v20191230.ScanImageResponse.Data.Result.SubResult.SfaceData;
import com.aliyuncs.imageaudit.model.v20191230.ScanImageResponse.Data.Result.SubResult.SfaceData.Face;
import com.aliyuncs.transform.UnmarshallerContext;


public class ScanImageResponseUnmarshaller {

	public static ScanImageResponse unmarshall(ScanImageResponse scanImageResponse, UnmarshallerContext _ctx) {
		
		scanImageResponse.setRequestId(_ctx.stringValue("ScanImageResponse.RequestId"));

		Data data = new Data();

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("ScanImageResponse.Data.Results.Length"); i++) {
			Result result = new Result();
			result.setTaskId(_ctx.stringValue("ScanImageResponse.Data.Results["+ i +"].TaskId"));
			result.setDataId(_ctx.stringValue("ScanImageResponse.Data.Results["+ i +"].DataId"));
			result.setImageURL(_ctx.stringValue("ScanImageResponse.Data.Results["+ i +"].ImageURL"));

			List<SubResult> subResults = new ArrayList<SubResult>();
			for (int j = 0; j < _ctx.lengthValue("ScanImageResponse.Data.Results["+ i +"].SubResults.Length"); j++) {
				SubResult subResult = new SubResult();
				subResult.setSuggestion(_ctx.stringValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].Suggestion"));
				subResult.setRate(_ctx.floatValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].Rate"));
				subResult.setLabel(_ctx.stringValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].Label"));
				subResult.setScene(_ctx.stringValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].Scene"));

				List<String> oCRDataList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].OCRDataList.Length"); k++) {
					oCRDataList.add(_ctx.stringValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].OCRDataList["+ k +"]"));
				}
				subResult.setOCRDataList(oCRDataList);

				List<Frame> frames = new ArrayList<Frame>();
				for (int k = 0; k < _ctx.lengthValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].Frames.Length"); k++) {
					Frame frame = new Frame();
					frame.setRate(_ctx.floatValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].Frames["+ k +"].Rate"));
					frame.setURL(_ctx.stringValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].Frames["+ k +"].URL"));

					frames.add(frame);
				}
				subResult.setFrames(frames);

				List<SfaceData> sfaceDataList = new ArrayList<SfaceData>();
				for (int k = 0; k < _ctx.lengthValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].SfaceDataList.Length"); k++) {
					SfaceData sfaceData = new SfaceData();
					sfaceData.setX(_ctx.floatValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].SfaceDataList["+ k +"].X"));
					sfaceData.setY(_ctx.floatValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].SfaceDataList["+ k +"].Y"));
					sfaceData.setHeight(_ctx.floatValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].SfaceDataList["+ k +"].Height"));
					sfaceData.setWidth(_ctx.floatValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].SfaceDataList["+ k +"].Width"));

					List<Face> faces = new ArrayList<Face>();
					for (int l = 0; l < _ctx.lengthValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].SfaceDataList["+ k +"].Faces.Length"); l++) {
						Face face = new Face();
						face.setRate(_ctx.floatValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].SfaceDataList["+ k +"].Faces["+ l +"].Rate"));
						face.setId(_ctx.stringValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].SfaceDataList["+ k +"].Faces["+ l +"].Id"));
						face.setName(_ctx.stringValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].SfaceDataList["+ k +"].Faces["+ l +"].Name"));

						faces.add(face);
					}
					sfaceData.setFaces(faces);

					sfaceDataList.add(sfaceData);
				}
				subResult.setSfaceDataList(sfaceDataList);

				List<HintWordsInfo> hintWordsInfoList = new ArrayList<HintWordsInfo>();
				for (int k = 0; k < _ctx.lengthValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].HintWordsInfoList.Length"); k++) {
					HintWordsInfo hintWordsInfo = new HintWordsInfo();
					hintWordsInfo.setContext(_ctx.stringValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].HintWordsInfoList["+ k +"].Context"));

					hintWordsInfoList.add(hintWordsInfo);
				}
				subResult.setHintWordsInfoList(hintWordsInfoList);

				List<LogoData> logoDataList = new ArrayList<LogoData>();
				for (int k = 0; k < _ctx.lengthValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].LogoDataList.Length"); k++) {
					LogoData logoData = new LogoData();
					logoData.setType(_ctx.stringValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].LogoDataList["+ k +"].Type"));
					logoData.setX(_ctx.floatValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].LogoDataList["+ k +"].X"));
					logoData.setY(_ctx.floatValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].LogoDataList["+ k +"].Y"));
					logoData.setHeight(_ctx.floatValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].LogoDataList["+ k +"].Height"));
					logoData.setWidth(_ctx.floatValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].LogoDataList["+ k +"].Width"));
					logoData.setName(_ctx.stringValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].LogoDataList["+ k +"].Name"));

					logoDataList.add(logoData);
				}
				subResult.setLogoDataList(logoDataList);

				List<ProgramCodeData> programCodeDataList = new ArrayList<ProgramCodeData>();
				for (int k = 0; k < _ctx.lengthValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].ProgramCodeDataList.Length"); k++) {
					ProgramCodeData programCodeData = new ProgramCodeData();
					programCodeData.setX(_ctx.floatValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].ProgramCodeDataList["+ k +"].X"));
					programCodeData.setY(_ctx.floatValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].ProgramCodeDataList["+ k +"].Y"));
					programCodeData.setHeight(_ctx.floatValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].ProgramCodeDataList["+ k +"].Height"));
					programCodeData.setWidth(_ctx.floatValue("ScanImageResponse.Data.Results["+ i +"].SubResults["+ j +"].ProgramCodeDataList["+ k +"].Width"));

					programCodeDataList.add(programCodeData);
				}
				subResult.setProgramCodeDataList(programCodeDataList);

				subResults.add(subResult);
			}
			result.setSubResults(subResults);

			results.add(result);
		}
		data.setResults(results);
		scanImageResponse.setData(data);
	 
	 	return scanImageResponse;
	}
}